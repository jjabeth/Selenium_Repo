package week5.day2_HomeAssignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class BigBasket_ActionsClass {

	public static void main(String[] args) throws InterruptedException, IOException {

		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Load the URL (https://www.bigbasket.com/)
		driver.get("https://www.bigbasket.com/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on "Shop by Category".
		driver.findElement(By.xpath("(//*[contains(@class,'StyledArrowDown')])[2]")).click();
		//Create object to Actions class for mouse actions
		Actions mouseActions = new Actions(driver);
		//Mouse over "Foodgrains, Oil & Masala".
		Thread.sleep(2000);
		mouseActions.moveToElement(driver.findElement(By.linkText("Foodgrains, Oil & Masala"))).perform();
		//Mouse over "Rice & Rice Products".
		mouseActions.moveToElement(driver.findElement(By.linkText("Rice & Rice Products"))).perform();
		Thread.sleep(2000);
		//Click on "Boiled & Steam Rice".
		Actions actions = mouseActions.moveToElement(driver.findElement(By.linkText("Boiled & Steam Rice")));
		Thread.sleep(2000);
		actions.click().perform();
		//Filter the results by selecting the brand "bb Royal".
		mouseActions.scrollToElement(driver.findElement(By.xpath("//span[text()='Brands']"))).click().perform();
		mouseActions.click(driver.findElement(By.xpath("//input[@id='i-BBRoyal']"))).perform();
		Thread.sleep(3000);
		//Click on "Tamil Ponni Boiled Rice".
		driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']")).click();
		//Using Windows Handling
		Set<String> windowHandles = driver.getWindowHandles();
		//Convert Set to List
		List<String> allWindows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(allWindows.get(0));
		String mainWindowTitle = driver.getTitle();
		System.out.println("Title of the Main Window :" + mainWindowTitle);
		driver.switchTo().window(allWindows.get(1));
		String currentWindowTitle = driver.getTitle();
		System.out.println("Title of the Current Window : " +currentWindowTitle);
		Thread.sleep(2000);
		//Select the 5 Kg bag
		Actions actions2 = mouseActions.scrollToElement(driver.findElement(By.xpath("(//div[@class='flex justify-start w-full h-full'])[5]")));
		actions2.perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='flex justify-start w-full h-full'])[5]")).click();
		//Check and note the price of the rice.
		String checkPrice = driver.findElement(By.xpath("//h1[contains(text(),'bb Royal Tamil Ponni Boiled Rice, 5 kg')]/following-sibling::table/tr[1]")).getText();
		System.out.println("Check the Price of Rice is : " + checkPrice);
		if(checkPrice.contains("350")) {
			System.out.println("Price is checked and noted");
		}else {
			System.out.println("Price is not checked and noted");
		}
		//Click "Add" to add the bag to your cart.
		WebElement clickAddPdt = driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]"));
		clickAddPdt.click();
		Thread.sleep(3000);
		//Verify the success message that confirms the item was added to your cart.
		String verifyMessages = driver.findElement(By.xpath("//div[@class='self-center']/following::p")).getText();
		System.out.println("Added successfully message is : "+ verifyMessages);
		if(verifyMessages.contains("successfully")) {
			System.out.println("Got added successfully message");
		}else {
			System.out.println("Not get successfully message");
		}
		//Take a snapshot of the current page
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snaps/bigBasketCurrentPage.png");
		FileHandler.copy(source, destination);
		//Close the current window.
		driver.close();
		//Close the main window.
		driver.switchTo().window(allWindows.get(0));
		driver.close();
	}

}

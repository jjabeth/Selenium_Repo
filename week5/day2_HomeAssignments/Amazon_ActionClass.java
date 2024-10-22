package week5.day2_HomeAssignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_ActionClass {

	public static void main(String[] args) throws InterruptedException, IOException {

		//Open empty browser
		ChromeDriver driver =new ChromeDriver();
		//Load the URL
		driver.get("https://www.amazon.in/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Search for "Oneplus 9 pro"
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus 9 pro");
		//click on search 
		driver.findElement(By.id("nav-search-submit-button")).click();
		//Get the price of the first product.
		String getPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])")).getText();
		System.out.println("Price of first product is: "+ getPrice);
		//Print the number of customer ratings for the first displayed product.
		//WebElement element = driver.findElement(By.xpath("(//i[@data-cy='reviews-ratings-slot'])[1]"));
		//WebElement element = driver.findElement(By.xpath("(//span[@class=\"a-icon-alt\"])[1]"));
		//WebElement element = driver.findElement(By.xpath("(//a[@class=\"a-popover-trigger a-declarative\"])[1]//span"));
		Thread.sleep(2000);

		WebElement mouseActions = driver.findElement(By.xpath("(//*[contains(@class,'a-icon a-icon-popover')])[1]"));
		Actions mouseHover =new Actions(driver);
		Thread.sleep(2000);
		mouseHover.moveToElement(mouseActions).click().build().perform();
		Thread.sleep(2000);
		String ratingsProduct = driver.findElement(By.xpath("//*[@class='a-size-base a-color-secondary totalRatingCount']")).getText();
		//driver.switchTo().frame(0);
		//String ratingsProduct = driver.findElement(By.xpath("//span[contains(text(),'global ratings')]")).getText();
		//String ratingsProduct = ratings.getText();
		System.out.println("Ratings for the first displayed product is : "+ ratingsProduct);
		//Click the first text link of the first image.
		driver.findElement(By.xpath("(//span[contains(text(),'OnePlus')])[1]")).click();
		//Handling new windows
		Set<String> allWindows = driver.getWindowHandles();
		//Convert set to list
		List<String> windowsHandling = new ArrayList<String>(allWindows);
		driver.switchTo().window(windowsHandling.get(1));
		//Take a screenshot of the product displayed.
		WebElement pdtScreenshot = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']"));
		File source = pdtScreenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snaps/productImage.png");
		FileUtils.copyFile(source, destination);
		//Click the 'Add to Cart' button.
		Actions scroll = new Actions(driver);
		WebElement scrollElement = driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
		scroll.scrollToElement(scrollElement).build().perform();
		scrollElement.click();
		//Get the cart subtotal and verify if it is correct.
		//String cartSubTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		String cartSubTotal = driver.findElement(By.xpath("(//div[@class='a-column a-span11 a-text-left a-spacing-top-large'])[1]")).getText();
		System.out.println(cartSubTotal);
		if(cartSubTotal.contains(getPrice)) {
			System.out.println("Total is correct");
		}else {
			System.out.println("Total is not correct");
		}
		//Close the browser
		driver.close();

	}

}

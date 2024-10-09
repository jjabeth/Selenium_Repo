package week4.day1_HomeAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		//Initialize the WebDriver (ChromeDriver).
		ChromeDriver driver = new ChromeDriver();
		//Load the URL http://leaftaps.com/opentaps/.
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter the user name as "DemoSalesManager"
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//Enter the Password as"crmsfa"
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on the login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on the Contacts button.
		driver.findElement(By.linkText("Contacts")).click();
		//Click on Merge Contacts.
		driver.findElement(By.linkText("Merge Contacts")).click();
		//Click on the widget of the "From Contact".
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		//Click on the first resulting contact.
		// Handling windows
		Set<String> handles = driver.getWindowHandles();
		// Convert from Set to List
		List<String> allWindows = new ArrayList<String>(handles);
		//Switch from parent window to immediate child window 
		driver.switchTo().window(allWindows.get(1));
		driver.findElement(By.linkText("DemoCustomer")).click();
		//Switch back from immediate child window to parent window
		driver.switchTo().window(allWindows.get(0));
		//Click on the widget of the "To Contact".
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
		//Click on the second resulting contact.
		Set<String> handles2 = driver.getWindowHandles();
		//Using Iterator
		Iterator<String> itr = handles2.iterator();
		String mainWin = itr.next();
		String firstWin = itr.next();
		driver.switchTo().window(firstWin);
		driver.findElement(By.linkText("DemoLBCust")).click();
		//Click on the Merge button.
		driver.switchTo().window(mainWin);
		driver.findElement(By.linkText("Merge")).click();
		//Accept the alert.
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//Verify the title of the page.
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Merge Contacts")) {
			System.out.println("Titele of the page is verified");
		}else {
			System.out.println("Titele of the page is not verified");
		}
		//Close the Browser
		Thread.sleep(3000);
		driver.quit();

	}

}

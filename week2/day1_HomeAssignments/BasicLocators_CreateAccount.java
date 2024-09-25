package week2.day1_HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators_CreateAccount {

	public static void main(String[] args) {
		// open empty browser
		ChromeDriver driver = new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the browser window
		driver.manage().window().maximize();
		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter the user name as "DemoSalesManager"
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//Enter the Password as"crmsfa"
		driver.findElement(By.id("password")).sendKeys("crmsfa");;
		//Click on the login Button
		driver.findElement(By.className("decorativeSubmit")).click();;
		//Click on the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
		//Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		//Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys("IT");
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//Enter a Number Of Employees
		driver.findElement(By.id("numberEmployees")).sendKeys("5");
		//Enter a Site Name as “LeafTaps”
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		//Verify that the Title is displayed correctly
		String title = driver.getTitle();
		System.out.println("Current Page title is :" + title);
		if(title.contains("Create Account")) {
			System.out.println("Title is verified");
		}else {
			System.out.println("Title is not verified");
		}
		//Close the browser window
		driver.close();
	}

}

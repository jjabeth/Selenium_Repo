package week2.day1_HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators_CreateLead {
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
		//Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();
		//Click on the "Create Lead" button.
		driver.findElement(By.partialLinkText("Create")).click();
		//Enter a CompanyName.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		//Enter a FirstName.
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Joshva");
		//Enter a LastName.
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		//Enter a Title .
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		//Click the "Create Lead" button.
		driver.findElement(By.className("smallSubmit")).click();
		//Verify that the Title is displayed correctly.
		String title = driver.getTitle();
		System.out.println("Current Page title is : " +title);
		if(title.contains("View Lead")) {
			System.out.println("Title displayed correctly");
		}else {
			System.out.println("Title is not displayed");
		}
		//Close the browser window.
		driver.quit();
	}

}

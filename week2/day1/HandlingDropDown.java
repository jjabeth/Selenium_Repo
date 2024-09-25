package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) {
		// open empty browser
		ChromeDriver driver = new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Enter the user name as "DemoSalesManager"
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//Enter the Password as"crmsfa"
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on the login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on the Leads Tap
		driver.findElement(By.linkText("Leads")).click();
		//Click on the create lead link from shortcuts
		driver.findElement(By.partialLinkText("Create")).click();
		// Enter Mandatory fields on the web page 
		// Enter first name as Cognizant
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		// Enter the Fore name as Joshva
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Joshva");
		// Enter surname as J
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		// Select employee on the source drop down (using index)
		WebElement dropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//Create an object for select class
		Select ddObj = new Select(dropDown);
		ddObj.selectByIndex(4);
		//Select automobile in the marketing campign (using visible text)
		WebElement dropDown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd2 =new Select(dropDown2);
		dd2.selectByVisibleText("Automobile");
		// select corporation in ownership (using value)
		WebElement dropDown3 = driver.findElement(By.name("ownershipEnumId"));
		Select dd3 =new Select(dropDown3);
		dd3.selectByValue("OWN_SCORP");
		// click on the create lead button
		WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));
		createLeadButton.click();
		//verify the title of the current web page
		String title = driver.getTitle();
		System.out.println(title);
		//WebElement title = driver.findElement(By.id("sectionHeaderTitle_leads"));
//		String titleText = title.getText();
		if(title.contains("View Lead")) {
			System.out.println("Current Web Page title is verified");
		}else {
			System.out.println("The current web page is title is not verified");
		}
		// close the browser window
		driver.close();
	}
}

package week2.day1_HomeAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_CreateAccount {
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
		//Click on the "Accounts" tab
		driver.findElement(By.linkText("Accounts")).click();
		//Click on the "Create Account" button
		driver.findElement(By.linkText("Create Account")).click();
		//Enter an account name as IT
		driver.findElement(By.id("accountName")).sendKeys("IT");
		//Enter a description as "Selenium Automation Tester
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//Select "ComputerSoftware" as the industry
		WebElement dd = driver.findElement(By.name("industryEnumId"));
		Select dropDown = new Select(dd);
		dropDown.selectByIndex(3);
		//Select "S-Corporation" as ownership using SelectByVisibleText
		WebElement dropDown2 = driver.findElement(By.name("ownershipEnumId"));
		Select dd1 = new Select(dropDown2);
		dd1.selectByVisibleText("S-Corporation");
		//Select "Employee" as the source using SelectByValue
		WebElement dropDown3 = driver.findElement(By.id("dataSourceId"));
		Select dd2 =new Select(dropDown3);
		dd2.selectByValue("LEAD_EMPLOYEE");
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		WebElement dDown4 = driver.findElement(By.name("marketingCampaignId"));
		Select dd3 = new Select(dDown4);
		dd3.selectByIndex(6);
		//Select "Texas" as the state/province using SelectByValue
		WebElement dDown5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dd4 = new Select(dDown5);
		dd4.selectByValue("TX");
		//Click the "Create Account" button
		driver.findElement(By.className("smallSubmit")).click();
		//if account name is duplicate ignore it
		driver.findElement(By.partialLinkText("Create Account Ignoring")).click();
		// Using Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//Verify that the account name is displayed correctly
		WebElement text3 = driver.findElement(By.xpath("//table[@class='fourColumnForm']/tbody/tr[1]/td[2]/span"));
		String text = text3.getText();
		System.out.println(text);
		if(text.contains("IT")) {
			System.out.println("Account name displayed correctly");
		}else {
			System.out.println("Account name is not displayed");
		}
		//Close the browser window
		driver.close();

	}
}

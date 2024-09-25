package week2.day2_HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) {
		/*
		 * 
-  .
- Maximize the browser window.
Requirements:
- 
- Enter the password.
- Click the Login button.
- Click the "crm/sfa" link.
- Click the "Leads" link.
- 
- 
- Enter the phone number.
- 
- 
- Click the first resulting lead.
- Click the "Delete" button.
- Click "Find leads" again.
- Enter the captured lead ID.
- Click the "Find leads" button.
- Verify the presence of the message "No records to display" in the Lead List. This
message confirms the successful deletion.
- Close the browser.
		 */
		//Initialize the WebDriver (ChromeDriver).
		ChromeDriver driver = new ChromeDriver();
		//Load the URL http://leaftaps.com/opentaps/.
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
		//Click on leads tap
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//Click "Find leads."
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		//Click on the "Phone" tab.
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		//Enter the phone number.
		WebElement phoneCCOde = driver.findElement(By.xpath("//input[@name='phoneCountryCode']"));
		phoneCCOde.clear();
		phoneCCOde.sendKeys("9");
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567890");
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Capture the lead ID of the first resulting lead.
		





	}

}

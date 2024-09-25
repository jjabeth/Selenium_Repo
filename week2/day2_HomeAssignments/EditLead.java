package week2.day2_HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) {

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
		//Click on create lead 
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		//Enter the CompanyName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		//Enter the FirstName Field Using Xpath. 
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Josh");
		//Enter the LastName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("J");
		//Enter the FirstName (Local) Field Using Xpath.  
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("JYJP");
		//Enter the Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		//Enter the Description Field Using any Locator of your choice.
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//Enter your email in the E-mail address Field using the locator of your choice.
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test657@gmail.com");
		//Select State/Province as NewYork Using Visible Text.
		WebElement dd = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select dDown = new Select(dd);
		dDown.selectByVisibleText("New York");
		//Click on the Create Button.
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		//Click on the edit button.
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//Clear the Description Field.
		WebElement description = driver.findElement(By.name("description"));
		description.clear();
		//Fill the Important Note Field with Any text.
		driver.findElement(By.name("importantNote")).sendKeys("Automation Tester");
		//Click on the update button.
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		//Get the Title of the Resulting Page.
		String title = driver.getTitle();
		System.out.println(title);
		//Close the browser window.
		driver.close();
		
	}

}

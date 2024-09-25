package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// open Empty browser
		ChromeDriver driver =new ChromeDriver();
		
		// load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the window
		driver.manage().window().maximize();
		
		// Enter the username as "DemoSalesManager"
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		
		// Enter the Password as "crmsfa"
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		// click on login button
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		
		// Click link on crmsfa (linktext - full value in the dom)
//		WebElement linkText = driver.findElement(By.linkText("CRM/SFA"));
//		linkText.click();
		
		// click on link crmsfa by using partial linktext (partial value in the dom)
		WebElement partiallinkText = driver.findElement(By.partialLinkText("SFA"));
		partiallinkText.click();
		
		
		
		
		
	}

}

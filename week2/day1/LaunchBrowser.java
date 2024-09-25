package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// Open empty Browser
		ChromeDriver driver = new ChromeDriver();
		//Load the Url
		driver.get("https://www.facebook.com");

		// java wait Thread.sleep()
		Thread.sleep(5000);
		// maximize the browser
		driver.manage().window().maximize();

		// close the browser
		
		// Enter the email id as testleaf.2023@gmail.com
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("testleaf.2023@gmail.com");
		
		// Enter the password as Tuna@321
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Tuna@321");
		
		// click on the login button
		WebElement loginButton = driver.findElement(By.linkText("Log in"));

		loginButton.click();
		
		
		//driver.close();

	}

}

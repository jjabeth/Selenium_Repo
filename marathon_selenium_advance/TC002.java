package marathon_selenium_advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class TC002 {

	/*
	 * Credentials - II

Instance URL: https://dev186929.service-now.com/
Username: admin
Password: 2AqjN!lC2!Vy
	 */
	public static void main(String[] args) {
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		//load the url
		driver.get("https://dev224911.service-now.com/");
		//maximize browser
		driver.manage().window().maximize();
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on sign in
		Shadow sd = new Shadow(driver);
		sd.setImplicitWait(5);
		sd.findElementByXPath("//span[text()='Sign In']").click();
		//Enter user name in user name field
		
		//Click on next button
		driver.findElement(By.id("username_submit_button")).click();
		//Enter password in password field
		//click on sigin in button after provide username and password
		driver.findElement(By.id("password_submit_button_div")).click();

	}

}

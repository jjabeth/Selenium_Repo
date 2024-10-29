package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecicMethod;

public class LoginPage extends ProjectSpecicMethod {
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		return this;
	}
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}

}

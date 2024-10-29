package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecicMethod;

public class WelcomePage extends ProjectSpecicMethod {
	
	public WelcomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public WelcomePage verifyLoginPage() {
		String verifyLoginPage = driver.findElement(By.xpath("//h2[contains(text(),'Welcome')]")).getText();
		if(verifyLoginPage.contains("Welcome")) {
			System.out.println("Login page is verified");
		}else {
			System.out.println("Login page is not verified");
		}
		return this;
	}

	public MyHomePage clickCRMSFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecicMethod;

public class MyHomePage extends ProjectSpecicMethod {
	
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public MyTeamsAccountPage clickAccountsLink() {
		driver.findElement(By.linkText("Accounts")).click();
		return new MyTeamsAccountPage(driver);
	}


}

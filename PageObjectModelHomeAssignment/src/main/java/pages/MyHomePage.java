package pages;

import org.openqa.selenium.By;

import base.ProjectSpecicMethod;

public class MyHomePage extends ProjectSpecicMethod {
	
	public MyTeamsAccountPage clickAccountsLink() {
		driver.findElement(By.linkText("Accounts")).click();
		return new MyTeamsAccountPage();
	}


}

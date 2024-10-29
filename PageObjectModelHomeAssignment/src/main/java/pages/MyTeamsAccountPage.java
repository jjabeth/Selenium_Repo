package pages;

import org.openqa.selenium.By;

import base.ProjectSpecicMethod;

public class MyTeamsAccountPage extends ProjectSpecicMethod {
	
	public MyTeamsAccountPage verifyMyTeamsAccountPage() {
		String navigatedMyTeamsAccPage = driver.findElement(By.id("sectionHeaderTitle_accounts")).getText();
		if(navigatedMyTeamsAccPage.contains("My Teams' Accounts")) {
			System.out.println("The page is navigated to My Teams' Accounts page");
		}else {
			System.out.println("The page is not navigated to My Teams' Accounts page");
		}
		return this;
	}
	
	public CreateAccountPage clickCreateAccountLink() {
		driver.findElement(By.xpath("//ul[@class='shortcuts']//following::li//a[text()='Create Account']")).click();
		return new CreateAccountPage();
	}

}

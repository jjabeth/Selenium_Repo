package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecicMethod;

public class AccountDetailsPage extends ProjectSpecicMethod{
	
	public AccountDetailsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public void verifyAccountDetailsPage() {
		String navigatedAccDetailsPage = driver.findElement(By.id("sectionHeaderTitle_accounts")).getText();
		if(navigatedAccDetailsPage.contains("Account Details")) {
			System.out.println("The page is navigated to Account Details page");
		}else {
			System.out.println("The page is not navigated to Account Details page");
		}
	}

}

package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecicMethod;

public class CreateAccountPage extends ProjectSpecicMethod {
	
	public CreateAccountPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public CreateAccountPage verifyCreateAccountPage() {
		String navigatedCreateAccPage = driver.findElement(By.id("sectionHeaderTitle_accounts")).getText();
		if(navigatedCreateAccPage.contains("Create Account")) {
			System.out.println("The page is navigated to Create Account page");
		}else {
			System.out.println("The page is not navigated to Create Account page");
		}
		return this;
	}
	
	public CreateAccountPage enterAccountName() {
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("IT");
		return this;
	}
	
	public CreateAccountPage enterDescription() {
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		return this;
	}
	
	public CreateAccountPage selectIndustry() {
		WebElement dd = driver.findElement(By.name("industryEnumId"));
		Select dropDown = new Select(dd);
		dropDown.selectByIndex(3);
		return this;
	}
	
	public CreateAccountPage numOfEmployees() {
		driver.findElement(By.id("numberEmployees")).sendKeys("5");
		return this;
	}
	
	public CreateAccountPage enterSiteName() {
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		return this;
	}
	
	public AccountDetailsPage clickCreateAccount() {
		
		driver.findElement(By.className("smallSubmit")).click();
		//if account name is duplicate ignore it
		driver.findElement(By.partialLinkText("Create Account Ignoring")).click();
		// Using Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return new AccountDetailsPage(driver);
	}

}

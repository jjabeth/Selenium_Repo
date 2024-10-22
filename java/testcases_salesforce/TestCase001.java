package testcases_salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase001 {
	//Launch the Browser
	@Test
	public void runTestCase2() throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		// load the URL
		driver.get("https://login.salesforce.com");
		//Maximize the browser
		driver.manage().window().maximize();
		//Add Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Username: dilip@testleaf.com
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		//Password: leaf@2024
		driver.findElement(By.id("password")).sendKeys("leaf@2024");
		//Click on log-in button
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		//Click on the toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		// Creating object for Actions Class
		Actions mouseActions =new Actions(driver);
		//Click View All and click Legal Entities from App Launcher
		Thread.sleep(5000);
		WebElement mouseOver = driver.findElement(By.xpath("//button[text()='View All']"));
		mouseActions.moveToElement(mouseOver).click().build().perform();
		//driver.executeScript("arguments[0].scrollIntoView(true);", mouseOver);
		//mouseOver.click();
		WebElement scrollToele = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		mouseActions.scrollToElement(scrollToele).build().perform();
		scrollToele.click();
		//driver.executeScript("arguments[0].click;", scrollToele);
		//Click on the Dropdown icon in the legal Entities tab
		Thread.sleep(5000);
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.findElement(By.xpath("//span[text()='Legal Entities']//following::a[@class='slds-button slds-button_reset']//span[@part='boundary']")).click();
		//jse.executeScript("arguments[0].click;", element);

		//span[text()='Legal Entities List']
		//driver.findElement(By.xpath("//span[text()='Legal Entities List']")).click();
		//mouseActions.scrollToElement(mouseOveLegal).click().build().perform();
		//Click on New Legal Entity
		Thread.sleep(2000);
		WebElement mouseOver1 = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
		//jse.executeScript("arguments[0].click();", mouseOver1);
		mouseActions.moveToElement(mouseOver1).click().build().perform();
		//Enter Name as 'Salesforce Automation by *Your Name*'
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Joshva");
		//Click save and verify Legal Entity Name
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		// verify legal entity name
		String legalEntityName = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(legalEntityName);
		if(legalEntityName.contains("Joshva")) {
			System.out.println("Verified legal entity name");
		}else {
			System.out.println("Not verified legal entity name");
		}
		//close the browser
		driver.close();
	}
}

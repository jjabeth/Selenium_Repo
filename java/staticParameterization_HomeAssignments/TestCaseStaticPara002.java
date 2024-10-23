package staticParameterization_HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import init.BaseClass_SalesForce;

public class TestCaseStaticPara002 extends BaseClass_SalesForce {
	@Test
	public void runTestCase2() throws InterruptedException {
		
		//Enter the Company name as 'TestLeaf'.
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		
		//Enter Description as 'Salesforces'.
		driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow textarea-container']/textarea)[2]")).sendKeys("Salesforces");
		//Select Status as 'Active'
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//button[@id='combobox-button-222']"));
		//WebElement element = driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']"));
		//mouseActions.scrollToElement(element).click().build().perform();
		driver.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		Thread.sleep(4000);
		WebElement clickActive = driver.findElement(By.xpath("//span[text()='Active']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", clickActive);
		clickActive.click();
		
		//Click on Save
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		//Verify the Alert message (Complete this field) displayed for Name
		Thread.sleep(4000);
		String alrtMsg = driver.findElement(By.xpath("//div[@class='slds-list--inline']")).getText();
		//String alrtMsg = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println("Alert message is : " + alrtMsg);
		if(alrtMsg.contains("Joshva")) {
			System.out.println("Verified Alert message");
		}else {
			System.out.println("Alert message is not verified");
		}
		
		
	}
}
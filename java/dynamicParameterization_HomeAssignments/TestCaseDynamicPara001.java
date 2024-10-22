package dynamicParameterization_HomeAssignments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import init.BaseClass_SalesForce;

public class TestCaseDynamicPara001 extends BaseClass_SalesForce {
	//Launch the Browser
		
	@Test
	public void runTestCase2() throws InterruptedException {
		
		//Click save and verify Legal Entity Name
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		// verify legal entity name
		Thread.sleep(2000);
		String legalEntityName = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(legalEntityName);
		if(legalEntityName.contains("Joshva")) {
			System.out.println("Verified legal entity name");
		}else {
			System.out.println("Not verified legal entity name");
		}
	}
}

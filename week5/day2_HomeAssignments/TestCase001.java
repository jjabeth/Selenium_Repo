package week5.day2_HomeAssignments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase001 extends ProjectSpecificMethod {
	//Launch the Browser
	@Test
	public void runTestCase2() throws InterruptedException {
		
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
	}
}

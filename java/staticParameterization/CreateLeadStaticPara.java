package staticParameterization;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

import init.BaseClass_Leads;

public class CreateLeadStaticPara extends BaseClass_Leads{
	@Test
	public void executeCreateLead() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
		
}
}







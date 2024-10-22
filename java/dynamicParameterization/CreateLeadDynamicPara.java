package dynamicParameterization;



import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import init.BaseClass_Leads;

public class CreateLeadDynamicPara extends BaseClass_Leads{
	
	@DataProvider(name ="fetchData")
	public String[][] sendData() {
		String[][] data = new String[4][3];
		data[0][0] = "Cognizant";
		data[0][1] = "Joshva";
		data[0][2] = "J";
		
		data[1][0] = "TCS";
		data[1][1] = "Yabath";
		data[1][2] = "J";
		
		data[2][0] = "Amazon";
		data[2][1] = "Puspharaj";
		data[2][2] = "J";
		
		data[3][0] = "Zoho";
		data[3][1] = "Joan";
		data[3][2] = "S";
		
		return data;
	}
	
	@Test (dataProvider = "fetchData")
	public void executeCreateLead(String compName, String firstName, String lastName) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();
		
}
}







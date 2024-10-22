package dynamicParameterization;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import init.BaseClass_Leads;


public class EditLeadDynamicPara extends BaseClass_Leads {
	
	@DataProvider(name ="fetchData1")
	public String[][] sendData1() {
		
		String [][] data1 = new String [3][2];
		data1[0][0] = "9";
		data1[0][1] = "Cognizant";
		
		data1[1][0] = "99";
		data1[1][1] = "TCS";
		
		data1[2][0] = "91";
		data1[2][1] = "Amazon";
		
		return data1;
	}
	@Test (dataProvider = "fetchData1")
	public void exceuteEditLead(String phoneNum , String updComName) throws InterruptedException {
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNum);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(updComName);
		driver.findElement(By.name("submitButton")).click();
}
}







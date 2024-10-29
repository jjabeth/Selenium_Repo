package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecicMethod;
import pages.LoginPage;

public class TC002_CreateAccountFunctionality extends ProjectSpecicMethod{
	
	@Test
	public void executeCreateAccountFunc() {
		LoginPage lp = new LoginPage();
		lp.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.verifyLoginPage()
		.clickCRMSFALink()
		.clickAccountsLink()
		.verifyMyTeamsAccountPage()
		.clickCreateAccountLink()
		.verifyCreateAccountPage()
		.enterAccountName()
		.enterDescription()
		.selectIndustry()
		.numOfEmployees()
		.enterSiteName()
		.clickCreateAccount()
		.verifyAccountDetailsPage();
		
	}
}

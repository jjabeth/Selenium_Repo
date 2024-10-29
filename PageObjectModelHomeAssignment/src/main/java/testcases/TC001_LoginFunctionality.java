package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecicMethod;
import pages.LoginPage;

public class TC001_LoginFunctionality extends ProjectSpecicMethod {
	
	@Test
	public void executeLogin() {
		
		LoginPage lp = new LoginPage();
		lp.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.verifyLoginPage();
		
	}	

}

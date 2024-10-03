package week3.day1_HomeAssignments;

public class LoginTestData extends TestData{

	public void enterUserName() {
		System.out.println("Enter valid user name");
	}
	public void enterPassWord() {
		System.out.println("Enter Valid Password");

	}

	public static void main(String[] args) {
		LoginTestData lD =new LoginTestData();
		lD.enterCredentials();
		lD.enterUserName();
		lD.enterPassWord();
		lD.navigateToHomePage();
	}
}

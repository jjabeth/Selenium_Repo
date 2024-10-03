package week3.day1_HomeAssignments;

public class LoginPage extends BasePage {

	@Override
	public void performCommonTasks() {
		System.out.println("Utilize the common function");
	}
	
	//create main method
	public static void main(String[] args) {
		// create object
		LoginPage lp = new LoginPage();
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		lp.performCommonTasks();
	}
	

}

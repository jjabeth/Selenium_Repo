package week1.day2;


public class Browser {
	
		
		// create method launchBrowser(String browsername) with one argument
		
	public String launchBrowser(String chrome) {
		// print the statement browser launched successfully
		System.out.println("Browser launched Successfully");
		return chrome;
	}
	
	// create a method as loadURL
	public void loadURL() {
		// print statement Application load URL successfully
		System.out.println("Application load URL Successfully");
		
	
	}
	public static void main(String[] args) {
		 // create object for Browser class
		Browser bc = new Browser();
		bc.launchBrowser("Chrome");
		bc.loadURL();
	}

}

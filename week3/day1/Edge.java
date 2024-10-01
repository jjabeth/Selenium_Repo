package week3.day1;

public class Edge extends Browser {

	public void takeSnap() {
		System.out.println("Take snap home screen");
	}
	public void clearCookies() {
		System.out.println("cookies cleared");
	}
	public void openURL() {
		System.out.println("This method come from Browser class");
	}
	public static void main(String[] args) {
		Edge e = new Edge();
		String name = e.browserName;
		System.out.println("From Edge Class :" +name);
		float version = e.browserVersion;
		System.out.println("From Edge Class :" +version);
		e.clearCookies();
		e.takeSnap();
		e.closeBrowser();
		e.openURL();
		e.navigateBack();
		
	}
	
	
}

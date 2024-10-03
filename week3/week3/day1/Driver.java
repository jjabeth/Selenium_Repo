package week3.day1;

public class Driver {

	public void loadURL(String URL, boolean status) {
		System.out.println("www.gmail.com" +" " + true);
	}
	
	public void loadURL(String URL) {
		System.out.println("www.gmail.com");
		//return URL;
	}
	public static void main(String[] args) {
		Driver obj = new Driver();
		obj.loadURL("URL", true);
		obj.loadURL("URL");

	}

}

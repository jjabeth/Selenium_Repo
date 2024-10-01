package week3.day1;

public class Safari extends Browser{

	public void readerMode() {
		System.out.println("I switch to reader mode");
	}
	public void fullScreenMode() {
		System.out.println("Switch to full screen");
	}
	public static void main(String[] args) {
		Safari s = new Safari();
		String bName = s.browserName;
		System.out.println("From Safari: " + bName);
		float bVersion = s.browserVersion;
		System.out.println("From Safari :" + bVersion);
		s.openURL();
		s.closeBrowser();
		s.fullScreenMode();
		s.readerMode();
		s.navigateBack();
	}
}

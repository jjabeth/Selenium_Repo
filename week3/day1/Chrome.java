package week3.day1;

public class Chrome extends Browser {
	public void openIncognito() {
		System.out.println("I can open Incognito window");
	}
	public void clearCache() {
		System.out.println("clear the cache in the browser");
	}
	public static void main(String[] args) {
		Chrome c = new Chrome();
		float version = c.browserVersion;
		System.out.println(version);
		String browserName2 = c.browserName;
		System.out.println(browserName2);
		c.clearCache();
		c.closeBrowser();
		c.navigateBack();
		c.closeBrowser();
		c.openURL();
	}
	
}

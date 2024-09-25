package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpathFacebook {

	public static void main(String[] args) throws InterruptedException {
		// Open empty Browser
		ChromeDriver driver = new ChromeDriver();
		//Load the Url
		driver.get("https://www.facebook.com");

		// java wait Thread.sleep()
		Thread.sleep(5000);
		// maximize the browser
		driver.manage().window().maximize();

		// close the browser

		// Enter the email id as test leaf.2023@gmail.com
		// using xpath is attribute based on exact match
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("testleaf.2023@gmail.com");

		// Enter the password as Tuna@321
		// using xpath attribute based on partial match
		WebElement password = driver.findElement(By.xpath("//input[contains(@data-testid,'pass')]"));
		password.sendKeys("Tuna@321");

		// click on the login button
		// using xpath text based on exact match
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
		loginButton.click();
		
		// verify title
		String title = driver.getTitle();
//		WebElement verifyTitle = driver.findElement(By.xpath("//div[text()='Log in to Facebook']"));
//		String text2 = verifyTitle.getText();
		System.out.println(title);
		if(title.equals("Log in to Facebook")) {
			System.out.println("Geeting title");
		}else {
			System.out.println("title not getting");
		}
		// verify error message
		
		WebElement verifyPage = driver.findElement(By.xpath("//div[contains(text(),'The email address you enter')]"));
		String text = verifyPage.getText();
		System.out.println(text);
		if(text.contains("The email address you entered")) {
			System.out.println("Error message is displayed");
		}else {
			System.out.println("error message not displayed");
		}
		
		//The email address you entered isn't connected to an account. 
		driver.quit();

	}

}

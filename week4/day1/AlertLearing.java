package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertLearing {

	public static void main(String[] args) throws InterruptedException {
		//Open empty browser
		ChromeDriver driver =new ChromeDriver();
		//Load the URL
		driver.get("https://www.leafground.com/alert.xhtml");
		//Maximize the browser
		driver.manage().window().maximize();
		//Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the "Prompt Box" button to trigger the alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//Alert ale =(Alert) driver.switchTo().alert()
		Alert alert = driver.switchTo().alert();

		//Type a name in the alert box
		alert.sendKeys("Josh");
		//Retrieve typed text from the alert box and verify it
		Thread.sleep(3000);
		String text = alert.getText();
		System.out.println(text);
		if(text.contains("Type")) {
			System.out.println("Text is verified");
		}else {
			System.out.println("Text is not verified");
		}
		//Dismiss the alert
		//alert.dismiss();
		//Accept the alert
		
		
		alert.accept();

		String text2 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(text2);
		if(text2.contains("User")) {
			System.out.println("Verified typed message");
		}else {
			System.out.println("Not verified");
		}
		driver.close();
		
	}

}

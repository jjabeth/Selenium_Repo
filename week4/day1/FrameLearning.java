package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameLearning {

	public static void main(String[] args) {
		//Open empty browser
		ChromeDriver driver =new ChromeDriver();
		//Load the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//Maximize the browser
		driver.manage().window().maximize();
		//Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//switch to frame
		String title = driver.switchTo().frame("iframeResult").getTitle();
		System.out.println(title);
		//Click Try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();

		String text = alert.getText();
		System.out.println(text);
		//Click ok
		alert.accept();
		if(text.contains("Press")) {
			System.out.println("Getting Alert text");
		}else {
			System.out.println("Not getting alert text");
		}
		// Verify the action is performed correctly
		String text2 = driver.findElement(By.id("demo")).getText();

		if(text2.contains("pressed")) {
			System.out.println("Action performed correctly");
		}else {
			System.out.println("Action is not performed");
		}
		//Close the browser
		driver.close();

	}

}

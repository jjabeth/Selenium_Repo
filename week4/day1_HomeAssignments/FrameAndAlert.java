package week4.day1_HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAndAlert {

	public static void main(String[] args) {

		//Open empty browser
		ChromeDriver driver =new ChromeDriver();
		//Load the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//Maximize the browser
		driver.manage().window().maximize();
		//Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click the "Try It" button inside the frame
		//switch to frame
		String title = driver.switchTo().frame("iframeResult").getTitle();
		System.out.println(title);
		//Click Try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		//Send the values
		alert.sendKeys("Joshva");
		String text = alert.getText();
		System.out.println(text);
		//Click Okay
		alert.accept();
		// Verify the action is performed correctly
		String text2 = driver.findElement(By.id("demo")).getText();
		System.out.println(text2);
		if(text2.contains("How")) {
			System.out.println("Action performed correctly");
		}else {
			System.out.println("Action is not performed");
		}
		//Close the browser
		driver.close();

	}

}

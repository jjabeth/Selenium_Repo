package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingLearning {

	public static void main(String[] args) {
		//Open empty browser
		ChromeDriver driver =new ChromeDriver();
		//Load the URL
		driver.get("https://www.irctc.co.in/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click on Flight links
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> handles = driver.getWindowHandles();
		
		// Convert set to list 
		List<String> windows = new ArrayList<String>(handles);
		driver.switchTo().window(windows.get(0));
		String pWinTitle = driver.getTitle();
		System.out.println(pWinTitle);
		
		//Switch to child window
		driver.switchTo().window(windows.get(1));
		String cWinTitle = driver.getTitle();
		System.out.println(cWinTitle);
		
		// Switch back to Parent window
		driver.switchTo().window(windows.get(0));
		//Close to Parent window
		driver.close();
		

	}

}

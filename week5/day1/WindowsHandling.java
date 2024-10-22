package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		//Open empty browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://www.flipkart.com/");
		//Maximise the browser
		driver.manage().window().maximize();
		//Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click TVs & Appliances
		driver.findElement(By.xpath("//span[text()='TVs & Appliances']")).click();
		//Click onn Smart TV
		driver.findElement(By.xpath("(//img[@class=\"xTaogf _3iTqAS\"])[2]")).click();
		//Click on First result
		driver.findElement(By.xpath("//div[contains(text(),'HUIDI 80 cm (32 inch) HD Ready LED TV ')]")).click();
		Thread.sleep(3000);
		//Using windows Handling
		Set<String> handles = driver.getWindowHandles();
		//Convert Set to List
		List<String> allWindows = new ArrayList<String>(handles);
		//Getting title for parent window
		String parentTitle = driver.getTitle();
		System.out.println("Parent Title is : " + parentTitle);
		//Switch parent to child window
		driver.switchTo().window(allWindows.get(1));
		//Getting title for child window
		String childTitle = driver.getTitle();
		System.out.println("child Title is : " + childTitle);
		// Close the parent window
		driver.switchTo().window(allWindows.get(0));
		String parentTitle1 = driver.getTitle();
		System.out.println("Parent Title : " + parentTitle1);
		driver.close();

		

	}

}

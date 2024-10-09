package week4.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingUsingIterator {

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
		//Using Iterator
		Iterator<String> iterator = handles.iterator();
		
		String pWindow = iterator.next();
		String childWin = iterator.next();
		WebDriver window = driver.switchTo().window(pWindow);
		String titleOfParent = window.getTitle();
		System.out.println(titleOfParent);
		
		WebDriver window2 = driver.switchTo().window(childWin);
		String titleOfChild = window2.getTitle();
		System.out.println(titleOfChild);
		
		//Close the Parent window
		WebDriver window3 = driver.switchTo().window(pWindow);
		window3.close();
		
		

	}

}

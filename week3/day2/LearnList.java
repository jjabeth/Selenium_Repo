package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {

public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/");
	//return for findElement - WebElement 
	
	//return for findElements -List<WebElement>
	List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
	int count = totalLinks.size();
	
//	List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	System.out.println(count);
	
	//inside 'a' tag -text 
	//print text from 'a' tag
	
	for (int i = 0; i < totalLinks.size(); i++) {
		System.out.println(totalLinks.get(i).getText());
	}
	
}
}

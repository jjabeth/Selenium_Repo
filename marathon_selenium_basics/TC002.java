package marathon_selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002 {
	public static void main(String[] args) throws InterruptedException {

		//launch the browser
		ChromeDriver driver =new ChromeDriver();
		//load the url
		driver.get("https://www.amazon.in/");
		//Maximize the window
		driver.manage().window().maximize();
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Type "Bags for boys" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Baags for boys");
		//click on search button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Choose the      item in the result (bags for boys)
		WebElement result = driver.findElement(By.xpath("//span[contains(text(),'bags for boys')]"));
		System.out.println(result.getText());
		//Print the total number of results (like 50000)
		WebElement bagResult = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
		System.out.println(bagResult.getText());
		//Select the first 2 brands in the left men (like American Tourister, Generic)
		driver.findElement(By.xpath("//input[@type='checkbox']/following::span[text()='Safari']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']/following::span[text()='Skybags']")).click();
		Thread.sleep(2000);
		//Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		//Print the first resulting bag info (name, discounted price)
		WebElement bagName = driver.findElement(By.xpath("(//h2[@class='a-size-mini s-line-clamp-1']/span[text()='Skybags'])[1]"));
		System.out.println("Bag Name is : " + bagName.getText());
		Thread.sleep(2000);
		WebElement price = driver.findElement(By.xpath("(//span[text()='₹2,100']/following::span/following-sibling::span[text()='2,100'])[1]"));
		System.out.println("Discounted price is :" + price.getText());
		//Get the page title
		String title = driver.getTitle();
		System.out.println("Title of the page is : " + title);
		//Close the browser
		driver.close();
		
		
	}

}

package week3.day2_HomeAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {
	
	public static void main(String[] args) {
		//open empty browser
		ChromeDriver driver = new ChromeDriver();
		//load url
		driver.get("https://www.ajio.com/");
		//Maximize the window
		driver.manage().window().maximize();
		//Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Type as "bags" in search field 
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		//click the lens symbol
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		// Click on "Men" under under Gender 
		List<WebElement> gender = driver.findElements(By.xpath("//div[@class='facet-body']//following-sibling::li"));
		for(int i=0;i<=gender.size()-1;i++) {
			//gender.get(2).click();
			//break;
			//label[contains(text(),'Men')]
			if(gender.get(i).getText().contains("Men")) {
				gender.get(i).click();
				break;
			}

		}
		// Click "Fashion Bags" under "Category"
		List<WebElement> gender1 = driver.findElements(By.xpath("(//div[@class='facet-body']/ul)[2]/li"));
		for(int i=0;i<=gender1.size()-1;i++) {
			String text = gender1.get(i).getText();
			if(text.contains("Fashion")) {
				gender1.get(i).click();
				break;
			}
		}
		//Print the count of the items found.
		WebElement itemCount = driver.findElement(By.xpath("//div[@class='length']"));
		System.out.println("Print the count of the Items found: " + itemCount);

		//Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brandList = driver.findElements(By.xpath("//div[@class='brand']"));
		for(int i =0;i<=brandList.size()-1;i++) {
			System.out.println("Prine the Brand Name : " + brandList.get(i).getText());
		}
		//Get the list of names of the bags and print it  
		List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for(int i =0;i<=bagName.size()-1;i++) {
			System.out.println("Print the Name of Bags: " + bagName.get(i).getText());
		}
		//Close the Browser
		driver.close();
	}

}

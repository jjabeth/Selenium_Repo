package week2.day2_HomeAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_leafground {
	/*
	 * Launch the Browser and Load the URL https://www.leafground.com/radio.xhtml.
- 
- Maximize the browser window.
Requirements:
- 
- 
.
- 
- Check and select the age group (21-40 Years) if not already selected.
	 */
	public static void main(String[] args) throws InterruptedException {
		//Initialize the WebDriver (ChromeDriver).
		ChromeDriver driver =new ChromeDriver();
		//Load the URL https://leafground.com/button.xhtml .
		driver.get("https://www.leafground.com/radio.xhtml");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add the ImplicityWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Select 'Your most favorite browser' from the radio buttons
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’
		WebElement radioBu = driver.findElement(By.xpath("//label[text()='Chennai']"));
		radioBu.click();
		System.out.println(radioBu.isEnabled());
		if(radioBu.isEnabled()) {
			System.out.println("Radio button is selected");
		}else {
			System.out.println("Radio button is not selected");
		}
		
		Thread.sleep(3000);
		radioBu.click();
		System.out.println(radioBu.isSelected());
		if(radioBu.isSelected()) {
			System.out.println("Radio button is selected");
		}else {
			System.out.println("Radio button is not selected");
		}
		//Identify the radio button that is initially selected by default.
		WebElement defaulted = driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c'])[4]"));
		boolean selected = defaulted.isEnabled();
		System.out.println(selected);
		
		//Check and select the age group (21-40 Years) if not already selected.
		WebElement checkSelected = driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c'])[5]"));
		if(checkSelected.isEnabled()) {
			System.out.println("Already selected");
		}else {
			
			checkSelected.click();
		}
		//close the browser
		driver.close();
	}

}

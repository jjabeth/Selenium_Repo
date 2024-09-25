package week2.day2_HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtons {
	
	public static void main(String[] args) {
		//Initialize the WebDriver (ChromeDriver).
		ChromeDriver driver =new ChromeDriver();
		//Load the URL https://leafground.com/button.xhtml .
		driver.get("https://leafground.com/button.xhtml");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		//Verify that the title of the page is ‘dashboard.’
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Dashboard")) {
			System.out.println("Dashboard title is verified");
		}else {
			System.out.println("Dashboard title does not display");
		}
		//navigate to backward
		driver.navigate().back();
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		WebElement checkButton = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/following-sibling::button"));
		boolean enabled = checkButton.isEnabled();
		if(enabled==true) {
			System.out.println("confirm button is enabled");
		}else {
			System.out.println("confirm button disabled");
		}
		//Find and print the position of the button with the text ‘Submit.’
		WebElement positionButton = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		Point location = positionButton.getLocation();
		System.out.println(location);
		String text = positionButton.getText();
		System.out.println(text);
		positionButton.click();
		//Find and print the background color of the button with the text 
		WebElement getColor = driver.findElement(By.xpath("(//span[text()='Submit'])[2]//parent::button"));
		String cssValue = getColor.getCssValue("background-color");
		System.out.println(cssValue);
		//‘Find the Save button color.’
		WebElement saveButtonColor = driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-save']//parent::button"));
		String cssValue2 = saveButtonColor.getCssValue("background-color");
		System.out.println(cssValue2);
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		WebElement height = driver.findElement(By.xpath("(//span[text()='Submit'])[2]//parent::button"));
		int height2 = height.getSize().getHeight();
		System.out.println("Height of the button: "+ height2);
		int width = height.getSize().getWidth();
		System.out.println("Width of the button : "+ width);
		//Close the browser window.
		driver.close();
		
	}

}

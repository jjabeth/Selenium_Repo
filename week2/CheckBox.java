package week2.day2_HomeAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		//open empty browser
		ChromeDriver driver =new ChromeDriver();
		//load the URL
		driver.get("https://leafground.com/checkbox.xhtml");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the web page elements are fully loaded Requirements:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Click on the "Basic Check box
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//Click on the "Notification Check box
		driver.findElement(By.xpath("//span[text()='Ajax']//parent::div")).click();
		//Verify that the expected message is displayed

		WebElement notification = driver.findElement(By.xpath("//div[contains(@class, 'ui-growl-message')]"));

		String notificationText = notification.getText();
		System.out.println(notificationText);
		if (notificationText.contains("Checked")) {
			System.out.println("Notification verified");
		} else {
			System.out.println("Notification not as expected");

		}
		//Click on your favorite language (assuming it's related to check boxes)
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		//Click on the "Tri-State Checkbox.
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[3]")).click();
		//Verify which tri-state option has been chosen.

		// Locate the notification message
		WebElement stateMessage = driver.findElement(By.xpath("//span[text()='State has been changed.']/following::p"));

		// Verify the notification message text
		String stateText = stateMessage.getText();
		System.out.println(stateText);
		if (stateText.contains("State = 1")) {
			System.out.println("state verified");
		} else {
			System.out.println("state not as expected");
		} 
		//Thread.sleep(12000);

		//			//Click on the "Toggle  Switch."  //div[@id='j_idt87:j_idt100']//div[contains(@class, 'ui-toggleswitch-slider')]
		WebElement element = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']//div[contains(@class,'ui-toggleswitch-slider')]"));
		////div[@id='j_idt87:j_idt100']//div[contains(@class,'ui-toggleswitch-slider')]
		////div[contains(@class,'ui-toggleswitch-slider')]
		element.click();
		//driver.close();

		//Verify that the expected message is displayed. //Checked
		WebElement toggleNotification = driver.findElement(By.xpath("//span[text()='Checked']"));
		////div[contains(@class,'ui-growl-message']/following::span
		String toggleText = toggleNotification.getText();
		System.out.println(toggleText);
		if(toggleText.contains("Checked")) {
			System.out.println("Verified the expcected message");
		}else {
			System.out.println("Does not verify expected message");
		}
		//Verify if the Check box is disabled.
		WebElement display = driver.findElement(By.xpath("(//div[@class='grid formgrid'])[5]"));
		boolean enabled = display.isEnabled();
		System.out.println(enabled);


		//Select multiple options on the page (details may be needed).
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Istanbul'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Brasilia'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		
		Thread.sleep(5000);
		//Close the web browser when done.
		driver.close();

	}

}
package week2.day2_HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		ChromeDriver driver = new ChromeDriver();

        
        driver.get("https://leafground.com/checkbox.xhtml");

       
        WebElement toggleSwitch = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']//div[contains(@class, 'ui-toggleswitch-slider')]"));

     
        toggleSwitch.click();
	}

}

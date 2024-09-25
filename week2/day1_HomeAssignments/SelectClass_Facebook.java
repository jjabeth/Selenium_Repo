package week2.day1_HomeAssignments;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_Facebook {

	public static void main(String[] args) {
		//open empty browser
		ChromeDriver driver =new ChromeDriver();
		//load the URL
		driver.get("https://en-gb.facebook.com/");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the web page elements are fully loaded Requirements:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the Create new account button
		driver.findElement(By.linkText("Create new account")).click();
		//Enter the First name
		driver.findElement(By.name("firstname")).sendKeys("Jos");
		//Enter the Surname
		driver.findElement(By.name("lastname")).sendKeys("j");
		//Enter the Mobile number or email address
		driver.findElement(By.name("reg_email__")).sendKeys("testleaf1909@gmail.com");
		//Enter the New password.
		driver.findElement(By.name("reg_passwd__")).sendKeys("pass@123");
		//Handle all three dropdowns in Date of birth
		WebElement dd = driver.findElement(By.id("day"));
		Select ddown = new Select(dd);
		ddown.selectByVisibleText("22");
		
		WebElement dd2 = driver.findElement(By.id("month"));
		Select ddown2 = new Select(dd2);
		ddown2.selectByIndex(3);
		
		WebElement dd3 = driver.findElement(By.id("year"));
		Select ddown3 = new Select(dd3);
		ddown3.selectByValue("1990");
		
		//Select the radio button in Gender.
		List<WebElement> radio = driver.findElements(By.id("sex"));
		radio.get(1).click();
		//close the browser
		driver.close();

	}

}

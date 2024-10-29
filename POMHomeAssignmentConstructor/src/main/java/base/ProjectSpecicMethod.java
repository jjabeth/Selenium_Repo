package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecicMethod {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition() {

		//Initialize WebDriver.
		driver = new ChromeDriver();
		//Maximize the browser window.
		driver.manage().window().maximize();
		//Navigate to the application's URL.
		driver.get("http://leaftaps.com/opentaps/");
		//Set up implicit waits.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@AfterMethod
	public void postCondition() {
		//close the browser
		driver.close();
	}

}

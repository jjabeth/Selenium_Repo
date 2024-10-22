package week5.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
	
	public ChromeDriver driver;
	@Test
	public void loginPage() {
		//open empty browser
		driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

}

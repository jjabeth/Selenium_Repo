package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefsSample {
	
	public ChromeDriver driver;   
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
	}

	@Given("Load the URL")
	public void load_the_url() {
		driver.get("http://leaftaps.com/opentaps/");
	}

	@When("Enter the username as DemoCSR")
	public void enter_the_username_as_demo_csr() {
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
	}
	@When("Enter the username as Demo")
	public void enter_the_username_as_demo() {
		driver.findElement(By.id("username")).sendKeys("Demo");
	}

	@When("Enter the password as crmsfa")
	public void enter_the_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("It should navigate to the next page")
	public void it_should_navigate_to_the_next_page() {
		String verText = driver.findElement(By.xpath("//h2[contains(text(),'Welcome')]")).getText();
		if(verText.contains("Welcome")) {
			System.out.println("The page navigated next page");
		}else {
			System.out.println("The page not navigated");
		}
	}
	
	@Then("It should throw error message")
	public void it_should_throw_error_message() {
	    String verErrMsg = driver.findElement(By.xpath("//div[@id='errorDiv']")).getText();
	    if(verErrMsg.contains("The Following Errors Occurred")) {
	    	System.out.println("Error message is displayed");
	    }else {
	    	System.out.println("Error message is not displayed");
	    }
	}

}

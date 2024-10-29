package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StaticParameters extends BaseClass {
	
	//public ChromeDriver driver;
	
	@Given("Launch the browser for static parameters")
	public void launch_the_browser_for_static_parameters() {
		driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
	}

	@Given("Load the URL for static parameters")
	public void load_the_url_for_static_parameters() {
		driver.get("http://leaftaps.com/opentaps/");
	}

	@When("Enter the username as {string} for static parameters")
	public void enter_the_username_as_demo_csr_for_static_parameters(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
	}

	@When("Enter the password as {string} for static parameters")
	public void enter_the_password_as_crmsfa_for_static_parameters(String passWord) {
		driver.findElement(By.id("password")).sendKeys(passWord);
	}

	@When("Click on the login button for static parameters")
	public void click_on_the_login_button_for_static_parameters() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("It should navigate to the next page for static parameters")
	public void it_should_navigate_to_the_next_page_for_static_parameters() {
		String verText = driver.findElement(By.xpath("//h2[contains(text(),'Welcome')]")).getText();
		if(verText.contains("Welcome")) {
			System.out.println("The page navigated next page");
		}else {
			System.out.println("The page not navigated");
		}
	}

	@Then("It should throw error message for static parameters")
	public void it_should_throw_error_message_for_static_parameters() {
		 String verErrMsg = driver.findElement(By.xpath("//div[@id='errorDiv']")).getText();
		    if(verErrMsg.contains("The Following Errors Occurred")) {
		    	System.out.println("Error message is displayed");
		    }else {
		    	System.out.println("Error message is not displayed");
		    }
	}

}

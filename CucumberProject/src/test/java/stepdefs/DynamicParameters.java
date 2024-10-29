package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DynamicParameters extends BaseClass  {
	
	@Given("Launch the browser for dynamic parameters")
	public void launch_the_browser_for_dynamic_parameters() {
		driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
	}

	@When("Enter the username as {string} for dynamic parameters")
	public void enter_the_username_as_for_dynamic_parameters(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
	}

	@When("Enter the password as {string} for dynamic parameters")
	public void enter_the_password_as_for_dynamic_parameters(String passWord) {
		driver.findElement(By.id("password")).sendKeys(passWord);
	}

	@When("Click on the login button for dynamic parameters")
	public void click_on_the_login_button_for_dynamic_parameters() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("It should navigate to the next page for dynamic parameters")
	public void it_should_navigate_to_the_next_page_for_dynamic_parameters() {
		String verText = driver.findElement(By.xpath("//h2[contains(text(),'Welcome')]")).getText();
		if(verText.contains("Welcome")) {
			System.out.println("The page navigated next page");
		}else {
			System.out.println("The page not navigated");
		}
	}

	@When("Click on the crmsfa link")
	public void click_on_the_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@Then("It should navigate to leads home page")
	public void it_should_navigate_to_leads_home_page() {
	   String homePageTitle = driver.getTitle();
	   if(homePageTitle.contains("CRM")) {
		   System.out.println("Navigated to home page");
	   }else {
		   System.out.println("Not navigated to home page");
	   }
	}

	@When("Click on the Leads link")
	public void click_on_the_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("Clik on the Create Lead link")
	public void clik_on_the_create_lead_link() {
		driver.findElement(By.partialLinkText("Create")).click();
	}

	@When("Enter the companyname as (.*)$")
	public void enter_the_companyname_as_tesleaf(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}

	@When("Enter the firstname as (.*)$")
	public void enter_the_firstname_as_joshva(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}

	@When("Enter the lastname as (.*)$")
	public void enter_the_lastname_as_jeyasingh(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}

	@When("Click on the Create Lead button")
	public void click_on_the_create_lead_button() {
		driver.findElement(By.className("smallSubmit")).click();
	}

	@Then("Lead should be created")
	public void lead_should_be_created() {
		String title = driver.getTitle();
		if(title.contains("View Lead")) {
			System.out.println("Lead created");
		}else {
			System.out.println("Lead not created");
		}
	}

}

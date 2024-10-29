package stepdefsHomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepdefs.BaseClass;

public class SalesforceHomeAssignments extends BaseClassSalesforceHomeAssignments {

	@Given("Launch the browser for salesForce")
	public void launch_the_browser_for_sales_force() {
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}
	@Given("Load the url for salesForce")
	public void load_the_url_for_sales_force() {
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@When("Enter the username as dilip@testleaf.com")
	public void enter_the_username_as_dilip_testleaf_com() {
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
	}

	@When("Enter the password as leaf@{int}")
	public void enter_the_password_as_leaf(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("leaf@2024");
	}

	@When("Click on the login in button")
	public void click_on_the_login_in_button() {
		driver.findElement(By.id("Login")).click();
	}

	@Then("It shoul navigated to HomePage")
	public void it_shoul_navigated_to_home_page() throws InterruptedException {
		Thread.sleep(2000);
		String navHome = driver.findElement(By.xpath("//span[@class='breadcrumbDetail uiOutputText']")).getText();
		if(navHome.contains("Home")) {
			System.out.println("It is navigated to Home Page");
		}else {
			System.out.println("It is not navigated to Home Page");
		}

	}

	@When("Click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

	@When("Click view All and click Sales from App Launcher")
	public void click_view_all_and_click_sales_from_app_launcher() throws InterruptedException {
		mouseActions =new Actions(driver);
		Thread.sleep(2000);
		WebElement mouseOver = driver.findElement(By.xpath("//button[text()='View All']"));
		mouseActions.moveToElement(mouseOver).click().build().perform();
	}

	@When("Click on Accounts tab")
	public void click_on_accounts_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement scrollToele = driver.findElement(By.xpath("//p[text()='Accounts']"));
		mouseActions.scrollToElement(scrollToele).build().perform();
		Thread.sleep(1000);
		scrollToele.click();
	}

	@When("Click on New button")
	public void click_on_new_button() throws InterruptedException {
		Thread.sleep(1000);;
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}

	@When("Enter your name as account name")
	public void enter_your_name_as_account_name() {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Joshva");
	}

	@When("Select Ownership as Public")
	public void select_ownership_as_public() throws InterruptedException {
		driver.findElement(By.xpath("//button[@aria-label='Ownership']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='Public']")).click();
	}

	@When("Click on the save button")
	public void click_on_the_save_button() {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@Then("verify Account name")
	public void verify_account_name() {
		String verifyAccName = driver.findElement(By.xpath("//div[@class='slds-media__body']/h1")).getText();
		if(verifyAccName.contains("Joshva")) {
			System.out.println("Account name is verified sucessfully");
		}else {
			System.out.println("Account name is not verified");
		}
	}
	

}

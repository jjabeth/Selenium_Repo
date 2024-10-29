package stepdefsHomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SaleforceHomeAssignmentsDynamicParameters extends BaseClassSalesforceHomeAssignments{


	@Given("Launch the browser for salesForce to DynmicPara")
	public void launch_the_browser_for_sales_force_to_dynmic_para() {
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}

	@Given("Load the url for salesForce for DynmicPara")
	public void load_the_url_for_sales_force_for_dynmic_para() {
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@When("Enter the username for DynmicPara as (.*)$")
	public void enter_the_username_for_dynmic_para_as_user_name(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
	}

	@When("Enter the password for DynmicPara as (.*)$")
	public void enter_the_password_for_dynmic_para_as_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on the login in button for DynmicPara")
	public void click_on_the_login_in_button_for_dynmic_para() {
		driver.findElement(By.id("Login")).click();
	}

	@Then("It shoul navigated to HomePage for DynmicPara")
	public void it_shoul_navigated_to_home_page_for_dynmic_para() throws InterruptedException {
		Thread.sleep(2000);
		String navHome = driver.findElement(By.xpath("//span[@class='breadcrumbDetail uiOutputText']")).getText();
		if(navHome.contains("Home")) {
			System.out.println("It is navigated to Home Page");
		}else {
			System.out.println("It is not navigated to Home Page");
		}
	}

	@When("Click on toggle menu button from the left corner for DynmicPara")
	public void click_on_toggle_menu_button_from_the_left_corner_for_dynmic_para() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

	@When("Click view All and click Sales from App Launcher for DynmicPara")
	public void click_view_all_and_click_sales_from_app_launcher_for_dynmic_para() throws InterruptedException {
		mouseActions =new Actions(driver);
		Thread.sleep(2000);
		WebElement mouseOver = driver.findElement(By.xpath("//button[text()='View All']"));
		mouseActions.moveToElement(mouseOver).click().build().perform();
	}

	@When("Click on Accounts tab for DynmicPara")
	public void click_on_accounts_tab_for_dynmic_para() throws InterruptedException {
		Thread.sleep(1000);
		WebElement scrollToele = driver.findElement(By.xpath("//p[text()='Accounts']"));
		mouseActions.scrollToElement(scrollToele).build().perform();
		Thread.sleep(1000);
		scrollToele.click();
	}
	
	@When("Search for the account using unique account name as (.*)$")
	public void search_for_the_account_using_your_unique_account_name(String accountName) throws InterruptedException {
		//driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys(accountName + Keys.ENTER);
		WebElement mouseOver = driver.findElement(By.xpath("(//a[@title='Joshva'])[1]"));
		mouseActions.moveToElement(mouseOver).build().perform();
		Thread.sleep(2000);
		driver.executeScript("arguments[0].click();", mouseOver);

	}

	@And("Click the dropdown icon next to the account and select Edit")
	public void click_the_dropdown_icon_next_to_the_account_and_select_edit() {
		driver.findElement(By.xpath("//li[@class='slds-dropdown-trigger slds-dropdown-trigger_click slds-button_last overflow']")).click();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
	}
	
	@And("Enter a unique number in the Phone field (.*)$")
	public void enter_a_unique_number_in_the_phone_field_parameterized_value(String phoneNumber) throws InterruptedException {
		WebElement phoneNum = driver.findElement(By.xpath("//input[@name='Phone']"));
		phoneNum.clear();
		phoneNum.sendKeys(phoneNumber);
		Thread.sleep(300);
	}
	
	@And("Set Type to Technology Partner")
	public void set_type_to_technology_partner() throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@aria-label='Type']")).click();
		Thread.sleep(200);
		WebElement techPartner = driver.findElement(By.xpath("//span[@title='Technology Partner']"));
		driver.executeScript("arguments[0].click();", techPartner);
		//scrollType.click();
		Thread.sleep(400);
	}

	@And("Set Industry to Healthcare")
	public void set_industry_to_healthcare() throws InterruptedException {
		//scroll the page for invisible element
		WebElement scrollEle = driver.findElement(By.xpath("//label[text()='Employees']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", scrollEle);
		mouseActions.moveToElement(scrollEle).build().perform();
		driver.findElement(By.xpath("//button[@aria-label='Industry']")).click();
		WebElement healthCare = driver.findElement(By.xpath("//span[text()='Healthcare']"));
		driver.executeScript("arguments[0].click();", healthCare);
	}

	@And("Enter the Billing Address (.*)$")
	public void enter_the_billing_address_parameterized_value(String billAddress) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Billing Street']/following-sibling::div//textarea")).sendKeys(billAddress);
	}

	@And("Enter the Shipping Address (.*)$")
	public void enter_the_shipping_address_parameterized_value(String shipAddress) {
		driver.findElement(By.xpath("//label[text()='Shipping Street']/following-sibling::div//textarea")).sendKeys(shipAddress);
	}

	@And("Set Customer Priority to Low")
	public void set_customer_priority_to_low() throws InterruptedException {
		//Scroll the page for invisible element
		WebElement scrollEleVis = driver.findElement(By.xpath("//label[text()='Customer Priority']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", scrollEleVis);
		mouseActions.moveToElement(scrollEleVis).build().perform();
		driver.findElement(By.xpath("//button[@aria-label='Customer Priority']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Low']")).click();
	}

	@And("Set SLA to Silver")
	public void set_sla_to_silver() throws InterruptedException {
		driver.findElement(By.xpath("//button[@aria-label='SLA']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Silver']")).click();
	}

	@And("Set Upsell Opportunity to No")
	public void set_upsell_opportunity_to_no()  throws InterruptedException {
		driver.findElement(By.xpath("//button[@aria-label='Upsell Opportunity']")).click();
		Thread.sleep(1000);
		////button[@aria-label='Upsell Opportunity']/following::span[text()='No']
		driver.findElement(By.xpath("(//span[text()='No'])[1]")).click();
	}
	
	@And("Set Active to NO")
	public void set_active_to_no() throws InterruptedException {
		driver.findElement(By.xpath("//button[@aria-label='Active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-label='Active']/following::span[@title='No']")).click();
	}
	
	@And("Click on the Save button")
	public void click_on_the_save_button() {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@Then("verify the phone number")
	public void verify_the_phone_number() {
		String verifyPhoneNumber = driver.findElement(By.xpath("//p[@title='Phone']/following-sibling::p")).getText();
		System.out.println(verifyPhoneNumber);
		if(verifyPhoneNumber.contains("123456546")) {
			System.out.println("PhoneNumber is verified sucessfully");
		}else {
			System.out.println("PhoneNumber is not verified");
		}
	}


}

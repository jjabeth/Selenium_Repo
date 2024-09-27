package marathon_selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC001 {
	public static void main(String[] args) throws InterruptedException {

		//Launch the Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		//Load the Url "https://www.pvrcinemas.com/"
		driver.get("https://www.pvrcinemas.com/");
		//Maximize the window
		driver.manage().window().maximize();
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Choose Your location as "Chennai" (sometimes it will be located automatically)
		//Click on Cinema under Quick Book
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		Thread.sleep(2000);
		//Select Your Cinema
		driver.findElement(By.xpath("//div[@aria-label='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'INOX The Marina Mall')]")).click();
		//Select Your Date as Tomorrow
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		//Select Your Movie
		driver.findElement(By.xpath("(//span[text()='LUBBER PANDHU'])[2]")).click();
		Thread.sleep(2000);
		//Select Your Show Time
		driver.findElement(By.xpath("//span[contains(text(),'04:10 PM')]")).click();
		//Click on Book Button
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		//Click Accept on Term and Condition
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//Click any one available seat
		driver.findElement(By.xpath("//span[@id='CL.CLUB|K:17']")).click();
		//print seat number
		WebElement seatNumber = driver.findElement(By.xpath("//div[@class='seat-number']"));
		System.out.println("Seat Number is :" + seatNumber.getText());
		//Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//Print the Seat info under book summary
		WebElement seatInfo = driver.findElement(By.xpath("//div[@class='seat-info']"));
		System.out.println("Print the Seat info : " + seatInfo.getText());
		//Print the grand total under book summary
		WebElement grandTotal = driver.findElement(By.xpath("(//span[text()='221.46'])[2]"));
		System.out.println("Grand Total is : " + grandTotal);
		//Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//Close the popup
		driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]")).click();
		//Print Your Current Page title
		String currentPageTitle = driver.getTitle();
		System.out.println("Current Page Title is : " + currentPageTitle);
		//Close Browser
		driver.close();

	}

}

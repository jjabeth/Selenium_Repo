package week5.day2_HomeAssignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class SnapDeal_ActionClass {

	public static void main(String[] args) throws IOException, InterruptedException {

		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Load the URL (https://www.snapdeal.com/)
		driver.get("https://www.snapdeal.com/");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Go to "Men's Fashion".
		Actions mouseActions = new Actions(driver);
		mouseActions.moveToElement(driver.findElement(By.xpath("(//a[@class='menuLinks leftCategoriesProduct ']/span)[2]"))).perform();
		//Go to "Sports Shoes".
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		//Get the count of sports shoes.
		String itemsCount = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Count of the sports shoes are : " + itemsCount);
		//Click on "Training Shoes".
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		//Sort the products by "Low to High"
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		//Check if the displayed items are sorted correctly.
		Thread.sleep(5000);
		List<WebElement> sortedItems = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		boolean isSorted = true;
		for (int i = 0; i < sortedItems.size() - 1; i++) {
			System.out.println("sortedItems : " + sortedItems.get(i).getText());
			if (Integer.parseInt(sortedItems.get(i).getText().replace("Rs. ", "").replace(",", "")) > 
			Integer.parseInt(sortedItems.get(i + 1).getText().replace("Rs. ", "").replace(",", ""))) {
				isSorted = false;
				break;
			}
		}
		System.out.println("Items sorted correctly: " + isSorted);
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/snapdealDisplayedItems.png");
		FileHandler.copy(source, dest);
		//Select any price range ex:(500-700).
		WebElement leftSlider = driver.findElement(By.xpath("//a[@class='price-slider-scroll left-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
		WebElement rightSlider = driver.findElement(By.xpath("//a[@class='price-slider-scroll right-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
		//Scroll to view
		WebElement toView = driver.findElement(By.xpath("(//div[@class=\"filter-type-name lfloat\"]/following-sibling::div)[2]"));
		mouseActions.scrollToElement(toView).perform();
		Thread.sleep(2000);
		mouseActions.dragAndDropBy(leftSlider, 5, 0).perform();
		Thread.sleep(7000);
		mouseActions.scrollToElement(toView).perform();
		Thread.sleep(2000);
		mouseActions.dragAndDropBy(rightSlider, -210, 0).perform();
		Thread.sleep(7000);
		//Filter by any color.
		/*
		 * mouseOver the color filter
		 * mouseOver the particular color and select
		 */
		WebElement mousOveColFil = driver.findElement(By.xpath("//div[@class='filter-content ']/div[@data-name='Color_s']"));
		mouseActions.moveToElement(mousOveColFil).build().perform();
		Thread.sleep(7000);
		List<WebElement> colrOfShoes = driver.findElements(By.xpath("//span[contains(@class,'filter-color')]"));
		colrOfShoes.get(0).click();
		//Verify all the applied filters.
		Thread.sleep(300);
		WebElement appliedFilters = driver.findElement(By.xpath("(//div[@class='filters'])[1]"));
		System.out.println(appliedFilters.getText());
		//Mouse hover on the first resulting "Training Shoes".
		WebElement mouseOver = driver.findElement(By.xpath("(//div[contains(@class,'product-tuple-listing')])[1]"));
		mouseActions.moveToElement(mouseOver).build().perform();
		WebElement viewMouseOver = driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])[1]"));
		mouseActions.moveToElement(viewMouseOver).build().perform();
		//Click the "Quick View" button
		Thread.sleep(3000);
		WebElement quickView = driver.findElement(By.xpath("(//a[@class='dp-widget-link hashAdded']//input)[1]/following::div[2]"));
		quickView.click();		
		//Print the cost and the discount percentage.
		Thread.sleep(2000);
		String befDisPrice = driver.findElement(By.xpath("//span[contains(@class,'strikee')]")).getText();
		System.out.println("Print the price before discount is : " + befDisPrice);
		//Print the cost is
		String afDisPrice = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Print the cost is : " + afDisPrice);
		//Print the Discount Percentage 
		String DisPercentage = driver.findElement(By.xpath("//span[contains(@class,'percent-desc')]")).getText();
		System.out.println("Print the Discount Percentage is : " + DisPercentage);
		//Take a snapshot of the shoes.  
		WebElement shoeSnap = driver.findElement(By.xpath("(//img[@class='cloudzoom'])[1]"));
		File source1 = shoeSnap.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./snaps/snapdealshoesPhoto.png");
		FileHandler.copy(source1, dest1);
		//Close the current window.
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[contains(@class,'close')]/i[@class='sd-icon sd-icon-delete-sign']")).click();
		//Close the main window.
		driver.close();








	}

}

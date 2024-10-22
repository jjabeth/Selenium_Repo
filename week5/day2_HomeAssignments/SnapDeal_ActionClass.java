package week5.day2_HomeAssignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.sukgu.Shadow;

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
		driver.findElement(By.xpath("//i[@class=\"sd-icon sd-icon-expand-arrow sort-arrow\"]")).click();
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		//Check if the displayed items are sorted correctly.
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
		mouseActions.dragAndDropBy(leftSlider, 7, 0).perform();
		Thread.sleep(7000);
		mouseActions.scrollToElement(toView).perform();
		Thread.sleep(2000);
		mouseActions.dragAndDropBy(rightSlider, -179, 0).perform();
		Thread.sleep(7000);
		//Filter by any colour.
		WebElement toView1 = driver.findElement(By.xpath("//a[contains(text(),' White & Blue')]"));
		//WebElement toView1 = driver.findElement(By.xpath("//span[@style="background:White&Blue;'\"]"));
		//driver.executeScript("arguments[0].scrollIntoView(true).click();", toView1);
		//toView1.click();
		Thread.sleep(7000);
		mouseActions.scrollToElement(toView1).perform();
		mouseActions.click().perform();
		//Verify all the applied filters.
		WebElement appliedFilters = driver.findElement(By.xpath("(//div[@class='filters'])[1]"));
		System.out.println(appliedFilters.getText());
		//Mouse hover on the first resulting "Training Shoes".
		//mouseActions.moveToElement(driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]"))).perform();
		WebElement mouseOver = driver.findElement(By.xpath("(//div[contains(@class,'product-tuple-listing')])[1]"));
		mouseActions.moveToElement(mouseOver).click().build().perform();
		//Click the "Quick View" button
		//driver.findElement(By.xpath("(//div[contains(@class,'center quick-view-bar')])[1]")).click();
		//driver.findElement(By.xpath("(//a[@class='dp-widget-link hashAdded']//input)[1]/following::div[2]")).click();
		Thread.sleep(3000);
		//WebElement quickView = driver.findElement(By.xpath("(//a[@class='dp-widget-link hashAdded']//input)[1]/following::div[2]"));
		WebElement quickView = driver.findElement(By.xpath("(//div[contains(@class,'product-tuple-listing')])[1]//div[contains(@class,'quick-view-bar')]"));
		driver.executeScript("arguments[0].scrollIntoView(true);", quickView);
		quickView.click();
		//driver.executeScript("arguments[0].click;", quickView);
		
		driver.switchTo().frame(quickView);
		quickView.click();
		
		//Print the cost and the discount percentage.
	
		Set<String> handles = driver.getWindowHandles();
		//Convert Set to List
		List<String> allWin = new ArrayList<String>(handles);
		driver.switchTo().window(allWin.get(0));
		String mainWinTitle = driver.getTitle();
		System.out.println("Title of the Main window is : " + mainWinTitle);
		//driver.switchTo().window(allWin.get(1));
		//String childWinTitle = driver.getTitle();
		//System.out.println("Title of the Main window is : " + childWinTitle);
		String costAndDisPercentage = driver.findElement(By.xpath("//div[@class=' pdp-e-i-PAY clearfix']")).getText();
		System.out.println(costAndDisPercentage);
		//Take a snapshot of the shoes.  
		WebElement shoeSnap = driver.findElement(By.xpath("(//img[@class='cloudzoom'])[1]"));
		File source1 = shoeSnap.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./snaps/shoesPhoto.png");
		FileHandler.copy(source1, dest1);
		//Close the current window.
		driver.close();
		//Close the main window.
		driver.switchTo().window(allWin.get(0));
		driver.close();

		
		
		
		
		
		
				
	}

}

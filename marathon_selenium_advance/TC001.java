package marathon_selenium_advance;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class TC001 {

	public static void main(String[] args) throws InterruptedException, IOException {

		//launch the browser
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification");
		ChromeDriver driver = new ChromeDriver(option);
		//load the url
		driver.get("https://www.tatacliq.com/");
		//driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.id("wzrk-cancel")).click();
		//maximize browser
		driver.manage().window().maximize();
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//MouseHover on 'Brands'
		WebElement mouseOver = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions mouseActions = new Actions(driver);
		mouseActions.moveToElement(mouseOver).perform();
		//MouseHover on 'Watches & Accessories'
		WebElement mouseOver2 = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		mouseActions.moveToElement(mouseOver2).perform();
		//Choose the first option from the 'Featured brands'.
		//Thread.sleep(5000);
		WebElement mouseOver3 = driver.findElement(By.xpath("//div[@class='DesktopHeader__brandsDetails']"));
		mouseActions.moveToElement(mouseOver3).click().perform();
		//Select sortby: New Arrivals
		WebElement dDown = driver.findElement(By.xpath("//select[@label='Popularity']"));
		Select dd = new Select(dDown);
		dd.selectByVisibleText("New Arrivals");
		//choose men from catagories filter.
		driver.findElement(By.xpath("(//div[text()='Men'])[1]")).click();
		//print all price of watches
		Thread.sleep(3000);
		List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		String initalPrice = priceList.get(0).getText();
		System.out.println(priceList.size());
		for (int i=0;i<=priceList.size()-1;i++) {
			String allWatchesPrice = priceList.get(i).getText();
			System.out.println(allWatchesPrice);
		}
		//click on the first resulting watch
		driver.findElement(By.xpath("(//a[@target='_blank']/div[@class=\"ProductModule__dummyDiv\"])[1]")).click();
		//Switch to new window
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		String mainWindow = itr.next();
		String childWin = itr.next();
		driver.switchTo().window(childWin);
		//click Add to Bag  and get count from the Bag cart icon.
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		//Take a snap
		WebElement bagSym = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']"));
		File source = bagSym.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/TataCliqBag.png");
		FileHandler.copy(source, dest);
		//compare two price are similar
		String pdtPrice = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']")).getText();
		String price = pdtPrice.replaceAll("[^0-9]", "");
		//System.out.println(price);
		//for(int i=0;i<=pdtPrice.length();i++) {
			if(initalPrice.contains(price)) {
				System.out.println("Two prices are similar");
			}else {
				System.out.println("Two prices are not similar");
			}
		//}
		//Click on the Bag cart icon
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		//Take a snap of the resulting page.
		File source1 = driver.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./snaps/TataCliqResultPage.png");
		FileHandler.copy(source1, dest1);
		//Close All the opened windows one by one.
		driver.close();
		//close maind window
		driver.switchTo().window(mainWindow);
		driver.close();
		
	}

}

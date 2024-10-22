package week5.day1;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		//Open empty browser
		ChromeDriver driver = new ChromeDriver();
		//load the url
		driver.get("https://erail.in/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter "MAS" as the from station
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS"+Keys.ENTER);
		//Enter "MDU" as the To station
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU"+Keys.ENTER);
		//Uncheck the "Sort on date" checkbox
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		//Retrieve the train names from the WebTable
		List<WebElement> trainName = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr/td[2]"));
		for(int i=0;i<trainName.size()-1;i++) {
			String trainNameList = trainName.get(i).getText();
			System.out.println("Train Names List are : " +trainNameList);

			//Verify if there are any duplicate train names in the web table
			if(trainName.get(i).getText().equals(trainName.get(i+1).getText())) {
				System.out.println("Duplicate Train List are : " + trainName.get(i).getText());
			}else {
				System.out.println("Unique Train List are : " + trainName.get(i).getText());
			}
		}	
		//Close the browser
		driver.close();
	}

}

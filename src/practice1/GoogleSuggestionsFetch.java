package practice1;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestionsFetch 
{
	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");

		// Enter the query string “Cheese”
		WebElement query = driver.findElement(By.name("q"));
		query.sendKeys("Cheese");

		Thread.sleep(2000);
		WebElement resultsDiv = driver.findElement(By.className("aajZCb"));

		// And now list the suggestions

		List<WebElement> allSuggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		Thread.sleep(2000);
		for (WebElement webElement : allSuggestions) 
		{
			//System.out.println(webElement.getSize());
			System.out.println(webElement.getText());
		}
		
		
	}
}
/*
  OUTPUT:--->this output not remains same changes time to time and system to system....

Cheese
Dairy product
Cheesecake
Sweet
cheese burst pizza
Cheese in the Trap
Television series
cheese price
cheese pizza
Cheese puffs
Food
cheese slice
cheesecake near me
cheese in tamil
 */
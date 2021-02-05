//Open Browser, Enter Url(bluestone), goto Search and search for rings
//move the courser to price, get the count of below 10k Rs. , close browser.
package Assignments;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Senario6 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-text typeahead']")).sendKeys("rings",Keys.ENTER);
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		List<WebElement> prices=driver.findElements(By.xpath("//section[@id='Price-form']"));
		for (WebElement pricelist : prices) 
		{
			a.moveToElement(pricelist).build().perform();
			Thread.sleep(4000);
		}		
		driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']")).click();
		

		driver.close();
	}
}



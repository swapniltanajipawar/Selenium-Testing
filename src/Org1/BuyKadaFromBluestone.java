package Org1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BuyKadaFromBluestone 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		List<WebElement> allJ=driver.findElements(By.xpath("//a[text()='All Jewellery ']"));

		Actions a=new Actions(driver);
		for(WebElement j : allJ)
		{
			a.moveToElement(j).build().perform();
			Thread.sleep(1000);
		}
		driver.findElement(By.xpath("//span[text()='Kadas']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[contains(@alt,'The Udith Kada For Him')]")).click();
		Thread.sleep(4000);
		for(String  win : driver.getWindowHandles())
		{
			driver.switchTo().window(win);
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()=' Select Size ']")).click();
		driver.findElement(By.xpath("//li[@data-key='02']/span[@class='size']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		String error1=driver.findElement(By.xpath("//a[text()='The Udith Kada For Him']")).getText();
		System.out.println(error1);
	}
}
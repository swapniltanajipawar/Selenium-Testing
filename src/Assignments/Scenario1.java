package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		List<WebElement> coins =driver.findElements(By.xpath("//li[@id='goldCoins']/a"));
		Actions a=new Actions(driver);
		for (WebElement goldcoins : coins) 
		{
			a.moveToElement(goldcoins).perform();
			Thread.sleep(4000);
		}
	
		driver.findElement(By.xpath("//span[@class='prcs-d' and  @data-p='gold-coins-weight-20gms,m'] ")).click();
		Thread.sleep(2000);
		WebElement page =driver.findElement(By.xpath("//h1[text()='20 gram 24 KT Gold Coin']"));
		if(page.isDisplayed())
		{
			System.out.println(page.getText());
		}
		else
		{
			System.out.println("Not Displayed");
		}
		driver.close();
	}
}




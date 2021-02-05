package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 
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
			a.moveToElement(goldcoins).build().perform();
			Thread.sleep(4000);
		}

		driver.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-2gms,m']")).click();
		Thread.sleep(2000);
		WebElement page =driver.findElement(By.xpath("//h1[@class='title-5']"));
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

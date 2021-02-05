package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		Thread.sleep(1000);
	      driver.findElements(By.xpath("//li[@class='menuparent']/a[contains(.,'Jewellery')]"));
		Thread.sleep(1000);
		List<WebElement> subMenues= driver.findElements(By.xpath("//div[@class='wh-submenu new-column']"));
		for(WebElement subMenuName:subMenues)
		{
			a.moveToElement(subMenuName).build().perform();
		}
		Thread.sleep(10000);
	}
}
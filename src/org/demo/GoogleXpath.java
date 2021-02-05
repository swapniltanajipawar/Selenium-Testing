package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleXpath 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement search =driver.findElement(By.xpath("//input[@aria-label='Search']"));
		search.sendKeys("Java" , Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a=new Actions(driver);

		for(WebElement menuName:menus)
		{
			System.out.println(menuName.getText());
			a.moveToElement(menuName).build().perform();
		}
	}
}
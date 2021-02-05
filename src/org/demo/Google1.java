package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.google.com/");
		WebElement search =driver.findElement(By.xpath("//input[@aria-label='Search']"));
		search.sendKeys("Java" , Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement link: links)
		{
			System.out.println(link.getText());
		}
		driver.close();

	}
}
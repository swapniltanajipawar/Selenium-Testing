package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//div[@class='_2QfC02']/button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9325837712");
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Swapnil@123",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Apple",Keys.ENTER);
		driver.findElement(By.xpath("//div[ @class='_4rR01T' and contains(.,'Apple iPhone XR (Black, 64 GB) (Includes EarPods, Power Adapter)')]")).click();
		
	}
}

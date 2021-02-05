package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VijaySalesXpath 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vijaysales.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='ctl00$txtSearch']")).sendKeys("Iron",Keys.ENTER);
		driver.findElement(By.xpath("//ul[@id='inner-slider1']/a[@class='vj-cur-pnter']/descendant::img[@class='img-responsive Dynamic-Bucket-img lazy b-loaded']")).click();
		driver.findElement(By.xpath("//a[contains(.,'Stores Locator')]")).click();
		String s1=driver.findElement(By.xpath("//h6[@class='h5 text-uppercase location-head']")).getText();
		System.out.println(s1);
	}
}

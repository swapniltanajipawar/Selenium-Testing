package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();// return type is string
		System.out.println(url);//To get the url of the website
		System.out.println(driver.getTitle());//Title of the web page
		System.out.println(driver.getPageSource());//To get the page source->Generally we dont use this method
		driver.quit();
	}
}
/*
ChromeDriver 



*/
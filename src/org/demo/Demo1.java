package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");//sytemclass.setProperty("key","value")
		WebDriver driver = new ChromeDriver();//launching a browser here
		//Upcasing we did because cant create object of interface and to avoid unwanted methods
		//and to doing this we can easily change the browser--->Load the Browser
		driver.manage().window().maximize();//maximize
		//	driver.get("https://www.google.com/");//Load the url
		driver.navigate().to("https://www.google.com/");//to() internally use the get() method to load the url.
		Thread.sleep(2000);
		driver.navigate().back();//back
		Thread.sleep(2000);
		driver.navigate().forward();//forward
		Thread.sleep(2000);//sleep
		driver.navigate().refresh();//refresh
		driver.close();//close the url page.

	}
}
package org.qsp.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUrbanLadder 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		UrbanLadder u1=new UrbanLadder(driver);
		u1.closeClick();
		u1.saleMouseHover(driver);
		u1.sofaClick();
		u1.viewProductClick();
	}

}

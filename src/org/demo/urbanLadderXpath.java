package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class urbanLadderXpath
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();//To close popup.
		WebElement sale=driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
		System.out.println(sale.getText());
		 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("sofa");
	    driver.findElement(By.xpath("//button[@id='search_button']")).click();
}
}
/*
 //li [@class='topnav_item saleunit']/span[@class='topnav_itemname']          ----->for sale
 
//span[contains(.,'Sale')]            --->for inner text  
 
*/
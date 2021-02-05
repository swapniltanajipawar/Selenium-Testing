package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement email =driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		email.sendKeys("swapniltanajipawar@gmail.com");
		WebElement passward =driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		passward.sendKeys("spswapnil");
		WebElement login =driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		login.click();
		
	}
}



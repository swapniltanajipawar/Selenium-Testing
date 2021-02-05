package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		Thread.sleep(2000);
		/*driver.findElement(By.id("identifierId")).sendKeys("swapniltanajipawar@gmail.com",Keys.ENTER);
		WebElement login =driver.findElement(By.className("\"whsOnd zHQkBf\""));
		login.click();
		driver.findElement(By.id("password")).sendKeys("skskjdjfjdk");
		WebElement login1 =driver.findElement(By.className("whsOnd zHQkBf"));
		login1.click();
		 */

		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("swapniltanajipawar@gmail.com");

		driver.findElement(By.id("identifierNext")).click();

		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("spswapnil");

		driver.findElement(By.id("passwordNext")).click();
	

	}
}





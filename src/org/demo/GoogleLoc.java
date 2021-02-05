package org.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleLoc
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Loding browser
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("Java" , Keys.ENTER);//some time google not showing for search option so 
		//for internal search we using keys.ENTER
		//driver.findElement(By.name("btnK")).click();
		

	}
}

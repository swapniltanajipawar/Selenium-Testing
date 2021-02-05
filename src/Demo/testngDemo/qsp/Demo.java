package Demo.testngDemo.qsp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;

	@BeforeMethod
	public void beforeM() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterM() 
	{
		driver.close();
	}
	@Test
	public void tc_1() throws InterruptedException 
	{
		WebElement search = driver.findElement(By.xpath("//input[@aria-label='Search']"));
		search.sendKeys("Java", Keys.ENTER);
		System.out.println("tc1");
	}
	@Test
	public void tc_2() throws InterruptedException 
	{
		WebElement search = driver.findElement(By.xpath("//input[@aria-label='Search']"));
		search.sendKeys("testng", Keys.ENTER);
		System.out.println("tc2");
	}

}

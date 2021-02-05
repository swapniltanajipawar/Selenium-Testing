package Org1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScrollDown
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		/*
		 * js.executeScript("window.scrollBy(0,1000)"); Thread.sleep(2000);//down
		 * js.executeScript("window.scrollBy(0,-500)");//up
		 */
		js.executeScript("window.scrollBy(300,0)");//Right
		Thread.sleep(2000);
		//js.executeScript("window.scrollBy(-200,0)");//Left
		/*
		 * js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//down
		 * Thread.sleep(2000);
		 * js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");//up
		 */	
		WebElement sfh=driver.findElement(By.xpath("//h2[contains(.,'Stand for Handmade')]"));
        js.executeScript("arguments[0].scrollIntoView()", sfh);
        
	}
}

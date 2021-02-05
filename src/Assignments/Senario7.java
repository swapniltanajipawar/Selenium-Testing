package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Senario7 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//a[@title='Jewellery with Next Day Delivery']"));
		a.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		Actions a1=new Actions(driver);
		WebElement ele1=driver.findElement(By.xpath("//span[@data-p='next-day-delivery,m']"));
		a1.moveToElement(ele1).build().perform();
		System.out.println(driver.findElement(By.xpath("/span[@data-displayname='next day delivery']/span[@class='items-count']")).getText());
		driver.close();
	}
}
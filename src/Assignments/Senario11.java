//Senarion 11: Based on the Robot class.
//Google.com, search java, double click on java, copy it (robot), paste it, press enter button.

package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Senario11
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
        driver.get("http://www.google.com/");
        Thread.sleep(2000);
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("Java" , Keys.ENTER);
		Actions a=new Actions(driver);
        Thread.sleep(2000);
        a.doubleClick(driver.findElement(By.xpath("//h2/span[contains(.,'Java')]"))).perform();
        
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_C);
        r.keyRelease(KeyEvent.VK_C);
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ENTER);
	}
}


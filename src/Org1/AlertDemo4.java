package Org1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo4
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//implicit wait is used for the find elemnt and findElemnts
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("timerAlertButton")).click();
		WebDriverWait ww=new WebDriverWait(driver,5);
		ww.until(ExpectedConditions.alertIsPresent());//this wait till the alert will come
		//so thats why we used explicit wait here
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
	}
}

package Org1;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rols_roycemotorcars_screenshot
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.rolls-roycemotorcars.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("")).click();
		List<WebElement> menus =driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a=new Actions(driver);
		
		for(WebElement menuName:menus)
		{
			String mName=menuName.getText();
			System.err.println(mName);
			a.moveToElement(menuName).build().perform();
			Thread.sleep(4000);
			DemoScreenShot.ScreenShot(driver, mName);
		}
		
	}
}

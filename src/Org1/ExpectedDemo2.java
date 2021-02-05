package Org1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpectedDemo2
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///E:/Selenium/DisabledText.html");
		WebDriverWait ww = new WebDriverWait(driver,10);
		driver.findElement(By.id("abc")).sendKeys("name");
		ww.until(new ExpectedCondition<Boolean>()
		{
			@Override
			public Boolean apply(WebDriver arg0) {
				// TODO Auto-generated method stub
				return !driver.findElement(By.id("xyz")).isEnabled();
			}
		});
		driver.findElement(By.id("pqr")).sendKeys("Sushant");

	}
}
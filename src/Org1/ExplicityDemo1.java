package Org1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityDemo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.name("textA")).sendKeys("name");
		WebDriverWait ww=new WebDriverWait(driver,10);
		ww.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("iamtextbox"))));
		driver.findElement(By.name("iamtextbox")).sendKeys("ANkur");
	}
}

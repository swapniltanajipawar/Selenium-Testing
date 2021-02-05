package Assignments;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Senario10
	{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bluestone.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='form-text typeahead']")).sendKeys("rings",Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(.,'Gender')]/span")).click();
			WebElement ele=driver.findElement(By.xpath("//div[@class=\"form-item \"]/descendant::span[text()='(1991)']"));
			System.out.println(ele.getText());
			driver.close();

		}
	}



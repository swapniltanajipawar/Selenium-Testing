package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();		
		driver.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html?color=pink#");

		System.out.println(driver.findElement(By.id("p1")).getText());//-->to print text as shown in page of website
		System.out.println(driver.findElement(By.id("p2")).getText());
		System.out.println(driver.findElement(By.id("p3")).getText());

		System.out.println(driver.findElement(By.id("p1")).getAttribute("textContent"));//-->To print the text as it is in html page
		System.out.println(driver.findElement(By.id("p2")).getAttribute("textContent"));
		System.out.println(driver.findElement(By.id("p3")).getAttribute("innerHTML"));//--->To print the text as it is in html page including inner text


		driver.findElement(By.id("input1")).sendKeys("Selenium");
		System.out.println(driver.findElement(By.id("input1")).getAttribute("value"));
		driver.findElement(By.id("input1")).clear();
		driver.findElement(By.id("input1")).sendKeys("Hello World");
		System.out.println(driver.findElement(By.id("input1")).getAttribute("value"));

		System.out.println(driver.findElement(By.id("mySelect")).getAttribute("value"));

		System.out.println(driver.findElement(By.id("link")).getAttribute("href"));

		driver.close();
		//driver.quit();

	}

}

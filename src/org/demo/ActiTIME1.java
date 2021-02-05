package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTIME1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager", Keys.ENTER);//Here using ENTER we click on login button
		//No need to click seperately on login like below line
		// driver.findElement(By.xpath("//div[contains(@id,'addTaskButtonId')]")).click();-->Error:no element found Exception
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(.,'New')]/ancestor::div[@id=\"addTaskButtonId\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']/descendant::div[@class='dropdownButton']")).click();
		driver.findElement(By.xpath("//div[@class='searchItemList']/descendant::div[contains(.,'- New Customer -')]")).click();
		driver.findElement(By.xpath("//input[@class='newCustomer newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@class='newProject newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//div[@class='components_button_label' and contains(.,'Create Tasks')]")).click();
		WebElement err = driver.findElement(By.xpath("//span[contains(.,'Please correct all errors in the fields highlighted in red.')]"));
		System.out.println("Error:" + err.getText());//Not Working
		System.out.println("Error:" + err.getAttribute("innerText"));
	}
}
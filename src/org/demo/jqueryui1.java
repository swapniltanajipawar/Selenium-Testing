package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jqueryui1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable");
		Thread.sleep(10000);
		WebElement f=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(f);
		Thread.sleep(10000);
		/*WebElement ele=driver.findElement(By.id("draggable"));
		Actions a=new Actions(driver);
		a.dragAndDropBy(ele, 150, 0).build().perform();*/
		WebElement ele=driver.findElement(By.id("draggable"));
		WebElement ele1=driver.findElement(By.id("droppable"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(ele, ele1).build().perform();
		WebElement username=driver.findElement(By.xpath("//p[text()='Dropped!']"));
		System.out.println(username.getText());
	}
}

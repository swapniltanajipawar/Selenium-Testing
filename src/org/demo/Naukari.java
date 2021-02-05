package org.demo;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari 
{	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();
		System.out.println("Parent:"+parent);
		Set<String> winshandel=driver.getWindowHandles();
		winshandel.remove(parent);
		for (String win : winshandel)
		{
			System.out.println("child:"+win);
			driver.switchTo().window(win);
			driver.close();
		}
		
	}

}

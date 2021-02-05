package org.demo;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*public class Naukri 
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
		System.out.println(winshandel.getClass());
		//retun type ....returnin
		for (String win : winshandel)
		{
			System.out.println("child:"+win);
			driver.switchTo().window(win);
			driver.close();
		}

	}

}*/
public class Naukri 
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
		System.out.println(winshandel.getClass());
		ArrayList<String> a1=new ArrayList<> (winshandel);
		//retun type ....returnin
		for (int i=a1.size() -1; i>=0; i++)
		{
			driver.switchTo().window(a1.get(i));
			driver.close();
			Thread.sleep(2000);
		}

	}
}
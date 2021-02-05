package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadderLoc 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		driver.findElement(By.xpath("//a[contains(.,' Stores ')]")).click();
		String s1=driver.findElement(By.xpath("//h3[@class='_3JJeW']")).getText();
		System.out.println(s1);
		String s2=driver.findElement(By.xpath("//div[@class='_12wcw']/h3[contains(.,'Bandra, Mumbai')]")).getText();
	    System.out.println(s2);
	    String s3=driver.findElement(By.xpath("//div[@class='_12wcw']/h3[contains(.,'Kirti Nagar, New Delhi')]")).getText();
	    System.out.println(s3);
	    String s4=driver.findElement(By.xpath("//div[@class='_12wcw']/h3[contains(.,'Domlur, Bangalore')]")).getText();
	    System.out.println(s4);
	    String s5=driver.findElement(By.xpath("//div[@class='_12wcw']/h3[contains(.,'JP Nagar, Bangalore')]")).getText();
	    System.out.println(s5);
	    String s6=driver.findElement(By.xpath("//div[@class='_12wcw']/h3[contains(.,'Sahakara Nagar, Bangalore')]")).getText();
	    System.out.println(s6);
	    String s7=driver.findElement(By.xpath("//div[@class='_12wcw']/h3[contains(.,'Mall Of India, Noida')]")).getText();
	    System.out.println(s7);
	    String s8=driver.findElement(By.xpath("//div[@class='_12wcw']/h3[contains(.,'Nungambakkam, Chennai')]")).getText();
	    System.out.println(s8);
	    String s9=driver.findElement(By.xpath("//div[@class='_12wcw']/h3[contains(.,'Creaticity, Pune')]")).getText();
	    System.out.println(s9);
	    String s10=driver.findElement(By.xpath("//div[@class='_12wcw']/h3[contains(.,'Kondapur, Hyderabad')]")).getText();
	    System.out.println(s10);
	}
}
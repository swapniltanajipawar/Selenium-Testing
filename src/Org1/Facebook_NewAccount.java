package Org1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_NewAccount
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		WebElement createNewAcc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		System.out.println(createNewAcc.isEnabled());//isEnabled()
		if(createNewAcc.isEnabled())
			createNewAcc.click();
		Thread.sleep(2000);

		WebElement day=driver.findElement(By.id("day"));
		Select sDay=new Select(day);

		sDay.selectByVisibleText("9");//.selectByVisibleText

		WebElement month=driver.findElement(By.id("month"));
		Select sMonth=new Select(month);

		sMonth.selectByValue("9");
		
		 WebElement male= driver.findElement(By.xpath("//label[text()='Male']"));
		 if(male.isDisplayed())//isDisplayed()
		 male.click();
		 Thread.sleep(2000);
		 System.out.println(male.isSelected());//isSelected()
		 System.out.println(male.getCssValue("background-color"));//getCssValue()
		 System.out.println(male.getRect().getPoint());//getRect().getPoint()
		 Point loc=male.getLocation();//getLocation()
		 System.out.println("x:" +loc.getX() + " y :" +loc.getY());

	}
}
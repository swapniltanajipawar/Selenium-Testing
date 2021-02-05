package Demo.testngDemo.qsp;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("before suite");
	}
	@BeforeTest
	public void bT()
	{
		System.out.println("before test");
	}
	@BeforeClass
	public void beforeC()  {
		System.out.println("before class");
	}
	@BeforeMethod
	public void beforeM()  {
		System.out.println("before method");
	}

	@Test
	public void tc_1() {
		System.out.println("Hi......");
	}
	@Test
	public void tc_2() {
		System.out.println("Hi......");
	}
	@AfterMethod
	public void afterM() {
		System.out.println("After method");
	}
	@AfterClass
	public void afterC()
	{
		System.out.println("after class");
	}
	@AfterTest
	public void aT()
	{
		System.out.println("after test");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("after suite");
	}
}

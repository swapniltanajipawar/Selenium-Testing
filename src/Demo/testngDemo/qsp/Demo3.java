package Demo.testngDemo.qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 
{
	@Test(priority = -3)
	public void tc1()
	{
		Reporter.log("1Hey...!",true);
	}
	
	@Test(priority=1)
	public void tc2()
	{
		Reporter.log("2Hey...!",true);
	}
	
	@Test(priority = 2,invocationCount=3)
	public void tc3()
	{
		Reporter.log("3Hey...!",true);
	}
	
	@Test(enabled=false)//bydefault value of enable is false
	public void tc4()
	{
		Reporter.log("4Hey...!",true);// to stop execution of test case.
	}

	@Test(invocationCount=0)//By default value of invocationCount is 1
	                        // to stop execution of test case
	public void tc5()
	{
		Reporter.log("3Hey...!",true);
	}
}

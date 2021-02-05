package Demo.testngDemo.qsp;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5
{
	@Test(groups="smoke", priority=3)
	public void tc1()
	{
		Reporter.log("1Hey...!",true);
	}
	@Test(groups="regration", dependsOnGroups="functional")
	public void tc2()
	{
		Reporter.log("2Hey...!",true);
	}
	@Test(groups="functional",dependsOnGroups="smoke",priority=-2)
	public void tc3()
	{
		Reporter.log("3Hey...!",true);
	}
	@Test(groups="smoke", priority=2)
	public void tc4()
	{
		Reporter.log("4Hey...!",true);
	}

	@Test(groups="functional",dependsOnGroups="smoke",priority=-3)
	public void tc5()
	{
		Reporter.log("5Hey...!",true);
	}
	@Test(groups="smoke", priority=1)
	public void tc6()
	{
		Reporter.log("6Hey...!",true);
	}
	@Test(groups="functional",dependsOnGroups="smoke")
	public void tc7()
	{
		Reporter.log("7Hey...!",true);
	}
}
/*
If any of the smoke testng gets fail then other testng will get run..........
 OUTPUT:-
 
6Hey...!
4Hey...!
1Hey...!
5Hey...!
3Hey...!
7Hey...!
2Hey...!
PASSED: tc6
PASSED: tc4
PASSED: tc1
PASSED: tc5
PASSED: tc3
PASSED: tc7
PASSED: tc2
*/
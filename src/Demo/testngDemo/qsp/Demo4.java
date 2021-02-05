package Demo.testngDemo.qsp;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 
{
	@Test(dependsOnMethods={ "tc2","tc3"})
	public void tc1()
	{
		Reporter.log("1Hey...!",true);//due to tc2 this test case is skipped.
	}
	@Test(dependsOnMethods="tc3")
	public void tc2()
	{
		Reporter.log("2Hey...!",true);
		Assert.fail();//Test fail here due to Assert.fail().
	}
	@Test()
	public void tc3()
	{
		Reporter.log("3Hey...!",true);//here if we write false then it will not write.
	}
}

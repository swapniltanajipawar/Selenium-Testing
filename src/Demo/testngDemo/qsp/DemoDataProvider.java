package Demo.testngDemo.qsp;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider 
{
	@DataProvider
	public static String [] [] demo()
	{
		String[] [] str = new String[3][2];
		str[0][0] ="UserA";
		str[0][1]="A";
		str[1][0]="UserC";
		str[1][1]="C";
		str[2][0]="UserB";
		str[2][1]="B";
		return str;
	}
	
	@Test(dataProvider="demo")
	public void tc(String user, String pass)
	{
		Reporter.log(user + " " + pass, true);
	}
}
/*
[RemoteTestNG] detected TestNG version 7.3.0
UserA A
UserC C
UserB B
PASSED: tc("UserA", "A")
PASSED: tc("UserC", "C")
PASSED: tc("UserB", "B")

===============================================
    Default test
    Tests run: 3, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 3, Passes: 3, Failures: 0, Skips: 0
===============================================


*/
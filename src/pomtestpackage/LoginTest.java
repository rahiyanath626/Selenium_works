package pomtestpackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pombasepackage.BaseClass;
import pompagepackage.LoginPage;

public class LoginTest extends BaseClass{ //to get driver information from the base class
	
	LoginPage obj;
	
	@BeforeMethod
	public void objmthd()
	{
		obj = new LoginPage(driver);	
	}
	
	@Test
	public void logintestmthd()
	{
		
		obj.setvalues();
		obj.loginmthd();
	}
	
	@Test
	public void titleverification()
	{
		System.out.println(obj.titlemthd());
	}

}

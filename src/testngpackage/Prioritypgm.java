package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Prioritypgm {
	@BeforeClass
	public void bfrclassmthd()
	{
		System.out.println("Before class method");
	}
	
	
	@Test(priority = 1, invocationCount = 3)  //executes the method 3 times
	public void methd_X()
	{
		System.out.println("Method X");
	}
	
	@Test(priority = 2, enabled = false)  
	public void methd_A()
	{
		System.out.println("Method A");
	}
	
	@Test(priority = 3)  
	public void methd_F()
	{
		System.out.println("Method F");
	}
	
	@AfterClass
	public void aftrclassmthd()
	{
		System.out.println("After Class method");
		
	}

}

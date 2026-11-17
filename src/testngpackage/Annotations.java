package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeTest
	public void beforetestmethod()
	{
		System.out.println("Before Test Method");
	}
	
	@BeforeClass
	public void beforeclassmthd()
	{
		System.out.println("Before class method");
	}
	
	@BeforeMethod
	public void method1()
	{
		System.out.println("Before method 'method1'");
	}
	
	@Test
	public void testmthd_A()
	{
		System.out.println("test method A");
	}
	@Test
	public void testmthd_X()
	{
		System.out.println("test method X");
	}
	@Test
	public void testmthd_C()
	{
		System.out.println("test method C");
	}
	
	@AfterMethod
	public void aftmethod()
	{
		System.out.println("After method 'aftmethod'");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After class method");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("After test method");
	}

}

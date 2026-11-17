package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Grouping_pgm {
	
	@BeforeClass(alwaysRun = true)
	public void bfrclassmthd()
	{
		System.out.println("Before class method");
	}
	
	@Test(priority = 1, groups = "smoke")
	public void methdA()
	{
		System.out.println("Method A");
	}
	
	@Test(priority = 2, groups = "sanity")
	public void methdB()
	{
		System.out.println("Method B");
	}
	
	@Test(priority = 3, groups= {"regression", "smoke"})
	public void methdC()
	{
		System.out.println("Method C");
	}

	@AfterClass(alwaysRun = true)
	public void aftrclassmthd()
	{
		System.out.println("after class method");
	}
}

package testngpackage;

import org.testng.annotations.Test;

public class Dependsonmethodspgm {
	
	@Test
	public void reg()
	{
		System.out.println("Registration method");
	}
	
	@Test(dependsOnMethods = "reg")  //this method is connected with the reg()method.it runs only if the reg method is enabled
	public void login()    
	{
		System.out.println("Login method");
	}
	@Test(dependsOnMethods = {"reg", "login"})
	public void home()
	{
		System.out.println("Home method");
	}

}

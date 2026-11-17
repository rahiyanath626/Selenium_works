package junitpkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpgm {
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		System.out.println("Before each method");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void titleverification()
	{
		System.out.println("Test method 1");
		String actualtitle = driver.getTitle();
		String expectedtitle = "Google";
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Title match");
		}
		else
		{
			System.out.println("Title mismatch");
		}
	}
	
	@Test
	public void method2()
	{
		System.out.println("Method 2");
	}
	
	@AfterEach
	public void closingmethod()
	{
		System.out.println("After each method");
		//driver.close();  //to close the browser tab
		driver.quit();
	}

}

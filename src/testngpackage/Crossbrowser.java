package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void browser_setup(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			System.out.println("Chrome browser");
		}
		else 
		{
			driver = new EdgeDriver();
			System.out.println("Edge browser");
		}

		
	}
	
	@Test
	public void method1()
	{
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	}

}

package junitpkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralapropertylogin {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();    //to maximize the browser window
	}
	
	@Test
	public void titleverification()
	{
		String actualtitle = driver.getTitle();
		System.out.println("Title : "+actualtitle );
	}
	
	@Test
	public void textverification()
	{
		String sourcecode = driver.getPageSource();   //to retrieve the source code
		if(sourcecode.contains("User Login"))
		{
			System.out.println("Text is present");
		}
		else
		{
			System.out.println("Text is not present");
		}
	}
	
	@Test
	public void login()
	{
		WebElement username = driver.findElement(By.id("ulogin"));   //locating username
		username.sendKeys("abcd");   //sendkeys accept only string values
		
		WebElement password = driver.findElement(By.name("upass")); //locating password field using locator name
		password.sendKeys("pass1234");
		
		WebElement loginbutton = driver.findElement(By.id("sub_logbtn"));
		loginbutton.click();
	}
	
	@AfterEach
	public void closewindow()
	{
		driver.quit();
	}
	

}

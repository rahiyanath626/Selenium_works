package junitpkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicetest {
ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();    //to maximize the browser window
	}
	
	@Test
	public void titleverification()
	{
		String actualtitle = driver.getTitle();
		System.out.println("Title : "+actualtitle );
	}

	@Test
	public void login()
	{
		WebElement username = driver.findElement(By.id("username"));   //locating username
		username.sendKeys("student");   //sendkeys accept only string values
		
		WebElement password = driver.findElement(By.name("password")); //locating password field using locator name
		password.sendKeys("Password123");
		
		WebElement submitbutton = driver.findElement(By.id("submit"));
		submitbutton.click();
	}
}

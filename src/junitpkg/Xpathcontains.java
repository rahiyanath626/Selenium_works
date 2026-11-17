package junitpkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathcontains {
	ChromeDriver driver;
	
	@BeforeEach
	public void browser_setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}

	@Test
	public void rediff1() throws InterruptedException
	{
		WebElement rediffmail = driver.findElement(By.xpath("//input[contains(@name, \"login\")]"));
		rediffmail.sendKeys("abcffgg");
		
		Thread.sleep(2000);
		
		WebElement fullname = driver.findElement(By.xpath("//input[contains(@name, \"name\") and contains(@placeholder, \"Enter your full name\")]"));
		fullname.sendKeys("John");
	}
}


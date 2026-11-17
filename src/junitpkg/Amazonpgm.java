package junitpkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpgm {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void home() throws InterruptedException
	{
		Thread.sleep(2000);   //java wait - used to wait for a particular time period(here its 2sec)    
		WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		//search.sendKeys("Mobiles");
		search.sendKeys("Mobiles", Keys.ENTER);   //Keys.ENTER - to press enter key
		
		WebElement electronics_icon = driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
		electronics_icon.click();
		
		Thread.sleep(2000);
		WebElement cart_icon = driver.findElement(By.xpath("//div[@id=\"nav-tools\"]/a[2]"));
		cart_icon.click();
		}

}

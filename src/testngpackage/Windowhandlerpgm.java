package testngpackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandlerpgm {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void method1()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parentwindow = driver.getWindowHandle();
		
		WebElement searchbar = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchbar.sendKeys("mobiles");
		
		WebElement srchicon = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		srchicon.click();
		
		
		WebElement phnlink = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div[3]/div[2]/span/div/a"));
		phnlink.click();
		
		Set<String> tabdetails = driver.getWindowHandles();
		
//		ArrayList<String> windowdetails = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(windowdetails.get(1));
		
		for(String handle : tabdetails)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				String title = driver.getTitle();
				System.out.println(title);
			}
		}
	}
	
	@AfterTest
	public void closemthd() {
		driver.quit();
	}

}
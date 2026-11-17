package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rightanddoubleclick2 {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void method() throws Exception {
		WebElement rytclk = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act = new Actions(driver);
		act.contextClick(rytclk);
		act.perform();
		Thread.sleep(2000);
		
		WebElement editbtn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
		editbtn.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement dblclkbtn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(dblclkbtn);
		act.perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();	
	}

	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
}

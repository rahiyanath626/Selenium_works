package testngpackage;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplewindowpgm2 {
	
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws Exception 
	{
		String parentwindow = driver.getWindowHandle();
		System.out.println("Title: " + driver.getTitle());
		driver.navigate().refresh();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement window1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
//		wait.until(ExpectedConditions.elementToBeClickable(window1));
		window1.click();
		
		WebElement clickoption1 = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a"));
		wait.until(ExpectedConditions.elementToBeClickable(clickoption1));
		clickoption1.click();
		System.out.println(driver.getTitle());
		
//			
		ArrayList<String> windowdetails = new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(windowdetails.get(1));
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);
		
		Thread.sleep(2000);
		
		
		WebElement window2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		window2.click();
		WebElement clickoption2 = driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button"));
		clickoption2.click();
		System.out.println(driver.getTitle());
		driver.switchTo().window(windowdetails.get(1));
		Thread.sleep(2000);
		
		
		driver.switchTo().window(parentwindow);
	
		WebElement window3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		window3.click();
		WebElement clickoption3 = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button"));
		clickoption3.click();
		driver.switchTo().window(windowdetails.get(1));
		Thread.sleep(2000);
		
		driver.switchTo().window(parentwindow);
	}
	
//	@AfterTest
//	public void closemthd() {
//		driver.quit();
//	}

}

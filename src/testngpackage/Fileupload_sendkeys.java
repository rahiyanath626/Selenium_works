package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Fileupload_sendkeys {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	}

	@Test
	public void method()
	{
		WebElement choosefileop = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		choosefileop.sendKeys("C:\\Users\\LENOVO\\OneDrive\\Pictures\\Screenshots\\Screenshot (101).png");
	}
}

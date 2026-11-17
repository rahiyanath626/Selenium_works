package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Iframepgm {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://vinothqaacademy.com/iframe/");
		driver.manage().window().maximize();
		}
	
	@Test
	public void namemthd() {
		WebElement frametag = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/iframe[1]"));
		driver.switchTo().frame(frametag);
		WebElement name = driver.findElement(By.xpath("//*[@id=\"nameInput\"]")); 
		name.sendKeys("Alice");
		driver.switchTo().defaultContent();
	}

}

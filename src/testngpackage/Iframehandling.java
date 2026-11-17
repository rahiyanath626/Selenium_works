package testngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Iframehandling {

	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void loginmthd()
	{
		WebElement usr = driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
		usr.sendKeys("rahiyanath626@gmail.com");
		WebElement pswd = driver.findElement(By.xpath("//*[@id=\"upass\"]"));
		pswd.sendKeys("@7eXyUi6xhH36dG");
		WebElement logbtn = driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]"));
		logbtn.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("myhome"));
	}
	
	@Test(priority = 2)
	public void addpropertymthd()
	{
		WebElement addprpbtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a"));
		addprpbtn.click();
		
	//summary box comes under iframe, so we need to switch to iframe
		WebElement frametag = driver.findElement(By.xpath("//*[@id=\"frm_property\"]/div[9]/div/div/iframe"));
		driver.switchTo().frame(frametag);
		WebElement summary = driver.findElement(By.xpath("/html/body"));
		summary.click();
		summary.sendKeys("12345");
		
		driver.switchTo().defaultContent();
	}
}

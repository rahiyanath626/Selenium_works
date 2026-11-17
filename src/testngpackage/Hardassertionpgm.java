package testngpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hardassertionpgm {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void titleverification()
	{
		String actualtitle = driver.getTitle();  
//		System.out.println("Title: " + actualtitle);
		String expectedtitle = "Rediffmail Free Unlimited";
		Assert.assertEquals(expectedtitle,actualtitle);
		System.out.println("Title verification Success"); //this is executed only after the assertion becomes true
	}
	
	@Test(priority=2)
	public void urlverification()
	{
	String actualurl = driver.getCurrentUrl();
//	System.out.println("Actual URL: " + actualurl);
	String expectedurl = "https://register.rediff.com/register/register.php?FormName=user_details";
	Assert.assertEquals(expectedurl, actualurl);
	System.out.println("URL verification completed");
	}

}

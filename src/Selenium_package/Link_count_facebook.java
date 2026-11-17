package Selenium_package;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_count_facebook {
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void linkcount()
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Link count = " +links.size());
		
		for(WebElement li:links)
		{
			//System.out.println("Link ------"+li.getAttribute("href"));
			System.out.println(li.getText()+"-----"+li.getAttribute("href"));
		}
	}

}

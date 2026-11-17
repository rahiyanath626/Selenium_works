package Selenium_package;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResponseCode {
	
	ChromeDriver driver;
	@BeforeEach
	public void browsersetup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws Exception
	{
		String url = driver.getCurrentUrl();
		URI ob = new URI(url);      //to verify the text is in the link format
		URL link = ob.toURL();
		HttpURLConnection con = (HttpURLConnection) link.openConnection();
		int resp_code=con.getResponseCode();
		System.out.println("Response code is "+ resp_code);
		
		if(resp_code == 200)
		{
			System.out.println("valid link");
		}
		else if (resp_code==404)
		{
			System.out.println("broken link");
		}
		else
		{
			System.out.println("other response code");
		}
		
			
	}
	

}

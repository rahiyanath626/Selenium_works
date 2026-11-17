package Selenium_package;

import org.openqa.selenium.chrome.ChromeDriver;

public class First_selenium_pgm {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//for opening MSedge - EdgeDriver
		//EdgeDriver driver = new EdgeDriver();
		//for opening Firefox - FirefoxDriver
		//FirefoxDriver driver = new FirefoxDriver
		driver.get("https://www.google.com/");
		String actualtitle = driver.getTitle();  //to retrieve the title of the web application
		System.out.println("The title of the web application is: " + actualtitle);
		
		String expectedtitle = "Google";
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("The title matches");
		}
		else
		{
			System.out.println("The title is not matched");
		}
			

	}

}

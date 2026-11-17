package Selenium_package;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logoverification {
	
	ChromeDriver driver;
	@BeforeEach
	public void browsersetup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws Exception
	{
	WebElement redifflogo = driver.findElement(By.xpath("//img[@title=\"Rediffmail\"]"));
	boolean result = redifflogo.isDisplayed();
	if(result==true)
	{
	System.out.println("Logo is displayed");	
	}
	else {
		System.out.println("Logo is not displayed");
	}
	
	WebElement radiobutton_f = driver.findElement(By.xpath("//input[@value='f']"));
	boolean btn_enabled = radiobutton_f.isEnabled();         //to verify whether the button is active
	System.out.println("Gender button is enabled? "+ btn_enabled);  
	Thread.sleep(2000);
	
	WebElement checkboxbutton = driver.findElement(By.xpath("//input[@type='checkbox']"));
	boolean chkbox_select = checkboxbutton.isSelected();  //to check the check box is selected or not
	if(chkbox_select == true)
	{
		System.out.println("Check box is selected");	
	}
	else
	{
		System.out.println("Check box is not selected");
		checkboxbutton.click();	
	}
	
	}
	

}

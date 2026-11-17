package pompagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	//Locating webelements using page factory
	@FindBy(xpath="//*[@id=\"ulogin\"]") WebElement username;
	@FindBy(id="upass") WebElement password;
	@FindBy(xpath="//*[@id=\"sub_logbtn\"]") WebElement loginbtn;
	
	public LoginPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//methods
	public void setvalues()
	{
		username.sendKeys("abc@gmail.com");
		password.sendKeys("aabbcc");
	}
	public void loginmthd() {
		loginbtn.click();	
	}
	public String titlemthd()
	{
		String title = driver.getTitle();
		return title;
	}
}

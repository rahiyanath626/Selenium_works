package Selenium_package;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm2 {
	ChromeDriver driver;
	
	@BeforeEach
	public void browser_setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	}

	@Test
	public void homepage() throws Exception
	{
		WebElement alertbox_1 = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		alertbox_1.click();
		
		Alert alrt= driver.switchTo().alert();
		String alrt_txt = alrt.getText();
		System.out.println("Alert text: "+ alrt_txt);
		
		Thread.sleep(2000);
		alrt.accept();
		
		Thread.sleep(3000);
		
		
		WebElement alert_2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		alert_2.click();
		WebElement alertbox_2 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		Thread.sleep(2000);
		alertbox_2.click();
		
		Thread.sleep(4000);
		Alert alrt1= driver.switchTo().alert();
		String alrt_txt1 = alrt1.getText();
		System.out.println("Alert text: "+ alrt_txt1);
		
		alrt1.dismiss();
		
		WebElement alert_3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		alert_3.click();
		Thread.sleep(2000);
		WebElement alertbox_3 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		alertbox_3.click();
		
		Alert alrt2= driver.switchTo().alert();
		String alrt_txt2 = alrt2.getText();
		System.out.println("Alert text: "+ alrt_txt2);
		Thread.sleep(2000);
		alrt2.sendKeys("Rahiyanath");
		
		alrt2.accept();
	}
}

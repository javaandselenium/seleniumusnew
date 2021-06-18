package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	public WebDriver driver;
	@Parameters({"broswerName"})
	@Test
	public void demo(String browser) {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("fghfghgfgfgfg");
		driver.findElement(By.id("pass")).sendKeys("fhgfgfgfghg");
		driver.findElement(By.name("login")).click();
		String t = driver.getTitle();
		Reporter.log(t,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		
	}

}

package waitingstatements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebDriverWait w=new WebDriverWait(driver,5);
		WebElement ele = driver.findElement(By.id("username"));
		w.until(ExpectedConditions.visibilityOf(ele)).sendKeys("admin");
		
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		
		WebElement ele1 = driver.findElement(By.xpath("//div[text()='Login ']"));
		w.until(ExpectedConditions.elementToBeClickable(ele1)).click();
		
		String t = driver.getTitle();
		System.out.println(t);
		
		if(t.equals("actiTIME - Login")) {
			System.out.println("Pass:home page is dispalyed");
		}
		
		else
		{
			System.out.println("Fail:home page is not dispalyed");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();

		}


	}



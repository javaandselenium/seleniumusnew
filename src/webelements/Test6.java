package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.id("username"));
		
		if(username.isDisplayed()) {
			System.out.println("Pass: The element is dispalyed");
		}
		else
		{
			System.out.println("Fail:The element is not dispalyed");
		}
		
		WebElement loginbtn = driver.findElement(By.xpath("//div[text()='Login ']"));
	
		if(loginbtn.isEnabled()) {
			System.out.println("Pass:The element is enabled");
		}
		else
		{
			System.out.println("Fail:The element is not enabled");
		}
		
		WebElement chceckbox = driver.findElement(By.id("keepLoggedInCheckBox"));
	if(chceckbox.isSelected()) {
		System.out.println("Pass:element is selected");
	}
	else
	{
		System.out.println("Fail:element is not selected");
	}
	driver.close();
	}

}

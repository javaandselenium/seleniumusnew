package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
    ele.sendKeys("phone");
	driver.findElement(By.id("nav-search-submit-button")).submit();
	
	Thread.sleep(3000);
      driver.close();
}
}

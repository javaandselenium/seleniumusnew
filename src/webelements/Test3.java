package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
	
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		Dimension s = ele.getSize();
		System.out.println(s.getHeight());
		System.out.println(s.getWidth());
		
		
		
	      driver.close();

	}

}

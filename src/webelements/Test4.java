package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
	
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		Point loc = ele.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		
		
	      driver.close();

	}

}

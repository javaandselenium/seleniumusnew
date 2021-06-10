package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("MTR"));
		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("m");
		s.selectByVisibleText("Cake");
		
		System.out.println(s.isMultiple());
		
		if(s.isMultiple()) {
			Thread.sleep(2000);
			s.deselectByIndex(0);
			Thread.sleep(2000);
			s.deselectByValue("m");
			Thread.sleep(2000);
			s.deselectByVisibleText("Cake");
		}
		Thread.sleep(4000);
		driver.close();

	}

}

package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		
		//WebElement ele = driver.findElement(By.name("q"));
	Skillraryloginpage s=new Skillraryloginpage(driver);
		
		driver.navigate().refresh();
	//ele.sendKeys("ggfhgfgf");
		s.serachtextbox("hgfjhghgghghjg");
	
	
	}

}

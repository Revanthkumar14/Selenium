package MouseandKeyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHold {
	public static void main (String[]args)throws Exception {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Mouse Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='Click & Hold']")).click();
		Thread.sleep(2000);
		WebElement circle=driver.findElement(By.id("circle"));
		Actions action = new Actions (driver);
		//click and hold the circle
		action.clickAndHold(circle).perform();
		Thread.sleep(4000);
		
		//RElease the circle
		action.release().perform();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}
}

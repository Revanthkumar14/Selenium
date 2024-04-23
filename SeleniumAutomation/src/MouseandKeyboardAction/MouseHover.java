package MouseandKeyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main (String[]args)throws Exception {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='Mouse Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='Mouse Hover']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Ratings")).click();
		Thread.sleep(2000);
		
		WebElement star=driver.findElement(By.xpath("//input[@value='1']/.."));
		Thread.sleep(2000);
		WebElement star2=driver.findElement(By.xpath("//input[@value='2']/.."));
		Thread.sleep(2000);
		WebElement star3=driver.findElement(By.xpath("//input[@value='3']/.."));
		Thread.sleep(2000);
		Actions action =new Actions (driver);
		action.moveToElement(star).perform();
		Thread.sleep(2000);
		action.moveToElement(star2).perform();
		Thread.sleep(2000);
		action.moveToElement(star3).perform();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		

}
}
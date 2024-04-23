package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleIframe {
	public static void main (String []args)throws Exception {
		WebDriver driver =new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Frames']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		Thread.sleep(2000);
		//Switch the frame
		driver.switchTo().frame(0);
		driver.findElement(By.name("username")).sendKeys("revanth");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("kumar");
		Thread.sleep(2000);
		//driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("kumar");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("revanth");
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}

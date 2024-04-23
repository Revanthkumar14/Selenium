package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {
	public static void main (String[]args)throws Exception {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(3000);
		//click on ui testing
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		//click on frames
		driver.findElement(By.xpath("//section[.='Frames']")).click();
		Thread.sleep(2000);
		//click on iframes
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		Thread.sleep(2000);
		//click on Nested with multiple iframes
		driver.findElement(By.linkText("Nested iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		String email=driver.findElement(By.xpath("(//p[@class='para'])[1]")).getText();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		String password=driver.findElement(By.xpath("(//p[@class='para'])[2]")).getText();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		String confrimpass=driver.findElement(By.xpath("(//p[@class='para'])[3]")).getText();
		Thread.sleep(2000);
		driver.switchTo().frame(0).findElement(By.id("confirm-password")).sendKeys(confrimpass);
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();
	}

}

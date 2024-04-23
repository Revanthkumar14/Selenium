package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopup {
	public static void main (String[]args)throws Exception{
		WebDriver driver = new ChromeDriver()  ;
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[.='Hidden division']")).click();
		Thread.sleep(3000);
		
		//Enter the name 
		driver.findElement(By.cssSelector("div>[type='text']")).sendKeys("REVANTH");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div>[type='email']")).sendKeys("revanth@gmail.com");
		Thread.sleep(4000);
		driver.quit();
		
		

}
}
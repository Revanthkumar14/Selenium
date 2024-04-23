package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calanderpopup {
	public static void main (String[]args)throws Exception{
		WebDriver driver = new ChromeDriver()  ;
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//section[.='Date & Time Picker']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[.='Date Picker']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).click();
		Thread.sleep(3000);
		driver.quit();

		
}
}
package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceName {
	public static void main (String[]args)throws Exception {
		WebDriver driver=new ChromeDriver ();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Books")).click();
		Thread.sleep(2000);
	String result = driver.findElement(By.xpath("//a[.='Copy of Computing and Internet EX']/../..//span[@class='price actual-price']")).getText();
		Thread.sleep(2000);
		System.out.println(result);
		driver.quit();
		
	}

}

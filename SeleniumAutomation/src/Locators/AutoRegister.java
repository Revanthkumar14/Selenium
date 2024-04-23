package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoRegister {
	public static void main (String[]args)throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("revanthkumar13@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("revanth13@");
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}

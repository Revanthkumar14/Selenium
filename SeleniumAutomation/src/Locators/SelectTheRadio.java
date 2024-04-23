package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectTheRadio {
	public static void main (String[]args)throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		WebElement maleRadioButton=driver.findElement(By.id("gender-male"));
		maleRadioButton.click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Revanth");
		driver.findElement(By.id("LastName")).sendKeys("Kumar");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("revanthkumar13@gamil.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Revanth13@");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Revanth13@");
		Thread.sleep(2000);
		WebElement registerButton=driver.findElement(By.id("register-button"));
		registerButton.click();
		Thread.sleep(2000);
		driver.quit();
		}
		
		
}

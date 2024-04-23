package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToggleButton {
	public static void main (String[]args)throws Exception {
		//launch the chromebrowser
		WebDriver driver=new ChromeDriver();
		//maximize the browser 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//navigate the url
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		//click on UI testing concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		//Click on toggle button 
		driver.findElement(By.xpath("//section[.='Toggle']")).click();
		Thread.sleep(2000);
		//click on toggle button 
		List<WebElement> allToggles =driver.findElements(By.xpath("//form//input[@type='checkbox']"));
		Thread.sleep(3000);
		for (WebElement toggle : allToggles) {
			toggle.click();
			Thread.sleep(2000);
		}
		for (WebElement toggle: allToggles) {
			toggle.click();
			Thread.sleep(200);
				
		}
	}
}



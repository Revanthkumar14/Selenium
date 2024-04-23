package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest {
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
		//Click on Radio button 
		driver.findElement(By.xpath("//section[.='Radio Button']")).click();
		Thread.sleep(2000);
		//click on radio button 
		List<WebElement> allradioButtons =driver.findElements(By.xpath("//form//input[@type='radio']"));
		Thread.sleep(3000);
		System.out.println(allradioButtons.size()); 
		for (WebElement radioButton : allradioButtons ) {
			radioButton.click();
			Thread.sleep(1000);
		}
		Thread.sleep(3000);
		driver.quit();
		}
	}


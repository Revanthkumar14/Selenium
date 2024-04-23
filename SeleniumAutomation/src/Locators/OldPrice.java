package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class OldPrice {
public static void main (String[]args)throws Exception {
	//launch the chromebrowser
	WebDriver driver=new ChromeDriver();
	//maximize the browser 
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//navigate the url
	driver.get("https://demowebshop.tricentis.com/register");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Books")).click();
	Thread.sleep(2000);
	String actualPrice = driver.findElement(By.xpath("//a[.='Health Book']/../..//span/following-sibling::span)")).getText();
	String oldPrice = driver.findElement(By.xpath("//a1[.='Health Book']/../..//span/following-sibling::span/preceding-sibling::span")).getText();
	if(oldPrice.equals("27.00") && actualPrice.equals("10.00")) {
	System.out.println("Old Price: "+oldPrice);
	System.out.println("Actual Price: "+actualPrice);
	System.out.println("Test case Pass");
	}
	else {
		System.out.println("Old Price: "+oldPrice);
		System.out.println("Actual Price: "+actualPrice);
		System.out.println("Test case Fail");
	}
	Thread.sleep(2000);
	System.out.println();
	driver.quit();
}
}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Checkboxs {
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
		driver.findElement(By.xpath("//section[.='Check Box']")).click();
		Thread.sleep(2000);
		List<WebElement> allCheckboxes= (List<WebElement>) driver.findElement(By.xpath("//input[@type='chec']"));
		System.out.println("Number of check boxes displayed:"+allCheckboxes);
		while(true){
		for(WebElement Checkbox:allCheckboxes) {	
			Checkbox.click();
			Thread.sleep(2000);
		}
		for(int i=allCheckboxes.size()-1;i>=0;i--) {
			allCheckboxes.get(i).click();
			Thread.sleep(2000);
		}
		driver.quit();
		}
		
	}
}

package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {
	public static void main (String[]args)throws Exception {
		WebDriver driver=new ChromeDriver ();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://filpkart.com");
		Thread.sleep(2000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println(allLinks.size());
		for (WebElement link : allLinks) {
			System.out.println(link.getText());
			
		}
		driver.quit();
		
				
	}
}

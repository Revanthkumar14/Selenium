package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main (String []args) {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		//Implicit Wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//navigate the url
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		//click on synchronization
		driver.findElement(By.xpath("//section[.='Synchronization']")).click();
		//click on progress bar
		driver.findElement(By.xpath("//section[.='Progress Bar']")).click();
		//click on with element
		driver.findElement(By.linkText("With Element")).click();
		//Enter the seconds 
		driver.findElement(By.cssSelector("[placeholder='Enter time in seconds']")).sendKeys("6");
		//click on start button 
		driver.findElement(By.xpath("//button[.='Start']")).click();
		//click on dropdown 
		driver.findElement(By.xpath("//p[.='Do you like Automation']//../select")).click();
		
		
		
		
		
	}
	

}

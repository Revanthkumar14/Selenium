package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	public static void main (String []args)throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		String placeholderText=driver.findElement(By.id("name")).getAttribute("placeholder");
			
		System.out.println(placeholderText);
         //Enter email
		driver.findElement(By.id("email")).sendKeys("revanth@gmail.com");
		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
		driver.quit();
	}
		
}

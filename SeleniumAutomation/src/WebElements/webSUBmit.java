package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webSUBmit {
	public static void main (String []args)throws Exception {
		
		//launch the chromebrowser
			WebDriver driver=new ChromeDriver();
			//maximize the browser 
			driver.manage().window().maximize();
			Thread.sleep(2000);
				
			//navigate the url
				driver.get("https://demo.opensourcebilling.org/");
				Thread.sleep(2000);
				
				WebElement emailTextField=driver.findElement(By.id("email"));
				
				//clear email text field 
				emailTextField.clear();
				
				//Enter the email
				emailTextField.sendKeys("revanth@gamil.com");
				Thread.sleep(2000);
				
				//Find password Text field
				WebElement passwordtextField=driver.findElement(By.id("password"));
				
				//clear password
				passwordtextField.clear();
				
				//Enter the password 
				passwordtextField.sendKeys("Revanth@123");
				Thread.sleep(2000);
				
				//click on submit button
				driver.findElement(By.xpath("//form")).submit();
				
				driver.quit();
				//okk
				
				
	}
	

}

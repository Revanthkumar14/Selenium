package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectTest {
	public static void main (String[]args)throws Exception{
		WebDriver driver =new ChromeDriver();
		driver .manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		
		//Find email Text Field 
		WebElement emailTF=driver.findElement(By.id("email"));
		//Find password text field
		WebElement passwordTF=driver.findElement(By.xpath("//input[@id='pass]/.."));
		
		System.out.println(emailTF.getRect().getDimension());
		System.out.println(emailTF.getRect().getPoint());
		 
		System.out.println("Password TF height:"+passwordTF.getRect().getHeight());
		System.out.println("Password TF width:"+passwordTF.getRect().getWidth());
		
		System.out.println("Password TF x point:"+passwordTF.getRect().getX());
		System.out.println("Password TF y point:"+passwordTF.getRect().getY());
		
		System.out.println(emailTF.getLocation());
		System.out.println(passwordTF.getLocation());
		
		if (emailTF==passwordTF) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
			
		}
		driver.quit();
		
		
	}

}

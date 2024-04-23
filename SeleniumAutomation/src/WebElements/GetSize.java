package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	public static void main (String []args)throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		
		WebElement emailTextField=driver.findElement(By.id("email"));
		int emailTextFieldHeight=emailTextField.getSize().height;
		int emailTextFieldWidth=emailTextField.getSize().getWidth();
		
		System.out.println(emailTextFieldHeight);
		System.out.println(emailTextFieldWidth);
		//Another Get size Code 
		System.out.println(emailTextField.getSize());
		WebElement passwordTextField=driver.findElement(By.xpath("//input[@id='pass']/.."));
		
		int passwordTextFieldHeight =passwordTextField.getSize().getHeight();
		int passwordTextFieldWidht =passwordTextField.getSize().getWidth();
		 
		System.out.println(passwordTextFieldHeight);
		System.out.println(passwordTextFieldWidht);
		
		if(emailTextFieldHeight==passwordTextFieldHeight&&emailTextFieldWidth==passwordTextFieldWidht)
		{
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
			
		}
	}
}




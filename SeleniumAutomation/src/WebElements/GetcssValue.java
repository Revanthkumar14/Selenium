package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetcssValue {
	public static void main (String []args)throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		System.out.println("Font size: " +driver.findElement(By.linkText("Books")).getCssValue("font-size"));
		System.out.println("Background: " +driver.findElement(By.linkText("Books")).getCssValue("background"));
	
		//verify the color of register link
		String registerLinkColor=driver.findElement(By.linkText("Register")).getCssValue("color");
		
		System.out.println(registerLinkColor);
		if(registerLinkColor.equals("rgba(175,3, 4, 1)"))
		{
			System.out.println("Test Case Is Pass");
	    }else {
		System.out.println("Test Case Is Fail");
		driver.quit();
		
		}
	}
}

package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacelogoVerify {
	public static void main (String []args)throws Exception{
		
		//launch the chromebrowser
			WebDriver driver=new ChromeDriver();
			//maximize the browser 
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			//navigate the url
			driver.get("https://facebook.com/");
			Thread.sleep(2000);
			boolean isLogoDisplayed=driver.findElement(By.className("fb_logo")).isDisplayed();
			System.out.println("Face book logo displayed?:"+isLogoDisplayed);
			if(isLogoDisplayed==true) {
				System.out.println("test case pass");
			}
			else {
				System.out.println("test case fail");
				driver.quit();
				//okk
			}
			
			
		
		
	}
}

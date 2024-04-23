package RobotClass;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPressandKeyRealse {
	public static void main (String[]args)throws Exception{
		WebDriver driver =new ChromeDriver();
		driver .manage().window().maximize();
		driver.get("https://google.com");
		Robot robo =new Robot();
		robo.keyPress(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_2);
		Thread.sleep(2000);
		driver.quit();	
		
	}

}

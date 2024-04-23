package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertOrJavascript_PopUp {
public static void main (String[]args)throws Exception{
	WebDriver driver = new ChromeDriver()  ;
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[.='UI Testing Concepts']"));
	Thread.sleep(2000);
	
}
}

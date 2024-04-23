package JavaScriptExecutors;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteScript {
	public static void main (String []args)throws Exception{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("jdk-8u401-linux-aarch64.tar.gz")).click();
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement  Downloadbutton=driver.findElement(By.linkText("Download jdk-8u401-linux-aarch64.tar.gz"));
		jse.executeScript("arguments[0].click();",Downloadbutton);
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}

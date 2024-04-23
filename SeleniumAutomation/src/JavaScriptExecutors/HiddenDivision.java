package JavaScriptExecutors;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {
	public static void main (String []args) throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(1000);
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(1000);
		WebElement Hiddentext = driver.findElement(By.id("displayed-text"));
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='Revanth😊😊';",Hiddentext);
		jse.executeScript("arguments[0].value='revan'",driver.findElement(By.id("hide-textbox")));
		driver.findElement(By.id("show-textbox")).click();
		Thread.sleep(6000);
		driver.quit();
		
		
	}
	

}

package JavaScriptExecutors;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByJSE {
	public static void main(String[] args)throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500);" );
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,2000);" );
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-600);" );
		Thread.sleep(4000);
		driver.quit();
	//ok
		
		
		
		
		
		
		
		
	}

}

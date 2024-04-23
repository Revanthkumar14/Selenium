package JavaScriptExecutors;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToJSE {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor rev= (JavascriptExecutor) driver;
		rev.executeScript("window.scrollTo(0,1500);" );
		Thread.sleep(2000);
		rev.executeScript("window.scrollTo(0,500);");
		Thread.sleep(2000);
		rev.executeScript("window.scrollTo(0,2500);");
		Thread.sleep(4000);
		driver.quit();
		//ok
		
	}

}

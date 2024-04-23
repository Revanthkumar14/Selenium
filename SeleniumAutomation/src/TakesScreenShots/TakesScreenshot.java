package TakesScreenShots;

	import java.io.File;
	import java.time.Duration;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class TakesScreenshot {
		public static void main (String []args) {
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https;//flipkart.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			
			
		}


}

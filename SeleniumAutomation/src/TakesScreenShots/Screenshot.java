package TakesScreenShots;
	import java.io.File;
	import java.time.Duration;
	import java.time.LocalDateTime;
	import java.util.logging.FileHandler;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;



	public class Screenshot {
		public static void main (String[]args)throws Exception {
			String time = LocalDateTime.now().toString().replace("-","_").replace(":","_");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://facebook.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//Step1 convert Webdriver reference into takesscreenshot type
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			//step2 Get the screenshot in the file format and store in temporary file 
			File temp=ts.getScreenshotAs(OutputType.FILE);
			
			//step3 Create a permament file 
			File permanent =new File("./Screenshots/"+time+".png");
			
			//Step4 copy the screenshot from temporary file to permanent file 
			org.openqa.selenium.io.FileHandler.copy(temp, permanent);
			
			
			driver.quit();
		}

	}




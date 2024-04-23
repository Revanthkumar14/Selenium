package Automate;
	import java.util.Scanner;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	public class Autobrowser {
		static Scanner sc=new Scanner(System.in);
		public static void main (String[]args)throws Exception {
			WebDriver driver=null;
			System.out.println("Enter the browser name");
			String browser=sc.next();
				if (browser.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
			}
	       else if (browser.equalsIgnoreCase("edge")) {
				driver=new EdgeDriver();
			}

			else if (browser.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
			}

			else {
				System.out.println("Invalid browser name,selecting default browser");
				driver=new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.get("https://zomato.com");
			Thread.sleep(2000);
			driver.quit();
	}
}

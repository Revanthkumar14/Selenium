package Automate;
	import java.util.Scanner;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	public class SeleniumAuto {
		static Scanner sc=new Scanner(System.in);
	    static	WebDriver driver;
		public static void main (String[]args)throws Exception {
			System.out.println("\t\tSelect the Browser");
			System.out.println("1.Chrome\n2.Edge\n3.Firefox");
			int browser=sc.nextInt();
			if(browser==1) {
				driver=new ChromeDriver();
			}
			else if (browser==2) {
				driver=new EdgeDriver();
				}
			else if (browser==3) {
				driver=new FirefoxDriver();
				}
			else {
				System.out.println("Invalid input,Using default browser ");
				driver=new ChromeDriver(); 
			}
			driver.manage().window().maximize();
			driver.get("https://zomato.com");
			Thread.sleep(2000);
			driver.quit();
			
		}

	}

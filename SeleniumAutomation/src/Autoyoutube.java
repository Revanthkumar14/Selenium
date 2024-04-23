import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoyoutube {
	public static void main (String[]args)throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://youtube.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("urugi urugi song");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='style-sccope ytd-searchbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string class=\"style-scope ytd-video-renderer\" aria-label=\"Urugi Urugi - Video Song | Joe | Rio Raj | Hariharan Ram.S | Siddhu Kumar | Dr.D.Arulanandhu by Think Music India 7,116,108 views 1 month ago 4 minutes, 10 seconds\">Urugi Urugi - Video Song | Joe | Rio Raj | Hariharan Ram.S | Siddhu Kumar | Dr.D.Arulanandhu</yt-formatted-string']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}
	}
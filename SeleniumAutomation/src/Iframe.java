import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main (String[]args)throws Exception{
		WebDriver driver = new ChromeDriver()  ;
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("revanth");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("REVANTH");
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("revanth");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("REVANTH");
		//Thread.sleep(2000);
		

}
}
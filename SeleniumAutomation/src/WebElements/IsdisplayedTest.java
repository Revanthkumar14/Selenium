package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsdisplayedTest {
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread. sleep (2000);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread. sleep (5000);
		
		boolean isDesktopsLinkDisplayed=driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(.,'Desktops')]")).isDisplayed();
		

		if (isDesktopsLinkDisplayed == false){
			System.out.println("Test Case Is Pass");
			}else {
				
			System.out.println("Test Case Is Fail");
			}
		Thread.sleep(2000);
		driver.quit();
		//okk
}
}
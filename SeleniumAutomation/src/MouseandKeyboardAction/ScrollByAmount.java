package MouseandKeyboardAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByAmount {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		Thread.sleep(500);
        action.scrollByAmount(0, 300).perform();
        Thread.sleep(500);
        
        action.scrollByAmount(0, 800).perform();
        Thread.sleep(500);
        action.scrollByAmount(0, -900).perform();
        Thread.sleep(500);
        driver.quit();
        

}
}
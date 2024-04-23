package MouseandKeyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main (String[]args)throws Exception {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		WebElement Wash=driver.findElement(By.id("box3"));//xpath://div[.='Washington'][2]"
		Thread.sleep(2000);
		WebElement USA=driver.findElement(By.xpath("//div[.='United States']"));
		Actions action =new Actions (driver);
		Thread.sleep(2000);
		action.dragAndDrop(Wash, USA).perform();
		Thread.sleep(2000);
		
		driver.quit();
}
}


package MouseandKeyboardAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropActions {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(500);
		Actions action = new Actions(driver);

		List<WebElement> allCapitals = driver.findElements(By.xpath("//div[@id='dropContent']/div"));
		List<WebElement> allCountries = driver.findElements(By.xpath("//div[@id='countries']/div"));

		for (int i = 1; i < allCapitals.size(); i += 2) {
			
			for (int j = 0; j < allCountries.size(); j++) {
				
				action.dragAndDrop(allCapitals.get(i), allCountries.get(j)).perform();
				if (allCapitals.get(i).getCssValue("background-color").equals("rgba(0, 255, 0, 1)")) 
					{
					break;

				}

			}
		}
	}
}
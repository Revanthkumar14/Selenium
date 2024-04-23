package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	public static void main  (String []args)throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		Thread.sleep(2000);
		
		boolean isMailCheckBoxEnable=driver.findElement(By.id("domainl")).isEnabled();
		boolean isMailCheckBoxSelected=driver.findElement(By.id("domainl")).isSelected();
		System.out.println("Is Mail Check BOx enable?:"+isMailCheckBoxEnable);
		System.out.println("Is Mail Check Box selected?:"+isMailCheckBoxSelected);
		
		//select mail check box
		driver.findElement(By.id("domainl")).click();
		isMailCheckBoxSelected=driver.findElement(By.id("domainl")).isSelected();
		System.out.println("Clicked on mail Check box ");
		System.out.println("is Mail Checkbox Selected?:"+isMailCheckBoxSelected);
		
		//click on Disabled link 
		driver.findElement(By.partialLinkText("Disabled")).click();
		Thread.sleep(2000);
		
		System.out.println("\nClicked on DIsabled link\n");
		isMailCheckBoxEnable=driver.findElement(By.id("domainl")).isEnabled();
		System.out.println("Is mail check box enable?:"+isMailCheckBoxEnable);
		
		driver.quit();
		
		
	}

}

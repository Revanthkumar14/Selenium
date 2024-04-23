package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread. sleep (2000);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread. sleep (2000);
		driver. findElement (By.xpath("//a[@href=*/computers'][1]")).click();
		Thread. sleep (2000);
		
		boolean DeskTop = driver.findElement(By.xpath("//img[@alt='Picture for category Desktops']")).isDisplayed();
		System.out.println("DeskTop is Present ot Nor? :"+DeskTop);
		if (DeskTop == true){
		System.out.println("Test Case Is Pass");
		}else {
		System.out.println("Test Case Is Fail");
		}
		Thread. sleep (2000);
		System.out.println("\n**************");
		
		boolean NoteBooks = driver.findElement(By.xpath("//img[@alt='Picture for category Notebooks']")).isDisplayed();
		System.out. println("NoteBooks is Present or Not?:" + NoteBooks); 
		if (NoteBooks == true) {
		System.out.println("Test Case Is Pass");
		}else {
		System.out.println("Test Case Is Fail");
		}
	    Thread.sleep(2000);
	    System.out.println("\n**********");
	    
	    boolean Accessories=driver.findElement(By.xpath("//img[@alt='Picture for category Accessories']")).isDisplayed();

	    System.out.println("Accessories is Present or Not?:"+Accessories);
	    if(Accessories==true)

	    {
		System.out.println("Test Case Is Pass");
	    }else {
		System.out.println("Test Case Is Fail");
		driver.quit();
	}
}
}

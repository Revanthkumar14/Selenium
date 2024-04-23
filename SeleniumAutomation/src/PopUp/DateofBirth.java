package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateofBirth {
	public static void main (String[]args)throws Exception{
		WebDriver driver = new ChromeDriver()  ;
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//section[.='Date & Time Picker']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[.='Date Picker']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).click();
		Thread.sleep(3000);
	
	//First click previous button 
			WebElement clickPrevious = driver.findElement(By.xpath("//button[@aria-label='Previous Month']"));
			clickPrevious.click();
			Thread.sleep(2000);
			
			//Get the text using gettext method 
			String acturlResult = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
			Thread.sleep(3000);
			
			//This my assumption
			 String expectedResult = "November 2001";
			
			//Loop the condition till we get our assumption
			while (true) {
				//If both match means break the loop
				if (acturlResult.equals(expectedResult)) {
					break;
				}else {
					clickPrevious.click();
					//After clicking again compare that test
					acturlResult = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
				}
			}
			driver.findElement(By.xpath("//div[.='14']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='14/11/2001']")).click();
			Thread.sleep(2000);
			String MyDateofBirth = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
			Thread.sleep(2000);
			System.out.println("My Date Of Birth is :"+MyDateofBirth);
			driver.quit();
}
}

package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceSignup {
	public static void main (String[]args)throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Dropdown']")).click();
		Thread.sleep(2000);
		WebElement countryDropdown = driver.findElement(By.id("section3"));
		Select selectCountry=new Select (countryDropdown);
		Thread.sleep(2000);
		List<WebElement> allCountryies = selectCountry.getOptions();
		
		for(WebElement country:allCountryies)
		{
			System.out.println(country.getText());
		}
		if (allCountryies.size()-1==8) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
			
		}
		Thread.sleep(200);
		driver.quit();
		
		
		
	}

}

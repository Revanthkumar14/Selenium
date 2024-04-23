package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstMultiSelectDropdown {
	public static void main (String[]args, WebElement Select)throws Exception {
		//launch the chromebrowser
		WebDriver driver=new ChromeDriver();
		//maximize the browser 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//navigate the url
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		
		//click on UI testing concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		
		//Click on Dropdown button 
		driver.findElement(By.xpath("//section[.='Dropdown']")).click();
		Thread.sleep(2000);
		
		//click on Multi slect link
		driver.findElement(By.partialLinkText("Multi Select")).click();
		Thread.sleep(2000);
		
		//Find country dropdown
		WebElement countryDropdown= driver.findElement(By.id("slect-multiple-native"));
		Thread.sleep(2000);
		
		//select class object
		org.openqa.selenium.support.ui.Select selectCountry=new Select(countryDropdown);
		
		//select the france
		selectCountry.selectByIndex(4);
		Thread.sleep(2000);
		
		//select the india
		selectCountry.selectByValue("India");
		Thread.sleep(2000);
		
		//Select Canada
		selectCountry.selectByVisibleText("Canada");
		Thread.sleep(2000);
		
		System.out.println("*******ALL SELECTED COUNTRIES******");
		List<WebElement> allSelectedCountries = selectCountry.getAllSelectedOptions();
		
		for(WebElement selectedCountry: allSelectedCountries) {
			
		
		System.out.println(selectedCountry.getText());
		}
	System.out.println("\n*******FIRST SELECTED COUNTRY******");
	System.out.println(selectCountry.getFirstSelectedOption().getText());
	driver.quit();
}
}

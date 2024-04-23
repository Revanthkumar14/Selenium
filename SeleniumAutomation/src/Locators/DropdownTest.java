package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {
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
		//click on Dropdown button 
         WebElement countryDropdown=driver.findElement(By.id("select3"));
         Select selectCountry=new Select (countryDropdown);
         System.out.println("Is country dropdown multiple select?:"+selectCountry.isMultiple());
         Thread.sleep(2000);
         selectCountry.selectByIndex(7);
         Thread.sleep(2000);
         //selectcountry.slectbyindex(8)
         selectCountry.selectByIndex(8);
         WebElement stateDropdown= driver.findElement(By.id("section3"));
          Select selectState=new Select(stateDropdown);
         System.out.println(selectState.isMultiple());
         //select tamilnadu
         selectState.selectByIndex(33);
         Thread.sleep(2000);
         selectState.selectByValue("Kerala");
         Thread.sleep(2000);
         selectState.selectByVisibleText("Pondicherry");
         selectState.deselectByVisibleText("Pondicherry");
         Thread.sleep(3000);
         driver.quit();
  
	}
}

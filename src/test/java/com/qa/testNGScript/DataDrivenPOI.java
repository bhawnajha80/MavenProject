package com.qa.testNGScript;

//import java.io.File;
//import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utility.Xls_dataProvider;


public class DataDrivenPOI {
		
		WebDriver driver;
		
		@BeforeClass
		public void startBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Bhawna\\Java Selenium links\\chrome driver\\Chromedriver 83\\chromedriver.exe");
		 	driver = new ChromeDriver();
		 	driver.manage().window().maximize();
		 	driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");	
			
		}
		@Test(dataProvider = "testdataxlsx")
		public void createAccount(String Username, String Password, String Confirm, String Email)
		{
			
	driver.findElement(By.id("wpName2")).clear();
			
			driver.findElement(By.id("wpName2")).sendKeys(Username);
			
			
			driver.findElement(By.id("wpPassword2")).clear();
			driver.findElement(By.id("wpPassword2")).sendKeys(Password);
			driver.findElement(By.id("wpRetype")).clear();
			driver.findElement(By.id("wpRetype")).sendKeys(Confirm);
			driver.findElement(By.id("wpEmail")).clear();
			driver.findElement(By.id("wpEmail")).sendKeys(Email);
			
		}
		
		
		
		@DataProvider (name ="testdataxlsx")
		public  Object[][] readExcel()	{
			
		Object input[][]= Xls_dataProvider.getTestData("sheet1");	
			
				
			return input;
	}


}

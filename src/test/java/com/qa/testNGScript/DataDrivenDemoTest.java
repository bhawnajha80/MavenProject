package com.qa.testNGScript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenDemoTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Bhawna\\Java Selenium links\\chrome driver\\chromedriver.exe");
	 	driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");	
		
	}
	@Test(dataProvider = "testdata")
	public void createAccount(String name, String Password, String Confirm, String Email) {
		
driver.findElement(By.id("wpName2")).clear();
		
		driver.findElement(By.id("wpName2")).sendKeys(name);
		
		
		driver.findElement(By.id("wpPassword2")).clear();
		driver.findElement(By.id("wpPassword2")).sendKeys(Password);
		driver.findElement(By.id("wpRetype")).clear();
		driver.findElement(By.id("wpRetype")).sendKeys(Confirm);
		driver.findElement(By.id("wpEmail")).clear();
		driver.findElement(By.id("wpEmail")).sendKeys(Email);
		
	}
	
	
	
	@DataProvider (name ="testdata")
	public  Object[][] readExcel() throws BiffException, IOException
	{
		File f = new File ("C:\\Bhawna\\Java Selenium links\\Assignments\\Data.xls");
		
		Workbook  w = Workbook.getWorkbook(f);
		
		Sheet s = w.getSheet("Sheet1");
		
		int rows = s.getRows();
		
		int Col = s.getColumns();
		
		String inputData[] [] = new String [rows][Col];
		
		for (int i = 0; i<rows; i++)
		{
			for(int j = 0; j<Col; j++)
			{
				Cell c = s.getCell(j, i);
				inputData[i][j] = c.getContents();
			}
				
				
		}
		return inputData;
}

}
package com.qa.testNGScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TourLogin2 {
 public static WebDriver driver;
 
 @BeforeClass
 public void config2()
 {
	 //System.setProperty("webdriver.gecko.driver", "C:\\Bhawna\\Java Selenium links\\FireFoxDriver\\geckodriver.exe");
	 driver = new ChromeDriver();
	// driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 
	  driver.get("http://www.newtours.demoaut.com/");
	 
 }
 
 @Parameters({"Username","Password"})
 @Test(priority ='1')
 public void signin (String Username, String Password) throws InterruptedException {
	  
	 /* WebElement e =driver.findElement(By.name("login"));
	  WebDriverWait w = WebDriverWait(driver, 10);
	  w.until(ExpectedConditions.)*/
	 Thread.sleep(2000);
	  
	  driver.findElement(By.name("userName")).sendKeys("Username2");
		driver.findElement(By.name("password")).sendKeys("Password126");
		driver.findElement(By.name("login")).click();
		driver.close();
 }

}

 


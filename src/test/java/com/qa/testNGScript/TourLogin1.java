package com.qa.testNGScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class TourLogin1 {
	
public static WebDriver driver;

@BeforeClass
	public void config() {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com/");
		
		}
  @Parameters({"Username","Password"})
  @Test(priority ='1')
  public void signin (String Username, String Password) throws InterruptedException {
	  
	 /* WebElement e =driver.findElement(By.name("login"));
	  WebDriverWait w = WebDriverWait(driver, 10);
	  w.until(ExpectedConditions.)*/
	 // Thread.sleep(2000);
	  
	  driver.findElement(By.name("userName")).sendKeys("Username1");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("login")).click();
		driver.close();
  }

}

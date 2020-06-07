package com.qa.testNGScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGScriptDemo {

	
	@Test
	public void Login()
	
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).sendKeys("bhawnajha");
		driver.findElement(By.name("password")).sendKeys("bhawnajha@123");
		driver.findElement(By.name("login")).click();
		driver.close();
	}
	@Test
	public void Registration() throws InterruptedException
	
	{
		
       WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		driver.findElement(By.name("firstName")).sendKeys("Bhawna");
		driver.findElement(By.name("lastName")).sendKeys("Jha");
		driver.findElement(By.name("phone")).sendKeys("404-564-6789");
		driver.findElement(By.name("userName")).sendKeys("jharibhav@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("4320,Sandalwood way");
		driver.findElement(By.name("city")).sendKeys("Atlanta");
		driver.findElement(By.name("state")).sendKeys("Georgia");
		driver.findElement(By.name("postalCode")).sendKeys("30041");
		driver.findElement(By.name("email")).sendKeys("bhawnajha@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("vaibhavjha@234");
		driver.findElement(By.name("confirmPassword")).sendKeys("vaibhavjha@234");
		driver.findElement(By.name("register")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		
		}	
}

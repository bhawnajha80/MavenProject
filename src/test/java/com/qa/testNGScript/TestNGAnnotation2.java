package com.qa.testNGScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGAnnotation2 {
	public static WebDriver driver;
	
	@BeforeClass
	public void config ()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/gmail/about/#");
	
	}
	
	@Test
	public void signin()
	{
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("bhawna.amarnath@gmail.com");
		driver.findElement(By.xpath("//*[@class='RveJvd snByac')")).click();
		
	}
}

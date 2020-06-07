package com.qa.testNGScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFtestDemo {

	public static WebDriver driver;
	
	public void fftest()
	{
		 System.setProperty("webdriver.gecko.driver", "C:\\Bhawna\\Java Selenium links\\FireFoxDriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get(" www.google.com" );
		 
	}
	
}

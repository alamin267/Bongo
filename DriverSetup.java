package com.bd.bongo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {

public static WebDriver driver;
	
	@BeforeSuite
	public static void setDriver() {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterSuite
	public static void driverClose() {
		driver.close();
	}
}

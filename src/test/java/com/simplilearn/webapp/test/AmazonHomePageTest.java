package com.simplilearn.webapp.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class AmazonHomePageTest {

	// 1. formulate test url and driverpath
	final String siteURL = "https://www.amazon.in/";
	final String driverPath = "driver/geckodriver";
	WebDriver driver;

	// setup 
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.get(siteURL);
	}

	// clean up
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

	@Test
	public void verifyAmazonHomePageTitle() {
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();		
		assertEquals(expectedTitle, actualTitle);
	}
	

	@Test
	public void verifyAmazonHomePageSourceURL() {
		String expected = siteURL;
		String actual = driver.getCurrentUrl();		
		assertEquals(actual, expected);
	}

}

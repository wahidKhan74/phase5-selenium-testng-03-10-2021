package com.simplilearn.webapp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertWithFaceBook {

	// 1. formulate test url and driverpath
	final String facebookSiteURL = "https://www.facebook.com/";
	final String chromeDriverPath = "driver/chromedriver";
	WebDriver driver;
	
	
	//soft assert 
	SoftAssert sofAssert = new SoftAssert();
	

	@Test()
	public void lauchChromeBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.get(facebookSiteURL);
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods="lauchChromeBrowser",priority=4)
	public void verfiyFacebookLogin() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc@123");
		sofAssert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
		sofAssert.assertTrue(false);
		driver.close();
	}

}

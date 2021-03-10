package com.simplilearn.webapp.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNgGroupTest {

	// 1. formulate test url and driverpath
	final String amazonSiteURL = "https://www.amazon.in/";
	final String facebookSiteURL = "https://www.facebook.com/";
	final String chromeDriverPath = "driver/chromedriver";
	final String firefoxDriverPath = "driver/geckodriver";
	WebDriver driver;

	// group -> ChromeTest
	@Test(groups = "Chrome",priority=0)
	public void lauchChromeTest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.get(amazonSiteURL);
		Thread.sleep(2000);
	}

	@Test(groups = "Chrome", dependsOnMethods = "lauchChromeTest",priority=1)
	public void verifyAmazonHomePageTitle() {
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
	}

	@Test(groups = "Chrome", dependsOnMethods = "lauchChromeTest",priority=2)
	public void verifyAmazonHomePageSourceURL() {
		String actual = driver.getCurrentUrl();
		assertEquals(actual, amazonSiteURL);
		driver.close();
	}

	// group -> FireFox Browser Only
	@Test(groups = "FireFox",priority=3)
	public void lauchFireFoxTest() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
		driver = new FirefoxDriver();
		driver.get(facebookSiteURL);
		Thread.sleep(2000);
	}

	@Test(groups="FireFox", dependsOnMethods="lauchFireFoxTest",priority=4)
	public void verfiyFacebookHomepage() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc@123");
		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		driver.close();
	}
}

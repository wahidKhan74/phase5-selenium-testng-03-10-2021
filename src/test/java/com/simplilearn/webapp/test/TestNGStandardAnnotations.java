package com.simplilearn.webapp.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

@Test(description="Standard Tests")
public class TestNGStandardAnnotations {
	
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" --- Before Method ---");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" --- After Method ---");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println(" --- Before Class ---");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println(" --- After Class ---");
  }
  
  @Test(alwaysRun=true)
  public void testOne() {
	  System.out.println(" --- Test 1 Method executed ---");
  }
  
  @Test(enabled=false)
  public void testTwo() {
	  System.out.println(" --- Test 2 Method executed ---");
  }
  
  @Test
  public void testThree() {
	  System.out.println(" --- Test 3 Method executed ---");
  }

}

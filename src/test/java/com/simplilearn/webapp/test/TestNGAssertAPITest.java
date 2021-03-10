package com.simplilearn.webapp.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertAPITest {
	
  @Test
  public void hardAssertTest() {
	  System.out.println("-- hardAssert Method Was started --");
	  Assert.assertEquals("Hello", "Hello");
//	  Assert.assertTrue(false);   /// this throw AsserException
	  System.out.println("-- hardAssert Method Was completed --");
  }
  
  @Test
  public void softAssertTest() {
	  System.out.println("-- softAssert Method Was started --");
	  SoftAssert softAssetion = new SoftAssert();
	  softAssetion.assertEquals("Hello", "Hello");
	  softAssetion.assertTrue(false);  /// This stm does not throw AssertException
	  System.out.println("---softAssert Method Was completed --");
  }
}

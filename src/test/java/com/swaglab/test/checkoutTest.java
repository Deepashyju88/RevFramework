package com.swaglab.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class checkoutTest extends BaseClass
{
  @Test(priority =1)
  public void VerifycancelButn() 
  {
	  chp.cancelbutn();
	  System.out.println("cancell button clicked #############");
	  cp.CheckoutTest();
	  String url = lp.getCUrl();
	  Assert.assertTrue(url.contains("one"),"Fail : url mismatch");
	  System.out.println("url matched first##############");
  }
  
  @Test(priority= 2)
  public void VerifyContinue() 
  {
	  chp.continueTest("Priya", "Deshmugh", "895452");
	  String url = lp.getCUrl();
	  Assert.assertTrue(url.contains("two"),"Fail : url mismatch");
	  System.out.println("url matched second##############");
	  
  }
  
}

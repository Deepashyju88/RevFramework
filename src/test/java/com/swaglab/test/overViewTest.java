package com.swaglab.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class overViewTest extends BaseClass
{
  @Test(priority = 1)
  public void VerifyoverviewCancle() {
	  op.cancelOverView();
	  System.out.println("cancell done #########");
	  ip.addToCart("Sauce Labs Backpack");
		cp.cartTest();
		cp.CheckoutTest();
		chp.continueTest("Sarang","Dev","200054");
  }
  
  
  @Test(priority = 2)
  public void VerifyFinish() {
	  op.finish();
	  String url = lp.getCUrl();
	  AssertJUnit.assertTrue(url.contains("complete"));
	  System.out.println("url matched third overview##############");
  }
}

package com.swaglab.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseClass
{
  @Test(priority =1 )
  public void verifyCartBut()
  {
	  cp.cartTest();
	  String url = lp.getCUrl();
	  Assert.assertTrue(url.contains("cart"), "Fail : cart page not opened");
	  System.out.println("Cart page opened##########");
  }
  @Test(priority =2 )
  public void verifyRemove()
  {
	  cp.removeTest();
	  System.out.println("product removed #############");
	  
  }
  
  @Test(priority =3 )
  public void verifyContiune()
  {
	  cp.continueShopTest();
	  ip.addToCart("Sauce Labs Onesie");
	  System.out.println("Product added ###################");
	  cp.cartTest();
	  
  }
  @Test(priority =4 )
  public void verifyCheckout()
  {
	  cp.CheckoutTest();
	  String url = lp.getCUrl();
	  Assert.assertTrue(url.contains("checkout"), "Fail : Checkout page not opened");
	  System.out.println("checkout page opened##########");
  }
}

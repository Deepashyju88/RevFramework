package com.swaglab.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class inventoryTest extends BaseClass
{
  @Test
  public void verifyProdTile()
  {
	  int num = ip.getProTileCount();
	  Assert.assertEquals(num, 6,"fail : count not match to 6 ");
	  System.out.println("product tile count match to 6");
  }
  
  @Test
  public void verifyaddToCart()
  {
	  ip.addToCart("Sauce Labs Fleece Jacket");
	  System.out.println("Product added to cart");
  }
  
}

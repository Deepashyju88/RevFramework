package com.swaglab.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest extends BaseClass
{
  @Test
  public void verifyurl()
  {
	String curl = lp.getCUrl();
	Assert.assertTrue(curl.contains("demo"), "fail : url not correct");
	System.out.println("URL is correct..........");
  }
  
  @Test
  public void verifyTitle()
  {
	  String title = lp.getTitlecheck();
	  Assert.assertTrue(title.contains("Swag"),"Fail : title Not matched");
	  System.out.println("title matched");
  
  }
  @Test
  public void verifyLogin()
  {
	  	lp.login("standard_user", "secret_sauce");
	  	System.out.println("Login sucessfull");
  }


}

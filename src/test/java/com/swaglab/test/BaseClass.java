package com.swaglab.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.swaglab.page.CartPage;
import com.swaglab.page.checkoutPage;
import com.swaglab.page.inventoryPage;
import com.swaglab.page.loginPage;
import com.swaglab.page.overViewPage;

public class BaseClass {
	
	public WebDriver driver;
	public loginPage lp;
	public inventoryPage ip;
	public CartPage cp;
	public checkoutPage chp;
	public overViewPage op;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		
		lp = new loginPage(driver);
		ip = new inventoryPage(driver);
		cp = new CartPage(driver);
		chp = new checkoutPage(driver);
		op = new overViewPage(driver);
		
	}
	
	@BeforeClass
	public void testSetup() throws InterruptedException
	{
		lp.login("standard_user", "secret_sauce");
		ip.addToCart("Test.allTheThings() T-Shirt (Red)");
		cp.cartTest();
		cp.removeTest();
		cp.continueShopTest();
		ip.addToCart("Sauce Labs Bike Light");
		Thread.sleep(2000);
		cp.cartTest();
		cp.CheckoutTest();
		chp.continueTest("Manav","Guptha","789565");

		
	}

}

package com.swaglab.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
	private WebDriver driver;
	
	public CartPage(WebDriver driver)
	{
		this.driver = driver;
	}

	
	private By cartButn= By.xpath("//a[@class='shopping_cart_link']");
//	private By remove = By.linkText("Remove");
	private By removeButn = By.xpath("//button[@class='btn btn_secondary btn_small cart_button']");
	private By chekoutButn = By.id("checkout");
	private By contShop = By.id("continue-shopping");
	
	public void cartTest()
	{
		driver.findElement(cartButn).click();
	}
	
	public void removeTest()
	{
		driver.findElement(removeButn).click();
		System.out.println("Product removed");
	}
	
	public void CheckoutTest()
	{
		driver.findElement(chekoutButn).click();
		
	}
	
	public void continueShopTest()
	{
		driver.findElement(contShop).click();
	}
	
}

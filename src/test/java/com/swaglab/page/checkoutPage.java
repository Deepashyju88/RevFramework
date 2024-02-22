package com.swaglab.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutPage {
	
	private WebDriver driver;
	
	public checkoutPage(WebDriver driver)
	{
		this.driver = driver;
	}

	
	private By fname = By.id("first-name");
	private By lname = By.id("last-name");
	private By pin = By.id("postal-code");
	private By canlbn = By.name("cancel");
	private By contBtn = By.name("continue");
	
	public void cancelbutn()
	{
		driver.findElement(canlbn).click();
	}
	
	public void continueTest(String firnm, String lstnm, String pinno)
	{
		driver.findElement(fname).sendKeys(firnm);
		driver.findElement(lname).sendKeys(lstnm);
		driver.findElement(pin).sendKeys(pinno);
		
		driver.findElement(contBtn).click();
	}
}

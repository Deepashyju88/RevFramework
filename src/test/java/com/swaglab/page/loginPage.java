package com.swaglab.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	private WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By usnm = By.id("user-name");
	private By pwd = By.id("password");
	private By loginBtn = By.name("login-button");
	
	public String getCUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getTitlecheck()
	{
		return driver.getTitle();
	}
	
	public void login(String usname, String pswd)
	{
		driver.findElement(usnm).sendKeys(usname);
		driver.findElement(pwd).sendKeys(pswd);
		driver.findElement(loginBtn).click();
	}
}

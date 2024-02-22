package com.swaglab.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class overViewPage {
	
	private WebDriver driver;
	
	public overViewPage(WebDriver driver)
	{
		this.driver = driver;
	}

	
	private By summary = By.xpath("//div[@class='summary_info']//div");
	
	private By canclebutn = By.id("cancel");
	private By finish = By.id("finish");
	private By meg = By.tagName("h2");
	
	public void cancelOverView()
	{
		driver.findElement(canclebutn).click();
	}
	
	public void finish()
	{
		List<WebElement> ele = driver.findElements(summary);
		
		for (WebElement i : ele)
		{
			System.out.println(i.getText());
		}
		
		driver.findElement(finish).click();
		
		WebElement ele1 = driver.findElement(meg);
	
		System.out.println(ele1.getText());
	}
	
}

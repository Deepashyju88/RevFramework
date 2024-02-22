package com.swaglab.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class inventoryPage {
	
	private WebDriver driver;
	
	public inventoryPage(WebDriver driver)

	{
		this.driver= driver;
	}
	
	private By proTile = By.xpath("//div[@class='inventory_list']//div[@class='inventory_item']");
	private By prodName= By.xpath("//div[@class='inventory_item_name ']");
	private By cartButn = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']");
	
	
	public int getProTileCount()
	{
		List<WebElement> count = driver.findElements(proTile);
		return count.size();
	}
	
	public void addToCart(String proName)
	{
		List<WebElement> ele = driver.findElements(prodName);
		for (WebElement i : ele)
		{
			if(i.getText().contains(proName))
			{
				i.click();
				break;
			}
		}
		
		driver.findElement(cartButn).click();
	}
}

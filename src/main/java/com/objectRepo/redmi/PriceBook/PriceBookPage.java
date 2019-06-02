package com.objectRepo.redmi.PriceBook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PriceBookPage {
	
	@FindBy(xpath="//body[@class='small']")
	private WebElement LoadPageElements;
	public WebElement getLoadPageElements() {
		return LoadPageElements;
	}
		
}

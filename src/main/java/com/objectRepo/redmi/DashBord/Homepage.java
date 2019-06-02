package com.objectRepo.redmi.DashBord;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Homepage {
	@FindBy(linkText="More")
	private WebElement MoreLinktest;
	
	@FindBy(linkText="Price Books")
	private WebElement PriceBooksLinktext;
	
	@FindBy(linkText="Products")
	private WebElement ProductsLink;
	
	
	public WebElement getProductsLink() {
		return ProductsLink;
	}
	public WebElement getMoreLinktest() {
		return MoreLinktest;
	}
	public WebElement getPriceBooksLinktext() {
		return PriceBooksLinktext;
	}
	
	

}
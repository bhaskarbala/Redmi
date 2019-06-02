package com.objectRepo.redmi.PriceBook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriceBooks {
	
	@FindBy(xpath="//span[contains(text(),'Price Book Information')]")
	private WebElement VerifyMethodOfCreatedPriceBook;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement CreatePageSymbol;
	
	@FindBy(xpath="//input[@name='Edit']")
	private WebElement EditButton;
	public WebElement getEditButton() {
		return EditButton;
	}


	public WebElement getCreatePageSymbol() {
		return CreatePageSymbol;
	}


	public WebElement getVerifyMethodOfCreatedPriceBook() {
		return VerifyMethodOfCreatedPriceBook;
	}
	
}

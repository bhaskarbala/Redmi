package com.objectRepo.redmi.Proudcts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement CreateProducts;

	public WebElement getCreateProducts() {
		return CreateProducts;
	}

}

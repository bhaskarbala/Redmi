package com.objectRepo.redmi.Proudcts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsWebElements {
	@FindBy(xpath="//span[contains(text(),'Product Information')]")
	private WebElement VerifyOfProduct;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement CreatePageProductsSymbol;
	@FindBy(xpath="//a[text()='Product No']/../../../tr[8]/td/input[1]")
	private WebElement ProductNoCheckBox;
	@FindBy(xpath="(//input[@value='Delete'])[1]")
	private WebElement ProductDeleteButton;
	@FindBy(xpath="(//td[contains(text(),'Showing Records')])[1]")
	private WebElement ProductsListVerify;
	@FindBy(xpath="//a[text()='Product No']/../../../tr/td[2]")
	private List <WebElement>ProductsNoCoulms;
	@FindBy(xpath="//td[text()=' ']/preceding-sibling::td/input[@type='checkbox']")
	private WebElement basedOnProductNoCheckBox;
	public WebElement getVerifyOfProduct() {
		return VerifyOfProduct;
	}
	public WebElement getCreatePageProductsSymbol() {
		return CreatePageProductsSymbol;
	}
	public WebElement getProductNoCheckBox() {
		return ProductNoCheckBox;
	}
	public WebElement getProductDeleteButton() {
		return ProductDeleteButton;
	}
	public WebElement getProductsListVerify() {
		return ProductsListVerify;
	}
	public List<WebElement> getProductsNoCoulms() {
		return ProductsNoCoulms;
	}
	public WebElement getBasedOnProductNoCheckBox() {
		return basedOnProductNoCheckBox;
	}
	
	

}

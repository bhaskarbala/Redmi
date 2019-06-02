package com.objectRepo.redmi.ThiredParty;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class VendorsPageOfProducts {
	
 @ FindBy(xpath="//td[@class='lvtCol']/../following-sibling::tr/td[1]/a")
  private WebElement VendernameList;
  
 @ FindBy(xpath="//td[@class='lvtCol']/../following-sibling::tr/td[2]/")
 private WebElement VenderPhoneList;

 @FindBy(xpath="//td[text()='Vendors']")
 private WebElement VendorTitle;
/**
 * @return the vendorTitle
 */
public WebElement getVendorTitle() {
	return VendorTitle;
}

/**
 * @return the vendername
 */
public WebElement getVendernameList() {
	return VendernameList;
}

/**
 * @return the venderPhone
 */
public WebElement getVenderPhoneList() {
	return VenderPhoneList;
}

 

  
}

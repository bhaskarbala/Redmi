package com.objectRepo.redmi.ThiredParty;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class VendorsPageOfProducts {
	
  
 @ FindBy(xpath="//td[@class='lvtCol']/../following-sibling::tr/td[2]/")
 private WebElement VenderPhoneList;

 @FindBy(xpath="//td[text()='Vendors']")
 private WebElement VendorTitle;
 @FindBy(xpath="//a[contains(text(),'Vendor Name')]/../../../tr/td[1]/a")
 private List<WebElement>venderNameList;
 
/**
 * @return the vendorTitle
 */
public WebElement getVendorTitle() {
	return VendorTitle;
}

public List<WebElement> getVenderNameList() {
	return venderNameList;
}

/**
 * @return the venderPhone
 */
public WebElement getVenderPhoneList() {
	return VenderPhoneList;
}
public void getSelectedVendorName(String ExceptedResult) {
	List <WebElement> list=getVenderNameList();
	for(int i=0;i<=list.size()-1;i++) {
		String acutal=list.get(i).getText();
		if(acutal.equals(ExceptedResult)) {
			list.get(i).click();
			break;	
		}
	
	}
	
}

 

  
}

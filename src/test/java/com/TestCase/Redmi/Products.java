package com.TestCase.Redmi;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.objectRepo.redmi.DashBord.Homepage;
import com.objectRepo.redmi.Proudcts.CreatingNewProduct;
import com.objectRepo.redmi.Proudcts.ProductsWebElements;
import com.objectRepo.redmi.ThiredParty.VendorsPageOfProducts;
import com.util.Lib.redmi.Setup;

import junit.framework.Assert;
@Listeners(com.util.Lib.redmi.ListernerImp.class)
public class Products extends Setup {
	@Test (groups= {"SomeTest"},enabled=false)
	public void navigateToProduct001() {
		Reporter.log("Navigate to Proudct moduler");
		Homepage hp=PageFactory.initElements(driver, Homepage.class);
		hp.getProductsLink().click();
		Reporter.log("Proudct should Save and verify the massage");
		String expTitlepage="Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM";
		String actual=driver.getTitle();
		Assert.assertEquals(expTitlepage, actual);
	}
		@Test
		public void newProductPage002() throws Throwable {
			Reporter.log("Navigate to Proudct modulder");
			Homepage hp=PageFactory.initElements(driver, Homepage.class);
			hp.getProductsLink().click();
			Reporter.log("Navigate to New products Symoble ");
			ProductsWebElements pw=PageFactory.initElements(driver, ProductsWebElements.class);
			pw.getCreatePageProductsSymbol().click();
			Reporter.log("Nagivate to CreatingNewProudct Page");
			CreatingNewProduct cr=PageFactory.initElements(driver, CreatingNewProduct.class);
			cr.getProductNameEditBox().sendKeys(data.getDataForExcelFile("MyTestCase",11,2));
			Assert.assertTrue(cr.getProductActiveButton().isSelected());
			cr.getPartNumberEditBox().sendKeys(data.getDataForExcelFile("MyTestCase",13, 2));
			cr.getSaleStartDateEditbox().sendKeys(cr.todate());
			Select sct=new Select(cr.getManufacturerDropDown());
			sct.selectByVisibleText(data.getDataForExcelFile("MyTestCase", 15, 2));
			Select sct2=new Select(cr.getProductcategoryDropDown());
			sct2.selectByVisibleText(data.getDataForExcelFile("MyTestCase", 16, 2));
			cr.getSupportStartDate().sendKeys(cr.todate());
			cr.getSalesEndDateEditbox().sendKeys(cr.EndDate("12", "31"));
			cr.getSupportExpiryDateEditbox().sendKeys(cr.EndDate("12", "31"));
			
			cr.getVenderNameEditboxSymbol().click();
			Iterator <String >it=driver.getWindowHandles().iterator();
			String parentwindow=it.next();
			String childWindow=it.next();
			driver.switchTo().window(childWindow);
			VendorsPageOfProducts vp=PageFactory.initElements(driver, VendorsPageOfProducts.class);
			vp.getSelectedVendorName("Susan");
			driver.switchTo().window(parentwindow);
			cr.getWebSiteEditbox().sendKeys("www.google.com");
			cr.getVendor_part_noEditbox().sendKeys("25");
			
		
		
		}
		
		
		
		
		 
	
	
	
	
	
}

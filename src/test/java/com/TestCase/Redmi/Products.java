package com.TestCase.Redmi;

import static org.testng.Assert.assertEqualsNoOrder;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
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
			Iterator <String>it=driver.getWindowHandles().iterator();
			String originalWindow=it.next();
			String newWindow;
		    while(it.hasNext()) {
			newWindow=it.next();
			if(!originalWindow.equals(newWindow)) {
				driver.switchTo().window(newWindow);
			VendorsPageOfProducts vp=PageFactory.initElements(driver, VendorsPageOfProducts.class);
			vp.getSelectedVendorName("Linda");
			}
		}
		driver.switchTo().window(originalWindow);
			cr.getWebSiteEditbox().sendKeys("www.poundspowder.com");
			cr.getVendor_part_noEditbox().sendKeys("25");
			cr.getMfrPartNoEditbox().sendKeys(data.getDataForExcelFile("MyTestCase",23 , 2));
			cr.getSerial_noEditbox().sendKeys(data.getDataForExcelFile("MyTestCase", 25, 2));
			cr.getProductsheetEditbox().sendKeys(data.getDataForExcelFile("MyTestCase", 24, 2));
			cr.getUnitPriceEditBox().sendKeys("10000");
			cr.getCommissionRateEditBox().sendKeys("10");
			cr.getVatCheckBox().click();
			cr.getServiesCheckBox().click();
			cr.getSalesCheckBox().click();
			Select sc=new Select(cr.getUsageUnitDropdown());
			sc.selectByIndex(2);
			cr.getQtyEditBox().sendKeys("12");
			cr.getQtyinStock().sendKeys("1000");
			cr.getRecorderLevelEditBox().sendKeys("FirstLevel");
			cr.getHandlerGroupRadioButton().click();
			cr.getQtyDemandEditBox().sendKeys("500");
			JavascriptExecutor jdriver=(JavascriptExecutor)driver;
			jdriver.executeScript("window.scrollBy(0,500) ");
			//cr.getChooseFile().click();
			//Runtime.getRuntime().exec("‪‪\\Users\\NBhaskar\\eclipse-workspace\\New folder\\Redmi\\Autoit\\hemedri.exe");
			
			
			
			
		
		
		}
		
		
		
		
		 
	
	
	
	
	
}

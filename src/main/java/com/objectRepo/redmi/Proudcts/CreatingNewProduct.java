package com.objectRepo.redmi.Proudcts;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatingNewProduct {
	 /**
	 * @return the date
	 */
	public static Date getDate() {
		return date;
	}

	/**
	 * @return the webSiteEditbox
	 */
	public WebElement getWebSiteEditbox() {
		return webSiteEditbox;
	}
	static Date date ;
	@FindBy(id="vendor_part_no")
	private WebElement vendor_part_noEditbox;
	 /**
	 * @return the vendor_part_noEditbox
	 */
	public WebElement getVendor_part_noEditbox() {
		return vendor_part_noEditbox;
	}

	/**
	 * @return the mfrPartNoEditbox
	 */
	public WebElement getMfrPartNoEditbox() {
		return MfrPartNoEditbox;
	}

	/**
	 * @return the serial_noEditbox
	 */
	public WebElement getSerial_noEditbox() {
		return serial_noEditbox;
	}

	/**
	 * @return the productsheetEditbox
	 */
	public WebElement getProductsheetEditbox() {
		return productsheetEditbox;
	}
	@FindBy(xpath="//input[@name='website']")
	 private WebElement webSiteEditbox;
	 
	 @FindBy(id="mfr_part_no")
	 private WebElement MfrPartNoEditbox;
	
	 @FindBy(id="serial_no")
	 private WebElement serial_noEditbox;
	
	 @FindBy(id="productsheet")
	 private WebElement productsheetEditbox;
	
	@FindBy(id="jscal_field_start_date")
	private WebElement supportStartDateEditbox;
	
	@FindBy(id="jscal_field_expiry_date")
	private WebElement supportExpiryDateEditbox;
	
	@FindBy(id="unit_price")
	private WebElement unitPriceEditBox;
	@FindBy(id="commissionrate")
	private WebElement commissionRateEditBox;
	@FindBy(id="tax1_check")
	private WebElement vatCheckBox;
	@FindBy(id="tax2_check")
	private WebElement salesCheckBox;
	@FindBy(id="tax3_check")
	private WebElement serviesCheckBox;
	@FindBy(name="usageunit")
	private WebElement usageUnitDropdown;
	@FindBy(id="qty_per_unit")
	private WebElement qtyEditBox;
	@FindBy(id="qtyinstock")
	private WebElement qtyinStock;
	@FindBy(id="reorderlevel")
	private WebElement RecorderLevelEditBox;
	@FindBy(name="assigntype")
	private WebElement handlerGroupRadioButton;
	@FindBy(id="qtyindemand")
	private WebElement qtyDemandEditBox;
	@FindBy(id="my_file_element")
	private WebElement ChooseFile;
	@FindBy(name="description")
	private WebElement descriptionDetials;
	
	
	
	
	
	
	
	
	public WebElement getUnitPriceEditBox() {
		return unitPriceEditBox;
	}

	public WebElement getCommissionRateEditBox() {
		return commissionRateEditBox;
	}

	public WebElement getVatCheckBox() {
		return vatCheckBox;
	}

	public WebElement getSalesCheckBox() {
		return salesCheckBox;
	}

	public WebElement getServiesCheckBox() {
		return serviesCheckBox;
	}

	public WebElement getUsageUnitDropdown() {
		return usageUnitDropdown;
	}

	public WebElement getQtyEditBox() {
		return qtyEditBox;
	}

	public WebElement getQtyinStock() {
		return qtyinStock;
	}

	public WebElement getRecorderLevelEditBox() {
		return RecorderLevelEditBox;
	}

	public WebElement getHandlerGroupRadioButton() {
		return handlerGroupRadioButton;
	}

	public WebElement getQtyDemandEditBox() {
		return qtyDemandEditBox;
	}

	public WebElement getChooseFile() {
		return ChooseFile;
	}

	public WebElement getDescriptionDetials() {
		return descriptionDetials;
	}

	/**
	 * @return the supportStartDateEditbox
	 */
	public WebElement getSupportStartDateEditbox() {
		return supportStartDateEditbox;
	}

	/**
	 * @return the supportExpiryDateEditbox
	 */
	public WebElement getSupportExpiryDateEditbox() {
		return supportExpiryDateEditbox;
	}

	/**
	 * @return the salesEndDateEditbox
	 */
	public WebElement getSalesEndDateEditbox() {
		return salesEndDateEditbox;
	}
	@FindBy(id="jscal_field_sales_end_date")
	private WebElement salesEndDateEditbox;

	@FindBy(name="productname")
	private WebElement ProductNameEditBox;
	
	@FindBy(xpath="//input[@class='crmbutton small save' and @type='submit' and @name='button']")
	private WebElement SaveButton;
	
	/**
	 * @return the saleStartDateEditbox
	 */
	public WebElement getSaleStartDateEditbox() {
		return saleStartDateEditbox;
	}
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement VenderNameEditboxSymbol;
	
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement vendorname;
	
	@FindBy(id="productcode")
	private WebElement partNumberEditBox;
	
	@FindBy(name="discontinued")
	private WebElement productActiveButton;
	
	@FindBy(id="jscal_trigger_sales_start_date")
	private WebElement salesStartDateWized;
	
	@FindBy(name="manufacturer")
	private WebElement manufacturerDropDown;
	
	@FindBy(name="productcategory")
	private WebElement productcategoryDropDown;
	
	@FindBy(id="jscal_field_sales_start_date")
	private WebElement saleStartDateEditbox;
	
	@FindBy(xpath="//input[@id='jscal_field_start_date']")
	private WebElement supportStartDate;
	
	@FindBy(id="jscal_trigger_sales_end_date")
	private WebElement salesEndDateWized;
	
	@FindBy(id="jscal_trigger_expiry_date")
	private WebElement salesExpiryDate;
	
	
	/**
	 * @return the venderNameEditboxSymbol
	 */
	public WebElement getVenderNameEditboxSymbol() {
		return VenderNameEditboxSymbol;
	}

	/**
	 * @return the partNumberEditBox
	 */
	public WebElement getPartNumberEditBox() {
		return partNumberEditBox;
	}

	/**
	 * @return the productActiveButton
	 */
	public WebElement getProductActiveButton() {
		return productActiveButton;
	}

	/**
	 * @return the salesStartDateWized
	 */
	public WebElement getSalesStartDateWized() {
		return salesStartDateWized;
	}

	/**
	 * @return the manufacturerDropDown
	 */
	public WebElement getManufacturerDropDown() {
		return manufacturerDropDown;
	}

	/**
	 * @return the productcategoryDropDown
	 */
	public WebElement getProductcategoryDropDown() {
		return productcategoryDropDown;
	}

	/**
	 * @return the supportStartDate
	 */
	public WebElement getSupportStartDate() {
		return supportStartDate;
	}

	/**
	 * @return the salesEndDateWized
	 */
	public WebElement getSalesEndDateWized() {
		return salesEndDateWized;
	}

	/**
	 * @return the salesExpiryDate
	 */
	public WebElement getSalesExpiryDate() {
		return salesExpiryDate;
	}

	/**
	 * @param productNameEditBox the productNameEditBox to set
	 */
	public void setProductNameEditBox(WebElement productNameEditBox) {
		ProductNameEditBox = productNameEditBox;
	}
	
	
	/**
	 * @return the vendorname
	 * NBhaskar
	 */
	public WebElement getVendorname() {
		return vendorname;
	}
	
	public WebElement getProductNameEditBox() {
		return ProductNameEditBox;
	}
	public WebElement getSaveButton() {
		return SaveButton;
	}
	
	public static String todate() {
	    date=new Date();
		String dateOfYear=date.toString().substring(24,date.toString().length());
		String dateOfdays=date.toString().substring(8, 11);
		String dateOfMonth="0"+(date.getMonth()+1);
		String todate=dateOfYear+"-"+dateOfMonth+"-"+dateOfdays;
		return todate;
	}
	public static String EndDate(String dateofMonth,String dayofDate) {
		date=new Date();
		String dateOfYear=date.toString().substring(24,date.toString().length());
		String todate=dateOfYear+"-"+dateofMonth+"-"+dayofDate;
		return todate;
	}
	public static String numberFormat(String arg) {
		double d1=Double.parseDouble(arg);
		int i2=(int)d1;
		String da2=""+d1;
		return da2;
	}
	
	
	
}

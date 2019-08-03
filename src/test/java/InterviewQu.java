import com.objectRepo.redmi.DashBord.Homepage;
import com.objectRepo.redmi.Proudcts.CreatingNewProduct;
import com.objectRepo.redmi.Proudcts.ProductsWebElements;
import com.util.Lib.redmi.Setup;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class InterviewQu extends Setup{
	
	@Test
	public void getInterviewQucation() {
		Reporter.log("Navigate to Proudct modulder");
		Homepage hp=PageFactory.initElements(driver, Homepage.class);
		hp.getProductsLink().click();
		Reporter.log("Navigate to New products Symoble ");
		ProductsWebElements pw=PageFactory.initElements(driver, ProductsWebElements.class);
		pw.getCreatePageProductsSymbol().click();
		Reporter.log("Nagivate to CreatingNewProudct Page");
		CreatingNewProduct cr=PageFactory.initElements(driver, CreatingNewProduct.class);
		
	
	}

}

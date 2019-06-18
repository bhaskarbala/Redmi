import java.io.IOException;

import javax.swing.event.TreeWillExpandListener;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.objectRepo.redmi.DashBord.Homepage;
import com.objectRepo.redmi.Proudcts.CreatingNewProduct;
import com.objectRepo.redmi.Proudcts.ProductsWebElements;
import com.util.Lib.redmi.Setup;
@Listeners(com.util.Lib.redmi.ListernerImp.class)
public class Prac extends Setup {
@Test
	public static void loginmethods() throws InterruptedException, Exception {
	Reporter.log("Navigate to Proudct modulder");
	Homepage hp=PageFactory.initElements(driver, Homepage.class);
	hp.getProductsLink().click();
	Reporter.log("Navigate to New products Symoble ");
	ProductsWebElements pw=PageFactory.initElements(driver, ProductsWebElements.class);
	pw.getCreatePageProductsSymbol().click();
	Reporter.log("Nagivate to CreatingNewProudct Page");
	CreatingNewProduct cr=PageFactory.initElements(driver, CreatingNewProduct.class);
	cr.getChooseFile().click();
	
	Thread.sleep(5000);
	ProcessBuilder pb=new ProcessBuilder("‪C:\\Users\\NBhaskar\\Desktop\\AutoIt\\new\\very.exe");
	pb.start();
	Thread.sleep(1000);
	
	
	
		
	}

}

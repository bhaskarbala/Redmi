import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.util.Lib.redmi.DataHandler;

import junit.framework.Assert;

public class Remote  {
	@DataProvider
	public Object [][] getLoginErrorMsg() throws Exception{
		Object datatype[][]=DataHandler.getRunSameTestCase("Sheet2");
		return datatype;
	}
	
	@Test(dataProvider="getLoginErrorMsg")
	public void TestDR(String username,String password) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Soures/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=index&module=Products&record=135&parenttab=Inventory&start=");
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		String exp="You must specify a valid username and password.";
		String actual=driver.findElement(By.xpath("//div[@class='errorMessage']")).getText();
		//System.out.println(actual);
		Assert.assertEquals(exp, actual);
		Thread.sleep(2000);
		driver.close();
	}
	
		}


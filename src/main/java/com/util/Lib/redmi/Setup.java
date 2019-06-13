package com.util.Lib.redmi;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.objectRepo.redmi.DashBord.LoginPage;

public class Setup {
	public static WebDriver driver;
	public static DataHandler data=new DataHandler();
	@BeforeClass
	public void globalBrowserStart() throws Throwable {
		String browser=data.getDataFromePropertiesFile("browser");
		String url=data.getDataFromePropertiesFile("url");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Soures/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Soures/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
	}
			
	@BeforeMethod
	public void prefix() throws Throwable {
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		lp.getLoginToApp(data.getDataFromePropertiesFile("username"),data.getDataFromePropertiesFile("password"));
		
	}
	@AfterMethod
	public void postFix() {
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		Actions act=new Actions(driver);
		act.moveToElement(lp.getLogoutButton()).build().perform();
		driver.findElement(By.linkText("Sign Out")).click();
	}
	@AfterClass
	public void globalBrowserClose() {
		driver.close();
	}
	
}

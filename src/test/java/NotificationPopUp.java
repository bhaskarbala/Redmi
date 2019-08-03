

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopUp {

	public static void main(String[] args) {
		
		
		/*System.setProperty("webdriver.chrome.driver","./Soures/chromedriver.exe" );
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		*/
		System.setProperty("webdriver.gecko.driver","./Soures/geckodriver.exe" );
		FirefoxOptions opt=new FirefoxOptions();
		opt.addPreference("dom.webnotifications.enabled",false );
		WebDriver driver=new FirefoxDriver(opt);
		driver.get("http://www.redbus.in");
	}

}

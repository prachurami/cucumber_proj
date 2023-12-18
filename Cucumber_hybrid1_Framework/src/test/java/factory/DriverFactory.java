package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
static WebDriver driver = null;
	
	public static WebDriver initializeBrowser(String browserName) {
		
		if(browserName.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver","D:\\prachi_CD\\chromedriver.exe");
			//D:\\prachi_CD\\chromedriver.exe
			driver = new ChromeDriver();
//			driver.get("https://www.ebay.ca/");
//			return driver;
//			
		}else if(browserName.equals("firefox")) {
			
			driver = new FirefoxDriver();
			
		}else if(browserName.equals("edge")) {
			
			driver = new EdgeDriver();
			
		}else if(browserName.equals("safari")) {
			
			driver = new SafariDriver();
			
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(CommonUtils.PAGE_LOAD_TIME));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(CommonUtils.IMPLICIT_WAIT_TIME));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.ca/");
		return driver;
		
}
	
public static WebDriver getDriver() {
		
		return driver;
		
	}
}
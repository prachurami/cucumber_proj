package hooks;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		driver=DriverFactory.initializeBrowser("firefox");
	}
	
	@After
	public void tearDown() throws Exception {
		//Thread.sleep(3000);
      driver.quit();
	
	
	
	}	
}

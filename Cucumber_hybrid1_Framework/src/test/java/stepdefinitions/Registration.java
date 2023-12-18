package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {

	 WebDriver driver;
	
	
	@Given("User navigates to directliy to registration page")
	public void user_navigates_to_directliy_to_registration_page() {
		 driver=DriverFactory.getDriver();
		 driver.findElement(By.xpath("//div[@class='nav-line-1-container']")).click();	    
		 driver.findElement(By.id("createAccountSubmit")).click();
		
	}

	@When("User enters valid Name")
	public void user_enters_valid_name() {
	    driver.findElement(By.id("ap_customer_name")).sendKeys("IMNUMBER1");

	}

	@When("User enter valid email address {string} in email field")
	public void user_enter_valid_email_address_in_email_field(String string) {
	    driver.findElement(By.id("ap_email")).sendKeys(string);

	}
	

	@When("User enters valid password {string} in password field")
	public void user_enters_valid_password_in_password_field(String string) {
	    driver.findElement(By.id("ap_password")).sendKeys(string);

	}

	@When("User enters valid and same {string} password")
	public void user_enters_valid_and_same_password(String string) {
	    driver.findElement(By.id("ap_password_check")).sendKeys(string);

	}

	@When("User clicks on continue button")
	public void user_clicks_on_continue_button() {
	    driver.findElement(By.id("continue")).click();

	}

	@Then("User should get success message")
	public void user_should_get_success_message() throws InterruptedException {
	   Thread.sleep(2000);
		driver.switchTo().frame(0);
	    Thread.sleep(2000);
	    String ACT= driver.findElement(By.id("aacb-captcha-header")).getText();
	    System.out.println(ACT);
	    String EXP="Solve this puzzle to protect your account";
		Assert.assertEquals(ACT, EXP);
	}

	@When("User enter invalid email address {string} in email field")
	public void user_enter_invalid_email_address_in_email_field(String string) {
	    driver.findElement(By.id("ap_email")).sendKeys(string);

	}

	@Then("User should get invalid email warning message")
	public void user_should_get_invalid_email_warning_message() throws InterruptedException {
		//Thread.sleep(3000);
	    String ACT= driver.findElement(By.xpath("//div[contains(text(),'Wrong or invalid e-mail address or mobile phone nu')]")).getText();
	    System.out.println(ACT);
	    String EXP="Wrong or invalid e-mail address or mobile phone number. Please correct it and try again.";
		Assert.assertEquals(EXP, ACT);
	}

	@When("User enters missmatch and same {string} password")
	public void user_enters_missmatch_and_same_password(String string) {
	    driver.findElement(By.id("ap_password_check")).sendKeys(string);

	}

	@Then("User should get password missmatch message")
	public void user_should_get_password_missmatch_message() throws InterruptedException {
		Thread.sleep(2000);
		   String ACT= driver.findElement(By.xpath("//div[contains(text(),'Passwords do not match')]")).getText();
		    System.out.println(ACT);
		    String EXP="Passwords do not match";
			Assert.assertEquals(EXP, ACT);
	}

	@When("User enters valid no Name")
	public void user_enters_valid_no_name() {
		 //Deliberately  left blank
	}
	
	@Then("User should get enter your name warning message")
	public void user_should_get_enter_your_name_warning_message() {
		String ACT= driver.findElement(By.xpath("//div[contains(text(),'Enter your name')]")).getText();
	    System.out.println(ACT);
	    String EXP="Enter your name";
		Assert.assertEquals(EXP, ACT);
	}
	
	
	
	
	
}

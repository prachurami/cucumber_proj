package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	WebDriver driver;

	@Given("User Navigate to login page")
	public void user_navigate_to_login_page() {
		driver = DriverFactory.getDriver();
		driver.findElement(By.xpath("//div[@class='nav-line-1-container']")).click();

	}

	@When("User Enters valid {string} username")
	public void user_enters_valid_username(String string) {
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@id='continue']")).click();

	}

	@When("Enter vaild {string} Password")
	public void enter_vaild_password(String string) {
		// driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(string);

	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}

	@Then("User Should get a proper login Message")
	public void user_should_get_a_proper_login_message() {
		String ACT = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).getText();
		String EXP = "Hello, prachi";
		Assert.assertEquals(EXP, ACT);

	}

	@Then("User Should get a proper warning Message for empty password")
	public void user_should_get_a_proper_warning_message_for_empty_password() {
		String ACT = driver.findElement(By.xpath("//div[contains(text(),'Enter your password')]")).getText();
		String EXP = "Enter your password";
		Assert.assertEquals(EXP, ACT);
	}

	@Then("User Should get a proper warning Message for wrong password")
	public void user_should_get_a_proper_warning_message_for_wrong_password() throws InterruptedException {
		String ACT = driver.findElement(By.xpath("//span[@class='a-list-item']")).getText();
		//driver.navigate().refresh();
		String EXP = "Your password is incorrect";
	//	Thread.sleep(7000);
		
		
		Assert.assertEquals(EXP, ACT);
	}

}

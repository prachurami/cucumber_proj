package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	WebDriver driver;

	@When("User click on cart button")
	public void user_click_on_cart_button() {
		driver = DriverFactory.getDriver();
		driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
	}

	@When("User click on Delete button of saved product")
	public void user_click_on_delete_button_of_saved_product() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@value='Delete' and @type='submit']")).click();
		
	}

//span[@class='a-size-small sc-action-delete']//span[@class='a-declarative']//input[@type='submit']

	@Then("Product should be removed from the saved items list")
	public void product_should_be_removed_from_the_saved_items_list() {
		boolean flag = driver
				.findElement(By.xpath("//input[@value='Delete' and @type='submit']"))
				.isDisplayed();
		Assert.assertTrue(flag);

	}

}

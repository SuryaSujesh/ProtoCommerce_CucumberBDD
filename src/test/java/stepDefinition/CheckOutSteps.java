package stepDefinition;

import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckOutHomePage;
import pages.CheckOut1Page;
import pages.CheckOut2Page;


public class CheckOutSteps {
   
	 WebDriver driver;
	 public static CheckOut1Page cp;
	 public static CheckOut2Page checkoutpage;

	@Given("user is on shop page")
	public void user_is_on_shop_page() {
		driver = DriverFactory.getDriver();
	}

	@When("user clicks on checkout button")
	public void user_clicks_on_checkout_button() {
		CheckOutHomePage hp = new CheckOutHomePage(driver);
		cp= hp.emptyCheckOut();
	
	}
	@Then("user should navigate to next checkout page")
	public void user_should_navigate_to_next_checkout_page() {	
      System.out.println("Nothing in cart");   
	}

	@When("User clicks the continue shopping button")
	public void user_clicks_the_continue_shopping_button() {
		
	       cp.continueShop();
	}

	@Then("User should successfully able to navigate to shop page")
	public void user_should_successfully_able_to_navigate_to_shop_page() {
		
	}

	@When("User clicks the Add button for all the product")
	public void user_clicks_the_add_button_for_all_the_product() {

		 CheckOutHomePage hp = new CheckOutHomePage(driver);
		 hp.clickOnButton1();
		 hp.clickOnButton2();
		
	}

	@And("User clicks the checkout button")
	public void user_clicks_the_checkout_button() throws InterruptedException {
		 CheckOutHomePage hp = new CheckOutHomePage(driver);
		 checkoutpage= hp.checkOut();
	}

	@When("User clicks the remove button for the first product")
	public void user_clicks_the_remove_button_for_the_first_product() throws InterruptedException {
		
		checkoutpage.removeButton();
	
	}

	@Then("User should successfully able to remove it")
	public void user_should_successfully_able_to_remove_it() {
	   
	}

	@When("User clicks the final checkout")
	public void user_clicks_the_final_checkout() {
	     checkoutpage.finalCheckout();
	}

	@Then("user navigates to purchase page")
	public void user_navigates_to_purchase_page() {
	   
	}


}

package stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import com.pages.HomePage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps {

	private HomePage homePage = new HomePage(DriverFactory.getDriver());

	@Given("user is on website landing page")
	public void user_is_on_website_landing_page() {

		DriverFactory.getDriver()
				.get("http://demowebshop.tricentis.com/");
	}

	@Given("user navigate to the following tabs")
	public void user_navigate_to_the_following_tabs(List<String> tabNames) {

		homePage.checkTabs(tabNames);

	}
	
	@Given("user explores the tabs from the Categories section")
	public void user_explores_the_tabs_from_the_Categories_section(List<String> tabNames) {

		homePage.checkLinksFromCategories(tabNames);

	}

	@Given("user clicks on the link {string}")
	public void user_clicks_on_register(String linkName) {
		if (linkName.equalsIgnoreCase("Register")) {
			homePage.navigatetoRegistrationPage();
		} else if (linkName.equalsIgnoreCase("Login")) {
			homePage.navigatetoLoginPage();
		}else if (linkName.equalsIgnoreCase("Shopping Cart")) {
			homePage.navigatetoShoppingCartPage();
		} else {
			Assert.fail(linkName + " is not defined");
		}
	}
	
	@Then("user adds {string} to cart")
	public void user_adds_to_cart(String product) {
	
		homePage.addProductToCart(product);
	}
	
	@Then("user validates the success message")
	public void user_validates_the_success_message() {
		homePage.successMsgForProductAddedToCard();
	}

	
	@Then("user navigates to {string}")
	public void user_navigates_to(String product) {
	
		homePage.addProductToCart(product);
	}
	
	@Then("user selects Checkout as Guest")
	public void user_selects() {
		homePage.continueAsGuest();
	    
	}
	
	@Then("the order is successfully placed")
	public void the_order_is_successfully_placed() {
		homePage.msgSuccessOrderPlaced();
	}
	
}

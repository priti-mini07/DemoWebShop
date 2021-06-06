package stepdefinition;

import java.util.Map;

import com.pages.CheckoutPage;
import com.pages.RegistrationPage;
import com.pages.ShoppingCartPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class CheckOutPageSteps {
	
	private CheckoutPage checkOutPage = new CheckoutPage(DriverFactory.getDriver());
	
	@Then("user provides the below address details for shipping")
	public void user_provides_the_below_address_details_for_shipping(Map<String, String> shippingDetails) {
		checkOutPage.selectShippingDetails(shippingDetails);
	}
	
	
	@Then("user clicks button {string}")
	public void user_clicks_button(String button) throws InterruptedException {
		checkOutPage.clickButton(button);
	}

}

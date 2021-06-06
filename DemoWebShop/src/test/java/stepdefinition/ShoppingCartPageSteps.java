package stepdefinition;

import com.pages.RegistrationPage;
import com.pages.ShoppingCartPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class ShoppingCartPageSteps {
	
	private ShoppingCartPage shopCartPage = new ShoppingCartPage(DriverFactory.getDriver());
	
	@Then("user selects the Terms n Conditions")
	public void user_selects_the_terms_n_conditions() {
	
		
		shopCartPage.selectTermsNConditions();
	}

	@Then("user clicks on {string} button")
	public void user_clicks_on_button(String button) {
		shopCartPage.clickButton(button);
	}
	
}

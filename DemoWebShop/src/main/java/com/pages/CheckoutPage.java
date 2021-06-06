package com.pages;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.qa.util.WaitUtil;
import org.junit.Assert;

public class CheckoutPage {

	private WebDriver driver;
	//private WaitUtil wait;

	// 1. By Locators: OR

	private By selectCountry = By.xpath("//select[@id='BillingNewAddress_CountryId']");
	private By selectState = By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
	private By txtPin = By.id("BillingNewAddress_ZipPostalCode");
	private By txtCity = By.name("BillingNewAddress.City");
	private By txtAddr1 = By.id("BillingNewAddress_Address1");
	private By txtphoneNo = By.id("BillingNewAddress_PhoneNumber");
	private By btnContinue = By.xpath("//input[@value='Continue']");
	private By btnConfirm = By.xpath("//input[@value='Confirm']");
	private By txtEmail = By.id("BillingNewAddress_Email");
	private By txtFirstName = By.id("BillingNewAddress_FirstName");
	private By txtLastName = By.id("BillingNewAddress_LastName");
	private By btnContinue2 = By.xpath("//h2[text()='Shipping method']/following::input[@value='Continue']");
	private By btnContinue3 = By.xpath("//h2[text()='Payment method']/following::input[@value='Continue']");
	private By btnContinue4 = By.xpath("//h2[text()='Payment information']/following::input[@value='Continue']");
	private By btnContinue5 = By.xpath("//h2[text()='Shipping address']/following::input[@value='Continue']");
	private By msgSuccess = By.xpath("//a[text()='Click here for order details.']");
	
	// 2. Constructor of the page class:
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public void selectShippingDetails(Map<String, String> shippingDetails) {
		// Select the shipping details
		Select country = new Select(driver.findElement(selectCountry));
		country.selectByVisibleText(shippingDetails.get("Country"));

		Select state = new Select(driver.findElement(selectState));
		state.selectByVisibleText(shippingDetails.get("State"));
		if(shippingDetails.containsKey("First name")){
		driver.findElement(txtFirstName).sendKeys(shippingDetails.get("First name"));
		}
		if(shippingDetails.containsKey("Last name")){
		driver.findElement(txtLastName).sendKeys(shippingDetails.get("Last name"));
		}
		if(shippingDetails.containsKey("Email")) {
		driver.findElement(txtEmail).sendKeys(shippingDetails.get("Email"));
		}
		driver.findElement(txtPin).sendKeys(shippingDetails.get("Zip Code"));
		driver.findElement(txtCity).sendKeys(shippingDetails.get("City"));
		driver.findElement(txtAddr1).sendKeys(shippingDetails.get("Address 1"));

		driver.findElement(txtphoneNo).sendKeys(shippingDetails.get("Phone No"));

	}

	public void clickButton(String button) throws InterruptedException {
		if (button.equals("Continue")) {
		
			driver.findElement(btnContinue).click();
			
		} else if (button.equals("Confirm")) {
			
			WaitUtil.waitForElementLoad(driver,10, driver.findElement(btnConfirm));
			driver.findElement(btnConfirm).click();
			WaitUtil.waitForElementPresence(driver,20,btnContinue);
			
		}else if (button.equals("Shipping Continue")) {
			
			WaitUtil.waitForElementLoad(driver,10, driver.findElement(btnContinue2));
			driver.findElement(btnContinue2).click();
			
		}else if (button.equals("Payment method Continue")) {
			
			WaitUtil.waitForElementLoad(driver,10, driver.findElement(btnContinue3));
			driver.findElement(btnContinue3).click();
			
		}else if (button.equals("Payment Info Continue")) {
			
			WaitUtil.waitForElementLoad(driver,10, driver.findElement(btnContinue4));
			driver.findElement(btnContinue4).click();
			
		}else if (button.equals("Shipping Address Continue")) {
			
			WaitUtil.waitForElementLoad(driver,10, driver.findElement(btnContinue5));
			driver.findElement(btnContinue5).click();
			
		}else {
			Assert.fail("Unknown button "+button);
		}
	}

}

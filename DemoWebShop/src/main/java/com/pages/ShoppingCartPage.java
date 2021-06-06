package com.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

public class ShoppingCartPage {

	private WebDriver driver;

	// 1. By Locators: OR
	
	private By selectCountry = By.xpath("//select[@id='BillingNewAddress_CountryId']");
	private By selectState = By.xpath("//select[@id='StateProvinceId']");
	private By txtPin = By.id("BillingNewAddress_ZipPostalCode");
	private By txtCity = By.name("BillingNewAddress.City");
	private By txtAddr1 = By.id("BillingNewAddress_Address1");
	private By txtphoneNo = By.id("BillingNewAddress_PhoneNumber");
	private By btnEstimateShipping = By.name("estimateshipping");
	private By termsNConditions = By.id("termsofservice");
	private By btnCheckout = By.id("checkout");
	private By btnContinue = By.xpath("//input[@value='Continue']");
	
	


	// 2. Constructor of the page class:
	public ShoppingCartPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:
	
	public void selectShippingDetails(List<String> shippingDetails) {
		//Select the shipping details
		Select country = new Select(driver.findElement(selectCountry));
		country.selectByVisibleText(shippingDetails.get(0));
		
		Select state = new Select(driver.findElement(selectCountry));
		state.selectByVisibleText(shippingDetails.get(1));
		
		driver.findElement(txtPin).sendKeys(shippingDetails.get(1));
		
		driver.findElement(btnEstimateShipping).click();
		
	
	}
	
	public void selectTermsNConditions() {
		driver.findElement(termsNConditions).click();
		
	}

	public void clickButton(String button) {
		if(button.equals("Checkout")) {
			driver.findElement(btnCheckout).click();	
		}
	}
	

	
}

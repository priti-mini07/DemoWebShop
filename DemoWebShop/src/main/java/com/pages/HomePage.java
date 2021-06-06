package com.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

import com.qa.util.WaitUtil;

public class HomePage {

	private WebDriver driver;

	// 1. By Locators: OR
	
	private By registerLink = By.xpath("//a[text()='Register']");
	private By loginLink = By.xpath("//a[text()='Log In']");
	private By shoppingCartLink = By.xpath("//a[text()='Shopping cart']");
	private By productAddedToCartSuccessMsg = By.xpath("//p[contains(text(),'The product has been added')]");
	private By selectCountry = By.xpath("//select[@id='CountryId']");
	private By selectState = By.xpath("//select[@id='StateProvinceId']");
	private By txtPin = By.id("ZipPostalCode");
	private By btnEstimateShipping = By.name("estimateshipping");
	private By termsNConditions = By.id("termsofservice");
	private By btnCheckout = By.id("checkout");
	private By btnGuest = By.xpath("//input[@value='Checkout as Guest']");
	private By msgSuccess = By.xpath("//div[@class='title']/strong");
	


	// 2. Constructor of the page class:
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public void navigatetoRegistrationPage() {
		driver.findElement(registerLink).click();
		
	}
	
	public void navigatetoLoginPage() {
		driver.findElement(loginLink).click();
		
	}
	
	public void navigatetoShoppingCartPage() {
		driver.findElement(shoppingCartLink).click();
		
	}
	
	public void checkTabs(List<String> tabNames) {
		for(int i=0;i<tabNames.size();i++) {
		driver.findElement(By.xpath("//a[contains(text(),'"+tabNames.get(i)+"')]")).click();
		//Validating the page contains the relevant header
		if(tabNames.get(i).equalsIgnoreCase("Log in")) {
			Assert.assertTrue(driver.findElements(By.xpath("//h1[text()='Welcome, Please Sign In!']")).size()>0);	
		}else {	
		Assert.assertTrue(driver.findElements(By.xpath("//h1[contains(text(),'"+tabNames.get(i)+"')]")).size()>0);
		}
		}
	}
	
	public void checkLinksFromCategories(List<String> tabNames) {
		for(int i=0;i<tabNames.size();i++) {
		
		//Validating the link in the categories section
		driver.findElement(By.xpath("//strong[contains(text(),'Categories')]/following::a[contains(text(),'"+tabNames.get(i)+"')]")).click();
		
		//Validating the page contains the relevant header
		Assert.assertTrue(driver.findElements(By.xpath("//h1[text()='"+tabNames.get(i)+"']")).size()>0);
		}
	}
	
	public void addProductToCart(String productName) {
		//Add product to cart by parameterizing the xpath
		driver.findElement(By.xpath("//a[contains(text(),'"+productName+"')]/following::input[@value='Add to cart']")).click();	
	}
	
	public void successMsgForProductAddedToCard() {
		WaitUtil.waitForElementLoad(driver,5, driver.findElement(productAddedToCartSuccessMsg));
		Assert.assertTrue(driver.findElements(productAddedToCartSuccessMsg).size()>0);
	}
	
	public void continueAsGuest() {
		driver.findElement(btnGuest).click();
		
	}
	
	public void msgSuccessOrderPlaced() {

		Assert.assertEquals(driver.findElement(msgSuccess).getText(),"Your order has been successfully processed!");
	}

}

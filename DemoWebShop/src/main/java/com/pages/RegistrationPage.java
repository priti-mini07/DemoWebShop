package com.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

public class RegistrationPage {

	private WebDriver driver;

//	// 1. By Locators: OR
//	
//	private By registerLink = By.xpath("//a[text()='Register']");
//	private By genderMale = By.xpath("//label[text()='Male']/preceding-sibling::input");
//	private By genderFemale = By.xpath("//label[text()='Female']/preceding-sibling::input");
//	private By firstName = By.id("FirstName");
//	private By lastName = By.id("LastName");
//	private By email = By.id("Email");
//	private By pwd = By.id("Password");
//	private By cnfPwd = By.id("ConfirmPassword");
//	private By btnRegister = By.id("register-button");
//	private By msgSuccess = By.xpath("//div[@class='result']");
//	private By btnContinue = By.xpath("//input[@value='Continue']");
//	private By linkUserName = By.xpath("//a[@class='account']");
//
//
//	// 2. Constructor of the page class:
//	public RegistrationPage(WebDriver driver) {
//		this.driver = driver;
//	}
//
//	// 3. page actions: features(behavior) of the page the form of methods:
//
//	public void clickRegisterLink() {
//		driver.findElement(registerLink).click();
//		
//	}
//	
//	public void enterRegistrationDetails(List<Map<String, String>> details) {
//		for (Map<String, String> detail : details) {
//			switch (detail.get("Field")) {
//			case "Gender":
//				if (detail.get("Value").equals("Male")) {
//					driver.findElement(genderMale).click();
//				} else if (detail.get("Value").equals("Female")) {
//					driver.findElement(genderFemale).click();
//				} else {
//					System.out.println("UnknownGender type");
//				}
//				break;
//
//			case "First Name":
//				driver.findElement(firstName).sendKeys(detail.get("Value"));
//				break;
//
//			case "Last Name":
//				driver.findElement(lastName).sendKeys(detail.get("Value"));
//				break;
//
//			case "Email":
//				driver.findElement(email).sendKeys(detail.get("Value"));
//				break;
//
//			case "Password":
//				driver.findElement(pwd).sendKeys(detail.get("Value"));
//				break;
//				
//			case "Confirm Password":
//				driver.findElement(cnfPwd).sendKeys(detail.get("Value"));
//				break;
//				
//				default :System.out.println("Entry is undefined");
//			}
//
//		}
//	}
//
//	public void clickRegisterButton() {
//		driver.findElement(btnRegister).click();
//	}
//	
//	public void clickContinueButton() {
//		driver.findElement(btnContinue).click();
//	}
//	
//  public void validateRegistratiOnSuccess(String msg) {
//	  Assert.assertEquals(driver.findElement(msgSuccess).getText(),msg,"Expected success message"+msg);
//  }
//
//  public void validateUserName(String userName) {
//	  Assert.assertEquals(driver.findElement(linkUserName).getText(),userName,"Expected userName "+userName);
//  }
  
  
}

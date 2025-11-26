package com.saucedemo.ui.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.ui.baseLayer.BaseClass;
import com.saucedemo.ui.utilityLayer.WebElementImpl;

public class CheckoutInformationPage extends BaseClass{
	
	private WebElementImpl webElement = new WebElementImpl();
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement pincode;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueButton;
	
	public CheckoutInformationPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void userEnterFirstnameLastnameAndPincode(String firstName, String lastName, String pincode) {
		webElement.sendKeys(this.firstName, firstName);
		webElement.sendKeys(this.lastName, lastName);
		webElement.sendKeys(this.pincode, pincode);
	}
	
	public void userClickOnContinueButton() {
		webElement.click(continueButton);
	}

}

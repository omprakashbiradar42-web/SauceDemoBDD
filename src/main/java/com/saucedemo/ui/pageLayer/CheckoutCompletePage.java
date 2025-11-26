package com.saucedemo.ui.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.ui.baseLayer.BaseClass;
import com.saucedemo.ui.utilityLayer.WebElementImpl;

public class CheckoutCompletePage extends BaseClass{
	private WebElementImpl webElement = new WebElementImpl();
	
	@FindBy(xpath="//button[text()='Finish']")
	private WebElement finishButton;
	
	@FindBy(xpath="//button[text()='Back Home']")
	private WebElement backToHomeButton;
	
	public CheckoutCompletePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void userClickOnFinishButton() {
		webElement.click(this.finishButton);
	}
	

	public void userClickOnBackToHomeButton() {
		webElement.click(this.backToHomeButton);
	}

}

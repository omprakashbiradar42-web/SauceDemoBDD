package com.saucedemo.ui.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.ui.baseLayer.BaseClass;
import com.saucedemo.ui.utilityLayer.WebElementImpl;

public class LoginPage extends BaseClass{
	
	private WebElementImpl webElement =new WebElementImpl();
	
	@FindBy(xpath="//input[@name='user-name']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='login-button']")
	private WebElement loginButton;
	
	
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void userEnterUsernameAndPassword(String userName, String password) {
		webElement.sendKeys(this.userName, userName);
		webElement.sendKeys(this.password, password);
	}
	
	public void userClikOnLoginButton() throws InterruptedException {
		webElement.click(loginButton);
		
		Thread.sleep(5000);
	}

}

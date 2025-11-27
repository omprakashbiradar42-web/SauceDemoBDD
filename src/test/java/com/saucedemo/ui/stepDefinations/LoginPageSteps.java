package com.saucedemo.ui.stepDefinations;

import java.io.IOException;

import com.saucedemo.ui.baseLayer.BaseClass;
import com.saucedemo.ui.pageLayer.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseClass{
	
	private LoginPage login;
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws IOException {
		initialization("incognito");
	}

	@When("user enter {string} as userName and {string} as password")
	public void user_enter_as_user_name_and_as_password(String userName, String password) {
		
		login = new LoginPage();
		login.userEnterUsernameAndPassword(userName, password);
	   
	}

	@Then("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		login.userClikOnLoginButton();
	}

}

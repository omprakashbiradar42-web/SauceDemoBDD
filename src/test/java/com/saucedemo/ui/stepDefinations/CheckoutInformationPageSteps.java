package com.saucedemo.ui.stepDefinations;

import com.saucedemo.ui.pageLayer.CheckoutInformationPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutInformationPageSteps {
	
	private CheckoutInformationPage infoPage = new CheckoutInformationPage();
	
	@When("user Enter {string} as firstName  {string} as lastName and {string} as pincode")
	public void user_enter_as_first_name_as_last_name_and_as_pincode(String firstName, String lastName, String pincode) {
		infoPage.userEnterFirstnameLastnameAndPincode(firstName, lastName, pincode);
	}
	@Then("user click on continue button")
	public void user_click_on_continue_button() {
		infoPage.userClickOnContinueButton();
	}

}

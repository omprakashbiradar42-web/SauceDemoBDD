package com.saucedemo.ui.stepDefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.saucedemo.ui.baseLayer.BaseClass;
import com.saucedemo.ui.pageLayer.CheckoutCompletePage;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutCompletePageSteps extends BaseClass{
	
	 private CheckoutCompletePage complete = new CheckoutCompletePage();	
	@When("user click on finish button")
	public void user_click_on_finish_button() {
		complete.userClickOnFinishButton();
	}
	@Then("user clik on back to home button")
	public void user_clik_on_back_to_home_button() {
		complete.userClickOnBackToHomeButton();
	}
	
	
	@AfterStep
	public void takeScreenshot(Scenario scenario) {
		TakesScreenshot ts = (TakesScreenshot)getDriver();
		byte [] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		
		scenario.attach(screenshot, "image/png",scenario.getName());
	}
}

package com.saucedemo.ui.stepDefinations;


import com.saucedemo.ui.pageLayer.ProductPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductPageSteps {
	
	
	
	private ProductPage product = new ProductPage();
	
	@When("user click on filter icon")
	public void user_click_on_filter_icon() {
		product.userClickOnFilterIcon();
	}
	@Then("select price range options")
	public void select_price_range_options() {
		product.userSelectPriceRange();
	}
	@Then("user click on first add to cart button")
	public void user_click_on_first_add_to_cart_button() throws InterruptedException {
		product.userClickOnFirstAddToButton();
	}
	@Then("user click on go to cart icon")
	public void user_click_on_go_to_cart_icon() {
		product.userClickOnGoToCartIcon();
	}
	@Then("user click on checkOut button")
	public void user_click_on_check_out_button() {
		product.userClickCkeckOutButton();
	}

}

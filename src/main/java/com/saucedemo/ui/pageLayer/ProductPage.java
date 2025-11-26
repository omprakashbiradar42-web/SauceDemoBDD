package com.saucedemo.ui.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.ui.baseLayer.BaseClass;
import com.saucedemo.ui.utilityLayer.DropDownImpl;
import com.saucedemo.ui.utilityLayer.WebElementImpl;

public class ProductPage extends BaseClass{
	
	private WebElementImpl webElement = new WebElementImpl();
	private DropDownImpl dropdown = new DropDownImpl();	
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filterOptions;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
	private WebElement firstAddToCartButton;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cartIcon;
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement checkOutButton;
	
	
   public ProductPage() {
	   PageFactory.initElements(getDriver(), this);
   }
   
   
	public void userClickOnFilterIcon() {
		webElement.click(this.filterOptions);
	}

	public void userSelectPriceRange() {
		dropdown.selectByVisibleText(this.filterOptions, "Price (low to high)");
	}

	public void userClickOnFirstAddToButton() throws InterruptedException {
		webElement.click(this.firstAddToCartButton);
		Thread.sleep(5000);
	}

	public void userClickOnGoToCartIcon() {
		webElement.click(this.cartIcon);
	}

	public void userClickCkeckOutButton() {
		webElement.click(this.checkOutButton);
	}

}

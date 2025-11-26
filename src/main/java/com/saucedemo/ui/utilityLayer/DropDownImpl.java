package com.saucedemo.ui.utilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.saucedemo.ui.baseLayer.BaseClass;
import com.saucedemo.ui.iHelper.IDropDown;

public class DropDownImpl extends BaseClass implements IDropDown {
	
	private WaitImpl wait = new WaitImpl();
	private WebElementImpl webElement = new WebElementImpl();

	@Override
	public void selectByVisibleText(WebElement wb, String VisibleText) {
		
		new Select(wait.visibilityOf(wb)).selectByVisibleText(VisibleText);
	}

	@Override
	public void selectByValue(WebElement wb, String value) {
		new Select(wait.visibilityOf(wb)).selectByValue(value);
		
	}

	@Override
	public void selectByIndex(WebElement wb, int index) {
		new Select(wait.visibilityOf(wb)).selectByIndex(index);
		
	}

	@Override
	public void selectValue(List<WebElement> list, String value) {
		for(WebElement li: list) {
			String actualValue = webElement.getText(li);
			
			if(actualValue.equals(value)) {
				webElement.click(li);
				break;
			}
		}
		
	}

}

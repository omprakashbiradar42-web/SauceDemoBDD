package com.saucedemo.ui.utilityLayer;

import java.time.Duration;

import com.saucedemo.ui.baseLayer.BaseClass;
import com.saucedemo.ui.iHelper.IWebDriver;

public class WebDriverImpl extends BaseClass implements IWebDriver{

	@Override
	public void get(String url) {
		getDriver().get(url);
		
	}

	@Override
	public void minimize() {
		getDriver().manage().window().minimize();
		
	}

	@Override
	public void maximize() {
		getDriver().manage().window().maximize();
		
	}

	@Override
	public void fullScreen() {
		getDriver().manage().window().fullscreen();
		
	}

	@Override
	public void forward() {
		getDriver().navigate().forward();
		
	}

	@Override
	public void back() {
		getDriver().navigate().back();
		
	}

	@Override
	public void implicitilyWait(Duration duration) {
		getDriver().manage().timeouts().implicitlyWait(duration);
		
	}

	@Override
	public void pageLoadTimeOut(Duration duration) {
		getDriver().manage().timeouts().pageLoadTimeout(duration);
		
	}

	@Override
	public String getTitle() {
		
		return getDriver().getTitle();
	}

	@Override
	public String getCurrentUrl() {
		
		return getDriver().getCurrentUrl();
	}

	@Override
	public void close() {
		getDriver().close();
		
	}

	@Override
	public void quit() {
		getDriver().quit();
		
	}

}

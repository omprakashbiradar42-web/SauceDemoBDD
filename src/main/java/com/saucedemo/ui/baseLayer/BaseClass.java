package com.saucedemo.ui.baseLayer;

import java.io.IOException;
import java.time.Duration;

import com.saucedemo.ui.utilityLayer.DriverFactory;
import com.saucedemo.ui.utilityLayer.PropertyReader;
import com.saucedemo.ui.utilityLayer.WebDriverImpl;

public class BaseClass extends DriverFactory{
	
	private WebDriverImpl webDriver;
	private PropertyReader prop;
	
	public void initialization(String driverName) throws IOException {
		setDriver(driverName);
		
	    webDriver = new WebDriverImpl();
	    webDriver.maximize();
	    webDriver.implicitilyWait(Duration.ofSeconds(30));
	    webDriver.pageLoadTimeOut(Duration.ofSeconds(30));
	    
	    prop = new PropertyReader();
	    String sauseDemoSitUrl = prop.getProperty("SIT_URL");
	    webDriver.get(sauseDemoSitUrl);
	}

}

package com.saucedemo.ui.iHelper;

import java.time.Duration;

public interface IWebDriver {
	
	void get(String url);
	
	void minimize();
	
	void maximize();
	
	void fullScreen();
	
	void forward();
	
	void back();
	
	void implicitilyWait(Duration duration);
	
	void pageLoadTimeOut(Duration duration);
	
	String getTitle();
	
	String getCurrentUrl();
	
	void close();
	
	void quit();

}

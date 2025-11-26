package com.saucedemo.ui.utilityLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	private Properties prop;

	public String getProperty(String key) throws IOException {

		String path = System.getProperty("user.dir")
				+ "\\src\\main\\java\\com\\saucedemo\\ui\\configrationLayer\\config.properties";
		FileInputStream fis;
		

		try {
			fis = new FileInputStream(path);
			prop = new Properties();
			prop.load(fis);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		String propertyValue = prop.getProperty(key);

		return propertyValue;

	}

}

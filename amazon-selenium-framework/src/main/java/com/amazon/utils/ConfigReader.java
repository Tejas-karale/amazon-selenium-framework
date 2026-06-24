package com.amazon.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
private Properties prop;

public ConfigReader() {
	prop = new Properties();
	try {
		FileInputStream fis = new FileInputStream("src/test/resources/configurations/config.properties");
		prop.load(fis);
	}catch (IOException io) {
		io.printStackTrace();
		
	}
}

      public String getUrl() {
       return prop.getProperty("URL");
}

	  public String getBrowser() {
		// TODO Auto-generated method stub
		return  prop.getProperty("BROWSER");
	  }

	  public long getGlobalWaitValue() {
		// TODO Auto-generated method stub
		  return  Long.parseLong(prop.getProperty("GLOBALWAIT"));
		
	  }
}
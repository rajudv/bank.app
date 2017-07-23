package com.ai.RiskNet.RT.web.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


import javax.annotation.PostConstruct;

public class RequirmentUtils {
	
	//This file is to read properties file provided with the file name to read
	
	private static InputStream inputStream;
	private static Properties properties;
	
	
	@PostConstruct
	public void intialize(String propertiesFileName) {
		try {
			inputStream = getClass().getResourceAsStream("/"+propertiesFileName);
			properties = new Properties();
			properties.load(inputStream);
		}catch (IOException e){
			// log.error(e.getMessage(), e);
		}
	}
	
	public String getEnvPropertyValue(String propertiesFileName, String propertyName) {
		try {
			inputStream = getClass().getResourceAsStream("/"+propertiesFileName);
			properties = new Properties();
			properties.load(inputStream);
		}catch (IOException e){
			// log.error(e.getMessage(), e);
		}
		return properties.getProperty(propertyName);
	}
}

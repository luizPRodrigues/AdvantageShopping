package com.advantageonlineshopping.advantage_shopping.utils.property;

import java.util.HashMap;
import java.util.Map;

public class DynamicPropertiesManager {

	private static DynamicPropertiesManager instance;
	private Map<String, String> dynamicProperties;

	public DynamicPropertiesManager() {
		dynamicProperties = new HashMap<>();
	}

	public synchronized DynamicPropertiesManager getInstance() {
		if (instance == null) {
			instance = new DynamicPropertiesManager();
		}
		return instance;
	}

	public void addProperty(String key, String value) {
		dynamicProperties.put(key, value);
	}

	public String getProperty(String key) {
		return dynamicProperties.get(key);
	}
}

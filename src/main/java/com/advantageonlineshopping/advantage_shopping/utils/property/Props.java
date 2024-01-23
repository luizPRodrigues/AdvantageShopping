package com.advantageonlineshopping.advantage_shopping.utils.property;

public class Props {
	
	private static final PropertiesManager applicationProperties = new PropertiesManager("./src/test/java/application.properties");
	public static final String URL = applicationProperties.getProps().getProperty("url");
	public static final String USERNAME = applicationProperties.getProps().getProperty("username");
	public static final String PASSWORD = applicationProperties.getProps().getProperty("password");
	public static final String ORDERNUM = applicationProperties.getProps().getProperty("orderNumber");
	public static final String USERDEL = applicationProperties.getProps().getProperty("userToDelete");
	public static final String PWDDEL = applicationProperties.getProps().getProperty("passwordToDelete");

}

package com.advantageonlineshopping.advantage_shopping.utils.property;

public class Props {
	
	private static final PropertiesManager applicationProperties = new PropertiesManager("./src/test/java/application.properties");
	public static final String URL = applicationProperties.getProps().getProperty("url");
	public static final String USERNAME = applicationProperties.getProps().getProperty("username");
	public static final String PASSWORD = applicationProperties.getProps().getProperty("password");
	public static final String URL_DB = applicationProperties.getProps().getProperty("urlDb");
	public static final String USER_DB = applicationProperties.getProps().getProperty("userDb");
	public static final String PASSWORD_DB = applicationProperties.getProps().getProperty("passwordDb");
	public static final String USERCOLUMN = applicationProperties.getProps().getProperty("userColumn");
	public static final String PASSWORDCOLUMN = applicationProperties.getProps().getProperty("passwordColumn");
	public static final String ORDERNUMCOLUMN = applicationProperties.getProps().getProperty("orderNumberColumn");
	public static final String USERTABLE = applicationProperties.getProps().getProperty("tableName");

}

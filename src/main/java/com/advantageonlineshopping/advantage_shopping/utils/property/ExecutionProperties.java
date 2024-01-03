//package com.advantageonlineshopping.advantage_shopping.utils.property;
//
//import java.util.Properties;
//
//
//public class ExecutionProperties {
//	private ExecutionProperties() {
//
//	}
//
//	private static String fileLocation = "./src/test/java/application.properties";
//	private static ExecutionProperties gerenciador;
//	private String executionUrl;
//
//	public static String getFileLocation() {
//		return fileLocation;
//	}
//
//	public static synchronized ExecutionProperties createChrome() {
//		if (gerenciador == null) {
//			try {
//				gerenciador = new ExecutionProperties();
//				Properties properties = new PropertyUtil().loadProperties(getFileLocation());
//				gerenciador.executionUrl = properties.getProperty("execution.url");
//
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		return gerenciador;
//	}
//
//	public String getExecutionUrl() {
//		return executionUrl;
//	}
//
//}
package com.advantageonlineshopping.advantage_shopping.utils.property;

import java.util.Properties;

public class ExecutionProperties {
	private ExecutionProperties() {
	}

	private static String fileLocation = "./src/test/java/application.properties";
	private static ExecutionProperties gerenciador;
	private String executionUrl;
	private String username;
	private String password;

	public static String getFileLocation() {
		return fileLocation;
	}

	public static synchronized ExecutionProperties createChrome() {
		if (gerenciador == null) {
			try {
				gerenciador = new ExecutionProperties();
				Properties properties = new PropertyUtil().loadProperties(getFileLocation());
				gerenciador.executionUrl = properties.getProperty("execution.url");
				gerenciador.username = properties.getProperty("execution.username");
				gerenciador.password = properties.getProperty("execution.password");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return gerenciador;
	}

	public String getExecutionUrl() {
		return executionUrl;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}

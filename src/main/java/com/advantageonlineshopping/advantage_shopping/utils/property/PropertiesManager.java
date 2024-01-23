package com.advantageonlineshopping.advantage_shopping.utils.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {
	private Properties props = new Properties();
	private String filePath;

	public PropertiesManager(String filePath) {
		this.filePath = filePath;
	}

	public Properties getProps() {
		FileInputStream fileInputStream = null;

		try {
			File file = new File(this.filePath);
			fileInputStream = new FileInputStream(file);
			this.props.load(fileInputStream);
			fileInputStream.close();
		} catch (Exception var11) {
			throw new RuntimeException("Error loading properties file", var11);

		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException var10) {
					System.out.println(var10.getMessage());

				}
			}
		}
		return this.props;
	}
}

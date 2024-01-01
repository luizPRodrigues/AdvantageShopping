package com.advantageonlineshopping.advantage_shopping.utils.property;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtil {
	public Properties loadProperties(String filename) throws Exception {
		Properties props = new Properties();
		try {
			FileInputStream file = new FileInputStream(new File(filename));
			props.load(file);
			return props;
		} catch (Exception e) {
			String msg = "Falha ao carregar o arquivo de properties" + filename;
			throw new Exception(msg, e);
		}
	}

}

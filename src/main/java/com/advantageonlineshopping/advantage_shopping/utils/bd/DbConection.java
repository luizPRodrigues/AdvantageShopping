package com.advantageonlineshopping.advantage_shopping.utils.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.advantageonlineshopping.advantage_shopping.utils.property.Props;

public class DbConection {

	public static Connection getConnection() {
		try {
			String url = Props.URL_DB;
			String user = Props.USER_DB;
			String password = Props.PASSWORD_DB;

			Connection connection = DriverManager.getConnection(url, user, password);

			System.out.println("Connection established successfully!");

			return connection;
		} catch (SQLException e) {
			throw new RuntimeException("Error obtaining connection to the database.", e);
		}
	}

}

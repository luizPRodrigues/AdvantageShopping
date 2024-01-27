package com.advantageonlineshopping.advantage_shopping.utils.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class DAO {

	public void createData(String name, String password, String orderNumber) {
		try (Connection connection = DbConection.getConnection()) {
			String sql = "INSERT INTO user (user_name, password, order_number) VALUES (?,?,?)";
			try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
				if (name != null) {
					preparedStatement.setString(1, name);
				} else {
					preparedStatement.setNull(1, Types.VARCHAR);
				}

				if (password != null) {
					preparedStatement.setString(2, password);
				} else {
					preparedStatement.setNull(2, Types.VARCHAR);
				}

				if (orderNumber != null) {
					preparedStatement.setString(3, orderNumber);
				} else {
					preparedStatement.setNull(3, Types.VARCHAR);
				}

				preparedStatement.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public <T> T readData(int userId, String columnName, Class<T> type) {
		try (Connection connection = DbConection.getConnection()) {
			String sql = "SELECT * FROM user WHERE id = ?";
			try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
				preparedStatement.setInt(1, userId);
				try (ResultSet resultSet = preparedStatement.executeQuery()) {
					if (resultSet.next()) {
						T value;
						if (columnName.equalsIgnoreCase("user_name")) {
							value = type.cast(resultSet.getString("user_name"));
						} else if (columnName.equalsIgnoreCase("password")) {
							value = type.cast(resultSet.getString("password"));
						} else if (columnName.equalsIgnoreCase("order_number")) {
							value = type.cast(resultSet.getString("order_number"));
						} else {
							return null;
						}

						System.out.println("Value read from the database: " + value);
						return value;
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void truncateTable(String tableName) {
		try (Connection connection = DbConection.getConnection()) {
			String sql = "TRUNCATE TABLE " + tableName;
			try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
				preparedStatement.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

package application;

import java.sql.*;

public class Database {
	public Connection connection = null;
	public PreparedStatement preStatement = null;
	public ResultSet result = null;
	private final static String CONNECTION_URL = "jdbc:mysql://localhost/SMS";

	public Database() {
		try {

			connection = DriverManager.getConnection(CONNECTION_URL, "root", "");
		} catch (SQLException e) {
			System.out.println("Cannot Connect to the Database:  " + e.getMessage());
		}
	}
}


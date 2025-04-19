package com.app.dbcon;

import java.sql.DriverManager;

/*import java.sql.Connection;
import java.sql.DriverManager;*/

public class DBConnect {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String DbUrl = "jdbc:mysql://localhost:3306/iacsd2025";
			Connection cn = DriverManager.getConnection(DbUrl, "root", "root");
			System.out.println("Connect to iacsd2025");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

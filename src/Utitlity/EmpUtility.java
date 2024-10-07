package Utitlity;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpUtility {

	private static String path = "com.mysql.cj.jdbc.Driver";
	private static Connection con = null;
	private static String url = "jdbc:mysql://localhost:3306/taskocto07";
	private static String user = "root";
	private static String psw = "root";
	private static PreparedStatement st = null;

	private EmpUtility() {
	}

	public static PreparedStatement createConnection(String query) {
		try {
			Class.forName(path);
			con = DriverManager.getConnection(url, user, psw);
			st = con.prepareStatement(query);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return st;
	}

	public static Connection createConnectionToInsert() {
		try {
			Class.forName(path);
			con = DriverManager.getConnection(url, user, psw);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return con;
	}

	public static void closeConnection() {
		try {
			if (st != null && con != null) {
				st.close();
				con.close();
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}

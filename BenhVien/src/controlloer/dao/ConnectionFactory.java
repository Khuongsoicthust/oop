package controlloer.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
	private static ConnectionFactory instance;

	private ConnectionFactory() {

	}

	public static ConnectionFactory getInstance() {
		if (instance == null) {
			instance = new ConnectionFactory();
		}
		return instance;
	}

	private Connection con;
	String hostName="localhost";
	String port="3306";
	String dbName="benhvien";
	String user="root";
	String passwd="phamthuha27042017";
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/BenhVien";
	

	public Connection getConnection() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, passwd);
			

		} catch (ClassNotFoundException ex) {
			Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SQLException ex) {
			Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);

		}
		return con;
	}
	public void getClose() {
		try {
			con.close();
		}catch(SQLException ex) {
			Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}

package dao;
import java.sql.*;

public class DBConn {
	private String url="jdbc:mysql://127.0.0.1:3306/tv_data";
	private String driver ="com.mysql.jdbc.Driver";
	private String user ="root";
	private String pass ="";
	private Connection connection ;
	public DBConn(){
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public Connection getConnect(){
		return connection;
	}
	public static void main(String[] args) {
		new DBConn();
	}

}

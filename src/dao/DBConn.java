package dao;
import java.sql.*;

public class DBConn {
	private String url="jdbc:mysql://172.20.128.155:3306/tv_data?characterEncoding=UTF-8";
	private String driver ="com.mysql.jdbc.Driver";
	private String user ="root";
	private String pass ="123";
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

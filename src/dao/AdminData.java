package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import mode.AdminLogin;

public class AdminData {
	public boolean AdminLogin(AdminLogin admin){
		
		try {
			
			DBConn con=new DBConn();
			Statement statement =con.getConnect().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs =statement.executeQuery("select * from tv_adminLogin where adminName='"+admin.getAdminName()+"'");
			
			
			if(rs.next()){
				String adminPass =rs.getString("adminPass");
				adminPass =adminPass.trim();
				System.out.println("userPas:"+adminPass);
				System.out.println("pass:"+admin.getAdminPass());
				if(admin.getAdminPass().equals(adminPass)){ return true;}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  false;
		}
		return false;
	}
	
	public static void main(String argss[]){
		AdminLogin a=new AdminLogin();
		a.setAdminID(1);
		a.setAdminName("hk");
		a.setAdminPass("123");
		AdminData  aa=new AdminData();
		System.out.println(aa.AdminLogin(a));
	}

}

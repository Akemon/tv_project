package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import mode.AdminLogin;
import mode.User;


public class UserData {
	public boolean userLogin(User user){
		
		
		try {
			
			DBConn con=new DBConn();
			Statement statement =con.getConnect().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs =statement.executeQuery("select * from tv_user where userName='"+user.getUserName()+"'");
			
			
			if(rs.next()){
				String userPass =rs.getString("passWord");
				userPass =userPass.trim();
				System.out.println("userPas:"+userPass);
				System.out.println("pass:"+user.getPassWord());
				if(user.getPassWord().equals(userPass)){ return true;}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  false;
		}
		return false;
	}
	public boolean UserRegister(User user,String repeatPass){
		
try {
			
			DBConn con=new DBConn();
			Statement statement =con.getConnect().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs =statement.executeQuery("select * from tv_user where userName='"+user.getUserName()+"'");
			
			System.out.println(rs.next());
			if(!rs.next()){
				
	            int i = statement.executeUpdate("insert into tv_userLogin (userName,passWord) values('"+user.getUserName()
	        	+"','"+user.getPassWord()+"')");
				
				System.out.println(i);
				if(i==1){ return true;}
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  false;
		}	
             return  false;
	}
	
	public static void main(String argss[]){
		User a=new User();
		a.setUserID(1);
		a.setUserName("��ͯ");
		a.setPassWord("123");
		UserData  aa=new UserData();
		System.out.println(aa.userLogin(a));
		
	}

}

package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




import mode.UserLR;


public class UserLRData {
	public boolean userLogin(UserLR user){
		
		
		try {
			
			DBConn con=new DBConn();
			Statement statement =con.getConnect().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs =statement.executeQuery("select from tv_userLogin where userName='"+user.getUserName()+"'");
	
			
			
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
	public boolean UserRegister(UserLR user,String repeatPass){
		
try {
			
			DBConn con=new DBConn();
			Statement statement =con.getConnect().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs =statement.executeQuery("select from tv_userLogin where userName='"+user.getUserName()+"'");
			
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

}

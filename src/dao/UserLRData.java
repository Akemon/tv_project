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
			ResultSet rs =statement.executeQuery("select * from tv_userLR where userName='"+user.getUserName()+"'");
	
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
			Statement statement2 =con.getConnect().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs =statement.executeQuery("select * from tv_userLR where userName='"+user.getUserName()+"'");
			
			
			System.out.println(rs.next());
			if(!rs.next()){
			
	           statement.executeUpdate("insert into tv_userLR (userName,passWord,phoneStatus,tvStatus) values('"+user.getUserName()
	        	+"','"+user.getPassWord()+"','"+user.getPhoneStatus()+"','"+user.getTvStatus()+"')");
				
				String temp=null;
				ResultSet rs2=statement2.executeQuery("select * from tv_userLR where userName='"+user.getUserName()+"'");
				if(rs2.next()){
				 temp=rs2.getString("userID");}
				
				int j=statement.executeUpdate("insert into tv_userInfo (nickName,sex,age,phone,mail,address,userID) values(null,null,null,null,null,null,"+temp+")");
				
	            if(j==1){ 
	            	
	            	return true;}
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  false;
		}	
     return false;
	}
	
	public static void main(String argss[]){
		UserLR a=new UserLR();
		//a.setUserID(1);
		a.setUserName("abc");
		
		UserLRData  aa=new UserLRData();
		System.out.println(aa.UserRegister(a, "123456"));
		
	}
}

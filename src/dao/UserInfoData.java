package dao;
import mode.*;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class UserInfoData {
	public List<UserInfo> getUserInfoList(){				
try {
			
			DBConn con=new DBConn();
			Statement statement =con.getConnect().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs =statement.executeQuery("select * from tv_userInfo");
			List<UserInfo> userInfos=new ArrayList<UserInfo>();
			 
			
			while(rs.next()){
				 int id=rs.getInt("id");
				 String nickName=rs.getString("nickName");
				 String sex=rs.getString("sex");
				 String age=rs.getString("age");
				 String phone=rs.getString("phone");
				 String mail=rs.getString("mail");
				 String address=rs.getString("address");
				 int userID=rs.getInt("userID");

				
				
				System.out.println("userPas:"+nickName);
				System.out.println("id:"+userID);
				UserInfo userInfo=new UserInfo(id, nickName, sex, age, phone, mail, address, userID);
 			   
				userInfos.add(userInfo);
				
			}
			return userInfos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
			
		}
           
	} 
	
	public boolean modifyUserInfo(UserInfo user){
try {
			
			DBConn con=new DBConn();
			Statement statement =con.getConnect().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			int i =statement.executeUpdate("update  tv_userInfo set nickName='"+user.getNickName()+"',sex='"+user.getSex()+"',age='"+user.getAge()+"',phone='"
			+user.getPhone()+"',mail='"+user.getMail()+"',address='"+user.getAddress()+"' where userID="+user.getUserID());			
			if(i==1){ return true;}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  false;
		}
		return false;
		
	}
	
	
	public boolean deleteUserInfo(int userID){
try {
			
			DBConn con=new DBConn();
			Statement statement =con.getConnect().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			int i =statement.executeUpdate("DELETE  FROM  tv_userInfo  WHERE userID= "+userID);	
			int j =statement.executeUpdate("DELETE  FROM  tv_userLR  WHERE userID= "+userID);	
			
			if(i==j){ return true;}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  false;
		}
		return false;
	}

	
	

	
	public List<UserInfo> getOneUserInfo(String userName){
		
try {
			
			DBConn con=new DBConn();
			Statement statement =con.getConnect().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs =statement.executeQuery("select * from tv_userInfo RIGHT  JOIN tv_userLR on tv_userInfo.userID=tv_userLR.userID where userName='"+userName+"'");
			List<UserInfo> userInfos=new ArrayList<UserInfo>();
			 
			while(rs.next()){

				 int id=rs.getInt("id");
				 String nickName=rs.getString("nickName");
				 String sex=rs.getString("sex");
				 String age=rs.getString("age");
				 String phone=rs.getString("phone");
				 String mail=rs.getString("mail");
				 String address=rs.getString("address");
				 int  userID=rs.getInt("userID");

				
				
				System.out.println("userID:"+userID);
				System.out.println("name:"+userName);
				UserInfo userInfo=new UserInfo(id, nickName, sex, age, phone, mail, address, userID);
 			   
				userInfos.add(userInfo);
			}
				return userInfos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
			
		}
          
		
	}
	public  static void  main(String args[]){
		UserInfoData a=new UserInfoData();
		System.out.println(a.deleteUserInfo(17));
	}
}

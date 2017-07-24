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
			ResultSet rs =statement.executeQuery("select from tv_userInfo");
			List<UserInfo> userInfos=new ArrayList<UserInfo>();
			 
			
			if(rs.next()){
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
				return userInfos;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
			
		}
            return null;
	}   

}

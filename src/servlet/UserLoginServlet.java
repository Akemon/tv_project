package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import mode.UserInfo;
import mode.UserLR;

import dao.StrConvert;
import dao.UserInfoData;
import dao.UserLRData;

public class UserLoginServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UserLoginServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setHeader("Content-Type", "text/html;charset=UTF-8");
		System.out.println("Ω¯»ÎUserLogin");
		String userName =request.getParameter("userName");
		String userPass =request.getParameter("userPass");
		if(userName!=null&&userPass!=null){
			userName =new StrConvert().chStr(userName);
			UserLR user =new UserLR();
			user.setUserName(userName);
			user.setPassWord(userPass);
			boolean  flag =new UserLRData().userLogin(user);
			if(flag){
				List<UserInfo> userInfoList = new UserInfoData().getOneUserInfo(userName);
				JSONArray jsonArray =JSONArray.fromObject(userInfoList);
				JSONObject jsonObject =new JSONObject();
				jsonObject.put("UserInfo", jsonArray);
				out.write(jsonObject.toString());
			}else{
				out.write("failed");
			}
		}
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}

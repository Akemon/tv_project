package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mode.UserInfo;

import dao.StrConvert;
import dao.UserInfoData;

public class ModifyUserInfoServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ModifyUserInfoServlet() {
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
		doPost(request, response);
	
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
		PrintWriter out = response.getWriter();
		response.setHeader("Content-Type", "text/html;charset=UTF-8");
		String nickName =request.getParameter("nickName");
		String sex =request.getParameter("sex");
		String age =request.getParameter("age");
		String phone =request.getParameter("phone");
		String mail =request.getParameter("mail");
		String address =request.getParameter("address");
		String userIDString  =request.getParameter("userID");
		StrConvert convert =new StrConvert();
		int userID  =0;
		if(nickName!=null&&sex!=null&&address!=null&&userIDString!=null){
			nickName =convert.chStr(nickName);
			sex =convert.chStr(sex);
			address =convert.chStr(address);
			userID =Integer.parseInt(userIDString);
		}
		UserInfo user =new UserInfo();
		user.setNickName(nickName);
		user.setAge(age);
		user.setSex(sex);
		user.setAddress(address);
		user.setPhone(phone);
		user.setMail(mail);
		user.setUserID(userID);
		boolean flag = new UserInfoData().modifyUserInfo(user);
		if(flag){
			out.write("success");
		}else{
			out.write("failed");
		}
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

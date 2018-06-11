package com.zt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zt.jdbc.dao.IUserDao;
import com.zt.jdbc.impl.UserDaoImpl;
import com.zt.jdbc.projo.User;
import com.zt.jdbc.util.ServletUtil;


//@WebServlet("*.do")

public class HelloServlet extends HttpServlet {

	
	/**
	 * Constructor of the object.
	 */
	public HelloServlet() {
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
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			IUserDao dao = new UserDaoImpl();
			String uri = request.getRequestURI();
			String goal = uri.substring(uri.lastIndexOf("/"), uri.lastIndexOf(".do"));
			
		
			if ("/user_add".equals(goal) || "/user_login".equals(goal)){
				
			}else{
				
				if (request.getSession().getAttribute("user")==null){
					System.out.println("^^^^^^^^^");
					response.sendRedirect("user_login.jsp");
					return ;
				}
			}
			
		
			if ("/user_show".equals(goal)){
				List<User> users = dao.findAll();
				request.setAttribute("users",users);
			
				request.getRequestDispatcher("user_list.jsp").forward(request, response);
			}else if ("/user_add".equals(goal)){
			
				String userName = request.getParameter("userName");
				String password = request.getParameter("password");
				String phone = request.getParameter("phone");
				String addr = request.getParameter("addr");
				User user = new User(userName, password, phone,addr);
				
				dao.addUser(user);
				
				HttpSession session = request.getSession();
				session.setAttribute("user",user);
				response.sendRedirect("user_show.do");
			}else if("/user_delete".equals(goal)){
				int id = Integer.parseInt(request.getParameter("id"));
				int t = dao.deleteUser(id);
				response.sendRedirect("user_show.do");
			}else if ("/user_edit".equals(goal)){
				int id = Integer.parseInt(request.getParameter("id"));
				User user = dao.findUserById(id);
				request.setAttribute("user", user);
				request.getRequestDispatcher("user_edit.jsp").forward(request, response);
			}else if ("/user_update".equals(goal)){
				int id = Integer.parseInt(request.getParameter("id"));
				User user = dao.findUserById(id);
				String userName = request.getParameter("userName");
				String password = request.getParameter("password");
				String phone = request.getParameter("phone");
				String addr = request.getParameter("addr");
				user.setUserName(userName);
				user.setPassword(password);
				user.setPhone(phone);
				user.setAddr(addr);
			
				dao.updateUser(user);
				response.sendRedirect("user_show.do");
			}else if ("/user_login".equals(goal)){
				String userName = request.getParameter("userName");
				String myCode = request.getParameter("verifyCode");
				
				User user = dao.findUserByUserName(userName);
				
				String code = (String) request.getSession().getAttribute("code");
				System.out.println(myCode.toLowerCase().equals(code.toLowerCase()));
				if (!myCode.toLowerCase().equals(code.toLowerCase())){
					request.setAttribute("code_error", "验证码不正确");
					request.getRequestDispatcher("user_login.jsp").forward(request, response);
				}
				else if (user!=null){
					String password = request.getParameter("password");
					
					if (user.getPassword().equals(ServletUtil.md5Password(password))){
						HttpSession session = request.getSession();
					
						session.setAttribute("user",user);
					
						System.out.println("user"+"*************************");
						request.getRequestDispatcher("user_show.do").forward(request, response);
					
						
					}else{
						request.setAttribute("login_error", "用户名或密码不正确");
						request.getRequestDispatcher("user_login.jsp").forward(request, response);
					}
				}else{
					response.sendRedirect("user_login.jsp");
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

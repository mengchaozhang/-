package com.qf.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qf.service.impl.AdminServiceImpl;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/admin/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private AdminServiceImpl adminServiceImpl = new AdminServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aname = request.getParameter("aname");
		String apassword = request.getParameter("apassword");
		int i = adminServiceImpl.login(aname, apassword);
		if (i == -1) {
			response.sendRedirect("loginfail.html");
		} else {
			System.out.println("登陆成功!");
			HttpSession session = request.getSession();
			session.setAttribute("aname", aname);
			response.sendRedirect("ExaminePageServlet");
		}
		
	}

}

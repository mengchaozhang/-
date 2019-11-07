package com.qf.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qf.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class StudentLoginServlet
 */
@WebServlet("/student/StudentLoginServlet")
public class StudentLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentLoginServlet() {
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
		String sname = request.getParameter("sname");
		String spassword = request.getParameter("spassword");
		int i = studentServiceImpl.login(sname, spassword);
		if (i == -1) {
			response.sendRedirect("loginfail.html");
		} else {
			System.out.println("登陆成功!");
			HttpSession session = request.getSession();
			session.setAttribute("sname", sname);
			request.getRequestDispatcher("MainServlet").forward(request, response);
		}
	}

}

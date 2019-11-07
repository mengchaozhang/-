package com.qf.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.qf.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class StudentRegisterServlet
 */
@WebServlet("/student/StudentRegisterServlet")
public class StudentRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegisterServlet() {
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
		String spassword2 = request.getParameter("spassword2");
		int i = studentServiceImpl.register(sname, spassword, spassword2);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("resp", i);
		response.getWriter().write(jsonObject.toString());
			
	}

}

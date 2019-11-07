package com.qf.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.qf.pojo.Picture;
import com.qf.service.impl.PictureServiceImpl;

/**
 * Servlet implementation class ExaminePageServlet
 */
@WebServlet("/admin/ExaminePageServlet")
public class ExaminePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PictureServiceImpl pictureServiceImpl = new PictureServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExaminePageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Picture> pictureList = pictureServiceImpl.getPictureByState(1);
		request.setAttribute("pictureList", pictureList);
		request.getRequestDispatcher("examinepage.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid = Integer.parseInt(request.getParameter("pid"));
		int state = Integer.parseInt(request.getParameter("state"));
		pictureServiceImpl.updatePictureState(state, pid);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("resp", 1);
		response.getWriter().write(jsonObject.toString());
	}

}

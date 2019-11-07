package com.qf.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qf.pojo.Picture;
import com.qf.service.impl.PictureServiceImpl;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/student/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private PictureServiceImpl pictureServiceImpl = new PictureServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Picture> pictureList = new ArrayList<Picture>();
		String stateString = request.getParameter("state");
		if (stateString == null) {
			pictureList = pictureServiceImpl.getPassPicture();
			request.setAttribute("pictureList", pictureList);
			request.getRequestDispatcher("mainpage.jsp").forward(request, response);
		} else {
			int state = Integer.parseInt(stateString);
			if (state == 2) {
				pictureList = pictureServiceImpl.getPassPicture();
				request.setAttribute("pictureList", pictureList);
				request.getRequestDispatcher("mainpage.jsp").forward(request, response);
			} else {
				if (state == 5) {
					state = 2;
				}
				HttpSession session = request.getSession();
				String sname = (String)session.getAttribute("sname");
				pictureList = pictureServiceImpl.getPictureBySnameAndState(sname, state);
				request.setAttribute("pictureList", pictureList);
				request.getRequestDispatcher("mainpage.jsp").forward(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

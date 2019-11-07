package com.qf.servlet;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.qf.service.impl.PictureServiceImpl;
import com.qf.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/student/UploadServlet")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private PictureServiceImpl pictureServiceImpl = new PictureServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
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
		HttpSession session = request.getSession();
		String sname = (String)session.getAttribute("sname");
		DiskFileItemFactory df = new DiskFileItemFactory();
		ServletFileUpload sf = new ServletFileUpload(df);
		try {
			List<FileItem> itemList = sf.parseRequest(request);
			for (FileItem fileItem : itemList) {
				if (fileItem.isFormField()) {
				} else {
					String path = getServletContext().getRealPath("/img");
					File f = new File(path);
					if(!f.exists()){
						f.mkdir();
					}
					File file = new File(path+"/"+fileItem.getName());
					fileItem.write(file);
					
					String purl = fileItem.getName();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
					String uploadtime = sdf.format(new Date());
					pictureServiceImpl.insertPicture(purl, sname, uploadtime);
				}
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("upload.jsp");
	}

}

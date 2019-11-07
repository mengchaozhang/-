package com.qf.dao;

import com.qf.pojo.Student;

public interface StudentDao {

	public Student queryStudentBySnameAndSpassword(String sname, String spassword);
	
	public Student queryStudentBySname(String sname);
	
	public Student queryStudentBySid(int sid);
	
	public int insertStudent(String sname, String spassword);
}

package com.qf.service.impl;

import com.qf.dao.impl.StudentDaoImpl;
import com.qf.pojo.Student;
import com.qf.service.StudentService;

public class StudentServiceImpl implements StudentService {

	private StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
	
	/**
	 * 学生登陆,返回1登陆成功，返回-1登陆失败
	 */
	@Override
	public int login(String sname, String spassword) {
		Student student = studentDaoImpl.queryStudentBySnameAndSpassword(sname, spassword);
		if (student == null) {
			return -1;
		}
		return 1;
	}

	/**
	 * 学生注册,返回1注册成功，返回-1用户名已存在，返回-2密码不一致。
	 */
	@Override
	public int register(String sname, String spassword, String spassword2) {
		Student student = studentDaoImpl.queryStudentBySname(sname);
		if (student != null) {
			return -1;
		}
		if (!spassword.equals(spassword2)) {
			return -2;
		}
		studentDaoImpl.insertStudent(sname, spassword);
		return 1;
	}

	@Override
	public int querySidBySname(String sname) {
		Student student = studentDaoImpl.queryStudentBySname(sname);
		return student.getSid();
	}

}

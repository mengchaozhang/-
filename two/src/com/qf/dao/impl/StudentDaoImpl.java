package com.qf.dao.impl;

import com.qf.dao.StudentDao;
import com.qf.pojo.Student;
import com.qf.util.DbUtil;

public class StudentDaoImpl implements StudentDao {

	private DbUtil<Student> dbutil = new DbUtil<Student>();
	
	/**
	 * 根据学生的姓名和密码查询学生信息
	 */
	@Override
	public Student queryStudentBySnameAndSpassword(String sname, String spassword) {
		String sql = "select * from student where sname=? and spassword=?";
		return dbutil.querySingle(sql, Student.class, sname, spassword);
	}

	/**
	 * 根据学生的姓名查询学生信息
	 */
	@Override
	public Student queryStudentBySname(String sname) {
		String sql = "select * from student where sname=?";
		return dbutil.querySingle(sql, Student.class, sname);
	}

	/**
	 * 根据学生的sid查询学生信息
	 */
	@Override
	public Student queryStudentBySid(int sid) {
		String sql = "select * from student where sid=?";
		return dbutil.querySingle(sql, Student.class, sid);
	}

	/**
	 * 插入学生信息
	 */
	@Override
	public int insertStudent(String sname, String spassword) {
		String sql = "insert into student(sname, spassword) values(?,?)";
		return dbutil.updateData(sql, sname, spassword);
	}

}

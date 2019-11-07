package com.qf.dao.impl;

import com.qf.dao.AdminDao;
import com.qf.pojo.Admin;
import com.qf.util.DbUtil;

public class AdminDaoImpl implements AdminDao {

	private DbUtil<Admin> dbUtil = new DbUtil<Admin>();
	
	/**
	 * 根据管理员姓名和密码查询管理员
	 */
	@Override
	public Admin queryAdmin(String aname, String apassword) {
		String sql = "select * from admin where aname=? and apassword=?";
		return dbUtil.querySingle(sql, Admin.class, aname, apassword);
	}

}

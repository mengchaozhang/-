package com.qf.service.impl;

import com.qf.dao.impl.AdminDaoImpl;
import com.qf.pojo.Admin;
import com.qf.service.AdminService;

public class AdminServiceImpl implements AdminService {

	private AdminDaoImpl adminDaoImpl = new AdminDaoImpl();
	
	/**
	 * 管理员登陆，返回1登陆成功，返回-1登陆失败
	 */
	@Override
	public int login(String aname, String apassword) {
		Admin admin = adminDaoImpl.queryAdmin(aname, apassword);
		if (admin == null) {
			return -1;
		}
		return 1;
	}

}

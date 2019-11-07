package com.qf.dao;

import com.qf.pojo.Admin;

public interface AdminDao {

	public Admin queryAdmin(String aname, String apassword);
	
}

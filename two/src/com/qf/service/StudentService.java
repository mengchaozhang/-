package com.qf.service;

public interface StudentService {

	public int login(String sname, String spassword);
	
	public int register(String sname, String spassword, String spassword2);
	
	public int querySidBySname(String sname);
	
}

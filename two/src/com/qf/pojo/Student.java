package com.qf.pojo;

public class Student {

	private int sid;
	private String sname;
	private String spassword;
	/**
	 * @return the sid
	 */
	public int getSid() {
		return sid;
	}
	/**
	 * @param sid the sid to set
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}
	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @return the spassword
	 */
	public String getSpassword() {
		return spassword;
	}
	/**
	 * @param spassword the spassword to set
	 */
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
	/**
	 * @param sid
	 * @param sname
	 * @param spassword
	 */
	public Student(int sid, String sname, String spassword) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.spassword = spassword;
	}
	/**
	 * 
	 */
	public Student() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", spassword=" + spassword + "]";
	}
	
	
}

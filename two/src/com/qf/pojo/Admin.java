package com.qf.pojo;

public class Admin {

	private int aid;
	private String aname;
	private String apassword;
	/**
	 * @return the aid
	 */
	public int getAid() {
		return aid;
	}
	/**
	 * @param aid the aid to set
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}
	/**
	 * @return the aname
	 */
	public String getAname() {
		return aname;
	}
	/**
	 * @param aname the aname to set
	 */
	public void setAname(String aname) {
		this.aname = aname;
	}
	/**
	 * @return the apassword
	 */
	public String getApassword() {
		return apassword;
	}
	/**
	 * @param apassword the apassword to set
	 */
	public void setApassword(String apassword) {
		this.apassword = apassword;
	}
	/**
	 * @param aid
	 * @param aname
	 * @param apassword
	 */
	public Admin(int aid, String aname, String apassword) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.apassword = apassword;
	}
	/**
	 * 
	 */
	public Admin() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", aname=" + aname + ", apassword=" + apassword + "]";
	}
	
	
}

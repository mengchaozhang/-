package com.qf.pojo;

public class Picture {

	private int pid;
	private String purl;
	private String sname;
	private String uploadTime;
	private int state;
	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}
	/**
	 * @return the purl
	 */
	public String getPurl() {
		return purl;
	}
	/**
	 * @param purl the purl to set
	 */
	public void setPurl(String purl) {
		this.purl = purl;
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
	 * @return the uploadTime
	 */
	public String getUploadTime() {
		return uploadTime;
	}
	/**
	 * @param uploadTime the uploadTime to set
	 */
	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}
	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}
	/**
	 * @param pid
	 * @param purl
	 * @param sname
	 * @param uploadTime
	 * @param state
	 */
	public Picture(int pid, String purl, String sname, String uploadTime, int state) {
		super();
		this.pid = pid;
		this.purl = purl;
		this.sname = sname;
		this.uploadTime = uploadTime;
		this.state = state;
	}
	/**
	 * 
	 */
	public Picture() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Picture [pid=" + pid + ", purl=" + purl + ", sname=" + sname + ", uploadTime=" + uploadTime + ", state="
				+ state + "]";
	}
	
	
}

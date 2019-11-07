package com.qf.dao.impl;

import java.util.List;

import com.qf.dao.PictureDao;
import com.qf.pojo.Picture;
import com.qf.util.DbUtil;

public class PictureDaoImpl implements PictureDao {

	private DbUtil<Picture> dbUtil = new DbUtil<Picture>();
	
	/**
	 * 查询所有照片
	 */
	@Override
	public List<Picture> queryPassPicture() {
		String sql = "select pid,purl,sname,uploadtime,state from picture inner join student on sid=uploadsid and state=2";
		return dbUtil.queryList(sql, Picture.class);
	}

	/**
	 * 根据照片状态查询照片
	 */
	@Override
	public List<Picture> queryPictureByState(int state) {
		String sql = "select pid,purl,sname,uploadtime,state from picture inner join student on sid=uploadsid and state=?";
		return dbUtil.queryList(sql, Picture.class, state);
	}

	/**
	 * 根据上传者查询照片
	 */
	@Override
	public List<Picture> queryPictureBySid(int sid) {
		String sql = "select pid,purl,sname,uploadtime,state from picture inner join student on sid=uploadsid and sid=?";
		return dbUtil.queryList(sql, Picture.class, sid);
	}

	/**
	 * 插入新照片
	 */
	@Override
	public int insertPicture(String purl, int uploadsid, String uploadtime) {
		String sql = "insert into picture(purl,uploadsid,uploadtime) values(?,?,?)";
		return dbUtil.updateData(sql, purl, uploadsid, uploadtime);
	}

	/**
	 * 根据上传者和照片状态查询照片列表
	 */
	@Override
	public List<Picture> queryPictureBySnameAndState(String sname, int state) {
		String sql = "select pid,purl,sname,uploadtime,state from picture inner join student on sid=uploadsid and sname=? and state=?";
		return dbUtil.queryList(sql, Picture.class, sname, state);
	}

	@Override
	public int updatePictureState(int state, int pid) {
		String sql = "update picture set state=? where pid=?";
		return dbUtil.updateData(sql, state, pid);
	}

	
}

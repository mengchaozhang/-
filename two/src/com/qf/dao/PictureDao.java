package com.qf.dao;

import java.util.List;

import com.qf.pojo.Picture;

public interface PictureDao {

	public List<Picture> queryPassPicture();
	
	public List<Picture> queryPictureByState(int state);
	
	public List<Picture> queryPictureBySid(int sid);
	
	public int insertPicture(String purl, int uploadsid, String uploadtime);
	
	public List<Picture> queryPictureBySnameAndState(String sname, int state);
	
	public int updatePictureState(int state, int pid);
}

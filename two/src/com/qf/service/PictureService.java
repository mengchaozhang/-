package com.qf.service;

import java.util.List;

import com.qf.pojo.Picture;

public interface PictureService {

	public List<Picture> getPictureByState(int state);
	
	public List<Picture> getPictureBySnameAndState(String sname, int state);
	
	public List<Picture> getPassPicture();
	
	public int insertPicture(String purl, String sname, String uploadtime);
	
	public int updatePictureState(int state, int pid);
}

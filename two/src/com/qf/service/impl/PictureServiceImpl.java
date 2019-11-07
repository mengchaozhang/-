package com.qf.service.impl;

import java.util.List;

import com.qf.dao.impl.PictureDaoImpl;
import com.qf.pojo.Picture;
import com.qf.service.PictureService;

public class PictureServiceImpl implements PictureService {

	PictureDaoImpl pictureDaoImpl = new PictureDaoImpl();
	StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
	
	@Override
	public List<Picture> getPictureByState(int state) {
		return pictureDaoImpl.queryPictureByState(state);
	}

	@Override
	public List<Picture> getPictureBySnameAndState(String sname, int state) {
		return pictureDaoImpl.queryPictureBySnameAndState(sname, state);
	}

	@Override
	public List<Picture> getPassPicture() {
		return pictureDaoImpl.queryPassPicture();
	}

	@Override
	public int insertPicture(String purl, String sname, String uploadtime) {
		int uploadsid = studentServiceImpl.querySidBySname(sname);
		return pictureDaoImpl.insertPicture(purl, uploadsid, uploadtime);
	}

	@Override
	public int updatePictureState(int state, int pid) {
		return pictureDaoImpl.updatePictureState(state, pid);
	}

}

package org.he.graduationdesignmanagement.service.Impl;

import java.util.List;

import org.he.graduationdesignmanagement.dao.StudentDao;
import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Selecttitle;
import org.he.graduationdesignmanagement.model.SelecttitleId;
import org.he.graduationdesignmanagement.model.Student;
import org.he.graduationdesignmanagement.model.Title;
import org.he.graduationdesignmanagement.service.StudentService;

public class StudentServiceImpl implements StudentService {
	private StudentDao studetDao;

	public StudentDao getStudetDao() {
		return studetDao;
	}


	public void setStudetDao(StudentDao studetDao) {
		this.studetDao = studetDao;
	}


	public Student scanStudentMess(Integer lid) {
		
		return studetDao.findStudentByLid(lid);
	}


	public void modifyPass(Login login) {
		System.out.println("Service--Login-->"+login.getPassword());
		studetDao.saveOrUpdate(login);
		
	}


	public List<Title> canSelectTitleList() {
		
		return studetDao.findTitleByReviewState();
	}


	public void selectTitle(Login login,Integer tmId) {
		int sid=studetDao.findStudentByLid(login.getLid()).getSid();
		SelecttitleId selecttitleid=new SelecttitleId(sid, tmId);
		Selecttitle selecttitle=new Selecttitle(selecttitleid);
		studetDao.saveSelecttitle(selecttitle);
		
	}


	@Override
	public 	Title scanStudentTitle(Integer Lid) {
		// TODO Auto-generated method stub
		
		return studetDao.findTitleBytmid(Lid);
	}


	@Override
	public List<Title> getTitleByid(int sid) {
		
		return studetDao.getTitleBuId(sid);
	}



}

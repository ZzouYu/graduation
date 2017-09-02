package org.he.graduationdesignmanagement.service.Impl;

import java.util.List;

import org.he.graduationdesignmanagement.dao.ManageDao;
import org.he.graduationdesignmanagement.model.Teacher;
import org.he.graduationdesignmanagement.model.Title;
import org.he.graduationdesignmanagement.service.ManageTitleService;

public class ManageTitleServiceImpl implements ManageTitleService {
	private ManageDao manageDao;

	public ManageDao getManageDao() {
		return manageDao;
	}

	public void setManageDao(ManageDao manageDao) {
		this.manageDao = manageDao;
	}

	public List<Title> findAllTitle() {

		return manageDao.findAllTitle();
	}

	public void addReviewer(Teacher teacher,Title title) {
		System.out.println(" 老师的ID----------->" + teacher.getTid());
		System.out.println(" 题目的ID----------->" + title.getTmId());
		Title t=manageDao.findTitleBytid(title.getTmId());
		System.out.println("Service---------->"+t.getTitle());
		t.setReviewPeople(teacher.getTid());
		manageDao.addReviewer(t);
		
	}

}

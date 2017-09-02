package org.he.graduationdesignmanagement.service.Impl;

import org.he.graduationdesignmanagement.dao.TeacherDao;
import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Teacher;
import org.he.graduationdesignmanagement.model.Title;
import org.he.graduationdesignmanagement.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {
	private TeacherDao teacherDao;

	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	public void addTitle(Title title) {
		title.setReviewStatus(0);
		title.setReviewSuggestion(0);
		teacherDao.saveTitle(title);
	}

	public void modifypass(Login login) {
		teacherDao.saveOrUpadate(login);
		
	}

	public Teacher scanMessage(Integer lid) {
		
		return teacherDao.findTeacherByLid(lid);
	}

}

package org.he.graduationdesignmanagement.service.Impl;

import java.util.List;

import org.he.graduationdesignmanagement.dao.ReviewerDao;
import org.he.graduationdesignmanagement.dao.UserDao;
import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Teacher;
import org.he.graduationdesignmanagement.model.Title;
import org.he.graduationdesignmanagement.service.ReviewerService;

public class ReviewerServiceImpl implements ReviewerService {
	private ReviewerDao reviewerDao;
	private UserDao userDao;
	

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public ReviewerDao getReviewerDao() {
		return reviewerDao;
	}

	public void setReviewerDao(ReviewerDao reviewerDao) {
		this.reviewerDao = reviewerDao;
	}

	public Teacher findByLid(Integer lid) {
		System.out.println("ReviewerDaoService--------->"+lid);
		return reviewerDao.findReviewerByLid(lid);
	}

	public void updateModifyPass(Integer lid,String pass) {
		Login login=reviewerDao.findLoginByLid(lid);
		login.setModifyPass(pass);
		reviewerDao.update(login);
		
	}

	public List<Title> findTitleByLid(Integer lid) {
		
		return reviewerDao.findTiltleByLid(lid);
	}

	public void updateReviewByTmid(Integer tmid,Integer reviewSuggestion) {
		Title title=reviewerDao.findTitleByTmid(tmid);
		System.out.println(title.getTitle());
		title.setReviewStatus(1);
		System.out.println("Service--Title---->"+title.getReviewSuggestion());
		title.setReviewSuggestion(reviewSuggestion);
		reviewerDao.updateTitleReviewByTmid(title);
		
	}

	
}

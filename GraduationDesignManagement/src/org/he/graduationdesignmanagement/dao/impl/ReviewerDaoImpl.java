package org.he.graduationdesignmanagement.dao.impl;

import java.util.List;

import org.he.graduationdesignmanagement.dao.ReviewerDao;
import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Teacher;
import org.he.graduationdesignmanagement.model.Title;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class ReviewerDaoImpl extends HibernateDaoSupport implements ReviewerDao {

	public Teacher findReviewerByLid(Integer lid) {
		List<Teacher> list=getHibernateTemplate().find("from Teacher where lid=?",lid);
		return list.get(0);
	}

	public void update(Login login) {
		getHibernateTemplate().update(login);
		
	}

	public Login findLoginByLid(Integer lid) {
		List<Login> list=getHibernateTemplate().find("from Login where lid=?",lid);
		return list.get(0);
	}

	public List<Title> findTiltleByLid(Integer reviewPeople) {
	
		return getHibernateTemplate().find("from Title where reviewStatus=0 and reviewPeople=?",reviewPeople);
	}

	public void updateTitleReviewByTmid(Title title) {
		System.out.println("daoImpl--------->"+title.getTitle());
		getHibernateTemplate().saveOrUpdate(title);
		
	}

	public Title findTitleByTmid(Integer tmid) {
		List<Title> list=getHibernateTemplate().find("from Title where tmId=?",tmid);
		return list.get(0);
	}

}

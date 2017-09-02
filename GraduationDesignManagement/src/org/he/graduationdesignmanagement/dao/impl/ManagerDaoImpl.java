package org.he.graduationdesignmanagement.dao.impl;

import java.util.List;

import org.he.graduationdesignmanagement.dao.ManageDao;
import org.he.graduationdesignmanagement.model.Title;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ManagerDaoImpl extends HibernateDaoSupport implements ManageDao{

	public List<Title> findAllTitle() {
		
		return getHibernateTemplate().find("from Title where reviewStatus=0");
	}

	public void addReviewer(Title title) {
		getHibernateTemplate().saveOrUpdate(title);
		
	}

	public Title findTitleBytid(Integer tmid) {
		List<Title> titles=getHibernateTemplate().find("from Title where tmId=?",tmid);
		System.out.println("DaoImple----------->"+titles.get(0).getTitle());
		return titles.get(0);
	}


}

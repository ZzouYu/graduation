package org.he.graduationdesignmanagement.dao.impl;

import java.util.List;

import org.he.graduationdesignmanagement.dao.TeacherDao;
import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Teacher;
import org.he.graduationdesignmanagement.model.Title;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class TeacherDaoImpl extends HibernateDaoSupport implements TeacherDao {

	public void saveTitle(Title title) {
		getHibernateTemplate().save(title);
		
	}

	public void saveOrUpadate(Login login) {
		getHibernateTemplate().saveOrUpdate(login);
		
	}

	public Login findLoginByLid(Integer lid) {
		List<Login> list=getHibernateTemplate().find("from Login where lid=?",lid);
		return list.get(0);
	}

	public Teacher findTeacherByLid(Integer lid) {
		List<Teacher> list=getHibernateTemplate().find("from Teacher where lid=?",lid);
		return list.get(0);
	}

}

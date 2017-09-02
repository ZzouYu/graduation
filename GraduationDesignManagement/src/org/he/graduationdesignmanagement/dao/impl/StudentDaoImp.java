package org.he.graduationdesignmanagement.dao.impl;

import java.util.List;

import org.he.graduationdesignmanagement.dao.StudentDao;
import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Selecttitle;
import org.he.graduationdesignmanagement.model.Student;
import org.he.graduationdesignmanagement.model.Title;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class StudentDaoImp extends HibernateDaoSupport implements StudentDao {

	public Student findStudentByLid(Integer lid) {
		List<Student> list=getHibernateTemplate().find("from Student where lid=?",lid);
		return list.get(0);
	}

	public void saveOrUpdate(Login login) {
		System.out.println("DAO--Login-->"+login.getPassword());
		getHibernateTemplate().saveOrUpdate(login);
		
	}

	public List<Title> findTitleByReviewState() {
		
		return getHibernateTemplate().find("from Title where reviewStatus=0 and reviewSuggestion=0");
	}

	public void saveSelecttitle(Selecttitle selecttitle) {
		getHibernateTemplate().save(selecttitle);
		
	}

	
	
	@Override
	public Title findTitleBytmid(Integer lid) {
		List<Title> list= getHibernateTemplate().find("from Student s,  Selecttitle st where s.sId=st.sId ");
		return list.get(0);
	}

	@Override
	public List<Title> getTitleBuId(int sid) {
		List<Title> tList = null;
		List<Selecttitle> sList=getHibernateTemplate().find("from Selecttitle where sid=?",sid);
		 for(int i = 0;i < sList.size(); i ++){
			 
			 Title  title =(Title) getHibernateTemplate().find("from Title where lid=?",sList.get(i).getId());
			 tList.add(title);
	        }
		return tList;
	}

	
}

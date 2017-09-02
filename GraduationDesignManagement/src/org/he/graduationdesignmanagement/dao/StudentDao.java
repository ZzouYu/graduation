package org.he.graduationdesignmanagement.dao;

import java.util.List;

import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Selecttitle;
import org.he.graduationdesignmanagement.model.Student;
import org.he.graduationdesignmanagement.model.Title;

public interface StudentDao {
	public Student findStudentByLid(Integer lid);
   
	public Title findTitleBytmid(Integer Lid);
	public void saveOrUpdate(Login login);

	public List<Title> findTitleByReviewState();
	public void saveSelecttitle(Selecttitle selectTitle);

	public List<Title> getTitleBuId(int sid);

	
}

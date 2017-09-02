package org.he.graduationdesignmanagement.dao;

import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Teacher;
import org.he.graduationdesignmanagement.model.Title;

public interface TeacherDao {
	public void saveTitle(Title title);
	public void saveOrUpadate(Login login);
	public Login findLoginByLid(Integer lid);
	public Teacher findTeacherByLid(Integer lid);
}

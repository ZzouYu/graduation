package org.he.graduationdesignmanagement.service;

import java.util.List;

import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Selecttitle;
import org.he.graduationdesignmanagement.model.Student;
import org.he.graduationdesignmanagement.model.Title;

public interface StudentService {
	public Student scanStudentMess(Integer lid);

	public void modifyPass(Login login);

	public List<Title> canSelectTitleList();
	public void selectTitle(Login login,Integer tmId);

	public Title scanStudentTitle(Integer Lid);

	public List<Title> getTitleByid(int sid);


	
}

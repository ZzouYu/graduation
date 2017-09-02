package org.he.graduationdesignmanagement.service;

import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Teacher;
import org.he.graduationdesignmanagement.model.Title;

public interface TeacherService {
	public void addTitle(Title title);

	public void modifypass(Login login);

	public Teacher scanMessage(Integer lid);

}

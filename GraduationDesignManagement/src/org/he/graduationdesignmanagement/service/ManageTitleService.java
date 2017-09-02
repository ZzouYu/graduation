package org.he.graduationdesignmanagement.service;

import java.util.List;

import org.he.graduationdesignmanagement.model.Teacher;
import org.he.graduationdesignmanagement.model.Title;

public interface ManageTitleService {
	public List<Title> findAllTitle();
	public void addReviewer(Teacher teacher,Title title);
}

package org.he.graduationdesignmanagement.dao;

import java.util.List;

import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Teacher;
import org.he.graduationdesignmanagement.model.Title;

public interface ReviewerDao {
	public Teacher findReviewerByLid(Integer lid);

	public void update(Login login);

	public Login findLoginByLid(Integer lid);

	public List<Title> findTiltleByLid(Integer reviewPeople);

	public void updateTitleReviewByTmid(Title title);
	public Title findTitleByTmid(Integer tmid);

}

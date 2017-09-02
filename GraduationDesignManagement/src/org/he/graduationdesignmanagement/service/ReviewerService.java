package org.he.graduationdesignmanagement.service;

import java.util.List;

import org.he.graduationdesignmanagement.model.Teacher;
import org.he.graduationdesignmanagement.model.Title;

public interface ReviewerService {
	public Teacher findByLid(Integer lid);

	public void updateModifyPass(Integer lid, String pass);

	public List<Title> findTitleByLid(Integer lid);

	public void updateReviewByTmid(Integer tmid,Integer reviewSuggestion);
}

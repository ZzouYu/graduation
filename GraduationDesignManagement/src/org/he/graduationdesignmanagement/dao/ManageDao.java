package org.he.graduationdesignmanagement.dao;

import java.util.List;

import org.he.graduationdesignmanagement.model.Title;

public interface ManageDao {
	public List<Title> findAllTitle();
	public void addReviewer(Title title);
	public Title findTitleBytid(Integer tmid);
}

package org.he.graduationdesignmanagement.dao;

import org.he.graduationdesignmanagement.model.Tfile;

public interface TfileDao {
   public Tfile findByFildId(String fileId);
}

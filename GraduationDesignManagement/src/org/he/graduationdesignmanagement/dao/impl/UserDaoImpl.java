package org.he.graduationdesignmanagement.dao.impl;

import java.util.List;

import org.he.graduationdesignmanagement.dao.UserDao;
import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Student;
import org.he.graduationdesignmanagement.model.Teacher;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public Login findByNameAndPass(String name, String password) {
		String[] str = { name, password };
		List<Login> list = getHibernateTemplate().find(
				"from Login where account=? and password=?", str);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;

	}

	public List<Teacher> findAllTeacher() {

		return (List<Teacher>) getHibernateTemplate().find("from Teacher");
	}

	public List<Student> findAllStudent() {

		return (List<Student>) getHibernateTemplate().find("from Student");
	}

	public void addStudent(Student student) {
		getHibernateTemplate().save(student);

	}

	public void addTeacher(Teacher teacher) {
		getHibernateTemplate().save(teacher);

	}

	public void save(Login login) {
		getHibernateTemplate().save(login);

	}

	public void deleteLogin(Login login) {
		getHibernateTemplate().delete(login);

	}

	public void deleteTeacher(Teacher teacher) {
		getHibernateTemplate().delete(teacher);

	}

	public void deleteStudent(Student student) {
		getHibernateTemplate().delete(student);

	}

	public void updateLoginPassword(Login login) {
		login.setPassword(login.getModifyPass());
		getHibernateTemplate().update(login);

	}

	public Login findById(int lid) {
		List<Login> list = getHibernateTemplate().find(
				"from Login where lid=?", lid);
		return list.get(0);
	}

	public List<Teacher> findReviewer() {
		return (List<Teacher>) getHibernateTemplate().find(
				"from Teacher where reviewer=1");

	}

	public List<Teacher> findOtherTeacher() {

		return (List<Teacher>) getHibernateTemplate().find(
				"from Teacher where reviewer=0");
	}

	public List<Login> findPassword() {

		return getHibernateTemplate().find(
				"from Login where password!=modifyPass");
	}

	public List<Teacher> findAllTeacherbyld(int lid) {

		return getHibernateTemplate().find("from Teacher where lid=?", lid);
	}

	public List<Student> findAllStudentbyld(int lid) {
		return getHibernateTemplate().find("from Student where lid=?", lid);
	}

	public Teacher findTeacherByLid(Integer lid) {
		List<Teacher> list = getHibernateTemplate().find(
				"from Teacher where lid=?", lid);
		return list.get(0);
	}

}

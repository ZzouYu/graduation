package org.he.graduationdesignmanagement.service.Impl;

import java.util.List;

import org.he.graduationdesignmanagement.dao.UserDao;
import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Student;
import org.he.graduationdesignmanagement.model.Teacher;
import org.he.graduationdesignmanagement.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public Login login(String name, String password) {
		return userDao.findByNameAndPass(name, password);
	}

	public List<Teacher> findAllTeacher() {
		return userDao.findAllTeacher();
	}

	public List<Student> findAllStudent() {

		return userDao.findAllStudent();
	}

	public void addStudent(Student student) {
		Login login = new Login(student.getStudentNo(), "123456", "1234", 3);
		userDao.save(login);
		int lid = userDao.findByNameAndPass(student.getStudentNo(), "123456")
				.getLid();
		student.setLid(lid);
		userDao.addStudent(student);

	}

	public void addTeacher(Teacher teacher) {
		
		Login login = new Login(teacher.getTeacheNo(), "123456", "1234", 2);
		userDao.save(login);
		int lid = userDao.findByNameAndPass(teacher.getTeacheNo(), "123456")
				.getLid();
		teacher.setLid(lid);
		userDao.addTeacher(teacher);

	}

	public void deleteStudent(Student student) {
		Login login=new Login(student.getLid());
		System.out.println(student.getLid());
		userDao.deleteLogin(login);
		userDao.deleteStudent(student);
		
	}

	public void deleteTeacher(Teacher teacher) {
		Login login=new Login(teacher.getLid());
		System.out.println(teacher.getLid());
		userDao.deleteLogin(login);
		userDao.deleteTeacher(teacher);
		
	}

	public void updateStudent(Student student) {
		int lid=student.getLid();
		System.out.println(lid);
		Login login=userDao.findById(lid);
		System.out.println(login.getAccount());
		userDao.updateLoginPassword(login);
		
	}

	public void updateTeacher(Teacher teacher) {
		int lid=teacher.getLid();
		System.out.println(lid);
		Login login=userDao.findById(lid);
		System.out.println(login.getAccount());
		userDao.updateLoginPassword(login);
		
	}

	public List<Teacher> findReviewer() {
		
		return userDao.findReviewer();
	}

	public List<Teacher> findOtherTeacher() {
		
		return userDao.findOtherTeacher();
	}

	public List<Login> findPassword() {
		
		return userDao.findPassword();
	}

	public void updatePassword(Login user) {
		Login login=userDao.findById(user.getLid());
		userDao.updateLoginPassword(login);
		
	}

	public Teacher findTeacherByLid(Integer lid) {
		
		return userDao.findTeacherByLid(lid);
	}





}

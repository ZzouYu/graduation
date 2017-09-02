package org.he.graduationdesignmanagement.dao;

import java.util.List;

import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Student;
import org.he.graduationdesignmanagement.model.Teacher;

public interface UserDao {
	public Login findByNameAndPass(String name, String password);

	public Login findById(int lid);

	public void save(Login login);

	public void deleteLogin(Login login);

	public List<Teacher> findReviewer();

	public List<Teacher> findOtherTeacher();

	public List<Teacher> findAllTeacher();

	public List<Student> findAllStudent();

	public List<Teacher> findAllTeacherbyld(int lid);

	public List<Student> findAllStudentbyld(int lid);

	public void addStudent(Student student);

	public void addTeacher(Teacher teacher);

	public void deleteTeacher(Teacher teacher);

	public void deleteStudent(Student student);

	public void updateLoginPassword(Login login);

	public List<Login> findPassword();
	public Teacher findTeacherByLid(Integer lid);

}

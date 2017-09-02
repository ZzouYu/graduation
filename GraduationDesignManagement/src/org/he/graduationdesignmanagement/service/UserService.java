package org.he.graduationdesignmanagement.service;

import java.util.List;

import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Student;
import org.he.graduationdesignmanagement.model.Teacher;

public interface UserService {
	public Login login(String name, String password);

	public List<Teacher> findAllTeacher();

	public List<Teacher> findReviewer();

	public List<Teacher> findOtherTeacher();

	public List<Student> findAllStudent();

	public void addStudent(Student student);

	public void addTeacher(Teacher teacher);

	public void deleteStudent(Student student);

	public void deleteTeacher(Teacher teacher);

	public void updateStudent(Student student);

	public void updateTeacher(Teacher teacher);

	public void updatePassword(Login user);

	public List<Login> findPassword();

	public Teacher findTeacherByLid(Integer lid);

}

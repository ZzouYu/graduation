package org.he.graduationdesignmanagement.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Student;
import org.he.graduationdesignmanagement.service.StudentService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class StudentScanMessage implements Action {
	private StudentService studentService;
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public String execute() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		HttpSession session = request.getSession();
		Login login = (Login) session.getAttribute("login");
		setStudent(studentService.scanStudentMess(login.getLid()));
		return SUCCESS;
	}

}

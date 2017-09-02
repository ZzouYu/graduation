package org.he.graduationdesignmanagement.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.service.StudentService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class StudentModifyPass implements Action {
	private StudentService studentService;
	private Login student;

	public Login getStudent() {
		return student;
	}

	public void setStudent(Login student) {
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
		if (student.getPassword() == null || student.getPassword().equals("")
				|| student.getModifyPass() == null
				|| student.getModifyPass().equals("")
				|| (!student.getPassword().equals(student.getModifyPass()))) {
			return INPUT;
		}
		login.setModifyPass(student.getModifyPass());
		System.out.println("Action---pass-->"+student.getPassword());
		studentService.modifyPass(login);
		return SUCCESS;
	}

}

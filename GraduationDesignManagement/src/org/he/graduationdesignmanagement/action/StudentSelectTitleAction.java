package org.he.graduationdesignmanagement.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Title;
import org.he.graduationdesignmanagement.service.StudentService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class StudentSelectTitleAction implements Action {
	private StudentService studentService;
	private List<Title> titles;
	private Title title;
	

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public List<Title> getTitles() {
		return titles;
	}

	public void setTitles(List<Title> titles) {
		this.titles = titles;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public String execute() throws Exception {
		setTitles(studentService.canSelectTitleList());
		return SUCCESS;
	}

	public String selectTitle() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		HttpSession session = request.getSession();
		Login login = (Login) session.getAttribute("login");
		studentService.selectTitle(login,title.getTmId());
		return SUCCESS;
	}

}

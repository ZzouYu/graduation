package org.he.graduationdesignmanagement.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Selecttitle;
import org.he.graduationdesignmanagement.model.Student;
import org.he.graduationdesignmanagement.model.Title;
import org.he.graduationdesignmanagement.service.StudentService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class studentScanTitle implements Action {
	private StudentService studentService;
	private Student student; 
    private Title title;
    private Selecttitle selecttitle;
    
	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Selecttitle getSelecttitle() {
		return selecttitle;
	}

	public void setSelecttitle(Selecttitle selecttitle) {
		this.selecttitle = selecttitle;
	}

	@Override
	public String execute() throws Exception {
		/*HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		HttpSession session = request.getSession();
		Login login = (Login) session.getAttribute("login");
		setTitle(studentService.scanStudentTitle(login.getLid()));*/
		/*int lid =((Login)ServletActionContext.getRequest().getSession().getAttribute("existStudent")).getLid();
		int sid = studentService.scanStudentMess(lid).getSid();
		List<Title> tList = studentService.getTitleByid(sid);
		ServletActionContext.getRequest().getSession()
		.setAttribute("tList",tList);*/
		return SUCCESS;
	}
}
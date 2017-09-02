package org.he.graduationdesignmanagement.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Teacher;
import org.he.graduationdesignmanagement.service.TeacherService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class TeacherModifyPass implements Action {
	private TeacherService teacherService;
	private Login teacher;

	public Login getTeacher() {
		return teacher;
	}

	public void setTeacher(Login teacher) {
		this.teacher = teacher;
	}

	public TeacherService getTeacherService() {
		return teacherService;
	}

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	public String execute() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		HttpSession session = request.getSession();
		Login login = (Login) session.getAttribute("login");
		if (teacher.getPassword() == null || teacher.getPassword().equals("")
				|| teacher.getModifyPass() == null
				|| teacher.getModifyPass().equals("")
				|| (!teacher.getModifyPass().equals(teacher.getModifyPass()))){
			return INPUT;
		}
		login.setModifyPass(teacher.getModifyPass());
			teacherService.modifypass(login);
		return SUCCESS;
	}

}

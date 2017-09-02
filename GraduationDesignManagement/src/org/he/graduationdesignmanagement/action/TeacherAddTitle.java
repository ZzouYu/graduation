package org.he.graduationdesignmanagement.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Title;
import org.he.graduationdesignmanagement.service.TeacherService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class TeacherAddTitle implements Action {
	private Title title1;
	private TeacherService teacherService;

	public TeacherService getTeacherService() {
		return teacherService;
	}

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	public Title getTitle1() {
		return title1;
	}

	public void setTitle1(Title title1) {
		this.title1 = title1;
	}

	public String execute() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		HttpSession session = request.getSession();
		Login login = (Login) session.getAttribute("login");
		title1.setTmId(3);
		System.out.println(login==null);
		System.out.println("Action--login-->"+login.getLid());
		System.out.println("Action--title1.name--->"+title1.getTitle());
		title1.setAccount(login.getAccount());
		teacherService.addTitle(title1);
		return SUCCESS;
	}

}

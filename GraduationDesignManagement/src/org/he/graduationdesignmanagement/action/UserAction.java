package org.he.graduationdesignmanagement.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Student;
import org.he.graduationdesignmanagement.model.Teacher;
import org.he.graduationdesignmanagement.model.Title;
import org.he.graduationdesignmanagement.service.UserService;
import org.he.graduationdesignmanagement.service.Impl.ManageTitleServiceImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private Login user;
	private UserService userService;
	private List<Teacher> teacherReviewList;
	private List<Teacher> teacherOtherList;
	private List<Student> studentList;
	private List<Login> logins;
	private Student student;
	private ManageTitleServiceImpl managerTitleService;
	private List<Title> titles;
	private Teacher teacher;
	private Title titlem;

	public Login check() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		HttpSession session = request.getSession();
		Login login = (Login) session.getAttribute("login");

		return login;
	}

	public Title getTitlem() {
		return titlem;
	}

	public void setTitlem(Title titlem) {
		this.titlem = titlem;
	}

	public List<Title> getTitles() {
		return titles;
	}

	public void setTitles(List<Title> titles) {
		this.titles = titles;
	}

	public ManageTitleServiceImpl getManagerTitleService() {
		return managerTitleService;
	}

	public void setManagerTitleService(
			ManageTitleServiceImpl managerTitleService) {
		this.managerTitleService = managerTitleService;
	}

	public List<Login> getLogins() {
		return logins;
	}

	public void setLogins(List<Login> logins) {
		this.logins = logins;
	}

	public List<Teacher> getTeacherReviewList() {
		return teacherReviewList;
	}

	public void setTeacherReviewList(List<Teacher> teacherReviewList) {
		this.teacherReviewList = teacherReviewList;
	}

	public List<Teacher> getTeacherOtherList() {
		return teacherOtherList;
	}

	public void setTeacherOtherList(List<Teacher> teacherOtherList) {
		this.teacherOtherList = teacherOtherList;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public Login getUser() {
		return user;
	}

	public void setUser(Login user) {
		this.user = user;
	}

	public String addTeacherForm() {
		return SUCCESS;
	}

	public String addStudentForm() {
		return SUCCESS;
	}

	public String login() {
		setTeacherReviewList(userService.findReviewer());
		setTeacherOtherList(userService.findOtherTeacher());
		setStudentList(userService.findAllStudent());
		Map session;
		user = userService.login(user.getAccount(), user.getPassword());
		if (user != null) {
			int power = user.getRole();
			session = (Map) ActionContext.getContext().getSession();
			session.put("login", user);
			if (power == 1) {
				return "1";

			}
			if (power == 2) {
				int reviewer = userService.findTeacherByLid(user.getLid())
						.getReviewer();
				session = (Map) ActionContext.getContext().getSession();
				session.put("loginMassage", user);
				if (reviewer == 1)
					return "4";
				if (reviewer == 0)
					return "5";
			}
			if (power == 3) {
				session = (Map) ActionContext.getContext().getSession();
				session.put("loginMassage", user);
				ServletActionContext.getRequest().getSession()
				.setAttribute("existStudent",user);
				return "3";
			}
		} else {
			return INPUT;
		}
		return INPUT;
	}

	public String addStudent() {
		if (this.check() == null) {
			return INPUT;
		}
		userService.addStudent(student);

		return SUCCESS;
	}

	public String addTeacher() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		HttpSession session = request.getSession();
		Login login = (Login) session.getAttribute("login");
		if (login == null) {
			return INPUT;
		}
		System.out.println(teacher.getName());
		userService.addTeacher(teacher);

		return SUCCESS;
	}

	public String deleteTeacher() {

		userService.deleteTeacher(teacher);
		return SUCCESS;
	}

	public String deleteStudent() {
		userService.deleteStudent(student);
		return SUCCESS;
	}

	public String updateTeacherPassword() {
		userService.updateTeacher(teacher);
		return SUCCESS;
	}

	public String updateStudentPassword() {
		userService.updateStudent(student);
		return SUCCESS;
	}

	public String updatePassword() {
		setLogins(userService.findPassword());

		for (int i = 0; i < logins.size(); i++) {
			System.out.print(logins.get(i).getAccount());

		}
		return SUCCESS;
	}

	public String agreePassword() {
		userService.updatePassword(user);
		return SUCCESS;
	}

	public String reviewerForm() {
		/* System.out.println("+++++++++++++----------------------++++++++++"); */
		// setTitles(managerTitleService.findAllTitle());
		titles = managerTitleService.findAllTitle();
		/*
		 * for(int i=0;i<titles.size();i++){
		 * System.out.println(titles.get(i).getTitle()); }
		 */
		setTeacherReviewList(userService.findReviewer());
		/*
		 * for(int i=0;i<teacherReviewList.size();i++){
		 * System.out.println(teacherReviewList.get(i).getName());
		 * System.out.println("           ");
		 * System.out.println(teacherReviewList.get(i).getTid()); }
		 */
		return SUCCESS;
	}

	public String agreeAddReviewer() {
		System.out.println("++++++++++++++++-------------+++++++++++++");
		System.out.println(teacher != null);
		System.out.println(titlem != null);
		System.out.println(" 老师的ID----------->" + teacher.getTid());
		System.out.println(" 题目的ID----------->" + titlem.getTmId());
		managerTitleService.addReviewer(teacher, titlem);

		return SUCCESS;
	}

	public String logout() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		HttpSession session = request.getSession();
		
			session.invalidate();
			
			return SUCCESS;
		
	}
}

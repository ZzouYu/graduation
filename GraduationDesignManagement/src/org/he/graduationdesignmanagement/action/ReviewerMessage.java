package org.he.graduationdesignmanagement.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Teacher;
import org.he.graduationdesignmanagement.service.ReviewerService;
import org.he.graduationdesignmanagement.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewerMessage extends ActionSupport {
	private Teacher reviewer;
	private ReviewerService reviewerService;


	public ReviewerService getReviewerService() {
		return reviewerService;
	}

	public void setReviewerService(ReviewerService reviewerService) {
		this.reviewerService = reviewerService;
	}

	public Teacher getReviewer() {
		return reviewer;
	}

	public void setReviewer(Teacher reviewer) {
		this.reviewer = reviewer;
	}

	public String scanReviewerMess() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		HttpSession session = request.getSession();
		Login login = (Login) session.getAttribute("login");
		System.out.println("+++++++++++-------------+++++++++++");
		System.out.println("ReviewerMessage---->" + login.getAccount());
		System.out.println("ReviewerMessage---->" + login.getLid());
		setReviewer(reviewerService.findByLid(login.getLid()));
		System.out.println("查找的数据中的名字为-->"+reviewer.getName());
		return SUCCESS;
	}
}

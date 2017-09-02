package org.he.graduationdesignmanagement.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.service.ReviewerService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class ReviewerModifyPassAction implements Action {

	private Login reviewer;
	private ReviewerService reviewerService;

	public ReviewerService getReviewerService() {
		return reviewerService;
	}

	public void setReviewerService(ReviewerService reviewerService) {
		this.reviewerService = reviewerService;
	}

	public Login getReviewer() {
		return reviewer;
	}

	public void setReviewer(Login reviewer) {
		this.reviewer = reviewer;
	}

	public String execute() throws Exception {
		System.out.println("+++++++++++++++++++++++");
         System.out.println("Action------->"+reviewer.getPassword());
		if (!reviewer.getPassword().equals(reviewer.getModifyPass())
				|| reviewer.getPassword().trim().equals("")
				|| reviewer.getModifyPass().equals("")) {
			return INPUT;
		}
 
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		HttpSession session = request.getSession();
		Login login = (Login) session.getAttribute("login");
		reviewerService
				.updateModifyPass(login.getLid(), reviewer.getPassword());
		System.out.println("ReviewerMessage---->" + login.getLid());
		return SUCCESS;
	}

}

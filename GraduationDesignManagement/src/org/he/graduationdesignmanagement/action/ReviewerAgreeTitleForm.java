package org.he.graduationdesignmanagement.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.he.graduationdesignmanagement.model.Login;
import org.he.graduationdesignmanagement.model.Title;
import org.he.graduationdesignmanagement.service.ReviewerService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class ReviewerAgreeTitleForm implements Action {
	private ReviewerService reviewerService;
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

	public ReviewerService getReviewerService() {
		return reviewerService;
	}

	public void setReviewerService(ReviewerService reviewerService) {
		this.reviewerService = reviewerService;
	}

	public String execute() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		HttpSession session = request.getSession();
		Login login = (Login) session.getAttribute("login");
		System.out.println("Action----->" + login.getLid());
		setTitles(reviewerService.findTitleByLid(login.getLid()));
		/*for(int i=0;i<titles.size();i++)
		{
			System.out.println(titles.get(i).getTitle());
		}*/
		return SUCCESS;
	}
	public String reviewerAgree(){
		System.out.println("reviewrAgree-------->"+title.getTmId());
		System.out.println("reviewrAgree-------->"+title.getReviewSuggestion());
		reviewerService.updateReviewByTmid(title.getTmId(), title.getReviewSuggestion());
		
		return SUCCESS;
	}

}

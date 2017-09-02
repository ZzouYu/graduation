package org.he.graduationdesignmanagement.model;

/**
 * Title entity. @author MyEclipse Persistence Tools
 */

public class Title implements java.io.Serializable {

	// Fields

	private Integer tmId;

	private String title;
	private String property;
	private String type;
	private Integer term;
	private Integer reviewStatus;
	private Integer reviewPeople;
	private Integer reviewSuggestion;
	private String account;

	// Constructors

	/** default constructor */
	public Title() {
	}

	/** minimal constructor */
	public Title(String title, String property, String type, Integer term,
			Integer reviewStatus, Integer reviewPeople, Integer reviewSuggestion) {
		this.title = title;
		this.property = property;
		this.type = type;
		this.term = term;
		this.reviewStatus = reviewStatus;
		this.reviewPeople = reviewPeople;
		this.reviewSuggestion = reviewSuggestion;
	}

	/** full constructor */
	public Title(String account, String title, String property, String type,
			Integer term, Integer reviewStatus, Integer reviewPeople,
			Integer reviewSuggestion) {
		this.account=account;
		this.title = title;
		this.property = property;
		this.type = type;
		this.term = term;
		this.reviewStatus = reviewStatus;
		this.reviewPeople = reviewPeople;
		this.reviewSuggestion = reviewSuggestion;
	}

	// Property accessors

	public Integer getTmId() {
		return this.tmId;
	}

	public void setTmId(Integer tmId) {
		this.tmId = tmId;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProperty() {
		return this.property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getTerm() {
		return this.term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public Integer getReviewStatus() {
		return this.reviewStatus;
	}

	public void setReviewStatus(Integer reviewStatus) {
		this.reviewStatus = reviewStatus;
	}

	public Integer getReviewPeople() {
		return this.reviewPeople;
	}

	public void setReviewPeople(Integer reviewPeople) {
		this.reviewPeople = reviewPeople;
	}

	public Integer getReviewSuggestion() {
		return this.reviewSuggestion;
	}

	public void setReviewSuggestion(Integer reviewSuggestion) {
		this.reviewSuggestion = reviewSuggestion;
	}

}
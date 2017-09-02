package org.he.graduationdesignmanagement.model;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	private Integer tid;
	private String teacheNo;
	private String name;
	private Integer lid;
	private Integer sex;
	private String professional;
	private String telephone;
	private String address;
	private String email;
	private Integer reviewer;
	private Integer reviewtotNo;

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(String teacheNo, String name, Integer lid, Integer sex,
			String professional, String telephone, Integer reviewer) {
		this.teacheNo = teacheNo;
		this.name = name;
		this.lid = lid;
		this.sex = sex;
		this.professional = professional;
		this.telephone = telephone;
		this.reviewer = reviewer;
	}

	/** full constructor */
	public Teacher(String teacheNo, String name, Integer lid, Integer sex,
			String professional, String telephone, String address,
			String email, Integer reviewer, Integer reviewtotNo) {
		this.teacheNo = teacheNo;
		this.name = name;
		this.lid = lid;
		this.sex = sex;
		this.professional = professional;
		this.telephone = telephone;
		this.address = address;
		this.email = email;
		this.reviewer = reviewer;
		this.reviewtotNo = reviewtotNo;
	}

	// Property accessors

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTeacheNo() {
		return this.teacheNo;
	}

	public void setTeacheNo(String teacheNo) {
		this.teacheNo = teacheNo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLid() {
		return this.lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getProfessional() {
		return this.professional;
	}

	public void setProfessional(String professional) {
		this.professional = professional;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getReviewer() {
		return this.reviewer;
	}

	public void setReviewer(Integer reviewer) {
		this.reviewer = reviewer;
	}

	public Integer getReviewtotNo() {
		return this.reviewtotNo;
	}

	public void setReviewtotNo(Integer reviewtotNo) {
		this.reviewtotNo = reviewtotNo;
	}

}
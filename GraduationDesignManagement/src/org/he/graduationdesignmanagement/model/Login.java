package org.he.graduationdesignmanagement.model;

/**
 * Login entity. @author MyEclipse Persistence Tools
 */

public class Login implements java.io.Serializable {

	// Fields

	private Integer lid;
	private String account;
	private String password;
	private String modifyPass;
	private Integer role;

	// Constructors

	/** default constructor */
	public Login() {
	}
	public Login(Integer lid) {
		this.lid=lid;
	}
	/** minimal constructor */
	public Login(String account, String password, Integer role) {
		this.account = account;
		this.password = password;
		this.role = role;
	}

	/** full constructor */
	public Login(String account, String password, String modifyPass,
			Integer role) {
		this.account = account;
		this.password = password;
		this.modifyPass = modifyPass;
		this.role = role;
	}

	// Property accessors

	public Integer getLid() {
		return this.lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getModifyPass() {
		return this.modifyPass;
	}

	public void setModifyPass(String modifyPass) {
		this.modifyPass = modifyPass;
	}

	public Integer getRole() {
		return this.role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

}
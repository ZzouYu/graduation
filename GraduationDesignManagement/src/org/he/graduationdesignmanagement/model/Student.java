package org.he.graduationdesignmanagement.model;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer sid;
	private String studentNo;
	private String name;
	private Integer lid;
	private Integer sex;
	private String specialty;
	private String classno;
	private String telephone;
	private String email;
	private String qq;

	// Constructors

	/** default constructor */
	public Student() {
	}
	public Student(Integer sid) {
		this.sid=sid;
	}
	/** minimal constructor */
	public Student(String studentNo, String name, Integer lid, Integer sex,
			String specialty, String classno, String telephone) {
		this.studentNo = studentNo;
		this.name = name;
		this.lid = lid;
		this.sex = sex;
		this.specialty = specialty;
		this.classno = classno;
		this.telephone = telephone;
	}

	/** full constructor */
	public Student(String studentNo, String name, Integer lid, Integer sex,
			String specialty, String classno, String telephone, String email,
			String qq) {
		this.studentNo = studentNo;
		this.name = name;
		this.lid = lid;
		this.sex = sex;
		this.specialty = specialty;
		this.classno = classno;
		this.telephone = telephone;
		this.email = email;
		this.qq = qq;
	}

	// Property accessors

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
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

	public String getSpecialty() {
		return this.specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getClassno() {
		return this.classno;
	}

	public void setClassno(String classno) {
		this.classno = classno;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

}
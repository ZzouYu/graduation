package org.he.graduationdesignmanagement.model;

/**
 * Selecttitle entity. @author MyEclipse Persistence Tools
 */

public class Selecttitle implements java.io.Serializable {

	// Fields

	private SelecttitleId id;
	private Integer score;

	// Constructors

	/** default constructor */
	public Selecttitle() {
	}

	/** minimal constructor */
	public Selecttitle(SelecttitleId id) {
		this.id = id;
	}

	/** full constructor */
	public Selecttitle(SelecttitleId id, Integer score) {
		this.id = id;
		this.score = score;
	}

	// Property accessors

	public SelecttitleId getId() {
		return this.id;
	}

	public void setId(SelecttitleId id) {
		this.id = id;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

}
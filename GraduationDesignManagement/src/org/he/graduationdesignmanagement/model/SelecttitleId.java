package org.he.graduationdesignmanagement.model;

/**
 * SelecttitleId entity. @author MyEclipse Persistence Tools
 */

public class SelecttitleId implements java.io.Serializable {

	// Fields

	private Integer sid;
	private Integer tmId;

	// Constructors

	/** default constructor */
	public SelecttitleId() {
	}

	/** full constructor */
	public SelecttitleId(Integer sid, Integer tmId) {
		this.sid = sid;
		this.tmId = tmId;
	}

	// Property accessors

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Integer getTmId() {
		return this.tmId;
	}

	public void setTmId(Integer tmId) {
		this.tmId = tmId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SelecttitleId))
			return false;
		SelecttitleId castOther = (SelecttitleId) other;

		return ((this.getSid() == castOther.getSid()) || (this.getSid() != null
				&& castOther.getSid() != null && this.getSid().equals(
				castOther.getSid())))
				&& ((this.getTmId() == castOther.getTmId()) || (this.getTmId() != null
						&& castOther.getTmId() != null && this.getTmId()
						.equals(castOther.getTmId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSid() == null ? 0 : this.getSid().hashCode());
		result = 37 * result
				+ (getTmId() == null ? 0 : this.getTmId().hashCode());
		return result;
	}

}
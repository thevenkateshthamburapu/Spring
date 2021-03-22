package com.spring.boot.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "STUDENT_DETAILS_TBL")
public class StudentEntity implements Serializable {
	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID")
	private Integer stuid;

	@Column(name = "STUDENT_NAME")
	private String stuname;

	@Column(name = "STUDENT_MARKS")
	private Integer marks;
	@Column(name = "STUDENT_RESULT")
	private String result;

	@Column(name = "ACTIVE_SW")
	private String activeSw;

	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date createDt;

	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	private Date updateDt;

	public Integer getStuid() {
		return stuid;
	}

	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public Date getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}

	@Override
	public String toString() {
		return "StudentEntity [stuid=" + stuid + ", stuname=" + stuname + ", marks=" + marks + ", result=" + result
				+ ", activeSw=" + activeSw + ", createDt=" + createDt + ", updateDt=" + updateDt + "]";
	}

}

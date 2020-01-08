package com.revature.models;

import java.util.Date;

public class Quiz {
	
	private int quizId;
	private String quizTitle;
	private String assignedTo;
	private String createdBy;
	private Date createdOn;
	
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quiz(int quizId, String quizTitle, String assignedTo, String createdBy, Date createdOn) {
		super();
		this.quizId = quizId;
		this.quizTitle = quizTitle;
		this.assignedTo = assignedTo;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
	}

	public int getQuizId() {
		return quizId;
	}

	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}

	public String getQuizTitle() {
		return quizTitle;
	}

	public void setQuizTitle(String quizTitle) {
		this.quizTitle = quizTitle;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assignedTo == null) ? 0 : assignedTo.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
		result = prime * result + quizId;
		result = prime * result + ((quizTitle == null) ? 0 : quizTitle.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quiz other = (Quiz) obj;
		if (assignedTo == null) {
			if (other.assignedTo != null)
				return false;
		} else if (!assignedTo.equals(other.assignedTo))
			return false;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (createdOn == null) {
			if (other.createdOn != null)
				return false;
		} else if (!createdOn.equals(other.createdOn))
			return false;
		if (quizId != other.quizId)
			return false;
		if (quizTitle == null) {
			if (other.quizTitle != null)
				return false;
		} else if (!quizTitle.equals(other.quizTitle))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Quiz [quizId=" + quizId + ", quizTitle=" + quizTitle + ", assignedTo=" + assignedTo + ", createdBy="
				+ createdBy + ", createdOn=" + createdOn + "]";
	}

}

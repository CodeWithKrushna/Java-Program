package com.practice.rto.entity;

public class feedback
{
	private int feedbackId ;
	private int userNo ;
	private String description;
	public feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public feedback(int feedbackId, int userNo, String description) {
		super();
		this.feedbackId = feedbackId;
		this.userNo = userNo;
		this.description = description;
	}
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "feedback [feedbackId=" + feedbackId + ", userNo=" + userNo + ", description=" + description + "]";
	}
	
	
}

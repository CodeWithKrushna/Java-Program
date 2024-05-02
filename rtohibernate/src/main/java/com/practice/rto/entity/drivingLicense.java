package com.practice.rto.entity;

public class drivingLicense 
{
	private int licId ;
	private String userName;
	private String userPass;
	public drivingLicense() {
		super();
		// TODO Auto-generated constructor stub
	}
	public drivingLicense(int licId, String userName, String userPass) {
		super();
		this.licId = licId;
		this.userName = userName;
		this.userPass = userPass;
	}
	public int getLicId() {
		return licId;
	}
	public void setLicId(int licId) {
		this.licId = licId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	@Override
	public String toString() {
		return "drivingLicense [licId=" + licId + ", userName=" + userName + ", userPass=" + userPass + "]";
	}
	
	
}

package com.practice.rto.entity;

public class drivingLearningLicense 
{
	private int licId;
	private String userName;
	private int userAge;
	private String userPass;
	private String typeOfLicense;
	public drivingLearningLicense() {
		super();
		// TODO Auto-generated constructor stub
	}
	public drivingLearningLicense(int licId, String userName, int userAge, String userPass, String typeOfLicense) {
		super();
		this.licId = licId;
		this.userName = userName;
		this.userAge = userAge;
		this.userPass = userPass;
		this.typeOfLicense = typeOfLicense;
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
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getTypeOfLicense() {
		return typeOfLicense;
	}
	public void setTypeOfLicense(String typeOfLicense) {
		this.typeOfLicense = typeOfLicense;
	}
	
	@Override
	public String toString() {
		return "drivingLearningLicense [licId=" + licId + ", userName=" + userName + ", userAge=" + userAge
				+ ", userPass=" + userPass + ", typeOfLicense=" + typeOfLicense + "]";
	}
	
	
	

}

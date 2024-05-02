package com.practice.rto.entity;

public class learningLicense 
{
	private int lerLicId ;
	private String lerUserName;
	private String lerUserPass;
	public learningLicense() {
		super();
		// TODO Auto-generated constructor stub
	}
	public learningLicense(int lerLicId, String lerUserName, String lerUserPass) {
		super();
		this.lerLicId = lerLicId;
		this.lerUserName = lerUserName;
		this.lerUserPass = lerUserPass;
	}
	public int getLerLicId() {
		return lerLicId;
	}
	public void setLerLicId(int lerLicId) {
		this.lerLicId = lerLicId;
	}
	public String getLerUserName() {
		return lerUserName;
	}
	public void setLerUserName(String lerUserName) {
		this.lerUserName = lerUserName;
	}
	public String getLerUserPass() {
		return lerUserPass;
	}
	public void setLerUserPass(String lerUserPass) {
		this.lerUserPass = lerUserPass;
	}
	
	@Override
	public String toString() {
		return "learningLicense [lerLicId=" + lerLicId + ", lerUserName=" + lerUserName + ", lerUserPass=" + lerUserPass
				+ "]";
	}
	
	
}

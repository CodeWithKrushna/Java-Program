package com.practice.rto.entity;

public class addressChange 
{
	private int adId ;
	private String uName;
	private String uPass;
	private int dlNo ;
	private String dlOldAdd;
	private String dlNewAdd;
	
	public addressChange() {
		super();
		// TODO Auto-generated constructor stub
	}
	public addressChange(int adId, String uName, String uPass, int dlNo, String dlOldAdd, String dlNewAdd) {
		super();
		this.adId = adId;
		this.uName = uName;
		this.uPass = uPass;
		this.dlNo = dlNo;
		this.dlOldAdd = dlOldAdd;
		this.dlNewAdd = dlNewAdd;
	}
	public int getAdId() {
		return adId;
	}
	public void setAdId(int adId) {
		this.adId = adId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPass() {
		return uPass;
	}
	public void setuPass(String uPass) {
		this.uPass = uPass;
	}
	public int getDlNo() {
		return dlNo;
	}
	public void setDlNo(int dlNo) {
		this.dlNo = dlNo;
	}
	public String getDlOldAdd() {
		return dlOldAdd;
	}
	public void setDlOldAdd(String dlOldAdd) {
		this.dlOldAdd = dlOldAdd;
	}
	public String getDlNewAdd() {
		return dlNewAdd;
	}
	public void setDlNewAdd(String dlNewAdd) {
		this.dlNewAdd = dlNewAdd;
	}
	
	@Override
	public String toString() {
		return "addressChange [adId=" + adId + ", uName=" + uName + ", uPass=" + uPass + ", dlNo=" + dlNo
				+ ", dlOldAdd=" + dlOldAdd + ", dlNewAdd=" + dlNewAdd + "]";
	}
	
	
}

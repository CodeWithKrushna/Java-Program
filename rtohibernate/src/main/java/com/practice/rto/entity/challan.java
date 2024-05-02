package com.practice.rto.entity;

public class challan 
{
	private int chaId ;
	private int vehNo ;
	private int chassisNo;
	public challan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public challan(int chaId, int vehNo, int chassisNo) {
		super();
		this.chaId = chaId;
		this.vehNo = vehNo;
		this.chassisNo = chassisNo;
	}
	public int getChaId() {
		return chaId;
	}
	public void setChaId(int chaId) {
		this.chaId = chaId;
	}
	public int getVehNo() {
		return vehNo;
	}
	public void setVehNo(int vehNo) {
		this.vehNo = vehNo;
	}
	public int getChassisNo() {
		return chassisNo;
	}
	public void setChassisNo(int chassisNo) {
		this.chassisNo = chassisNo;
	}
	
	@Override
	public String toString() {
		return "challan [chaId=" + chaId + ", vehNo=" + vehNo + ", chassisNo=" + chassisNo + "]";
	}
	
	
}

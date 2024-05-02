package com.practice.rto.entity;

public class vehicle 
{
	private int vehicleId;
	private int regiNo;
	private int ownerId;
	private String vehicleType;
	
	public vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public vehicle(int vehicleId, int regiNo, int ownerId, String vehicleType) {
		super();
		this.vehicleId = vehicleId;
		this.regiNo = regiNo;
		this.ownerId = ownerId;
		this.vehicleType = vehicleType;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public int getRegiNo() {
		return regiNo;
	}

	public void setRegiNo(int regiNo) {
		this.regiNo = regiNo;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "vehicle [vehicleId=" + vehicleId + ", regiNo=" + regiNo + ", ownerId=" + ownerId + ", vehicleType="
				+ vehicleType + "]";
	}
	
	

}

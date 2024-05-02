package com.practice.rto.entity;

public class rtoOfficer 
{
	private int roId;
	private String roName;
	private String roPass;
	private int roIdCardNo;
	
	public rtoOfficer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public rtoOfficer(int roId, String roName, String roPass, int roIdCardNo) {
		super();
		this.roId = roId;
		this.roName = roName;
		this.roPass = roPass;
		this.roIdCardNo = roIdCardNo;
	}

	public int getRoId() {
		return roId;
	}

	public void setRoId(int roId) {
		this.roId = roId;
	}

	public String getRoName() {
		return roName;
	}

	public void setRoName(String roName) {
		this.roName = roName;
	}

	public String getRoPass() {
		return roPass;
	}

	public void setRoPass(String roPass) {
		this.roPass = roPass;
	}

	public int getRoIdCardNo() {
		return roIdCardNo;
	}

	public void setRoIdCardNo(int roIdCardNo) {
		this.roIdCardNo = roIdCardNo;
	}

	@Override
	public String toString() {
		return "rtoOfficer [roId=" + roId + ", roName=" + roName + ", roPass=" + roPass + ", roIdCardNo=" + roIdCardNo
				+ "]";
	}
	
	
	
	
	

}

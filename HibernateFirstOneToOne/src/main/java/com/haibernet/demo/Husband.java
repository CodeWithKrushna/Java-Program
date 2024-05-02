package com.haibernet.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="husbans_details")
public class Husband 
{
	@Id
	private int hid;
	@Column(name="husband_name")
	private String hname;
	@ManyToOne
	private Wife wife;
	public Husband() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Husband(int hid, String hname, Wife wife) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.wife = wife;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public Wife getWife() {
		return wife;
	}
	public void setWife(Wife wife) {
		this.wife = wife;
	}
	@Override
	public String toString() {
		return "Husband [hid=" + hid + ", hname=" + hname + ", wife=" + wife + "]";
	}
	
	

}



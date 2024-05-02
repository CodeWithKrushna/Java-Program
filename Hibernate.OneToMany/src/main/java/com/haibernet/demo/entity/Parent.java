package com.haibernet.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="parentDetails")
public class Parent
{
	@Id
	private int pId;
	private String pName;
	
	@OneToMany
	private List <Child> chid;
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Parent(int pId, String pName, List<Child> chid) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.chid = chid;
	}

	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public List<Child> getChid() {
		return chid;
	}
	public void setChid(List<Child> chid) {
		this.chid = chid;
	}
	@Override
	public String toString() {
		return "Parent [pId=" + pId + ", pName=" + pName + ", chid=" + chid + "]";
	}
	
	
	

}

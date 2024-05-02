package com.practice.rto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User
{
	@Id
	private int userId ;
	private String userName;
	private int userMonile;
	private String userEmail;
	private String userAdd;
	private String userPass;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userName, int userMonile, String userEmail, String userAdd, String userPass) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMonile = userMonile;
		this.userEmail = userEmail;
		this.userAdd = userAdd;
		this.userPass = userPass;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserMonile() {
		return userMonile;
	}
	public void setUserMonile(int userMonile) {
		this.userMonile = userMonile;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserAdd() {
		return userAdd;
	}
	public void setUserAdd(String userAdd) {
		this.userAdd = userAdd;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userMonile=" + userMonile + ", userEmail="
				+ userEmail + ", userAdd=" + userAdd + ", userPass=" + userPass + "]";
	}
	
	

}

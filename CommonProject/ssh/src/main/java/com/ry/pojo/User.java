package com.ry.pojo; 
/** 
* @author ry 
* @create 2018年3月2日 下午1:14:24 
* @describe
*/
public class User {
	
	private String userId;
	private String userName;
	private String userRealName;
	private String userPass;
	private int userSex;
	private String userCreate;
	private String userLastTime;
	private String userEmail;
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userRealName=" + userRealName + ", userPass=" + userPass + ", userSex="
				+ userSex + ", userCreate=" + userCreate + ", userLastTime=" + userLastTime + ", userEmail=" + userEmail
				+ "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserRealName() {
		return userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public int getUserSex() {
		return userSex;
	}
	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}
	public String getUserCreate() {
		return userCreate;
	}
	public void setUserCreate(String userCreate) {
		this.userCreate = userCreate;
	}
	public String getUserLastTime() {
		return userLastTime;
	}
	public void setUserLastTime(String userLastTime) {
		this.userLastTime = userLastTime;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	
	
	
}
 
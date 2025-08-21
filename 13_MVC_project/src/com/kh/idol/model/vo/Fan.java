package com.kh.idol.model.vo;

public class Fan {

	private String userId;
	private String userPwd;
	private String nickName;

	public Fan() {
		super();
	}

	public Fan(String userId, String userPwd, String nickName) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.nickName = nickName;
	}

	public String getUesrId() {
		return userId;
	}

	public void setUserId(String uesrId) {
		this.userId = uesrId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String uesrPwd) {
		this.userPwd = uesrPwd;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "Fan [userId=" + userId + ", userPwd=" + userPwd + ", nickName=" + nickName + "]";
	}

}

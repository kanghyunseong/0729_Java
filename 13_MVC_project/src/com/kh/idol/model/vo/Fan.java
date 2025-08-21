package com.kh.idol.model.vo;

public class Fan {

	private String uesrId;
	private String uesrPwd;
	private String nickName;

	public Fan() {
		super();
	}

	public Fan(String uesrId, String uesrPwd, String nickName) {
		super();
		this.uesrId = uesrId;
		this.uesrPwd = uesrPwd;
		this.nickName = nickName;
	}

	public String getUesrId() {
		return uesrId;
	}

	public void setUesrId(String uesrId) {
		this.uesrId = uesrId;
	}

	public String getUesrPwd() {
		return uesrPwd;
	}

	public void setUesrPwd(String uesrPwd) {
		this.uesrPwd = uesrPwd;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "Fan [uesrId=" + uesrId + ", uesrPwd=" + uesrPwd + ", nickName=" + nickName + "]";
	}

}

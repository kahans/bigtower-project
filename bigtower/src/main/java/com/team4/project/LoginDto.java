package com.team4.project;

public class LoginDto {
	private String id;//로그인
	private String pw;
	private String level;
	
	
	
	@Override
	public String toString() {
		return "LoginDto [id=" + id + ", pw=" + pw + ", level=" + level + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
}

package com.qingshixun.register;

public class User implements java.io.Serializable{
	private String username;
	private String pwd;
	private String pwd1;
	private String e_mail;
	private String sex;
	private String profession;
	private String hobby;
	
	public User() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPwd1() {
		return pwd1;
	}
	public void setPwd1(String pwd1) {
		this.pwd1 = pwd1;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		if(sex.equals("on")){
			this.sex="男";
		}else{
			this.sex = "女";
		}
		
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}	
}

package com.qingshixun.register;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class RegisterAction {
	/**
	 * 
	 */
	//实例化对象
	UserService userService=new UserService();
	private static final long serialVersionUID = 1L;
	//用户实体
	private User user;
	//进入注册页面
	public String register(){
		System.out.println("success");
		return "success";
	}
	//保存用户
	public String save() throws SQLException{
		//接受前台传入的信息
		//保存数据到数据库
		if(userService.saveUser(user)==true){
			return "success";
		}else{
			return "fail";
		}
		
	}
	public User getUser(){
		return user;
	}
	public void setUser(User user){
		this.user=user;
	}
}

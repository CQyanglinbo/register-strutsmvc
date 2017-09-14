package com.qingshixun.register;

import java.sql.SQLException;

public class UserService {
	//创建UserDao实例
	private UserDao userDao=new UserDao();
	/**
	 * 保存用户：先根据用户名查询用户是否存在，存在则返回false，不存在，则插入
	 * @param user 用户信息
	 * @return
	 * @throws SQLException
	 */
	public boolean saveUser(User user) throws SQLException{
		if(userDao.getUserByUsername(user.getUsername())!=null){
			return false;
		}else{
			userDao.createUser(user);
			return true;
		}
	}
}

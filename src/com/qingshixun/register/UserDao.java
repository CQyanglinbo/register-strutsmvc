package com.qingshixun.register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JDBCUtil ju=new JDBCUtil();
	/**
	 *通过用户名查找用户信息
	 * @param userName
	 * @return 未找到用户，返回null
	 * @throws SQLException
	 */
	public User getUserByUsername(String userName) throws SQLException {
		Connection connection = JDBCUtil.getConnection();
		StringBuffer sql = new StringBuffer();
		sql.append("select * from register where userName=?");
		PreparedStatement ps = connection.prepareStatement(sql.toString());
		setParam(ps,userName);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {//有值表明匹配上了信息
			User user = new User();
			JDBCUtil.close(rs,ps,connection);
			return user;
		}
		return null;
	}
	/**
	 * 设置sql的参数
	 * @param ps
	 * @param objects
	 * @throws SQLException
	 */
	public void setParam(PreparedStatement ps,Object...objects) throws SQLException{
		for (int i = 0; i < objects.length; i++) {
			ps.setObject(i+1, objects[i]);
		}
	}
	/**
	 * 创建用户
	 * @param user用户对象
	 * @return 1表示插入成功，0表示插入失败
	 * @throws SQLException
	 */
	public int createUser(User user) throws SQLException{
		int row=0;
		Connection connection=JDBCUtil.getConnection();
		StringBuffer sql=new StringBuffer();
		sql.append("insert into register values(?,?,?,?,?,?,?)");
		PreparedStatement ps=connection.prepareStatement(sql.toString());
		setParam(ps, user.getUsername(),user.getPwd(),user.getPwd1(),user.getE_mail(),user.getSex(),user.getProfession(),user.getHobby());
		row=ps.executeUpdate();
		JDBCUtil.close(null,ps,connection);
		return row;
	}
}

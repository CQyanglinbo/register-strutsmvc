package com.qingshixun.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/myschool?zeroDateTimeBehavior=convertToNull";
	private static final String USER = "root";
	private static final String PASSWORD = "ylb951228";

	// 1.加载驱动
	static {
		try {
			Class.forName(DRIVER_CLASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 获得数据库连接
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException{
		return  DriverManager.getConnection(URL, USER, PASSWORD);
	}
	/**
	 * 关闭数据库连接，释放资源
	 * @param rs
	 * @param ps
	 * @param connection
	 * @throws SQLException
	 */
	public static void close(ResultSet rs,PreparedStatement ps,Connection connection) throws SQLException{
		if(rs!=null){
			rs.close();
		}
		if(ps!=null){
			ps.close();
		}
		if(connection!=null){
			connection.close();
		}
	}

}

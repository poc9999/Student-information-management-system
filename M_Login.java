package com.langxikeji.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class M_Login {

	//数据库验证用户名和密码
	public static boolean verification(String name,String pass){
		
		String sql="SELECT * FROM user WHERE user_name=? AND password=?";
		
		Connection conn=Connections.getConnection();
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setString(1, name);
			
			ps.setString(2, pass);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				
				return true;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
		
		
	}
	
	
	
	
}

package com.mega.restTest;

import java.sql.DriverManager;

import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

@Repository
public class SkiDAO {
	
	public void insert(String name, String tel) {
		//JDBC4단계
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ski";
			String user = "root";
			String pw = "1234";
			Connection con 
				= (Connection) DriverManager.getConnection(url, user, pw);
			String sql = "insert into ski values ( ?, ?)";
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, tel);
			ps.executeUpdate();
			ps.close();
			con.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void insert2(String title, String link, String pubDate, String author) {
		//JDBC4단계
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ski?useUnicode=true&characterEncoding=utf8";
			String user = "root";
			String pw = "1234";
			Connection con 
				= (Connection) DriverManager.getConnection(url, user, pw);
			String sql = "insert into news values ( ?, ?, ?, ?)";
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, link);
			ps.setString(3, pubDate);
			ps.setString(4, author);
			ps.executeUpdate();
			ps.close();
			con.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

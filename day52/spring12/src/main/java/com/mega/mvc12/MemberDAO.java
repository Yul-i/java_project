package com.mega.mvc12;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository 
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	public boolean login(MemberDTO dto) {
		
		String dbId = "root";
		String dbPw = "1234";
		boolean result = false; 
		
		if (dto.getId().equals(dbId)&&dto.getPw().equals(dbPw)) {
			result = true;
		}
		return result;
	}
	
	public boolean check(String nick) {
		String dbNick = "superman";
		boolean result = false;
		if (nick.equals(dbNick)) {
			result = true;
		}
		return result;
	}
	
	public void create() {
		mybatis.insert("insert int member~~~");
		
	}
	
	public void read() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
}

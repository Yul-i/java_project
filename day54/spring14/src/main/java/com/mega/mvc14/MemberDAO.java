package com.mega.mvc14;

import java.util.List;

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
	
	public void create(MemberDTO memberDTO) {
		mybatis.insert("member.create", memberDTO);
		
	}
	
	public MemberDTO read(MemberDTO memberDTO) {
		MemberDTO dto = mybatis.selectOne("member.one", memberDTO);
		return dto;
	}
	
	public List<MemberDTO> list() {
		List<MemberDTO> list = mybatis.selectList("member.all");
		return list;
	}
	
	public void update() {
		
	}
	
	public int delete(MemberDTO memberDTO) {
		int result = mybatis.delete("member.del", memberDTO);
		return result;
	}
}

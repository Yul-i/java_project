package com.mega.mvc09;

import org.springframework.stereotype.Repository;

@Repository //싱글톤으로 만들어준다. //싱글톤으로 만들어줄 객체가 아니면 어노테이션 달면 안됨.
public class MemberDAO {
	//DAO는 무조건 싱글톤으로 만들어 주어야 한다.
	//잘 사용하지 않는 DB는 프로토로 만들어도 됨
	public boolean login(MemberDTO dto) {
		//컨트롤러의 메서드 내에 선언된 파라메터는 무조건 프로토타입으로 만들어진다.
		
		String dbId = "root";
		String dbPw = "1234";
		boolean result = false; //컨트롤러에 결과를 알려주기 위한 변수
		
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
	
	public void read() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
}

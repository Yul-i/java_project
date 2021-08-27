package com.mega.mvc07;

import javax.annotation.ManagedBean;

import org.springframework.stereotype.Repository;

//특정한 방법을 가지고 처리하는 파일 : 방법파일(Model, DAO)
//메서드만 사용하는 애들은 싱글톤이 효율적
@Repository
public class MemberDAO {
	
	public void insert(MemberDTO dto) {
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		System.out.println(dto.getName());
		System.out.println(dto.getTel());
	}
}

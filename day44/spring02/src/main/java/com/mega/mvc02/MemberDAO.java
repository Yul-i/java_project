package com.mega.mvc02;

//특정한 방법을 가지고 처리하는 파일 : 방법파일(Model, DAO)
public class MemberDAO {
	public void insert(MemberDTO dto) {
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		System.out.println(dto.getName());
		System.out.println(dto.getTel());
	}
}

package com.mega.mvc13;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	//기능별로 메서드로 정의한다.
	public void create(BbsDTO bbsDTO) {
		int result = my.insert("bbs.add", bbsDTO);
		System.out.println(result);
	}
	
	public BbsDTO read(BbsDTO bbsDTO) {
		BbsDTO dto = my.selectOne("bbs.one", bbsDTO);
		return dto;
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
}


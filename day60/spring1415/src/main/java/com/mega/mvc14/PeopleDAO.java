package com.mega.mvc14;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import oracle.net.aso.p;

@Repository
public class PeopleDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void create(PeopleDTO peopleDTO) {
		System.out.println(peopleDTO);
		int result = my.insert("people.create", peopleDTO); 
		System.out.println(result);
	}
	
	public PeopleDTO read(PeopleDTO peopleDTO) {
		System.out.println(peopleDTO);
		PeopleDTO dto = my.selectOne("people.one", peopleDTO);
		return dto;
	}
}

package com.mega.finance;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FinanceDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	public void insert(FinanceVO vo) {
		mybatis.insert("financeMapper.create", vo);
	}
	
}

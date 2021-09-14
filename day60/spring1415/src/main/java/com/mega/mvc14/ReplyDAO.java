package com.mega.mvc14;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReplyDAO {
	@Autowired
	SqlSessionTemplate my;
	
	// 기능별로 메서드!!!로 정의한다.
	public void create(ReplyDTO replyDTO) {
		System.out.println(replyDTO);
		int result = my.insert("reply.add", replyDTO);
		System.out.println(result);
	}

	public List<ReplyDTO> all(ReplyDTO replyDTO) {
		return my.selectList("reply.all", replyDTO);
	}


}

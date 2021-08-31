package com.mega.mvc09;

import org.springframework.stereotype.Repository;

@Repository
public class MovieDAO {
	public void pay() {
		System.out.println("결제처리를 DB에 저장함");
	}
}

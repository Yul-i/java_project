package com.mega.mvc07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//어노테이션 달아놓은 클래스들은 스프링 프로젝트에서 모두 다 싱글톤이다.
@Controller //어노테이션 Annotation
public class BbsController {
	
	//요청 되는 가상 주소는 중복되면 절대 안됨.
	@RequestMapping("bbs")
	public void bbs(BbsDTO dto, String date) {
		//컨트롤러의 입력값으로 넣은 변수는 프로토타입 변수
		//컨트롤러에서 받은거 확인 출력
		System.out.println("받아온 값 결과");
		System.out.println(dto);
		System.out.println(date);
	}
}

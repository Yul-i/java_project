package com.mega.mvc02;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	@RequestMapping("in.mega")
	public void insert(MemberDTO dto) {
		System.out.println("컨트롤러 메서드 호출됨.....!");
		System.out.println("컨트롤러에서 받은 id"+dto.getId());
		System.out.println("컨트롤러에서 받은 pw"+dto.getPw());
		System.out.println("컨트롤러에서 받은 name"+dto.getName());
		System.out.println("컨트롤러에서 받은 tel"+dto.getTel());
	}
	
	@RequestMapping("check.mega")
	public void check(MemberDTO dto) {
		System.out.println("컨트롤러 메서드 호출됨....!");
		System.out.println("컨트롤러에서 받은 id"+dto.getId());
		System.out.println("컨트롤러에서 받은 pw"+dto.getPw());
		//컨트롤러에서 처리를 한 후, 클라이언트에게 결과를 알려주어야 한다.
		//views 아래에 check.jsp로 만든다.
	}
}

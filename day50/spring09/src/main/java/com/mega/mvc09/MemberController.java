package com.mega.mvc09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//싱글톤 객체, 스프링에 컨트롤러로 등록
@Controller
public class MemberController {
	
	@Autowired //자동연결
	MemberDAO dao; //스프링이 만들어놓은 싱글톤 객체의 주소를 넣어준다.
	
	//요청 주소 하나당 메서드 하나
	@RequestMapping("login.mega")
	public String login(MemberDTO memberDTO) {
		System.out.println(memberDTO);
		System.out.println("싱글톤으로 만들어진 주소 프린트 : "+ dao);
		boolean result = dao.login(memberDTO);
		if (result) {
			return "ok"; //views/ok.jsp
		}else {
			return "no"; //vies/no.jsp
		}
	}	
	
	@RequestMapping("check.mega")
	public String check(String nick) {
		System.out.println(nick);
		boolean result = dao.check(nick);
		if (result) {
			return "super";
		}else {
			return "common";
		}
	}
	
	@RequestMapping("password.mega")
	public String pass(String pass) {
		System.out.println(pass);
		if (pass.equals("1234")) {
			return "pass";
		}else {
			return "redirect:index.jsp";
			//response.sendRedirect("index.jsp");
		}
	}
}

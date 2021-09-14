package com.mega.mvc14;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


//싱글톤 객체, 스프링에 컨트롤러로 등록
@Controller
public class MemberController {
	
	@Autowired //자동연결
	MemberDAO dao; //스프링이 만들어놓은 싱글톤 객체의 주소를 넣어준다.
	
	//요청 주소 하나당 메서드 하나
	@RequestMapping("login.mega")
	public String login(MemberDTO memberDTO, HttpSession session) {
		System.out.println(memberDTO);
		System.out.println("싱글톤으로 만들어진 주소 프린트 : "+ dao);
		boolean result = dao.login(memberDTO);
		if (result) {
			session.setAttribute("id", memberDTO.getId());
			//${id} : 세션출력;
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
	
	@RequestMapping("create.do")
	public void create(MemberDTO memberDTO) {
		System.out.println(memberDTO);
		dao.create(memberDTO);
	}
	
	@RequestMapping("list.mega")
	public void list(Model model) {
		List<MemberDTO> list = dao.list();
		model.addAttribute("list", list);
		System.out.println("회원 전체 수>>>"+list.size());
	}
	
	@RequestMapping("one.do")
	public void one(MemberDTO memberDTO, Model model ) {
		System.out.println(memberDTO.getId());
		MemberDTO dto = dao.read(memberDTO);
		//dto의 데이터는 views/one.jsp로 출력되어야 클라이언트에게 보인다.
		//model 속성을 이용하면 Controller->views 아래까지 데이터를 보내고, 사라진다.
		model.addAttribute("dto", dto);
	}
	
	@RequestMapping("del.do")
	public String delete(MemberDTO memberDTO) {
		int result = dao.delete(memberDTO);
		return "redirect:list.mega";
	}
	
	
	@RequestMapping("check2.mega")
	public void check(MemberDTO memberDTO, Model model) {
		System.out.println(memberDTO);
		String result = "중복된 아이디가 없습니다. 사용 가능합니다.";
		MemberDTO dto = dao.check2(memberDTO);
		if(dto!=null) {
			result = "중복된 아이디가 있습니다. 사용불가능 합니다.";
		}
		model.addAttribute("result", result);
	}
}

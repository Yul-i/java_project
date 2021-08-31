package com.mega.mvc09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@Autowired
	MovieDAO dao;
	
	@RequestMapping("movie.do")
	public String movie(String mvName, int mvCost) {
		System.out.println("영화 이름: "+mvName+", 가격 : "+mvCost);
		if (mvCost>=10000) {
			return "pay";
		}else {
			return "redirect:movie.jsp";
		}
	}
	
	@RequestMapping("pay.do")
	public void moviePay() {
		dao.pay();
	}
}

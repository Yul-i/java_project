package com.mega.boot03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo3Controller {
	
	@RequestMapping("hello2")
	public String call2(Model model) {
		model.addAttribute("result", "win");
		return "h2";
	}
	
	@RequestMapping("hello3")
	public String call3(Model model, String name) {
		model.addAttribute("result", name+"win");
		return "h3";
	}
	
	@RequestMapping("hello4")
	public String call4(Model model, VO vo) {
		model.addAttribute("result", vo);
		return "h4";
	}
}

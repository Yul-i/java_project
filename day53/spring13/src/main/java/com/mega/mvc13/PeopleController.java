package com.mega.mvc13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PeopleController {
	
	@Autowired
	PeopleDAO dao;
	
	@RequestMapping("success.dahaeng")
	public void join(PeopleDTO peopleDTO) {
		dao.create(peopleDTO);
	}
	
	@RequestMapping("peopleOne.dahaeng")
	public void read(PeopleDTO peopleDTO, Model model) {
		PeopleDTO dto = dao.read(peopleDTO);
		model.addAttribute("dto", dto);
		
	}
}

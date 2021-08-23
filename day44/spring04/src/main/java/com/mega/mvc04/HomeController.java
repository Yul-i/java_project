package com.mega.mvc04;

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
	@RequestMapping("create")
	public void create(BbsDTO dto) {
		System.out.println("전달된 번호 "+dto.getNo());
		System.out.println("전달된 제목 "+dto.getTitle());
		System.out.println("전달된 내용 "+dto.getContent());
		System.out.println("전달된 작성자 "+dto.getWriter());
	}
}

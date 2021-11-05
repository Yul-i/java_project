package com.mega.ourModule;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mega.myModule.BasicCal;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	BasicCal basic;
	
	@RequestMapping("home")
	public void call(Model model) {
		System.out.println("컨트롤러의 메서드 호출됨.");

		int result = basic.add(300, 400);
		model.addAttribute("result", result);
	}
	
}

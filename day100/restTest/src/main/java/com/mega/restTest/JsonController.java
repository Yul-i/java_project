package com.mega.restTest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {
	
	@Autowired
	SkiDAO dao;
	
	@RequestMapping("jsonResponse1")
	@ResponseBody
	public BookBag json1() {
		//db에서 row 1개를 가지고 와서
		//클라이언트에게 주고 싶은 경우
		BookBag bag = new BookBag();
		bag.setId("monday1");
		bag.setName("monday2");
		bag.setUrl("https://www.naver.com");
		bag.setImg("resources/img/photo1.jpg");
		return bag;
	}
	
	@RequestMapping("dbGo")
	public void dbGo(String name, String tel) {
		dao.insert(name, tel);
	}
	
	@RequestMapping("jsonResponse2")
	@ResponseBody
	public List<BookBag> json2() {
		//db에서 row 1개를 가지고 와서
		//클라이언트에게 주고 싶은 경우
		List<BookBag> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			BookBag bag = new BookBag();
			bag.setId("naver" + i);
			bag.setName("naver" + i);
			bag.setUrl("https://www.naver.com");
			bag.setImg("resources/img/photo1.jpg");
			list.add(bag);
		}
		return list;
	}
	

	
}

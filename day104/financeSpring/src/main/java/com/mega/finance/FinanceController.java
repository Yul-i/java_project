package com.mega.finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FinanceController {
	
	@Autowired
	FinanceDAO dao;
	
	
	@Autowired
	CrawlingStock stock;
	
	@RequestMapping("create.do")
	public void create(FinanceVO vo) {
		dao.insert(vo);
	}
	
	@RequestMapping("crawl.do")
	public void crawl(String code) {
		stock.crawl(code);
	}
}

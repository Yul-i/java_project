package com.mega.finance;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Component <-- Service, Repository, Controller...

@Service //싱글톤으로 만들어주는 역할! 
public class CrawlingStock {
	
	//code를 jsp에서 입력하여
	//controller로 넘겨서(controller)
	//크롤링을 해서(service layer, business layer) 
	//dao를 거쳐서(model layer)
	//db로 들어가자!!
	
	@Autowired
	FinanceDAO dao;
	
	public void crawl(String code) {
		//크롤링하여 dao이용하여 바로 db에 넣어버리자
		//dao.insert("finance.create", vo);
		
		//크롤링 하는 과정 코딩하면 됨
		//1. 연결해라, html을 가지고 와라
		String url = "https://finance.naver.com/item/main.naver?code="+code;
		try {
			Document doc = Jsoup.connect(url).get();
			//System.out.println(doc);
			Elements company = doc.select(".wrap_company>h2>a");
			//System.out.println(company.get(0).text());
			Elements today = doc.select(".no_today>.no_up>span.blind");
			//System.out.println(today.get(0).text());
			Elements yesterday = doc.select("td.first>em>span.blind");
			//System.out.println(yesterday.get(0).text());
			Elements high = doc.select("td.first+td>em>span.blind");
			//System.out.println(high.get(0).text());
			
			FinanceVO vo = new FinanceVO();
			vo.setCode(code);
			vo.setCompany(company.get(0).text());
			vo.setToday(today.get(0).text());
			vo.setYesterday(yesterday.get(0).text());
			vo.setHigh(high.get(0).text());
			
			dao.insert(vo);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2. 가지고 온 html에서 추출해라.
		//3. 내가 원하는 형태로 가공해라(vo)
	}
}

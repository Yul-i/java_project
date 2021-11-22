package com.mega.finance;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test {
	
	
	public Test(String code) {
		//크롤링 하는 과정 코딩하면 됨
		//1. 연결해라, html을 가지고 와라
		String url = "https://finance.naver.com/item/main.naver?code="+code;
		try {
			Document doc = Jsoup.connect(url).get();
			//System.out.println(doc);
			Elements company = doc.select(".wrap_company>h2>a");
			System.out.println(company.get(0).text());
			Elements today = doc.select(".no_today>.no_up>span.blind");
			System.out.println(today.get(0).text());
			Elements yesterday = doc.select("td.first>em>span.blind");
			System.out.println(yesterday.get(0).text());
			Elements high = doc.select("td.first+td>em>span.blind");
			System.out.println(high.get(0).text());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2. 가지고 온 html에서 추출해라.
		//3. 내가 원하는 형태로 가공해라(vo)
		
	}
	
	public static void main(String[] args) {
		new Test("035720");
	}

}

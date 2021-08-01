package 크롤링;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements; //tag가 담긴 arrayList

public class W3Schools크롤링테스트 {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://www.w3schools.com/tags/default.asp").get();
			System.out.println("1. 사이트 연결 성공@@@");
			System.out.println("2. 소스 받아오기 성공@@@");
//			System.out.println(doc);
			//Element : tag
			//Elements : tags
			Elements list = doc.select("div.w3-bar a.w3-bar-item");
			System.out.println(list.size());
//			System.out.println(list);
//			for (Element tag : list) {
//				System.out.println(tag.text());
//			}			
			
			for (int i = 9; i < list.size(); i++) {
				Element aTag = list.get(i);
				System.out.println(aTag.text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

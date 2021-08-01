package 크롤링;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements; //tag가 담긴 arrayList

public class 네이버메인크롤링테스트 {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://www.naver.com").get();
			System.out.println("1. 사이트 연결 성공@@@");
			System.out.println("2. 소스 받아오기 성공@@@");
//			System.out.println(doc);
			//Element : tag
			//Elements : tags
			Elements list = doc.select("a.nav");
			System.out.println(list.size());
//			System.out.println(list);
			for (Element tag : list) {
				System.out.println(tag.text());
//				System.out.println(tag.attr("href"));
			}
			
			Element aTag0 = list.get(0);
			Elements list2 = aTag0.select("i");
			System.out.println(list2.get(0));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

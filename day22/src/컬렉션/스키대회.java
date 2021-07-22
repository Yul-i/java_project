package 컬렉션;

import java.util.ArrayList;
import java.util.Iterator;

public class 스키대회 {

	public static void main(String[] args) {
		// 스키대회 
		
		ArrayList ski = new ArrayList();
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		System.out.println(ski);
		ski.remove(1);
		System.out.println(ski);
		
		for (int i = 0; i < ski.size(); i++) {
			System.out.println(i+1+"등 : "+ski.get(i));
		}
		
//		for (Object o : ski) {
//			System.out.println(o);
//		}

	}

}

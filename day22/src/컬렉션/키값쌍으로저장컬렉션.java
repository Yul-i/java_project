package 컬렉션;

import java.util.HashMap;

public class 키값쌍으로저장컬렉션 {

	public static void main(String[] args) {
		HashMap dic = new HashMap();
		//키는 중복되면 안되고 value 는 중복되어도 됨
		dic.put("사과", "apple");
		dic.put("바나나", "banana");
		dic.put("멜론", "melon");
		System.out.println(dic);
//		dic.clear();//다 지워용
		System.out.println(dic.size());
		System.out.println(dic.get("사과"));
		dic.put("사과", "blueApple");
		System.out.println(dic.get("사과"));
		dic.remove("멜론");
		System.out.println(dic);

	}

}

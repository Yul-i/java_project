package 컬렉션;

import java.util.HashMap;

public class 폰단축키 {

	public static void main(String[] args) {
		HashMap phoneNum = new HashMap();
		phoneNum.put("1번", "엄마");
		phoneNum.put("2번", "아빠");
		phoneNum.put("3번", "친구");
		phoneNum.put("4번", "동생");
		System.out.println("2번에 저장된 가족: "+phoneNum.get("2번"));
	}

}

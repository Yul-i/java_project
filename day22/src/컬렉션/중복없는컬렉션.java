package 컬렉션;

import java.util.HashSet;

public class 중복없는컬렉션 {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("볼펜");
		bag.add("휴지");
		bag.add("휴대폰");
		bag.add("볼펜");
		System.out.println(bag.size());
		//toString에 오버라이드 되어있어서 참조형인데도 주소가 안뜨고 들어가있는 데이터가 뜬다.
		System.out.println(bag);
		for (Object object : bag) {
			System.out.println(object);
		}
	}

}

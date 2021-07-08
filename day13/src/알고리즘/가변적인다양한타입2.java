package 알고리즘;

import java.util.ArrayList;
import java.util.HashSet;

public class 가변적인다양한타입2 {

	public static void main(String[] args) {
//		1. 동계 올림픽 피겨 순위
//		1위 : 김연아
//		2위 : 김영아
//		3위 : 김양아
//		4위 : 김용아

		ArrayList arr = new ArrayList();
		arr.add("김연아");
		arr.add("김영아");
		arr.add("김양아");
		arr.add("김용아");
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println((i+1)+"위: "+arr.get(i));
		}
		
//		4위가 반칙을 해서 탈락함
//		전체 명단을 다시 프린트
		
		arr.remove(3);
		for (int i = 0; i < arr.size(); i++) {
			System.out.println((i+1)+"위: "+arr.get(i));
		}
		
//		2.아침에 가방에 넣은 물건들. 가방이 무거워지면 안되니까
//		하나만 넣으려고 함
//		내 가방은 같은 물건이 하나이상 들어가지 않음.
//		실제로 내가 넣은 것  : 휴지, 휴대폰, 볼펜, 휴지
//		내 가방에 들어간 물건의 개수와 물건들을 쓰시오.
		
		HashSet arr2 = new HashSet();
		
		arr2.add("휴지");
		arr2.add("휴대폰");
		arr2.add("볼펜");
		arr2.add("휴지");
		
		System.out.println("가방의 물건 개수 : "+arr2.size());
		System.out.println("가방 물건 : "+arr2);
		

	}

}

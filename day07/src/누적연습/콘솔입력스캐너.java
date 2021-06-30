package 누적연습;

import java.util.*;
//import java.util.*; //*은 모든 것, 임포트 할때 
// java.util.a.Test //이거꺄지 * 인식 못해서 따로 써줘야댕 하위 패키지는 다시 써줘야함

public class 콘솔입력스캐너 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//scanner은 자바 유틸리티다.
		System.out.print("당신의 이름을 입력해주세요.>");
		String name = sc.next(); //String 입력(공백이 있으면 뒤는 무시해버림:단어)
		System.out.print("당신의 소속을 입력해주세요.>");
		String team = sc.next();
		System.out.println("당신의 이름은 : "+name);
		System.out.println("당신의 소속은 : "+team);
		
	}

}

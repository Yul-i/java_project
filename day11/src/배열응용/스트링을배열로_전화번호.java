package 배열응용;

import java.util.Scanner;

public class 스트링을배열로_전화번호 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		전화번호입력>>    011-245-1234   
		System.out.print("전화번호입력>> ");
		String phone = sc.next();

//		1) 양쪽 공백을 제거하시오.
		String phone2 = phone.trim();
//		2) -를 기준으로 분리해내세요(String[])
		String[] phone3 = phone2.split("-");

//		3) 첫번째 문자열이 011이면 SK, 019이면 LG, 나머지이면 Apple
		if (phone3[0].equals("011")) {
			System.out.println("SK입니다.");
		} else if (phone3[0].equals("019")) {
			System.out.println("LG입니다.");
		} else {
			System.out.println("Apple 입니다.");
		}
//		4) 두번째 문자열의 길이가 4개이상이면 최신폰, 아니면 올드폰
		if (phone3[1].length() >= 4) {
			System.out.println("최신폰입니다.");
		} else {
			System.out.println("올드폰입니다.");
		}
//		5) 전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호
//	                    	  아니면 유효하지 않은 전화번호.
		int num = 0;
		for (int i = 0; i < phone3.length; i++) {
			num = num+phone3[i].length();
		}
		if (num >= 10) {
			System.out.println("유효한 전화번호.");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
		sc.close();
	}

}

package 복습;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class 부품사용방법 {

	public static void main(String[] args) {// start해! 라는 개념이라 void = 반환이 없다.
		// 망치
		// 너무 자주 사용하여 RAM에 이미 들어가있음.
		// 클래스 이름으로 바로 사용가능.
		// Integer, Double, System, JOptionPane 등등
		// 기능을 가진 부품을 선택 - 선택의 기준 : 기능을 가지고 있는지 여부
		// 함수를 가지고 있는 부품을 선택

		// 벽돌
		// Date name;
		// name = new Date();

		// Date라는 부품을 복사해서 램에 변수를 만들어 저장해둔다.
		// cpu는 모든 부품을 램에 가져다 놓고 조립한다.
		// Date date; => 저장된타입 변수명;(선언:램에 저장공간을 만드는 것.)
		Date date = new Date();// 보통 클래스명은 대문자니 소문자 명으로 바꿔서 쓰는걸 권장함
//		Random r = new Random();
//		Scanner sc = new Scanner(System.in);

		int hour = date.getHours(); // 10
		System.out.println("현재 시각은 " + hour + "시");

		// 반환값이 있는 함수가 있고 없는게 있다.
		// 반환을 return 이라고 부른다.
		// 반환이 있는 함수만 프린트가 가능하다.
		System.out.println(date.getMinutes());// 계속 반복해서 쓸거면 변수에 담는거지 문제가 되는건 없음
//		System.out.println(System.out.println());
		// 반환이 없는 경우에는 void라고 써있다. void = 없다.

		int month = date.getMonth() + 1;
		String result = "해당 계절이 없습니다.";

		if (month == 3 || month == 4 || month == 5) {
			result = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			result = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			result = "가을";
		} else {
			result = "겨울";
		}

		System.out.println(result);

		System.out.println("=====================================================");

		int day = date.getDay();// 요일
		if (day == 0 || day == 6) {// if문에는 자체 break가 있다. while은 없음.
			System.out.println("주말에는 놀아요.");
		} else {
			System.out.println("주중에는 달려요.");
		}

		while (true) {// break가 없어서 자동으로 1-2-3-1-2-3 무한루프
			System.out.println("달려요!! 달려!!"); // 1
			System.out.println("또 달려요!"); // 2
			System.out.println("마지막 달려요!!"); // 3
			break;
		}

		
		//정수 지원함(int), 문자1, String 지원함 - 실수는x 
		switch (month) {// 얘도 while처럼 break 써줘야 멈춤, 반드시 넣어줘야 함.
		case 3:
		case 4:
		case 5:
			System.out.println("봄 입니다.");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println("여름 입니다.");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println("가을 입니다.");
			break;

		default:// else
			System.out.println("겨울 입니다.");
			break;
		}
		
		
		switch (month) {
		case 2:
			System.out.println("28일까지 있는 달");
			break;

		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일까지 있는 달");
			break;

		default://else가 없으면 안써도 됨
			System.out.println("30일까지 있는 달");
			break;
		}

	}

}

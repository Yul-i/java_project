package 문제풀이;

import java.util.Date;

public class 시간구하기 {

	public static void main(String[] args) {
		// 시간을 구해보세요
		Date date = new Date();
		//10시 전이면 굿모닝
		// 15시 전이면 굿 애프터눈
		// 20시 전이면 굿 이브닝
		// 나머지는 굿나잇
		
		int hour = date.getHours();
		
		if(hour<10) {
			System.out.println("굿 모닝");
		}else if (hour<15) {
			System.out.println("굿 애프터눈");
		}else if (hour<20) {
			System.out.println("굿 이브닝");
		}else {
			System.out.println("굿 나잇");
		}
		
		//요일이 토/일이면 쉬어요.
		//나머지 요일이면 달려요.
		
		int day = date.getDay();
		
		if (day==0||day==6) {
			System.out.println("쉬어요");
		}else {
			System.out.println("달려요.");
		}
		
		//월이 3-5이면 봄
		//6-8이면 여름
		//9-11 이면 가을
		//나머지면 겨울
		
		int month = date.getMonth()+1;
		
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}

	}

}

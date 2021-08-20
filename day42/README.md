## 자바 복습 연습문제


```java
package test;

import java.util.Random;
import java.util.Scanner;

public class 문제풀이1 {
	
	//주민등록번호를 만들어서 리턴할 메서드
	public static String make() {
		Random r = new Random();
		int year = r.nextInt(100); //년 0~99
		int month = r.nextInt(12)+1; //달 1~12
		int num = 0; //각 달의 마지막 일이 담길 변수
		switch (month) {//달 값 받으면 해당 일자 세기
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			num = 31;
		case 4: case 6: case 9: case 11:
			num = 30;
		case 2:
			num = 28;
		}
		int day = r.nextInt(num)+1;//일 1~31
		
		String year1 = null;
		String month1 = null;
		String day1 = null;
		String back = null;

		//주민등록번호 만들기(뒷자리&연도)
		if (year<22) {//2000~2021 년생
			back = Integer.toString(r.nextInt(2000000)+3000000);//3000000~4999999 까지 생성
			if (year<10) {//연도갸 10 미만이라면 스트링으로 변환 후 0을 앞에 붙여준다.
				year1 = '0'+Integer.toString(year);
			}else {//연도갸 10 이상이라면 스트링으로 변환 한다.
				year1 = Integer.toString(year);
			}
		}else {//1922~1999 년생
			back = Integer.toString(r.nextInt(2000000)+1000000); //1000000~2999999 까지 생성
			year1 = Integer.toString(year); //연도를 스트링으로 변환 한다.
		}
		
		//주민등록번호 만들기(월)
		if (month<10) {//월이 10 미만이라면 스트링으로 변환 후 0을 앞에 붙여준다.
			month1 = '0'+ Integer.toString(month);
		}else {//월이 10 이상이라면 스트링으로 변환 한다.
			month1 = Integer.toString(month);
		}
		
		//주민등록번호 만들기(일)
		if (day<10) {//일이 10 미만이라면 스트링으로 변환 후 0을 앞에 붙여준다.
			day1 = '0'+ Integer.toString(day);
		}else {//일이 10 이상이라면 스트링으로 변환 한다.
			day1 = Integer.toString(day);
		}
		
		//주민등록번호를 하나의 스트링으로 만들어준다.
		String rrn = year1+month1+day1+"-"+back;
		
		//위의 스트링을 리턴한다.
		return rrn;
	}
	

	public static void main(String[] args) {
		//입력은 스캐너 모듈로 받을 것이다.
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 주민등록 번호를 생성하시겠습니까?>>");
		int amount = sc.nextInt();//주민등록번호 갯수
		String[] bag = new String[amount];//주민등록번호 갯수만큼 크기를 정해서 배열을 생성해준다.
		
		//배열에 주민등록번호를 하나씩 넣어줄 for문
		for (int i = 0; i < amount; i++) {//주민등록번호 갯수만큼 돈다.
			String rrn1 = make();//make()메서드를 실행해서 스트링으로 주민등록번호를 받아온다.
			System.out.println(rrn1);
			bag[i]=rrn1;//배열의 index에 주민등록번호를 담는다.
		}
		
		
		int MCount = 0; //남자 수를 누적시킬 변수
		int WCount = 0; //여자 수를 누적시킬 변수
		char genderCount = '\u0000'; //성별 구분해줄 변수
		
		// 성별 계산
		for (int i = 0; i < bag.length; i++) {//배열의 크기만큼 실행한다.
			genderCount = bag[i].charAt(7) ;//배열에 담긴 주민등록번호가 String형태라 7번째 index를 char형태로 뽑는다.
			if (genderCount=='1'||genderCount=='3') {//1, 3이라면 남자 카운트가 오른다
				MCount++;
			}else if(genderCount=='2'||genderCount=='4'){//2, 4라면 여자 카운트가 오른다.
				WCount++;
			}
		}
		
		char townCount = '\u0000'; //지역 구분해줄 변수
		int seoul = 0; //서울 누적시킬 변수
		int busan = 0; //부산 누적시킬 변수
		int jeju = 0; //제주 누적시킬 변수
		int other = 0; //기타 지역 변수
		
		//지역 계산
		for (int i = 0; i < bag.length; i++) {//배열의 크기만큼 실행한다.
			townCount =	bag[i].charAt(8) ;//배열에 담긴 주민등록번호가 String형태라 8번째 index를 char형태로 뽑는다.
			if (townCount=='1') {//1이라면 서울 카운트가 오른다.
				seoul++;
			}else if (townCount=='2') {//2라면 부산 카운트가 오른다.
				busan++;
			}else if (townCount=='3') {//3이라면 제주 카운트가 오른다.
				jeju++;
			}else {//그 외 숫자는 기타 지역 카운트가 오른다.
				other++;
			}
		}
		
		System.out.println("총 "+bag.length+"명 중,");
		System.out.println("남자는 "+MCount+"명 이고, 여자는 "+WCount+"명 입니다.");
		System.out.println("서울 "+seoul+"명 이고, 부산 "+busan+"명 이고, 제주 "+jeju+"명 이고, 기타 지역 "+other+"명 입니다.");
		
		
	}

}

```

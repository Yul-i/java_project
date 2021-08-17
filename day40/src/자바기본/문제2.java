package 자바기본;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		//가게에서 영업을 하는데 코로나로 5인 이상 출입하면 당신은 벌금을 물게 됩니다.
		//방역을 위해서 5인 이상 출입을 막고,
		//입장 가능한 사람들은 대표자 이름을 남기도록 합시다.
		Scanner sc = new Scanner(System.in);//스캐너 객체 부르기
		String[] name = new String[5];//배열은 자동 초기화
		for (int i = 0; i < 5; i++) {
			System.out.print("몇분이세요?>>");
			int count = sc.nextInt();//String으로 받아서 int로 변환
			if(count>=5) {//5명 이상이면 내보내자.
				System.out.println("인원수 제한에 걸리셨습니다. 나가세요.");
				name[i] = "출입불가";	//출입 불가 기록을 하였다.
			}else {//5명 아래라면
				System.out.println("대표 1명 출입자 명부를 작성해주세요.");
				System.out.print("이름 >>");
				String name1 = sc.next();//String으로 받는다.
				name[i] = name1;				
			}
		}
		
		System.out.println("오늘의 출입 명단");
		for (int j = 0; j < name.length; j++) {
			System.out.print(name[j]+ " ");//명단 출력
		}
	}

}

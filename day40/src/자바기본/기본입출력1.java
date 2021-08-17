package 자바기본;

import java.awt.print.Printable;
import java.util.Scanner;

public class 기본입출력1 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			//콘솔과 자바프로그램간 입력 스트림(입력용 연결 통로)이 만들어진다.
			//기본 생성자는 클래스 이름과 동일한 이름을 가진 파라메터없는 생성자메서드
			//객체 생성시 꼭 처리해야할 것이 있으면 생성자 메서드에 정의해서 꼭 실행하도록 함
			//변수 초기화 많이 함.
			//생성자는 대문자로 시작하는 유일한 메서드(o)
			//에러의 원인 ) 기본생성자를 만들어두지 않았기 때문에 호출할 수 없음
			//기본 생성자는 자동으로 생성됨
			//단) 다른 파라메터 있는 생성자가 없는 경우에만!!!
			//어떤 생성자들이 있는지 알고 싶은 경우
			//1) 컨트롤+클릭을 해본다.
			//2) 자동완성 기능을 사용해본다.
			//오늘 온도는 몇도인가요?
			System.out.print("오늘 온도는 몇도인가요?>>");
			//CPU의 구성 (연산+제어+저장)
			//변수에 넣어서, 30도 이상이면 너무 더워요.
			//			그 미만이면 괜찮아요!
			int todayTemp = sc.nextInt();//모든 외부 입력은 모두다 String -> int로 변환!  //"33"->33
			//====1=======2=====3=======
			//1) 변수 선언 : 변수 만들어 짐
			//3) 입력 값을 String으로 받아서 정수로 변환
			//2) 변환한 정수값을 변수에 저장
			if (todayTemp >= 30) {
				System.out.println("너무 더워요.");
			} else {
				System.out.println("괜찮아요!");
			} 
		}
		sc.close(); //입력스트림 닫는다.
	}

}

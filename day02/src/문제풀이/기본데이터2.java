package 문제풀이;

public class 기본데이터2 {

	public static void main(String[] args) {
		// 기본데이터2를 생성
		// 색을 저장(r)
		// 호실을 저장(709)
		// 평균나이를 저장(27.5)
		// -----------------------------------
			// 예약어는 저장공간의 공간을 쓸 수 없다.
			// char, int, class...		
		
		// 1. 선언
		// color = 'ㅅ'; //변수가 선언되지 않아 값을 대입할 수 없다.
			char color;
			int num;
			double avgAge; //낙타표기법=카멜표기법, avg_age(파이썬, 뱀표기법=스네이크표기법)
			
		// 2. 대입
			color = 'r';
			num = 709;//계산을 안해도 되는 숫자는 int로 잡기 좀 그래(ex, 전화번호)
			avgAge = 27.5;
			//변수(variable, 값이 변한다) : 램에 저장공간에 들어갈 값은 변할 수 있다.
			//램에 만들어지는 저장공간을 변수라고 부른다.
			
			color = 'b';
			//변수 하나에는 값이 하나만 저장 된다. 여러개 저장x
			
		// 3. 출력
			System.out.println("색은 "+color); //결합연산자		
			System.out.println("방번호는 "+num+"호");
			// 한 줄 복사 : ctrl+alt+화살표아래키
			// 한 줄 이동 : alt+방향키
			// 한 줄 삭제 : ctrl+d
			System.out.println("평균나이는 "+avgAge+"세 입니다.");
		// 4. 그림
		

	}

}

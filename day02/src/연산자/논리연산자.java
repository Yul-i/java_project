package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		// 논리연산자, 조건이 여러개 있을 때 판단의 기준
		// 조건이 모두 만족해야 true(and 조건, &&)
		// 조건이 하나만 만족해도 true(or 조건, ||)
		// 조건에 해당되지 않을 때 true(not 조건, !)

		// 자바에서 비교연산자로 비교가능 한 것은 기본데이터만 제공!
		// String은 연산자로 비교가 불가능하다

		// 입력데이터
		int id = 1111; // 회원가입은 1111
		int pw = 2222; // 회원가입pw는 2000

		System.out.println(id == 1111);
		System.out.println(pw == 2000);
		System.out.println(id == 1111 && pw == 2000);

		int manager1 = 5555;
		int manager2 = 4444;
		System.out.println(manager1 == 5555 || manager2 == 4000);
		// 컨트롤 + 쉬프트 + f : 자동 포맷팅(코드 정리)

	}

}

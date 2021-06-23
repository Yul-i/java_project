package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// 산술연산자 : 사칙연산자(+, -, *(아스테르크), /), %(나머지)
		int x = 100;
		int y = 200;
		 
		//괄호로 우선순위 주기
		//구분하기 쉽게 명시적으로 표시해주기도 한다.
		System.out.println("두 수의 합은 " + (x + y));
		System.out.println("두 수의 차는 " + (x - y));
		System.out.println("두 수의 곱은 " + (x * y));
		System.out.println("두 수의 나눗셈은 " + (x / y));
		System.out.println("두 수의 나머지는 " + (x % y));

	}

}



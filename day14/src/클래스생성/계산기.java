package 클래스생성;

public class 계산기 {
	public void order(String food) {
		System.out.println("당신이 주문한 것은 "+food+"입니다.");
	}
	// 사직연산 계산기
	public void 더하기(int sum1, int sum2) {
		System.out.println("더하기 기능 처리");
		int result = sum1 + sum2;
		System.out.println("두 수의 합의 결과는 "+ result);
	}

	public void 빼기() {
		System.out.println("빼기 기능 처리");
	}

	public void 곱하기(int price, int count) {
		System.out.println("곱하기 기능 처리");
		int result = price * count;
		System.out.println("두 수의 곱의 결과는 "+ result);
	}

	public void 나누기(double sum1, double sum2) {
		System.out.println("나누기 기능 처리");
		double result = sum1 / sum2;
		System.out.println("두 수의 나누기의 결과는 "+ result);
	}
}

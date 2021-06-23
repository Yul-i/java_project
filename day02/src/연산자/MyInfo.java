package 연산자;

public class MyInfo {//public 접근제한자

	public static void main(String[] args) {
		// 나에 대한 정보
		// 내 이름, 나이, 내 몸무게, 성별, 점심	먹었나요?
		// 부품은 무조건 대문자.		
		String name = "홍길동"; //스트링(문자열)
		int age = 100;
		double weight = 99.9;
		char gender = 'F';
		boolean food = true; //false, 부울렌
		
		System.out.println(name);
		System.out.println(weight);
		System.out.println(age+1);
		
		weight = weight-10;//변수 수가 바뀔때 대입 연산자를 사용해야 변수 값이 변한다.
		System.out.println(weight);
	}

}

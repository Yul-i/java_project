package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		// 비교연산자 : ==(같다), !=(다르다), >(초과,미만), >=(이상,이하)
		// 비교결과가 중요(논리데이터, boolean, true/false)
		int x = 100;
		int y = 200;
		 
		//괄호로 우선순위 주기
		//구분하기 쉽게 명시적으로 표시해주기도 한다.
		System.out.println(x==y);//false
		System.out.println(x!=y);//true
		System.out.println(x>=y);//false
		System.out.println(x>y);//false
		System.out.println(x<y);//true

	}

}



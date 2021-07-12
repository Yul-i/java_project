package 메서드반환값;

public class 계산기 {
	// 성질 : 멤버 변수
	// 동작 : 멤버 메서드(*)
	
	//cal.add(100, 200)
	//기능정의, 함수정의, 메서드 정의
	//x, y는 지역변수, add안에서만 사용 가능
	//메서드 사용(호출, call, 콜)
	//메서드 안에서 값을 전달할 목적으로 생성되는 변수 =>
	//x, y: 매개변수, parameter(파라메터)
	//void 없다라는 의미, 반환값이 없다.
	// add -> main
	public int add(int x, int y) {
		int result = x + y;
		System.out.println("두 수의 합은 "+ result);
		return result;//반환시 return이라고 꼭 써줘야 함.
		
		//리턴 하다 : 처리한 값을 다음 처리 할 때 다시 가져와야 할 때. 
	}
}

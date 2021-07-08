package 클래스생성;

public class Car {
	//전역변수(Global, 글로별 변수)<->지역변수(local, 자동 초기화 안됨, 메모리 위치 다름)
	//(모델링)
	// 성질 => 변수로 만든다. 멤버변수
	// 색(color), 바퀴수(count)
	public String color; //클래스 밑에 만들어지면 자동 초기화 됨 null
	public int count;//자동초기화 0
	
	// 동작 => 멤버메서드
	public void run() {//메서드
		//함수의 기능을 정의
		System.out.println("네 바퀴로 달리자.");
	}
	
	public void up() {
		System.out.println("속도를 20씩 높이자.");
	}
}

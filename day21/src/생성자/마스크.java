package 생성자;

public class 마스크{
	//속성 => 멤버변수
	//색, 가격
	//자동 초기화
	String color;//참조형 변수는 null
	int price;//기본형 변수는 0
	
	//객체 생성시 클래스이름과 동일한 것이 있으면 자동호출
	//객체 생성시 넣어주어야 하는 처음값을 넣어주기 위해 사용
	//생성자 메서드 => 생성자
	public 마스크(String c, int p) {
		color = c;
		price = p;
	}
	
	//동작 => 멤버 메서드
	public void cover() {
		System.out.println("마스크쓰다. ");
	}
	
	
	public String toString() {
		return color + " " + price;
	}
}
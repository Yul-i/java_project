package shop.db;

public class 회원DAO {
	
	//메서드(변수들) : 메서드를 호출할 때 값을 전달하게 되는데 이 전달된 값들을
//				   중간에 저장할 목적으로 매개체 역할을 해주는 변수(매개변수, parameter)
	public void create(String id, String pw, String name, String tel) {
		//매서드 안에서 만들어진 변수
		//변수는 "타입 변수명;" 만들어 짐(선언)
		//선언의 위치가 변수의 생존범위를 결정함.
		//파라메터는 지역변수이다. 이 지역을 벗어나서는 사용 불가능.
		//지역변수는 자동초기화x, 쓰레기값 들어있는 상태!
		System.out.println("전달된 id는 "+id);
		System.out.println("전달된 pw는 "+pw);
		System.out.println("전달된 name는 "+name);
		System.out.println("전달된 tel는 "+tel);
	}
	
	
	//하나의 이름으로 메서드 이름을 쓸 수 있다
	//입력값의 형태가 다양한 형태이어야 한다.
	//다형성(오버로딩)
	public void read(String id) {
		
	}
	
	public void read() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
}

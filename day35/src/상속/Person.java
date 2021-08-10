package 상속;

public class Person extends Object {
	//상태(속성), 멤버변수
	String name;
	int age;
	
	//기본 생성자는 다른 생성자 메서드가 없으면 자동 생성되지만,
	//			다른 생성자 메서드가 있으면 자동 생성되지 않는다.
	// 생성자를 사용하는 이유
	// 1. 객체 생성시 자동 호출 되므로, 생성할 때 자동으로 꼭 실행해주고 싶은 부분이 있으면
	//	  생성자에 넣어주면 자동 실행됨.
	// 2. 객체생성시 입력값에 대한 제약조건을 걸고 싶은 경우
	public Person() {
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//동작, 멤버메서드를 정의
	
	public void think() {
		System.out.println("생각하다.");
	}
	
	public void tool() {
		System.out.println("도구를 이용하다.");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
		
}

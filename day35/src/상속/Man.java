package 상속;

//Person 클래스를 확장해서(상속, 재사용) Man 클래스를 정의하겠다.
//			Man extends Person			
public class Man extends Person{
	//멤버변수 2개 
	//멤버 메소드 2개
	
	int power;
	
	//생성자가 하나도 정의되어 있지 않으면, 기본 생성자가 자동으로 만들어진다.
	//public Man(){
	//	}
	public void run() {
		System.out.println("빨리 달리다.");
	}

	@Override
	public String toString() {
		return "Man [power=" + power + ", name=" + name + ", age=" + age + "]";
	}
}

package com.mega.mvc07.test;

public class BoyMain2 {

	public static void main(String[] args) {
		Boy2 b1 = Boy2.getInstance();
		Boy2 b2 = Boy2.getInstance();
		
		System.out.println("생성된 객체 수 : "+Boy2.count);
		//22.메서드를 부를때마다 객체를 생성하면 메모리를 많이 잡아 먹게 된다.
		//boy1의 메서드는 2x8+4 = 20byte
		//boy2의 메서드는 1x8+4 = 12byte
		//23. 싱글톤 패턴은 어떤 클래스가 최초에 한번만 메모리를 할당하고 그 메모리에 인스턴스를 만들어 사용하는 디자인 패턴인데, 
		// 	  DTO는 객체 하나하나를 담기위한 수단(프로토는 사용하고 버릴수있는데)
		//    DAO는 데이터를 조작하는 객체이므로 속성이 변경되거나 하는 일이 없음.(싱글톤은 서버가 살아있는 한 싱글톤 계속 살림)
		//싱글톤 꼭 해줘야 하는것 DAO, 컨트롤러
	}

}

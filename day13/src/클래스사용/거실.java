package 클래스사용;

import 클래스생성.Dog;
import 클래스생성.Phone;

public class 거실 {

	public static void main(String[] args) {
		Phone phone = new Phone();
		Dog dog = new Dog();
		
		phone.os = "android";
		phone.series = 9;
		
		System.out.println("쓰고있는 폰 os는 "+phone.os+"입니다.");
		System.out.println("폰 기종은 갤럭시 "+phone.series+" 입니다.");
		phone.ring();
		phone.message();
		
		dog.kinds = "골든리트리버";
		dog.many = 3;
		
		System.out.println("강아지 종은 "+dog.kinds+" 입니다.");
		System.out.println("개가 "+dog.many+"마리 있습니다.");
		dog.bark("왈왈");
		dog.eat("시저");

	}

}

package 클래스사용;

import 클래스생성.Labtop;

public class 니거실 {

	public static void main(String[] args) {
		Labtop labtop = new Labtop();
		
		labtop.kinds = "SAMSUNG";
		labtop.size = 14;
		labtop.color = "silver";
		labtop.adapter = false;
		
		System.out.println("노트북 만든 회사는 "+labtop.kinds+"입니다.");
		System.out.println("노트북의 사이즈는 "+labtop.size+"인치 입니다.");
		System.out.println("노트북의 색깔은 "+labtop.color+"색 입니다.");
		System.out.println("노트북에 충전기 on/off 상태: "+labtop.adapter);
		
		labtop.전원on();
		labtop.충전on();
		labtop.충전off();
		labtop.전원off();
	}

}

package 컬렉션;

import java.util.ArrayList;

import javax.swing.JFrame;

public class 순서있는목록 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(100); //기본형 -> 클래스 변환 -> Object
		list.add(22.22);
		list.add(true);
		list.add('남');
		list.add(new JFrame());
		System.out.println(list.size());//6
		System.out.println(list);//원래 주소가 찍혀야 하지만 안의 구성이 보이도록 오버라이딩 되었다.
		System.out.println(list.get(0));
		System.out.println(list.get(5));
		list.add("목요일");
		System.out.println(list.size());//7
		list.remove(5);
		list.remove("홍길동");//안의 값으로도 지울 수 있음 댑악
//		list.remove(new Integer(100));//100 지울 때
		System.out.println(list.size());//5
		System.out.println(list.get(0));
		list.add(0, "김길동");//0번 앞에 넣어라
		System.out.println(list);
		list.set(0, "홍길동");
		System.out.println(list);
		
	}
	

}

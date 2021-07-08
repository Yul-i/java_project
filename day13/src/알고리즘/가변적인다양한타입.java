package 알고리즘;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class 가변적인다양한타입 {

	public static void main(String[] args) {
		//set : 집합, 중복된 값 허용하지 x
		HashSet set = new HashSet();
		set.add("");
		set.add(100);
		set.add(200);
		set.add(100);
		System.out.println(set.size());
		System.out.println(set);//주소대신에 내부 값이 보이게 만들어놔서 굳이 for문 안돌려도 보임
		
		
		ArrayList list = new ArrayList();
		//많은 양의 데이터를 다룰 때, 가변, 다양한 데이타인 경우 사용
		//Object
		list.add(100);
		list.add(100.33);
		list.add(true);
		list.add('a');
		list.add("감자");
		
		Random r = new Random();
		list.add(r);
		
		//값 가져올때는 .get()
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
//		System.out.println(list.get(5));
		
		//크기는 .size()
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+": "+list.get(i));
		}
		
		//삭제는 .remove()
		list.remove(5);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+": "+list.get(i));
		}
		
		
		

	}

}

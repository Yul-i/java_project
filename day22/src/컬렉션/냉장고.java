package 컬렉션;

import java.util.LinkedList;

public class 냉장고 {

	public static void main(String[] args) {
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		System.out.println("현재 냉장고 : "+ milk);
		milk.remove();
		System.out.println("현재 냉장고 : "+ milk);
	}

}

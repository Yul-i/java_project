package 문제풀이;

import java.util.Random;

public class 수능문제 {

	public static void main(String[] args) {
		int[] jumsu = new int[10000];
		Random r = new Random(5);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(331);
		}
		//1. 수능 만점자는 몇명일까요?
		int count = 0;
		for (int j = 0; j < jumsu.length; j++) {
			if (jumsu[j]==330) {
				count++;//count = count + 1
				//2. 만점자 번호는 몇번?
				System.out.println("번호> "+ j);
			}
		}System.out.println("수능 만점자 : "+count+"명");

		// 내가 짠거
		String person = "";
		for (int j = 0; j < jumsu.length; j++) {
			if (jumsu[j]==330) {
				person = person + j+"번 ";
			}
		}System.out.println("수능 만점자 : "+person);
		
	}

}

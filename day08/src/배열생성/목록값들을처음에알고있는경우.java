package 배열생성;

import java.util.Iterator;

public class 목록값들을처음에알고있는경우 {

	public static void main(String[] args) {
		// 배열을 만들때는 처음부터 값들을 알고 있는 경우/모르는 경우
		String[] names = { "홍길동", "송길동", "정길동", "박길동", "장길동" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		for (String n : names) {
			System.out.println(n);
		}
		
		int[] ages = { 100, 88, 55, 10, 4 };
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		for (int x : ages) {
			System.out.println(x);
		}
		
		double[] eyes = { 2.0, 1.5, 1.2, 0.8, 1.0 };
		for (int i = 0; i < eyes.length; i++) {
			System.out.println(eyes[i]);
		}
		for (double d : eyes) {
			System.out.println(d);
		}

		char[] gender = { '남', '여', '남', '여', '남' };
		for (int i = 0; i < gender.length; i++) {
			System.out.println(gender[i]);
		}
		for (char c : gender) {
			System.out.println(c);
		}
		
		boolean[] food = { true, false, true, true, false };
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		for (boolean b : food) {
			System.out.println(b);
		}
	}

}

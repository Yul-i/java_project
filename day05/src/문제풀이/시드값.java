package 문제풀이;

import java.util.Random;

public class 시드값 {

	public static void main(String[] args) {
		Random r = new Random(5);
		int target = r.nextInt(100);
		int target2 = r.nextInt(100);
		System.out.println(target);
		System.out.println(target2);
	}

}

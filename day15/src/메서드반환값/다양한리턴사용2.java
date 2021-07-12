package 메서드반환값;

import java.util.Random;

public class 다양한리턴사용2 {

	public static void main(String[] args) {
		다양한리턴2 r2 = new 다양한리턴2();
		int result1 = r2.get(100); //result1 = 200
		double result2 = r2.get(); //result2 = 11.11;
		int[]result3 = r2.get2(); //{10,20,30,40,50};
		for (int x : result3) {
			System.out.println(x); //10 20 30 40 50
		}
		Random rd = r2.get3();
		System.out.println(rd.nextInt());
	}

}

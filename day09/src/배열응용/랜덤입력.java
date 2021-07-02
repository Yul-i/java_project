package 배열응용;

import java.util.Random;

public class 랜덤입력 {

	public static void main(String[] args) {
		Random r = new Random(42);//sudo(가짜랜덤)
		int[] jumsu = new int[100];
		//100개의 변수를 넣을 공간을 만든다.
		
		for (int i = 0; i < jumsu.length; i++) {//100번 넣어야 해서 반복문을 돌린다(유한) 
			jumsu[i] = r.nextInt(101);//특정한 변수 인덱스에 하나씩 랜덤한 값을 대입한다. (0~100 안으로)
		}
		
		for (int x : jumsu) {
			System.out.println(x);
		}
	}

}

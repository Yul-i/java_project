package 알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 최솟값_선생님 {

	public static void main(String[] args) {
		Random r = new Random(100);
		int[] s = new int[10000];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(1000)+1;
		}
		
		int min = s[0];
		int count = 0;
		for (int i = 1; i < s.length; i++) {
			if (s[i] < min) {
				min = s[i];
			}
		}
		
		System.out.println(min);//1
		String result = "";
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] == min) {
				count++;
//				System.out.println(i);
				result += i + " ";
			}
		}
		System.out.println("최솟값인"+min+"의 개수는"+count+"개");
		System.out.println(result);
		
//		파괴함수를 써서 정렬 후 최소값/최대값을 찾아보자.
		Arrays.sort(s);
		System.out.println(s[0]);
		System.out.println(s[s.length-1]);
	}

}

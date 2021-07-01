package 배열생성;

public class 문제풀이1 {

	public static void main(String[] args) {

		
		// 1. int 크기 5인 배열을 생성해보세요.
		int[] s = new int[5];

		// 2. 배열의 크기를 프린트 해보세요.
		System.out.println(s.length);
		
		// 3. 배열의 첫번째 위치에 100을 넣어서 프린트
		s[0] = 100;
		System.out.println(s[0]);
		
		// 4. 배열의 마지막 위치에 500을 넣어서 프린트
		s[s.length-1] = 500;
		System.out.println(s[s.length-1]);
		
		// 5. 배열의 3번째 위치에 200을 넣어서 프린트
		s[2] = 200;
		System.out.println(s[2]);
		
		// 6. 배열의 전체 데이터를 프린트
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}System.out.println();

		// 7. 배열의 전체 데이터를 인덱스와 함께 프린트
		for (int i = 0; i < s.length; i++) {
			System.out.println("s["+i+"] "+s[i]);
		}
		
		// 8. 그림으로 그려보세요.
	}

}

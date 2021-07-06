package 문제풀이;

public class 깊은복사_성적구하기 {

	public static void main(String[] args) {
		//과목명
		String[] subject = {"국어", "영어", "수학", "컴퓨터", "회화"};
		
		//1학기 성적
		int[] jumsu1 = {44, 66, 22, 99, 100};
		//2학기 성적
		int[] jumsu2 = jumsu1.clone();
		jumsu2[2] = 88;
				
		// 0) 전체 1학기, 2학기 성적 프린트
		System.out.print("1학기 성적 : ");
		for (int i : jumsu1) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("2학기 성적 : ");
		for (int i : jumsu2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// 1) 1학기, 2학기 성적 중 동일한 성적과목수
		int count  = 0;
		for (int i = 0; i < jumsu2.length; i++) {
			if (jumsu1[i]==jumsu2[i]) {
				count++;
			}
		}System.out.println("동일 성적 과목 수:"+count);
		
		// 2) 1학기, 2학기 성적 중 오른 과목수
		int count2 = 0;
		for (int i = 0; i < jumsu2.length; i++) {
			if (jumsu1[i]<jumsu2[i]) {
				count2++;
				// 3) 1학기, 2학기 성적 중 오른 과목 명
				System.out.println("오른 과목 명: "+subject[i]);
			}
		}System.out.println("오른 과목 수:"+count2);

	}

}

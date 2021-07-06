package 문제풀이;

public class 성적확인문제 {

	public static void main(String[] args) {
		String[] subject = { "컴퓨터", "국어", "수학", "영어", "체육" };
		int[] term1 = { 77, 88, 99, 80, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		// 1. 성적이 2학기에 향상된 과목의 수를 카운트 해보세요.
		int count1 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count1++;
			}
		}
		System.out.println("성적 향상 과목 수 : " + count1);
		// 2. 성적이 1,2학기 동일한 과목의 수를 카운트 해보세요.
		int count2 = 0;
		int location = -1;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count2++;
				location = i;
			}
		}
		System.out.println("성적 동일 과목 수 : " + count2);

		// 3. 성적이 1,2학기 동일하나 과목의 과목명을 프린터 해보세요.
		if (location != -1) {			
			System.out.println("성적 동일 과목 명 : " + subject[location]);
		}else {
			System.out.println("동일한 과목이 없습니다.");
		}

	}

}

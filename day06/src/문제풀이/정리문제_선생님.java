package 문제풀이;

import javax.swing.JOptionPane;

public class 정리문제_선생님 {

	public static void main(String[] args) {
		// 사원번호 입력 : 기103
		// 사원번호 중 첫글자가 '기'인 경우 '기획부이군요.'
		//				  '인'인 경우 '인사부이군요.'
		//				  '개'인 경우 '개발부이군요.'
		// 사원번호 중 두번째 글자가 '1'또는 '2'인 경우 '임원'
		//					  '3'인 경우 '부장'
		//					  '4'또는 '5'인 경우 '평사원'
		//					  나머지 '해당 직급이 없음'
		
		String no = JOptionPane.showInputDialog("사원번호 입력");
		char first = no.charAt(0);
		char second = no.charAt(1);
		
		switch (first) {
		case '기':
			System.out.println("기획부");
			break;
		case '인':
			System.out.println("인사부");
			break;
		case '개':
			System.out.println("개발부");
			break;
		default:
			System.out.println("없는 부서입니다.");
			break;
		}
		
		switch (second) {
		case '1': case '2':
			System.out.println("임원");
			break;
		case '3':
			System.out.println("부장");
			break;
		case '4': case '5':
			System.out.println("평사원");
			break;
		default:
			System.out.println("해당 직급이 없음.");
			break;
		}

	}

}

package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

public class 랜덤문제_선생님 {

	public static void main(String[] args) {
		//1.랜덤문제
		//랜덤한 숫자를 2개 발생시켜서
		// 첫번째 랜덤한 숫자가 더 크면 첫번째가 더 커요!
		// 두번째 랜덤한 숫자가 더 크면 두번째가 더 커요!
		
		Random r = new Random();
		
		int n1 = r.nextInt(100);
		int n2 = r.nextInt(100);
		
		if (n1>n2) {
			JOptionPane.showMessageDialog(null, "첫번째 숫자: "+n1+" 두번째 숫자: "+n2+" 첫번째가 더 커요");
		}else if(n1<n2) {
			JOptionPane.showMessageDialog(null, "첫번째 숫자: "+n1+" 두번째 숫자: "+n2+" 두번째가 더 커요");
		}

	}

}

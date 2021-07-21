package 생성자;

import javax.swing.JButton;

public class Bbs사용 {

	public static void main(String[] args) {
		Bbs b1 = new Bbs(1, "java", "fun java", "park");
		Bbs b2 = new Bbs(2, "jsp", "fun jsp", "hong");
		Bbs b3 = new Bbs(3, "spring", "fun spring", "kim");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
//		ex)
		JButton b4 = new JButton();
		b4.setText("4번 버튼");
		
		JButton b5 = new JButton("5번 버튼");
	}

}

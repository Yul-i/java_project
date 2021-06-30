package 누적연습;

import javax.swing.JOptionPane;

public class 인기투표3 {

	public static void main(String[] args) {
		int singer1 = 0, singer2 = 0, singer3 = 0;
		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("이번 주 인기 노래는?(아이유-Lylac : 1, 프로미스나인-we go: 2, 스테이씨-ASAP: 3)");
			switch (reply) {
			case "1":
				singer1++;
				break;
			case "2":
				singer2++;
				break;
			case "3":
				singer3++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1,2,3 중 선택해주세요.");
				i--;
				break;
			}
		}//for
		System.out.println("아이유-Lylac : "+singer1+"표");
		System.out.println("프로미스나인-we go : "+singer2+"표");
		System.out.println("스테이씨-ASAP : "+singer3+"표");
	}

}

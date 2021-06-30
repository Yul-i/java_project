package 누적연습;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class 인기투표2 {
	private static JLabel sing1;
	private static JLabel sing2;
	private static JLabel sing3;

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

		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setSize(500, 800);
		f.getContentPane().setLayout(null);
		
		JLabel sing1;
		sing1 = new JLabel("");
		sing1.setBackground(Color.ORANGE);
		sing1.setBounds(56, 113, 174, 174);
		f.getContentPane().add(sing1);
		
		ImageIcon iu = new ImageIcon("iu.jpg");
		sing1.setIcon(iu);
		
		JLabel sing2;
		sing2 = new JLabel("");
		sing2.setBounds(56, 299, 174, 174);
		f.getContentPane().add(sing2);
		
		ImageIcon nine = new ImageIcon("promisenine.jpg");
		sing2.setIcon(nine);
		
		JLabel sing3;
		sing3 = new JLabel("");
		sing3.setBounds(56, 485, 174, 174);
		f.getContentPane().add(sing3);
		
		ImageIcon stayc = new ImageIcon("stayc.jpg");
		sing3.setIcon(stayc);
		
		JLabel lblNewLabel = new JLabel("K-pop 인기 투표");
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 35));
		lblNewLabel.setBounds(86, 12, 329, 81);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1. 아이유-라일락");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(257, 120, 186, 50);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2. 프로미스나인-we go");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(257, 307, 211, 50);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("3.스테이씨 - ASAP");
		lblNewLabel_1_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(257, 502, 211, 50);
		f.getContentPane().add(lblNewLabel_1_2);
		
		JLabel score1 = new JLabel("");
		score1.setFont(new Font("굴림", Font.PLAIN, 30));
		score1.setBounds(302, 182, 77, 73);
		f.getContentPane().add(score1);
		
		JLabel score2 = new JLabel("");
		score2.setFont(new Font("굴림", Font.PLAIN, 30));
		score2.setBounds(302, 390, 77, 73);
		f.getContentPane().add(score2);
		
		JLabel score3 = new JLabel("");
		score3.setFont(new Font("굴림", Font.PLAIN, 30));
		score3.setBounds(302, 575, 77, 73);
		f.getContentPane().add(score3);
		
		score1.setText(singer1+"표");
		score2.setText(singer2+"표");
		score3.setText(singer3+"표");
		
		
		f.setVisible(true);
		
	}
}

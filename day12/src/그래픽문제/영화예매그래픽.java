package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("영화예매그래픽 버전");
		f.setSize(560, 730);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		int[] seat = new int[200];
		
		for (int i = 0; i < 200; i++) {
			JButton b = new JButton(i+"");//String.valueOf(0);
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand();//스트링으로 들어온다.
					int index = Integer.parseInt(s);//스트링을 인트로 바꿔주자.
					seat[index] = 1;
					JOptionPane.showMessageDialog(f, index+"번 예약됨.");
					//버튼을 비활성화!
					b.setEnabled(false);
					b.setBackground(Color.red);
				}
			});
			f.add(b);
		}//for
		
//		결제하기 버튼을 누르면
//		1) 배열안에 1이 몇개인지 세서
//		2) 금액이 10000원씩 계산 후에
//		3) 결제금액 알려주세요.
//		4) 몇번 좌석을 예약했는지 출력.

		JButton b2 = new JButton("<<<<<<<< 결제하기 >>>>>>>>");
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;//지역변수로 주어야 함. 속해있는 클래스가 서로 달라서이다.
				final int COST = 10000;
				String sum ="";
				for (int i = 0; i < seat.length; i++) {
					if (seat[i]==1) {
						count++;
						sum += i+"번 ";
					}
				}//for
				int payment = count*COST;
				
				JOptionPane.showMessageDialog(f, "선택한 좌석은 "+sum+"입니다.");
				JOptionPane.showMessageDialog(f, "당신이 결제할 금액은 "+payment+"원 입니다.");
			}//class
		});
		b2.setBackground(Color.yellow);
		f.add(b2);
		f.setVisible(true);
	}

}

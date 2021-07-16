package travel;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class ReserveButton {

	
	public static void reserve() {
		JFrame f = new JFrame("예약 확인");
		f.setSize(500, 500);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel la1 = new JLabel("예약이 확정 되었습니다!");
		la1.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		la1.setBounds(129, 183, 233, 56);
		f.getContentPane().add(la1);
		
		JButton b1 = new JButton("나가기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				f.dispose();
//				System.exit(0);
				
			}
		});
		b1.setBounds(26, 251, 217, 56);
		f.getContentPane().add(b1);
		
		
		//예약 조회 창으로 옮길때사용할것
//		JButton b2 = new JButton("예약조회창으로");
//		b2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				JFrame f1 = new JFrame();
//				f1.setSize(500, 500);
//				
//				
//				
//				f1.setVisible(true);
//			}
//		});
//		b2.setBounds(256, 251, 217, 56);
//		f.getContentPane().add(b2);
		

		f.setVisible(true);
	}
}

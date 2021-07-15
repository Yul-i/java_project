package 새창데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창2 {
	public void open2(String m) {
		JFrame f = new JFrame(m+" 뜨는 화면@@@");
		f.setSize(800, 1000);
		JButton b2 = new JButton(m+" 화면 닫기");
		f.add(b2);
		b2.setBackground(Color.green);
		b2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(f, "새창2을 닫습니다.");
		//				System.exit(0);
						f.dispose();//이 프레임만 닫힘.
					}
				});
		f.setVisible(true);
	}
}

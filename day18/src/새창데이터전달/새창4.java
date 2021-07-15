package 새창데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창4 {
	public void open4(int temp) {
		JFrame f = new JFrame("새창4화면@@@");
		f.setSize(500, 500);
		String result;
		if (temp>30) {
			result = "폭염";
		}else {
			result = "견딜만해요!";
		}
		JButton b4 = new JButton(result);
		f.add(b4);
		b4.setBackground(Color.pink);
		f.setVisible(true);
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창4을 닫습니다.");
//				System.exit(0);
				f.dispose();//이 프레임만 닫힘.
			}
		});
	}
}

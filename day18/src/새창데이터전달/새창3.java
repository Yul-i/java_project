package 새창데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창3 {
	public void open3(String id, String pw) {
		JFrame f = new JFrame("새창1화면@@@");
		f.setSize(500, 500);
		String result;
		if (id.equals("root")&&pw.equals("pass")) {
			result = "로그인 성공!";
		}else {
			result = "로그인 실패!";
		}
		JButton b3 = new JButton(result);
		f.add(b3);
		b3.setBackground(Color.pink);
		f.setVisible(true);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창3을 닫습니다.");
				f.dispose();//이 프레임만 닫힘.
			}
		});
	}
}

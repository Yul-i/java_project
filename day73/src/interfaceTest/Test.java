package interfaceTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test {
	
	JLabel result;
	private JTextField t1;
	private JTextField t2;
	
	public Test() {
		
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel l1 = new JLabel("어디로 갈까요????");
		f.getContentPane().add(l1);
		
		t1 = new JTextField();
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel l2 = new JLabel("언제 갈까요???????");
		f.getContentPane().add(l2);
		
		t2 = new JTextField();
		t2.setColumns(10);
		f.getContentPane().add(t2);
		

		JButton b1 = new JButton("어디로 언제 갈까요!!!!!!!!!!!");
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("현재 시간은???????????????");
		f.getContentPane().add(b2);
		
		JLabel result1 = new JLabel("결과가 나타납니다....");
		f.getContentPane().add(result1);
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String where = t1.getText();
				String when = t2.getText();
				
				result1.setText(where+"로 "+when+"에 떠나요!!");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				String year = String.valueOf(date.getYear()+1900);
				String month = String.valueOf(date.getMonth()+1);
				String day = String.valueOf(date.getDate());
				String hour = String.valueOf(date.getHours());
				String minute = String.valueOf(date.getMinutes());
				String second = String.valueOf(date.getSeconds());
				
				result1.setText(year+"년 "+month+"월 "+day+"일 "+hour+"시 "+minute+"분 "+second+"초");
			}
		});
		
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Test();
	}

}

package 파일시스템;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 일기장 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(500, 700);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("나의 일기장");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 36));
		lblNewLabel.setBounds(127, 21, 218, 94);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 날짜");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(43, 147, 158, 52);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("오늘의 날씨");
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 28));
		lblNewLabel_1_1.setBounds(43, 209, 158, 52);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("오늘의 제목");
		lblNewLabel_1_2.setFont(new Font("맑은 고딕", Font.PLAIN, 28));
		lblNewLabel_1_2.setBounds(43, 271, 158, 52);
		f.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("오늘의 내용");
		lblNewLabel_1_3.setFont(new Font("맑은 고딕", Font.PLAIN, 28));
		lblNewLabel_1_3.setBounds(43, 333, 158, 52);
		f.getContentPane().add(lblNewLabel_1_3);
		
		t1 = new JTextField();
		t1.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		t1.setBounds(220, 147, 228, 52);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		t2.setColumns(10);
		t2.setBounds(220, 209, 228, 52);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		t3.setColumns(10);
		t3.setBounds(220, 271, 228, 52);
		f.getContentPane().add(t3);
		
		JTextArea t4 = new JTextArea();
		t4.setTabSize(4);
		t4.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		t4.setBounds(220, 342, 228, 210);
		f.getContentPane().add(t4);
		
		JButton b1 = new JButton("파일에 일기 저장");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String day = t1.getText();
				String weather = t2.getText();
				String title = t3.getText();
				String content = t4.getText();
				try {
					FileWriter file = new FileWriter(day+".text");
					file.write("날짜 : "+day+"\n");
					file.write("날씨 : "+weather+"\n");
					file.write("제목 : "+title+"\n");
					file.write("내용 : "+content+"\n");
					file.close();
					JOptionPane.showMessageDialog(f, "일기가 저장되었습니다.");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("저장에 오류가 발생했습니다.");
				}
			}
		});
		b1.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		b1.setBounds(64, 574, 384, 61);
		f.getContentPane().add(b1);
		
		f.setVisible(true);
	}
}

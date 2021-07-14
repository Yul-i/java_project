package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.Box;
import java.awt.Label;
import java.awt.Canvas;
import javax.swing.JList;
import java.awt.List;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.ScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class ProductUI {

	public static void main(String[] args) {
		JFrame f = new JFrame("2조 여행사");
		f.getContentPane().setForeground(new Color(0, 0, 0));
		f.getContentPane().setFont(new Font("굴림", Font.BOLD, 18));
		f.getContentPane().setBackground(new Color(255, 255, 255));
		f.setSize(1200, 900);
		f.getContentPane().setLayout(null);
		
		Label label = new Label("[연합상품] [버스] 강원도권으로 떠나는 당일여행");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("굴림", Font.PLAIN, 24));
		label.setBackground(new Color(153, 50, 204));
		label.setBounds(80, 50, 1000, 60);
		f.getContentPane().add(label);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(147, 112, 219));
		canvas.setBounds(80, 180, 350, 350);
		f.getContentPane().add(canvas);
		
		JLabel lblNewLabel = new JLabel("#국내여행");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(503, 180, 120, 45);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("#버스패키지");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1.setBounds(604, 180, 120, 45);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("강릉, 평창, 인제, 원주, 영월 등 강원도 지역으로 떠나는 ");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_2.setBounds(506, 235, 603, 39);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("당일, 무박 테마여행");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(506, 268, 603, 39);
		f.getContentPane().add(lblNewLabel_2_1);
		
		JList list = new JList();
		list.setBounds(478, 360, 1, 1);
		f.getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setToolTipText("일정 :");
		list_1.setBounds(478, 336, 1, 1);
		f.getContentPane().add(list_1);
		
		JLabel lblNewLabel_3 = new JLabel("- 일정 : ");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(503, 336, 62, 18);
		f.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("0박 1일");
		lblNewLabel_3_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_3_1.setBounds(575, 336, 62, 18);
		f.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("- 07월 20일 (화) 07:00 전용차량 출발 - 07월 20일 (화) 00:00 도착");
		lblNewLabel_3_2.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_3_2.setBounds(503, 360, 568, 18);
		f.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("- 방문 도시 :");
		lblNewLabel_3_2_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_3_2_1.setBounds(501, 387, 92, 18);
		f.getContentPane().add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("강릉, 평창, 원주");
		lblNewLabel_3_1_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_3_1_1.setBounds(602, 387, 122, 18);
		f.getContentPane().add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("- 예약 인원 :");
		lblNewLabel_3_2_1_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_3_2_1_1.setBounds(503, 417, 92, 18);
		f.getContentPane().add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("현재 0명(최소 출발 인원 4명/최대 25명)");
		lblNewLabel_3_1_1_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_3_1_1_1.setBounds(604, 417, 298, 18);
		f.getContentPane().add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("여행 가격");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(777, 447, 92, 45);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3_2_1_2 = new JLabel("대인 : 27,900원");
		lblNewLabel_3_2_1_2.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_3_2_1_2.setBounds(883, 460, 129, 18);
		f.getContentPane().add(lblNewLabel_3_2_1_2);
		
		JLabel lblNewLabel_3_2_1_2_1 = new JLabel("소인 : 10,900원");
		lblNewLabel_3_2_1_2_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_3_2_1_2_1.setBounds(883, 485, 129, 18);
		f.getContentPane().add(lblNewLabel_3_2_1_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"예약 가능 날짜", "2021년 07월 20일 화요일 (예약 인원 4명) - 예약 가능, 출발 확정,", "021년 07월 21일 수요일 (예약 인원 3명) - 예약 가능,", "2021년 07월 22일 목요일 (예약 인원 0명) - 예약 가능"}));
		comboBox.setToolTipText("예약 가능 날짜");
		comboBox.setBounds(506, 533, 506, 39);
		f.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("대인");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(514, 595, 51, 45);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1명", "2명", "3명", "4명", "5명", "6명", "7명", "8명", "9명", "10명"}));
		comboBox_1.setBounds(561, 596, 135, 40);
		f.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("소인");
		lblNewLabel_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(830, 595, 51, 45);
		f.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"0명", "1명", "2명", "3명", "4명", "5명", "6명", "7명", "8명", "9명", "10명"}));
		comboBox_1_1.setBounds(877, 598, 135, 40);
		f.getContentPane().add(comboBox_1_1);
		
		JButton btnNewButton = new JButton("예약 하기");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(148, 0, 211));
		btnNewButton.setBounds(503, 682, 518, 53);
		f.getContentPane().add(btnNewButton);
		
		f.setVisible(true);

	}
}

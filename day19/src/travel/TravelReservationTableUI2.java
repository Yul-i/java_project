package travel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class TravelReservationTableUI2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t10;


		/**
		 * @wbp.parser.entryPoint
		 */
		public void search() 	{
		
		JFrame f = new JFrame();
		f.setSize(1200, 900);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("예약 조회창");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 33));
		lblNewLabel.setBounds(36, 37, 192, 74);
		f.getContentPane().add(lblNewLabel);
	
		JLabel reserveLabel = new JLabel();
		reserveLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		reserveLabel.setBounds(170, 178, 875, 92);
		f.getContentPane().add(reserveLabel);
		
				
				JLabel la10 = new JLabel("날짜 선택");
				la10.setFont(new Font("Lucida Grande", Font.BOLD, 18));
				la10.setBounds(239, 413, 118, 63);
				f.getContentPane().add(la10);
				

				
			
		//-----콤보박스
				JComboBox travelDay = new JComboBox();
				travelDay.setToolTipText("예약 가능 날짜");
				travelDay.setBounds(425, 426, 188, 39);
				travelDay.setModel(new DefaultComboBoxModel(new String[] {"예약 가능 날짜", "2021-07-20-TUE", "2021-07-21-WED", "2021-07-22-THU", "2021-07-23-FRI", "2021-07-24-SAT", "2021-07-25-SUN", "2021-07-26-MON", "2021-07-27-TUE", "2021-07-28-WED", "2021-07-29-THU", "2021-07-30-FRI", "2021-07-31-SAT"}));
				f.getContentPane().add(travelDay);
				
				t10 = new JTextField();
				t10.setBounds(21, 802, 130, 26);
				f.getContentPane().add(t10);
				t10.setColumns(10);
				t10.setVisible(false);
				
		
				//예약 날짜 구하기
				travelDay.addItemListener(new ItemListener() {
					@Override
					public void itemStateChanged(ItemEvent e) {
						String reserve_day = travelDay.getSelectedItem().toString();//예약날짜
						t10.setText(reserve_day);
						System.out.println(reserve_day);
					}
				});
		
		
		
		JLabel la1 = new JLabel("전화번호 뒷자리");
		la1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		la1.setBounds(239, 495, 172, 63);
		f.getContentPane().add(la1);
		
		t1 = new JTextField();
		t1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t1.setText("");
			}
		});
		t1.setText("숫자 4자리를 입력하세요.");
		t1.setBounds(425, 495, 243, 63);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel la2 = new JLabel("성인");
		la2.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		la2.setBounds(239, 571, 39, 63);
		f.getContentPane().add(la2);
		t2 = new JTextField();
		t2.setText("인원을 입력하세요.");
		t2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t2.setText("");
			}
		});
		t2.setColumns(10);
		t2.setBounds(425, 573, 243, 63);
		f.getContentPane().add(t2);
		
		JLabel la3 = new JLabel("어린이");
		la3.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		la3.setBounds(239, 661, 130, 63);
		f.getContentPane().add(la3);
		
		t3 = new JTextField();
		t3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t3.setText("");
			}
		});
		t3.setText("인원을 입력하세요.");
		t3.setColumns(10);
		t3.setBounds(425, 661, 243, 63);
		f.getContentPane().add(t3);
		//----------------------------------------
//		
		
		JButton btnNewButton_1 = new JButton("예약 취소");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = t1.getText();
				ReservationDAO db = new ReservationDAO();
			
				try {
				int	result = db.delete(id);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "예약 취소가 완료되었습니다.");
					reserveLabel.setText("");
				} else {
					JOptionPane.showMessageDialog(f, "없는 예약번호입니다.");
				}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
				
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNewButton_1.setBounds(239, 736, 117, 92);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("예약 정보 수정");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = t1.getText();
				String adult = t2.getText();
				String child = t3.getText();
				String day = travelDay.getSelectedItem().toString();

				ReservationDAO db = new ReservationDAO();
				
				try {
					int result = db.update(id, adult, child, day);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "예약 정보 수정이 완료되었습니다!");
						String[] a = db.read(id);
						
						reserveLabel.setText(a[0] + a[1] + a[2] + a[3] + a[4]);
					}else {
						JOptionPane.showMessageDialog(f, "오류가 생겼습니다 다시 시도하세요.");
					} 
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t10.setText("");
			}
			
		});
		btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton_2.setBounds(388, 736, 176, 92);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("예약 조회");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				JFrame f1 = new JFrame();
//				f1.setSize(800, 450);
//				
//				JLabel la01 = new JLabel("예약 조회 결과입니다.");
//				la01.setFont(new Font("Lucida Grande", Font.BOLD, 15));
//				la01.setBounds(50, 50, 150, 150);
//				f1.getContentPane().add(la01);
//				t2.setText("");
//				t3.setText("");
//				t10.setText("");
//				JButton b12 = new JButton("창닫기");
//				b12.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						f1.dispose();
//					}
//				});
//				b12.setBounds(290, 286, 187, 52);
//				f1.getContentPane().add(b12);
//				
//				
//				 --------- 메서드 호출
				
			
				String id = t1.getText();
				ReservationDAO db = new ReservationDAO();
				
				try {
					String[] a = db.read(id);
					if (a[0]==null) {
						reserveLabel.setText("없는 예약 번호입니다.");	
					}else {						
						reserveLabel.setText(a[0] + a[1] + a[2] + a[3] + a[4]);						
					}
//					System.out.println(a[0] + a[1] + a[2] + a[3]);
					
				// 예약 조회 결과창 
//				JLabel la00 = new JLabel(a[0] + a[1] + a[2] + a[3] + a[4]);
//				la00.setFont(new Font("Lucida Grande", Font.BOLD, 15));
//				la00.setBounds(169, 521, 150, 150);
//				f1.getContentPane().add(la00);
				
				} catch (Exception e1) {
					e1.printStackTrace();
				}
//				f1.setVisible(true);
				
				//예약 뜨는 창
				


				
			}
		});
		btnNewButton_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(589, 736, 117, 92);
		f.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("창 닫기");
		btnNewButton_3.setBackground(new Color(153, 50, 204));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_3.setBounds(736, 736, 192, 92);
		f.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("* 수정시, 날짜, 대인, 소인 인원수 필수체크! 뒷자리는 입력하신 번호를 입력하세요");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(239, 330, 714, 26);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("* 조회시, 예약번호(전화번호 뒷자리)를 입력하세요");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setBounds(239, 351, 714, 26);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("* 삭제시, 예약번호(전화번호 뒷자리)를 입력하세요");
		lblNewLabel_1_1_1.setForeground(Color.RED);
		lblNewLabel_1_1_1.setBounds(239, 375, 714, 26);
		f.getContentPane().add(lblNewLabel_1_1_1);
		

	
		
		f.setVisible(true);
	} //main
} //class

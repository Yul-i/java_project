package travel;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.util.Date;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class ReserveMain {
	private static JTextField t10;
	private static JTextField t1;
	private static JTextField t2;
//	private static Component t3;
	private static JTextField t4;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void openReserveMain(String id) throws Exception {
		
		ProductDAO productDB = new ProductDAO();
		String[] result = productDB.read(id);
		

		JFrame f = new JFrame();	//주문창 생성
		f.setSize(1200, 900);
		f.getContentPane().setLayout(null);
		

		//상품 정보
		
		ImageIcon image = new ImageIcon(result[6]);//이미지
		JLabel lblNewLabel = new JLabel("상품 예약&주문");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		lblNewLabel.setBounds(18, 20, 419, 81);
		f.getContentPane().add(lblNewLabel);
		
		
		
		JLabel re1 = new JLabel("photo");
		re1.setOpaque(true);
		re1.setBounds(88, 113, 200, 150);
		re1.setIcon(image);
		f.getContentPane().add(re1);
		
		JLabel re2 = new JLabel(result[1]);
		re2.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		re2.setOpaque(true);
		re2.setBounds(404, 113, 615, 48);
		f.getContentPane().add(re2);
		
		JLabel re3 = new JLabel(result[3]+"로 떠나는 당일, 무박 테마여행 ");
		re3.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		re3.setOpaque(true);
		re3.setBounds(404, 173, 615, 39);
		f.getContentPane().add(re3);
		
		JLabel re3_1 = new JLabel("여행 일정 :");
		re3_1.setOpaque(true);
		re3_1.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		re3_1.setBounds(404, 224, 104, 39);
		f.getContentPane().add(re3_1);
		
		JLabel re3_1_1 = new JLabel(result[2]);
		re3_1_1.setOpaque(true);
		re3_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		re3_1_1.setBounds(512, 224, 104, 39);
		f.getContentPane().add(re3_1_1);
		
		JLabel re3_1_2 = new JLabel("여행 도시 :");
		re3_1_2.setOpaque(true);
		re3_1_2.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		re3_1_2.setBounds(632, 224, 104, 39);
		f.getContentPane().add(re3_1_2);
		
		JLabel re3_1_1_1 = new JLabel(result[3]);
		re3_1_1_1.setOpaque(true);
		re3_1_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		re3_1_1_1.setBounds(740, 224, 279, 39);
		f.getContentPane().add(re3_1_1_1);
		
		
		//날짜 선택
		
		JLabel la10 = new JLabel("날짜 선택");
		la10.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		la10.setBounds(88, 323, 118, 63);
		f.getContentPane().add(la10);
		

		//-----콤보박스--> 날짜 
		JComboBox travelDay = new JComboBox();
		travelDay.setToolTipText("예약 가능 날짜");
		travelDay.setBounds(177, 338, 188, 39);
		travelDay.setModel(new DefaultComboBoxModel(new String[] {"예약 가능 날짜", "2021-07-20-TUE", "2021-07-21-WED", "2021-07-22-THU", "2021-07-23-FRI", "2021-07-24-SAT", "2021-07-25-SUN", "2021-07-26-MON", "2021-07-27-TUE", "2021-07-28-WED", "2021-07-29-THU", "2021-07-30-FRI", "2021-07-31-SAT"}));
		f.getContentPane().add(travelDay);
		
		t10 = new JTextField();
		t10.setBounds(6, 840, 21, 26);
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
		
		// ------------- 라벨 + 텍스트 필드
		JLabel la1 = new JLabel("전화번호 뒷자리");		//숫자 4자리입력창
		la1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		la1.setBounds(88, 398, 118, 63);
		f.getContentPane().add(la1);
		t1 = new JTextField();
		t1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t1.setText("");
			}
		});
		t1.setText("숫자 4자리를 입력하세요.");		//대인 인원 입력창
		t1.setBounds(252, 400, 243, 63);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel la2 = new JLabel("대인");
		la2.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		la2.setBounds(377, 324, 39, 63);
		f.getContentPane().add(la2);
		t2 = new JTextField();
		t2.setText("인원을 입력하세요.");		// 소인 입력창
		t2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t2.setText("");
			}
		});
		t2.setColumns(10);
		t2.setBounds(418, 323, 243, 63);
		f.getContentPane().add(t2);
		
		JLabel la3 = new JLabel("소인");
		la3.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		la3.setBounds(673, 321, 53, 63);
		f.getContentPane().add(la3);
		
		t4 = new JTextField();
		t4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t4.setText("");
			}
		});
		t4.setText("인원을 입력하세요.");
		t4.setColumns(10);
		t4.setBounds(714, 323, 243, 63);
		f.getContentPane().add(t4);
		
		
		//-----------------버튼 -----------------------
		JButton btnNewButton = new JButton("예약");
		btnNewButton.setBackground(new Color(153, 50, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String id = t1.getText();
				String adult = t2.getText();
				String child = t4.getText();
				String day = t10.getText();
				// member테아블에 저장하려고함.
				//=> 해결책, 우리가 원하는 기능을 가진 메소드를 가지고 있는 부품을 찾아야함.\
				// 	램에 가져다 놓으면됨.
				
				ReservationDAO db = new ReservationDAO();
				try {
					int result = db.createCard(id, adult, child, day);	// 괄호안에 child 
					if (result == 1) {
//						JOptionPane.showMessageDialog(f, "예약 성공");
						ReserveButton button1 = new ReserveButton();		//예약성공 jframe 띄우는곳
						button1.reserve();
					}else if(result != 1) {
						JOptionPane.showMessageDialog(f, "예약 실패! 다시 시도하세요!");
					}
						
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				// 입력한거 지워버리자!
				t1.setText("");
				t2.setText("");
				t4.setText("");
				t10.setText("");
				
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		btnNewButton.setBounds(544, 511, 117, 92);
		f.getContentPane().add(btnNewButton);
		
		// 조회창 이동 -> 수정, 취소, 조회  UI2 class 로 이동
		
		JButton b2 = new JButton("예약 조회창으로");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TravelReservationTableUI2 m2 = new TravelReservationTableUI2();
				m2.search();
				
			}
		});
		b2.setFont(new Font("Dialog", Font.PLAIN, 20));
		b2.setBounds(810, 9, 202, 92);
		f.getContentPane().add(b2);
		
		
		JButton b3 = new JButton("창닫기");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		b3.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		b3.setBounds(378, 511, 117, 92);
		f.getContentPane().add(b3);
		
		
		
		//---------
		
		
		
//	
		
		
		f.setVisible(true);
	}
}

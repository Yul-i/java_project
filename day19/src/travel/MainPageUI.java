package travel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;


public class MainPageUI {
	
	/**
	 * @wbp.parser.entryPoint
	 */
	
	
	public static void show() {
		JFrame f = new JFrame();
		
		f.setSize(1200, 800);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("국내여행");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		lblNewLabel.setBounds(406, 223, 375, 83);
		f.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("회원 정보");
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 40));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InfoUI infoUi = new InfoUI();
				try {
					infoUi.show();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(635, 51, 245, 101);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("예약 조회");
		btnNewButton_1_1.setFont(new Font("Dialog", Font.PLAIN, 40));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TravelReservationTableUI2 reservationTable = new TravelReservationTableUI2();
				reservationTable.search();
			}
		});
		btnNewButton_1_1.setBounds(892, 55, 245, 93);
		f.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton = new JButton("예약 하러 가기");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 60));
		btnNewButton.setBounds(152, 318, 924, 374);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("2조 여행사");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 50));
		lblNewLabel_1.setBounds(156, 69, 375, 83);
		f.getContentPane().add(lblNewLabel_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//상품리스트페이지가기
				ProductListUI productListUI = new ProductListUI();
				try {
					productListUI.listOpen();
//					f.setVisible(false);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		f.setVisible(true);
	}
}

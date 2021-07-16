package travel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.FileDialog;

import javax.swing.Box;
import java.awt.Label;
import java.awt.Canvas;
import javax.swing.JList;
import javax.swing.border.LineBorder;

import java.awt.List;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.ScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductUI {
	/**
	 * @wbp.parser.entryPoint
	 */
	public void productOpen(String id) throws Exception {
		//DB 불러오기
		ProductDAO productDB = new ProductDAO();
		//ProductListUi에서 던져준 id 값으로 데이터 불러옴
		String[] result = productDB.read(id);
		
		//frame 구성
		JFrame f = new JFrame("2조 여행사- "+result[1]);
		f.getContentPane().setForeground(new Color(0, 0, 0));
		f.getContentPane().setFont(new Font("맑은 고딕", Font.BOLD, 18));
		f.getContentPane().setBackground(new Color(255, 255, 255));
		f.setSize(1200, 800);
		f.getContentPane().setLayout(null);
		//boeder 설정
		LineBorder bb = new LineBorder(Color.black);
	
		
		//productList로 돌아가는 버튼
		JButton goList = new JButton("LIST");
		goList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		goList.setBackground(new Color(153, 50, 204));
		goList.setForeground(new Color(255, 255, 255));
		goList.setBounds(116, 32, 81, 62);
		f.getContentPane().add(goList);
		
		
		//상품 제목(product-title)
		JLabel titleLabel = new JLabel(result[1]);
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		titleLabel.setBackground(new Color(153, 50, 204));
		titleLabel.setBounds(152, 129, 633, 60);
		f.getContentPane().add(titleLabel);
		
		//border
		JLabel border1 = new JLabel("");
		border1.setBounds(116, 129, 966, 60);
		border1.setBorder(bb);
		f.getContentPane().add(border1);
		
		//image
		ImageIcon images = new ImageIcon(result[6]);
		
		JLabel imagesL1 = new JLabel();
		imagesL1.setBackground(new Color(147, 112, 219));
		imagesL1.setBounds(130, 266, 350, 260);
		imagesL1.setIcon(images);
		f.getContentPane().add(imagesL1);
		
		//border
		JLabel border3 = new JLabel("");
		border3.setBounds(116, 238, 375, 303);
		border3.setBorder(bb);
		f.getContentPane().add(border3);
		
		
		JLabel lblNewLabel = new JLabel("#국내여행");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel.setBounds(539, 259, 120, 45);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("#버스패키지");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_1.setBounds(640, 259, 120, 45);
		f.getContentPane().add(lblNewLabel_1);
		
		//소제목은 여행도시(product-town)으로 넣었음
		JLabel lblNewLabel_2 = new JLabel("버스를 타고 "+result[3]+"로 떠나는 ");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel_2.setBounds(542, 314, 603, 39);
		f.getContentPane().add(lblNewLabel_2);
		
		
		JLabel lblNewLabel_2_1 = new JLabel("당일, 무박 테마여행");
		lblNewLabel_2_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(542, 347, 603, 39);
		f.getContentPane().add(lblNewLabel_2_1);
		
		
		//여행일정(product-during)
		JList list = new JList();
		list.setBounds(514, 439, 1, 1);
		f.getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setToolTipText("일정 :");
		list_1.setBounds(514, 415, 1, 1);
		f.getContentPane().add(list_1);
		
		JLabel lblNewLabel_3 = new JLabel("- 일정 : ");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(545, 415, 62, 18);
		f.getContentPane().add(lblNewLabel_3);
		
		JLabel duringLabel = new JLabel(result[2]);
		duringLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		duringLabel.setBounds(617, 415, 62, 18);
		f.getContentPane().add(duringLabel);
		
		JLabel lblNewLabel_3_2 = new JLabel("07:00 전용차량 출발 - 00:00 도착");
		lblNewLabel_3_2.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblNewLabel_3_2.setBounds(549, 439, 568, 18);
		f.getContentPane().add(lblNewLabel_3_2);
		
		
		//여행도시(product-town)
		JLabel lblNewLabel_3_2_1 = new JLabel("- 방문 도시 :");
		lblNewLabel_3_2_1.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblNewLabel_3_2_1.setBounds(537, 466, 105, 18);
		f.getContentPane().add(lblNewLabel_3_2_1);
		
		JLabel townLabel = new JLabel(result[3]);
		townLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		townLabel.setBounds(638, 466, 277, 18);
		f.getContentPane().add(townLabel);
		
		
		//여행 가격(product-adult_cost/child-cost)
		JLabel lblNewLabel_1_1 = new JLabel("여행 가격");
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(813, 526, 92, 45);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3_2_1_2 = new JLabel("대인 : ");
		lblNewLabel_3_2_1_2.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblNewLabel_3_2_1_2.setBounds(919, 539, 62, 18);
		f.getContentPane().add(lblNewLabel_3_2_1_2);
		
		JLabel adult_costLabel = new JLabel(result[4]+"원");
		adult_costLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		adult_costLabel.setBounds(990, 539, 81, 18);
		f.getContentPane().add(adult_costLabel);
		
		JLabel lblNewLabel_3_2_1_2_1 = new JLabel("소인 : ");
		lblNewLabel_3_2_1_2_1.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblNewLabel_3_2_1_2_1.setBounds(919, 569, 62, 18);
		f.getContentPane().add(lblNewLabel_3_2_1_2_1);
		
		JLabel child_costLabel = new JLabel(result[5]+"원");
		child_costLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		child_costLabel.setBounds(988, 569, 81, 18);
		f.getContentPane().add(child_costLabel);
		
		
		//예약하기 버튼
		JButton btn_reserve = new JButton("예약 하기");
		btn_reserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReserveMain reserveMain = new ReserveMain();
				try {
					reserveMain.openReserveMain(id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn_reserve.setForeground(new Color(255, 255, 255));
		btn_reserve.setBackground(new Color(148, 0, 211));
		btn_reserve.setBounds(539, 628, 518, 53);
		f.getContentPane().add(btn_reserve);
		
		
		//border
		JLabel border2 = new JLabel("");
		border2.setBounds(514, 238, 568, 482);
		border2.setBorder(bb);
		f.getContentPane().add(border2);
	
		
		
		f.setVisible(true);
	}

}

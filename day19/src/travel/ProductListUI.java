package travel;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductListUI {
	
	/**
	 * @throws Exception 
	 * @wbp.parser.entryPoint
	 */
	public void listOpen() throws Exception {
		//DB연결
		ProductDAO productDB = new ProductDAO();
		
		// Frame 구성
		JFrame f = new JFrame("2조 여행사 - 국내 여행 상품");
		f.getContentPane().setForeground(new Color(0, 0, 0));
		f.getContentPane().setFont(new Font("맑은 고딕", Font.BOLD, 18));
		f.getContentPane().setBackground(new Color(255, 255, 255));
		f.setSize(1200, 1100);
		f.getContentPane().setLayout(null);
		
		//Main으로 가는 버튼
		JButton goMain = new JButton("MAIN");
		goMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		goMain.setBackground(new Color(153, 50, 204));
		goMain.setForeground(new Color(255, 255, 255));
		goMain.setBounds(61, 27, 81, 62);
		f.getContentPane().add(goMain);
		
		//border 부품
		LineBorder bb = new LineBorder(Color.black);
		
		// 맨 Top 메뉴 이름
		JLabel lblNewLabel = new JLabel("국내 여행 상품");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 36));
		lblNewLabel.setBounds(446, 43, 260, 60);
		f.getContentPane().add(lblNewLabel);
		
		//for문으로 메뉴 생성
		for (int i = 1; i <= 3; i++) {
			String num = Integer.toString(i);
			String[] result = productDB.read(num);//read 기능 실행
			
			
			//상품 제목(product-title)
			JLabel label = new JLabel(result[1]);
			label.setForeground(Color.BLACK);
			label.setFont(new Font("맑은 고딕", Font.BOLD, 24));
			label.setBackground(Color.WHITE);
			label.setBounds(312, 176*i+(90*(i-1)), 542, 60);
			f.getContentPane().add(label);

			
			//상품 이미지(product-image)
			ImageIcon image = new ImageIcon(result[6]);
			
			JLabel images1 = new JLabel();
			images1.setBackground(new Color(147, 112, 219));
			images1.setBounds(99, 190*i+(80*(i-1)), 200, 150);
			images1.setIcon(image);
			f.getContentPane().add(images1);

			
			//소제목은 여행도시(product-town)으로 넣었음
			JLabel lblNewLabel_2 = new JLabel(result[3]+"로 떠나는 당일, 무박 테마여행 ");
			lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
			lblNewLabel_2.setBounds(311, 225*i+(40*(i-1)), 734, 39);
			f.getContentPane().add(lblNewLabel_2);
			
			
			//여행일정(product-during)
			JLabel lblNewLabel_3 = new JLabel("여행 일정");
			lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 16));
			lblNewLabel_3.setBounds(325, 292*i-(20*(i-1)), 92, 18);
			f.getContentPane().add(lblNewLabel_3);
			
			JLabel lblNewLabel_3_1 = new JLabel(result[2]);
			lblNewLabel_3_1.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
			lblNewLabel_3_1.setBounds(419, 292*i-(20*(i-1)), 62, 18);
			f.getContentPane().add(lblNewLabel_3_1);
			
			
			//여행 가격(product-adult_cost)
			JLabel lblNewLabel_1_1 = new JLabel("여행 가격");
			lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(579, 292*i-(20*(i-1)), 92, 18);
			f.getContentPane().add(lblNewLabel_1_1);
			
			JLabel lblNewLabel_3_2_1_2 = new JLabel("대인 : "+result[4]+"원");
			lblNewLabel_3_2_1_2.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
			lblNewLabel_3_2_1_2.setBounds(685, 292*i-(20*(i-1)), 129, 18);
			f.getContentPane().add(lblNewLabel_3_2_1_2);
			
			
			//예약하기 버튼
			JButton btnNewButton = new JButton("예약 하기");
			//버튼 누르면 실행할 기능
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ProductUI productUI = new ProductUI();
					String productId = num;
					try {
						//productUI로 화면 이동(보여줄  product-prodId값 던져줌)
						productUI.productOpen(productId);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBackground(new Color(148, 0, 211));
			btnNewButton.setBounds(908, 276*i, 128, 44);
			f.getContentPane().add(btnNewButton);
			
			
			//border 처리한 라벨
			JLabel border1 = new JLabel("");
			border1.setBounds(63, (140*i)+(130*(i-1)), 1035, 244);
			border1.setBorder(bb);
			f.getContentPane().add(border1);
		}
		
		
		f.setVisible(true);
	}

}

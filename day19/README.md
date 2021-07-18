## 1. 완성작

### 1) 영상

[https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fba8d8d1-3271-4f1d-aeb1-63c9d0be716e/bandicam_2021-07-17_20-24-58-455_-_.mp4](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fba8d8d1-3271-4f1d-aeb1-63c9d0be716e/bandicam_2021-07-17_20-24-58-455_-_.mp4)

### 2)  내가 맡은 파트
- 상품 리스트
- 상품 상세 페이지

## 2. 코드 분석

### 1)MySQL - product Table
+---------+-----------------------------+--------+----------------+------------+------------+----------+
| prod_id | title                       | during | town           | adult_cost | child_cost | image    |
+---------+-----------------------------+--------+----------------+------------+------------+----------+
| 1       | [????][??]?????? ??? ????   | 0? 1?  | ??, ??, ??     | 27900      | 10900      | ???L.jpg |
| 2       | [????][??]?????? ??? ????   | 0? 1?  | ??, ??, ??, ?? | 37900      | 20900      | ???L.jpg |
| 3       | [????] [??] ?????? ??? ???? | 0? 1?  | ??, ??, ??     | 25000      | 8900       | ???L.jpg |
+---------+-----------------------------+--------+----------------+------------+------------+----------+
### 2) Product.java

- read메소드로 MySQL에 저장된 product 테이블의 데이터를 가져온다.

```java
package travel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductDAO {
		public String[] read(String id) throws Exception {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.connector 연결 성공!!");
	
			String url = "jdbc:mysql://localhost:3306/travelDB";
			String username = "root";
			String password = "****";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2.product db연결 성공!!!");
	
		
			String sql = "select * from product where prod_id = ?";	
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,	id);
			System.out.println("3.sql 생성  성공!!!!");
	
	
			ResultSet rs = ps.executeQuery();//SQL문의 select의 결과를 ResultSet에 담는 메서드.
			System.out.println("4.SQL문 전송 성공!!!!!");
			String[] result = new String[7];//result 배열 생성
			if (rs.next()) {//rs.next()=true; 여기서 re.next()는 검색결과가 레코드에 있는지
											//검사해서 boolean으로 값 반환함.
				String prod_id = rs.getString(1);
				String title = rs.getString(2);//rs는 테이블 형식으로 된 Object여서
																			 //get으로 값 반환. getString()을 사용해서 String
				String during = rs.getString(3);
				String town = rs.getString(4);
				String adult_cost = rs.getString(5);
				String child_cost = rs.getString(6);
				String image = rs.getString(7);
				result[0] = prod_id;//나온 값들을 result 배열에 저장
				result[1] = title;
				result[2] = during;
				result[3] = town;
				result[4] = adult_cost;
				result[5] = child_cost;
				result[6] = image;
			}
			return result;//result를 리턴 해줌
			
		}// read end
	}
```

### 3) ProductListUI.java

```java
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
	public void listOpen() throws Exception {/frame 오픈
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
			String[] result = productDB.read(num);//read 기능 실행, i를 ID로 보냄
			
			
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
```

### 4) ProductListUI.java

```java
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
					reserveMain.openReserveMain(id);//id값 다음 페이지에 던져줌
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
```

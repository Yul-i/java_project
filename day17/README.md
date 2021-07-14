## 1. DB 연결 실습

### 1) 회원가입 처리(Create)

- Create메소드로 id, pw, name, tel을 받아온다.
- MemberDAO.java

```java
public int create(String id, String pw, String name, String tel) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!!");

	
		String url = "jdbc:mysql://localhost:3306/book";
		String username = "root";
		String password = "****";
		
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.book db연결 성공!!!");

		
		String sql = "insert into member values (?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);//스트림을 부품으로 만듬 SQL문 객체
		
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3.sql 생성  성공!!!!");

		int result = ps.executeUpdate();//sql문의 결과 return 받아옴
		System.out.println("4.SQL문 전송 성공!!!!!");
		System.out.println("sql문 수행 개수 "+result+"개");
		
		return result;

	}// create end
```

- MemberUI.java

```java
		JButton b1 = new JButton("가입");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// T1~t4ㅇ 입력된 값 가지고 와야 함.
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				// member 테이블에 저장하려고 함.
				// ==> 해결책 : 우리가 원하는 기능을 가진 메소드를 가지고 있는
				// 부품을 찾아야 함.
				// 램에 가져다 놓음
				MemberDAO db = new MemberDAO();
				try {
					int result = db.create(id, pw, name, tel);// 1
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "회원가입 성공");
					} else {
						JOptionPane.showMessageDialog(f, "회원가입 실패");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// 입력한거 지워버리자.
				t1.setText("");
				t2.setText("");
				t3.setText(""e);
				t4.setText("");
			}
		});
		b1.setBackground(Color.YELLOW);
		b1.setFont(new Font("굴림", Font.PLAIN, 24));
		b1.setBounds(52, 355, 104, 48);
		f.getContentPane().add(b1);2
```

### 2) 회원정보 삭제(Delete)

- delete메소드로 id를 받아온다.
- MemberDAO.java

```java
public int delete(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!!");

		String url = "jdbc:mysql://localhost:3306/book";
		String username = "root";
		String password = "****";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.book db연결 성공!!!");

		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3.sql 생성  성공!!!!");

		int result = ps.executeUpdate();
		System.out.println("4.SQL문 전송 성공!!!!!");
		System.out.println(result);
		
		return result;

	}// delete end
```

- MemberUI.java

```java
JButton b2 = new JButton("탈퇴");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// id를 입력 받아야 함
				String id = JOptionPane.showInputDialog(f, "탈퇴할 id입력");
				// db처리해야 함
				MemberDAO db = new MemberDAO();
				try {
					int result = db.delete(id);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "회원탈퇴 성공@@@");
					} else {
						JOptionPane.showMessageDialog(f, "없는 ID입니다.");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		b2.setFont(new Font("굴림", Font.PLAIN, 24));
		b2.setBackground(Color.ORANGE);
		b2.setBounds(185, 355, 104, 48);
		f.getContentPane().add(b2);
```

### 3) 회원정보 수정(Update)

- update메소드로 id, tel을 받아온다.
- MemberDAO.java

```java
public int update(String id, String tel) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!!");

		String url = "jdbc:mysql://localhost:3306/book";
		String username = "root";
		String password = "****";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.book db연결 성공!!!");

		String sql = "update member set tel = ? where id = ?";		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,	tel);
		ps.setString(2,	id);
		System.out.println("3.sql 생성  성공!!!!");

		int result = ps.executeUpdate();
		System.out.println("4.SQL문 전송 성공!!!!!");
		System.out.println(result);
		
		return result;

	}// update end
```

- MemberUI.java

```java
JButton b3 = new JButton("수정");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// id 입력 받기
				String id = JOptionPane.showInputDialog(f, "수정할 id입력");
				// tel 입력 받기
				String tel = JOptionPane.showInputDialog(f, "수정할 전화번호");
				// db 처리
				MemberDAO db = new MemberDAO();
				try {
					int result = db.update(id, tel);
					if (result==1) {
						JOptionPane.showMessageDialog(f, "전화번호 수정완료@@@");
					}else {
						JOptionPane.showMessageDialog(f, "없는 ID입니다.");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		b3.setFont(new Font("굴림", Font.PLAIN, 24));
		b3.setBackground(Color.CYAN);
		b3.setBounds(315, 355, 104, 48);
		f.getContentPane().add(b3);
```

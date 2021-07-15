## 1. 개념 정리

### 1)Data Access Object(DAO, 다오) : CRUD 기능 구현

부품(object, 객체)중에서 데이터베이스 안에 들어있는 데이터를 엑세스 해서 조작하는 기능들을 가진 클래스

### 2)Data Transfer Object(DTO, 전달용)

데이터들을 전달할 때 다 넣을 가방 역할을 할 클래스

## 2. DB 연결 실습

### 1) 회원조회 처리(Read)

- Create메소드로 id, pw, name, tel을 받아온다.
- MemberDAO.java

```java
public String[] read(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!!");

		String url = "jdbc:mysql://localhost:3306/book";
		String username = "root";
		String password = "****";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.book db연결 성공!!!");

		String sql = "select * from member where id = ?";		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,	id);
		System.out.println("3.sql 생성  성공!!!!");

		ResultSet rs = ps.executeQuery();//true false
		System.out.println("4.SQL문 전송 성공!!!!!");
//		System.out.println(rs.next());//2번쓰면 안된다.
		String[] result = new String[4];
							//{"win", "win", "win", "win"}
		if (rs.next()) {
			//테이블에 검색 결과가 있다라는 얘기
			String id2 = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);

			result[0] = id2;
			result[1] = pw;
			result[2] = name;
			result[3] = tel;
		}
		return result;
		
	}// read end
```

- MemberUI.java

```java
		public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("검색할 아이디 입력");

		MemberDAO db = new MemberDAO();
		String[] result = db.read(id);
		System.out.println("검색된 id는 "+result[0]);
		System.out.println("검색된 pw는 "+result[1]);
		System.out.println("검색된 name는 "+result[2]);
		System.out.println("검색된 tel는 "+result[3]);
		//l1.setText(result[0]);
		//b1.setText(result[1]);
	}
```

## 3. 그래픽(Swing)

### 1) 새창 열기

- Main.java

```java
b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				새창1 w1 = new 새창1();
				w1.open1("너무 더워서");
			}
		});

b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				새창2 w2 = new 새창2();
				String num = t3.getText();
				int temp = Integer.parseInt(num);
				w2.open4(temp);
			}
		});
```

- 새창1.java

```java
public class 새창1 {
	public void open1(String m) {
	
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창1을 닫습니다.");
//				System.exit(0);//완전 종료
				f.dispose();//이 프레임만 닫힘.
			}
		});
	}
}
```

- 새창2.java

```java
public class 새창2 {
	public void open2(int temp) {
		String result;
		if (temp>30) {
			result = "폭염";
		}else {
			result = "견딜만해요!";
		}
		JButton b4 = new JButton(result);
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창4을 닫습니다.");
//				System.exit(0);
				f.dispose();//이 프레임만 닫힘.
			}
		});
	}
}
```

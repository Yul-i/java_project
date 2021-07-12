### 1) 클래스 생성 할때

- 클래스를 만들때는 그 부품들이 가지는 특징을 선택해서 틀을 만들게 된다.
- 특징

    1) 성질(멤버변수) : 채널, 볼륨, 전원

    2) 동작(멤버메서드) : tv켜다, tv끄다, 볼륨up하다.

### 2) class에는 Object가 생략되어있다.

```java
public class TV extends Object{//extends Object가 생략되어있음(default)
```

### 3) class 는 전역변수 선언시 자동 초기화 된다.

```java
public int ch;//자동 초기화 , 전역변수
	//전역변수는 자동 초기화가 된다.
	//<-> 지역변수는 자동초기화가 안된다.
	public int vol;
	public boolean onOff;
```

### 4) 메서드 정의할 때 고려사항

- 입력값이 있는가
- 반환값이 있는가

```java
public void tv켜다() {
		System.out.println("리모컨으로 on버튼을 누르다.");
	}
	
	public void tv끄다() {
		System.out.println("리모콘으로 off버튼을 누르다.");
	}
	
	public void 볼륨up하다() {
		System.out.println("볼륨을 1씩 up");
	}
```

### 5) 클래스 사용하기

- new를 하면, 멤버변수들이 heap 영역에 복사된다.
- 참조형 변수에는 멤버변수들이 복사된 heap영역의 주소가 들어간다.

```java
package 클래스사용;

import 클래스생성.TV;

public class 내거실 {

	public static void main(String[] args) {
		TV myTv = new TV();
		//new를 하면, 멤버변수들이 heap 영역에 복사된다.
		//myTv 참조형 변수에는 멤버변수들이 복사된 heap영역의 주소가 들어간다.
		myTv.ch = 7;
		//myTv안에 들어있는 주소가 가르키는 ch변수에 7을 넣어라는 의미
		myTv.vol = 9;
		myTv.onOff = true;
		System.out.println("myTv의 채널은 "+ myTv.ch);
		System.out.println("myTv의 볼륨은 "+ myTv.vol);
		System.out.println("myTv의 전원은 "+ myTv.onOff);
//		myTv.onOff=false;
		System.out.println(myTv);
		
		TV yourTv= new TV();
		yourTv.ch = 9;
		yourTv.vol = 12;
		yourTv.onOff = true;
		System.out.println("yourTv의 채널은 "+ yourTv.ch);
		System.out.println("yourTv의 볼륨은 "+ yourTv.vol);
		System.out.println("yourTv의 전원은 "+ yourTv.onOff);
		System.out.println(yourTv);

	}

}
```

## 2. 입력값 사용

### 1) 메소드(입력값1, 입력값2)

- 입력값연습 class
- 입력값에서 정확하게 맞추어야 하는 것

    1)개수

    2)타입

    3)순서

```java
package 클래스생성;

public class 입력값연습 {
	public void add(int x, int y) {
		System.out.println(x + y);
	}

	public void minus(int x) {
		System.out.println(x - 100);
	}

	public void mul(int x, String y) {
		int result = x * 10;
		System.out.println(y + "가 " + result + "원을 냈습니다.");
	}
}
```

- 입력값사용 class : 입력값의 갯수, 순서를 맞춰준다.

```java
package 클래스생성;

public class 입력값사용 {
	public static void main(String[] args) {
		입력값연습 t = new 입력값연습();
		
		//입력값 갯수, 순서 중요하다.
		t.add(4, 6);
		t.minus(5000);
		t.mul(1000, "너구리");
	}
```

### 2) 브런치카페 - 응용

- 계산기 class

```java
package 클래스생성;

public class 계산기 {
	public void order(String food) {
		System.out.println("당신이 주문한 것은 "+food+"입니다.");
	}
	// 사직연산 계산기
	public void 더하기(int sum1, int sum2) {
		System.out.println("더하기 기능 처리");
		int result = sum1 + sum2;
		System.out.println("두 수의 합의 결과는 "+ result);
	}

	public void 빼기() {
		System.out.println("빼기 기능 처리");
	}

	public void 곱하기(int price, int count) {
		System.out.println("곱하기 기능 처리");
		int result = price * count;
		System.out.println("두 수의 곱의 결과는 "+ result);
	}

	public void 나누기(double sum1, double sum2) {
		System.out.println("나누기 기능 처리");
		double result = sum1 / sum2;
		System.out.println("두 수의 나누기의 결과는 "+ result);
	}
}
```

- 브런치카페class

```java
package 클래스생성;

public class 브런치카페 {
	
	public static void main(String[] args) {
		int coffeePrice = 3500;
		int coffeeCount = 5;
		
		int bagelPrice = 3000;
		int bagelCount = 3;
		
		계산기 cal = new 계산기();
		cal.곱하기(coffeePrice, coffeeCount);
		cal.곱하기(bagelPrice, bagelCount);
		
		// 커피주문 해보세요.
		cal.order("커피");
		cal.order("베이글");
		
		cal.더하기(1000, 2000);
		cal.나누기(55.5, 11.2);
	}

}
```

## 3. DB를 다루기 위한 연습

### 1) DB작업

   1. DB, 테이블 생성
   2. 데이터 조작(CRUD : CREATE, READ, UPDATE, DELETE)

### 2)  회원가입&로그인

- MemberDB.java

```java
package 클래스사용;

public class MemberDB {
	public void login(String id, String pw) {
		// 회원가입시 사용한 id가 apple, pw는 1111
		if (id.equals("apple") && pw.equals("1111")) {
			System.out.println("로그인 성공!");
		} else {

			System.out.println("로그인 실패!");
		}
	}

	public void create(String id, String pw, String name, String tel) {

		System.out.println(ip + port + "에 연결 되었습니다.");
		System.out.println("회원가입 처리");
		System.out.println("도착한 id는 " + id);
		System.out.println("도착한 pw는 " + pw);
		System.out.println("도착한 name는 " + name);
		System.out.println("도착한 tel는 " + tel);
	}

	public void read(String id) {
		System.out.println("회원정보 검색 처리");
	}

	public void update() {
		System.out.println("회원정보 수정 처리");
	}

	public void delete(String id) {
		System.out.println("회원탈퇴 처리");
		System.out.println(id + "님의 탈퇴가 완료되었습니다.");
	}
}
```

- Login

```java
	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		
		
		MemberDB db = new MemberDB();
		db.login(id, pw);
	}
```

- 회원가입

```java
	public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		String name = JOptionPane.showInputDialog("이름 입력");
		String tel = JOptionPane.showInputDialog("전화번호 입력");
		
		
		MemberDB db = new MemberDB();
		db.create(id, pw, name, tel);

	}
```

- 회원탈퇴

```java
	public static void main(String[] args) {
		MemberDB db = new MemberDB();
		
		String id = JOptionPane.showInputDialog("회원 탈퇴하실 id를 입력해주세요.");
		db.delete(id);
	}
```

### 2) 게시판 등록, 삭제

- BbsDB.java

```java
package 클래스사용;

public class BbsDB {
	public void create(String title, String contents) {
		System.out.println("제목 : "+title);
		System.out.println("내용 : "+contents);
	}
	
	public void delete(String title) {
		System.out.println(title+" 글이 삭제 되었습니다.");
	}
}
```

- 게시판등록.java

```java
public static void main(String[] args) {
		BbsDB db = new BbsDB();
		String title = JOptionPane.showInputDialog("제목을 입력해주세요");
		String contents = JOptionPane.showInputDialog("내용을 입력해주세요.");
		
		db.create(title, contents);
	}
```

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/943b1c28-715a-4cba-a132-6a9885d36ceb/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/943b1c28-715a-4cba-a132-6a9885d36ceb/Untitled.png)

- 게시판삭제.java

```java
public static void main(String[] args) {
		BbsDB db = new BbsDB();
		String title = JOptionPane.showInputDialog("삭제할 글 제목을 입력해주세요.");
		db.delete(title);

	}
```

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/868c283b-05c7-47df-ba2d-dab52f209170/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/868c283b-05c7-47df-ba2d-dab52f209170/Untitled.png)

## 3. JAVA - DB 연결

### 1) DB연결

- 연결할 mysql server 정보가 필요
- 연결할 mysql server에 승인을 받아야 함. 필요한 정보 : id, pw

```java

		S
		// JAVA와 mysql과의 연결 순서 정해져있음.(JDBC 프로그래밍)
		// JAVA DB Connectivity
		// 1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 설정 성공!!");
		// 2. mysql server의 db와 연결하고 승인을 받자
		// jdbc:mysql://localhost:3306/shoes
		String url = "jdbc:mysql://" + ip + ":" + port + "/shoes";
		DriverManager.getConnection(url, user, pass);
		System.out.println("2. mysql 서버 승인/연결 성공!!");
		// 3. sql을 만들자
		// 4. sql을 mysql server에게 전송
```

### 2) JAVA와 mysql과의 연결 순서 정해져있음.(JDBC 프로그래밍)

1. connector 설정

2. mysql server의 db와 연결하고 승인을 받자

3. sql을 만들자

4. sql을 mysql server에게 전송

### 3) MySQL Connector 설치

- MAVEN에서 Mysql Connector 검색

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d8c22a6f-a4b4-4052-b07b-f02ee155be81/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d8c22a6f-a4b4-4052-b07b-f02ee155be81/Untitled.png)

- MySQL 버전 5.5.62 버전은 5.1.46 jar 을 받아주자

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5ba89653-91c6-4bcd-951e-0056c7957864/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5ba89653-91c6-4bcd-951e-0056c7957864/Untitled.png)

- Java Project를 우클릭 해서 Build Path - configure Build path를 들어간다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/deaac930-1ff3-4ce7-84b7-22e360e12daf/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/deaac930-1ff3-4ce7-84b7-22e360e12daf/Untitled.png)

- mysql Connector를 추가해주고 Apply - Apply and Close 한다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1fb9c669-b187-4a1d-bd58-e9b205977794/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1fb9c669-b187-4a1d-bd58-e9b205977794/Untitled.png)

자세한건 다음 Day에~~

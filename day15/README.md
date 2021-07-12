## 1. 복습

### 1) 클래스 생성

- 성질 : 멤버 변수
- 동작 : 멤버 메서드(*)

## 2. 메서드반환값

### 1) return/void

- 리턴 하다 : 처리한 값을 다음 처리 할 때 다시 가져와야 할 때.

```java
//cal.add(100, 200)	

	public int add(int x, int y) {
		int result = x + y;
		System.out.println("두 수의 합은 "+ result);
		return result;//반환시 return이라고 꼭 써줘야 함.
		}
```

- 기능정의, 함수정의, 메서드 정의
- x, y는 지역변수, add안에서만 사용 가능
- 메서드 사용(호출, call, 콜)
- 메서드 안에서 값을 전달할 목적으로 생성되는 변수 =>
x, y: 매개변수, parameter(파라메터)
- void 없다라는 의미, 반환값이 없다.

- main

```java
		int 화분_price = 10000;
		int 삽_price = 5000;
		//두 개의 합을 구해보자.
		
		계산기 cal = new 계산기();
		int result1 = cal.add(화분_price, 삽_price);
		
		int 물조리개_price = 3000;
		int 식물_price = 9000;
		int result2 = cal.add(물조리개_price, 식물_price);
		
		//계산기가 main 메서드에게 더한 결과 값을 반환하다.
		int result3 = cal.add(result1, result2);
		System.out.println("최종 결제한 금액은 "+ result3);
```

### 2) 다양한 리턴

```java
public int add1() { //double, float, long
		return 100;
	}
	
	public double add2() {//float, double
		return 11.11;
	}

	public char add3() {
		return 'a';
	}
	
	public boolean add4() {
		boolean result = true;
		return result;
	}
	
	public String add5() {
		return "OK";
	}
```

- 주소값 반환 - 참조형(주소) 가 반환된다.

```java
public Date add6() {//
		Date date = new Date();
		return date;
	}
	
	public int[] add7() {//int배열 주소
		int[] num = {1,2,3};
		return num;
	}
	
	public 계산기 add8() {//타입인 클래스
		계산기 cal = new 계산기();
		return cal;
	}
```

- 메서드 사용하기

```java
public static void main(String[] args) {
		다양한리턴 r = new 다양한리턴();
		int result1  = r.add1();
		double result2  = r.add2();
		char result3  = r.add3();
		boolean result4  = r.add4();
		String result5  = r.add5();
		Date date = new Date();//Mon Jul 12 22:45:12 KST 2021
		Date result6  = r.add6();
		System.out.println(result6);
		int[] result7  = r.add7();
		for (int i : result7) {
			System.out.println(i+" "); // 1,2,3
		}
		계산기 result8  = r.add8();
		result8.add(200, 100); //두 수의 합은 300
	}
```

### 3) 리턴 응용

```java
public int get(int a) {
		return a*2;
	}
	
	public double get() {
		return 11.11;
	}
	
	public int[] get2() {
		//int[] 배열을 만든 후,
		//배열의 주소를 리턴
		int[] num = {10,20,30,40,50};
		return num;
	}
	
	public Random get3() {
		//초기화 시켜주지 않으면 쓰레기 값;
		//r 변수에 그냥 null 넣은거(부품이 안만들어진거)
//		Random r = null

		//부품 생성하고 null 기본값으로 넣은거
		Random r = new Random();
		return r;
	}
```

```java
public static void main(String[] args) {
		다양한리턴2 r2 = new 다양한리턴2();
		int result1 = r2.get(100); //result1 = 200
		double result2 = r2.get(); //result2 = 11.11;
		int[]result3 = r2.get2(); //{10,20,30,40,50};
		for (int x : result3) {
			System.out.println(x); //10 20 30 40 50
		}
		Random rd = r2.get3();
		System.out.println(rd.nextInt());
	}
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

## 3. Java-DB 연결

### 1) DB 만들기

- 자바에서 db 처리할 때는 DML 중심으로 클래스를 만든다.
- DB연결 할 때는 DB를 단위로 연결한다.
- DB연결하여 데이터 처리를 하는 클래스를 만들 때는 테이블 단위로 만든다.
- 테이블(entity, 개체)
- create(insert~into values)

### 2) 자바와 DB연결하는 프로그램(JDBC) 순서

- 메서드 생성, 메서드 안에서 연결 코드를 작성한다.

```java
public void create(String id, String pw, String name, String tel){

}; 
```

**1. jdbc connector 설정**

- 연결해줘야 하는 jdbc class 찾기.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/398919c7-cc11-40da-bf98-2959fdff2b87/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/398919c7-cc11-40da-bf98-2959fdff2b87/Untitled.png)

```java
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!!");
```

- 경고줄 뜨면 Add throws declaration 선택하기

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b2364c1c-504a-4c77-904d-98c0b239f358/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b2364c1c-504a-4c77-904d-98c0b239f358/Untitled.png)

- ClassNotFound를 날려주고 Exception만 남기기

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/64af5256-90e5-4394-9609-6f4cf115749f/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/64af5256-90e5-4394-9609-6f4cf115749f/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8d9d7f12-ba84-413e-a34c-14b50b8ade62/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8d9d7f12-ba84-413e-a34c-14b50b8ade62/Untitled.png)

**2. java에서 db로 연결**

- 연결할 주소 url (ip, port, db명), username, password

```java
String url = "jdbc:mysql://localhost:3306/shoes";
String username = "root";
String password = "1111";
```

- 부품을 리턴 해줌. (connection)을 리턴

```java
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.shoes db연결 성공!!!");
```

**3. SQL문을 만든다.**

```java
String sql = "insert into member values (?,?,?,?)";
		//										('apple,'apple','apple','apple')
```

- PrepareStatement : sql을 나타내는 부품.
- 부품을 램에 넣어놓은 주소만 있으면 됨.
- ps부품을 2단계에서 획득한 con부품이 만들어서 return.
- sql의 객체이다.

```java
	PreparedStatement ps = con.prepareStatement(sql);
		//?에 String으로 이 순서대로 넣어줘라.
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3.sql 생성  성공!!");
```

**4. SQL문을 mysql로 전송한다.**

```java
		int result = ps.executeUpdate();
		System.out.println("4.SQL문 전송 성공!!!!!");
		System.out.println(result);//성공시 1 실패시 0 
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

### 3) 위에서 만든 메서드 사용하기

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

- 회원정보수정

```java
public static void main(String[] args) throws Exception {
		//String sql = "update member set tel = ? where id = ?";
		String id = JOptionPane.showInputDialog("수정할 아이디 입력");
		String tel = JOptionPane.showInputDialog("변경할 전화번호 입력");

		MemberDB db = new MemberDB();
		db.update(id, tel);

	}
```

- 회원삭제

```java
public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("아이디 입력");

		MemberDB db = new MemberDB();
		db.delete(id);

	}
```

## 3. 오늘의 용어

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

## 3. 오늘의 용어

### 1) CLI(Command-line interface)

- 명령 줄 인터페이스 또는 명령어 인터페이스는 가상 터미널 또는 텍스트 터미널을 통해 사용자와 컴퓨터가 상호 작용하는 방식을 뜻한다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2badf081-dbe1-43d0-80c4-f96341386643/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2badf081-dbe1-43d0-80c4-f96341386643/Untitled.png)

> [https://ko.wikipedia.org/wiki/명령_줄_인터페이스](https://ko.wikipedia.org/wiki/%EB%AA%85%EB%A0%B9_%EC%A4%84_%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4)

### 2) GUI(graphical user interface)

- 그래픽 사용자 인터페이스는 사용자가 편리하게 사용할 수 있도록 입출력 등의 기능을 알기 쉬운 아이콘 따위의 그래픽으로 나타낸 것이다.

> [https://ko.wikipedia.org/wiki/그래픽_사용자_인터페이`스](https://ko.wikipedia.org/wiki/%EA%B7%B8%EB%9E%98%ED%94%BD_%EC%82%AC%EC%9A%A9%EC%9E%90_%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%60%EC%8A%A4)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c5f18645-a18e-4f16-a67b-2c22b8555c7d/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c5f18645-a18e-4f16-a67b-2c22b8555c7d/Untitled.png)

### 3) Entity (개체)

- 철학 또는 전산학에서의 개체는 인간의 개념 또는 정보의 세계에서 의미있는 하나의 정보 단위이다.
- 사물의 본질적인 성질을 속성이라고 하며, 관련있는 속성들이 모여서 의미있는 하나의 정보 단위를 이룬 것이 바로 개체에 해당한다.
- 파일시스템이나 데이터베이스에서의 레코드가 개체에 해당한다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d8580a46-1920-4789-ae73-29ab45692f65/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d8580a46-1920-4789-ae73-29ab45692f65/Untitled.png)

> [https://ko.wikipedia.org/wiki/개체_(컴퓨팅)](https://ko.wikipedia.org/wiki/%EA%B0%9C%EC%B2%B4_(%EC%BB%B4%ED%93%A8%ED%8C%85))

### 4) TCP(전송 제어 프로토콜)

- 전송 제어 프로토콜은 인터넷 프로토콜 스위트의 핵심 프로토콜 중 하나로, IP와 함께 TCP/IP라는 명칭으로도 널리 불린다.
- TCP는 근거리 통신망이나 인트라넷, 인터넷에 연결된 컴퓨터에서 실행되는 프로그램 간에 일련의 옥텟을 안정적으로, 순서대로, 에러없이 교환할 수 있게 한다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6424014e-7ce2-4e17-926b-545640f14882/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6424014e-7ce2-4e17-926b-545640f14882/Untitled.png)

> [https://ko.wikipedia.org/wiki/전송_제어_프로토콜](https://ko.wikipedia.org/wiki/%EC%A0%84%EC%86%A1_%EC%A0%9C%EC%96%B4_%ED%94%84%EB%A1%9C%ED%86%A0%EC%BD%9C)

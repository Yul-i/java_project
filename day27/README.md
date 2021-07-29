## 1. 복습

- result = ps.executeUpdate(); //성공적으로 반영된 레코드의 갯수 int로 나타냄.
- result를 return 해서 성공 유무 판별하도록 코드 수정하기.

### 1) create

- 회원DAO.java

```java
public int create(회원Bag bag) {//던져주면서 참조형 변수(주소 담은 값) 같이 던져준거라 선언 안해줘도 된다.
	    
		System.out.println("전달된 id는 "+bag.getId());
		System.out.println("전달된 pw는 "+bag.getPw());
		System.out.println("전달된 name는 "+bag.getName());
		System.out.println("전달된 tel는 "+bag.getTel());
			
			int result = 0; <- 지역 변수 선언(초기화 필요)

		   try {
			//자바와 db연결하는 프로그램(JDBC) 순서
			  //1. jdbc connector설정
			  Class.forName("com.mysql.jdbc.Driver");
			  System.out.println("1. connector연결 성공!!!");
			  
			  //2. java에서 db로 연결: 
			  //   연결할 주소url(ip, port, db명), username, password
			  String url = "jdbc:mysql://localhost:3306/shop";
			  String username = "root";
			  String password = "1234";
			  Connection con = DriverManager.getConnection(url, username, password);
			  System.out.println("2. shoes db연결 성공!!!");
			  
			  //3. sql문을 만든다.
			  String sql = "insert into member values (?, ?, ?, ?)";
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, bag.getId());
			  ps.setString(2, bag.getPw());
			  ps.setString(3, bag.getName());
			  ps.setString(4, bag.getTel());
			  System.out.println("3. sql문 생성 성공!!!");
			  
			  //4. sql문을 mysql로 전송한다.
			  result = ps.executeUpdate();
			  System.out.println("4. sql문 전송 전송");
			  System.out.println(result);
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>>드라이버 없음!!");
		} catch (SQLException e) {//2-4단계
			System.out.println("2-4번 에러>> DB관련 처리하다 에러 발생함!!!");
		}
		   return result; // <- result 반환
	}
```

- create.jsp

```java
<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
    /*  1. 전송된 데이터 받아줘야 함 */
    	String id = request.getParameter("id");	
    	String pw = request.getParameter("pw");	
    	String name = request.getParameter("name");	
    	String tel = request.getParameter("tel");
    
    	회원Bag bag = new 회원Bag();
    	bag.setId(id);
    	bag.setPw(pw);
    	bag.setName(name);
    	bag.setTel(tel);
    	
    	회원DAO2 dao = new 회원DAO2();
    	int result = dao.create(bag); //0 or 1;
    	String text = "회원가입 실패했습니다. 재가입 해주세요";
    	if(result==1){
    		text = "회원 가입 성공했습니다. 축하드립니다.";
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
	실행 결과는 <%= text %>
</body>
</html>
```

### 2) update

- 회원DAO.java

```java
public int update(회원Bag bag) { // int로 반환

		System.out.println("전달된 id는 "+bag.getId());
		System.out.println("전달된 name는 "+bag.getName());
		System.out.println("전달된 tel는 "+bag.getTel());
		int result = 0;
		   try {
			//자바와 db연결하는 프로그램(JDBC) 순서
			  //1. jdbc connector설정
			  Class.forName("com.mysql.jdbc.Driver");
			  System.out.println("1. connector연결 성공!!!");
			  
			  //2. java에서 db로 연결: 
			  //   연결할 주소url(ip, port, db명), username, password
			  String url = "jdbc:mysql://localhost:3306/shop";
			  String username = "root";
			  String password = "1234";
			  Connection con = DriverManager.getConnection(url, username, password);
			  System.out.println("2. shoes db연결 성공!!!");
			  
			  //3. sql문을 만든다.
			  String sql = "update member set tel = ?, name = ? where id = ?";
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, bag.getTel());
			  ps.setString(2, bag.getName());
			  ps.setString(3, bag.getId());
			  System.out.println("3. sql문 생성 성공!!!");
			  
			  //4. sql문을 mysql로 전송한다.
			  result = ps.executeUpdate();
			  System.out.println("4. sql문 전송 전송");
			  System.out.println(result);
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>>드라이버 없음!!");
		} catch (SQLException e) {//2-4단계
			System.out.println("2-4번 에러>> DB관련 처리하다 에러 발생함!!!");
		}
		   
		   return result;
	}
```

- update.jsp

```java
<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	String name = request.getParameter("name");
    	String tel = request.getParameter("tel");
    	
    	회원Bag bag = new 회원Bag();
    	bag.setId(id);
    	bag.setName(name);
    	bag.setTel(tel);
    	
    	회원DAO2 dao = new 회원DAO2();
    	int result = dao.update(bag);
    	String text = "회원 정보 수정 실패했습니다.";
 		if(result==1){
 			text="회원 정보 수정 성공했습니다.";
 		}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= text %>
</body>
</html>
```

### 3) delete

- 회원DAO.java

```java
public int delete(회원Bag bag) {
		System.out.println("전달된 id는 "+bag.getId());
			int result = 0;
		   try {
			//자바와 db연결하는 프로그램(JDBC) 순서
			  //1. jdbc connector설정
			  Class.forName("com.mysql.jdbc.Driver");
			  System.out.println("1. connector연결 성공!!!");
			  
			  //2. java에서 db로 연결: 
			  //   연결할 주소url(ip, port, db명), username, password
			  String url = "jdbc:mysql://localhost:3306/shop";
			  String username = "root";
			  String password = "1234";
			  Connection con = DriverManager.getConnection(url, username, password);
			  System.out.println("2. shoes db연결 성공!!!");
			  
			  //3. sql문을 만든다.
			  String sql = "delete from member where id = ?";
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, bag.getId());
			  System.out.println("3. sql문 생성 성공!!!");
			  
			  //4. sql문을 mysql로 전송한다.
			  result = ps.executeUpdate();
			  System.out.println("4. sql문 전송 전송");
			  System.out.println(result);
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>>드라이버 없음!!");
		} catch (SQLException e) {//2-4단계
			System.out.println("2-4번 에러>> DB관련 처리하다 에러 발생함!!!");
		}
		   	return result;
	}
```

- delete.jsp

```java
<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 
    	String id = request.getParameter("id");
    	//DB처리하는 DAP에게 주면서 탈퇴하는 SQL문을 만들어서 전송
    	
    	//가방을 만들어서 데이터를 넣자.
    	회원Bag bag = new 회원Bag();
    	bag.setId(id);
    	
    	//DAO를 만들어서 탈퇴 요청
    	회원DAO2 dao = new 회원DAO2();
    	int result = dao.delete(bag);
    	String text = "회원 탈퇴 처리 실패";
    	if(result==1){
    		text = "회원 탈퇴 처리 성공";
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= text %>
</body>
</html>
```

## 2. ORM(object relationalDB mapping)

- 객체와 관계형 데이터베이스의 데이터를 자동으로 매핑(연결)해주는 것을 말한다.
- 자바 DTO 클래스 하나당 RDB 테이블의 한 행
- 검색 결과가 많은 경우, 가방 역할의 DTO를 넣어줄 컨테이너 역할의 클래스가 필요

    → ArrayList가 컨테이너 역할

## 3) UI-DTO-DAO-DB(read)

### 1) id값으로 하나의 레코드 가져오기

- member.jsp

```html
<form action="read.jsp">
   ID: <input name = "id"><br>
   <button>회원검색 처리</button>
</form>
```

- read.jsp

```java
<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    	String id = request.getParameter("id");
    	
    	회원Bag bag = new 회원Bag();//값 전달하는 가방
    	bag.setId(id);
    	
    	회원DAO2 dao = new 회원DAO2();
    	회원Bag bag2 = dao.read(bag);//값 가져온 가방
    	
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원정보 검색 결과 입니다.</h3>
	id : <%= bag2.getId() %> <br>
	pw : <%= bag2.getPw() %> <br>
	name : <%= bag2.getName() %> <br>
	tel : <%= bag2.getTel() %> <br>
</body>
</html>
```

- 회원Bag.java

```java
package shop.dto;

public class 회원Bag {
	private String id;	
	private String pw;
	private String name;
	private String tel; 
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
```

- 회원DAO2.java

```java
public 회원Bag read(회원Bag bag) {
		System.out.println("전달된 id는 "+bag.getId());
			
			ResultSet rs = null;//참조형 초기화 null //메서드 안에서 선언된 변수는 모두 지역변수
			//지역변수는 초기화를 해줘야 한다.
			회원Bag bag2 = new 회원Bag();//값 가져오는 가방과 값 저장하는 가방은 서로 다름
			
		   try {
			//자바와 db연결하는 프로그램(JDBC) 순서
			  //1. jdbc connector설정
			  Class.forName("com.mysql.jdbc.Driver");
			  System.out.println("1. connector연결 성공!!!");
			  
			  //2. java에서 db로 연결: 
			  //   연결할 주소url(ip, port, db명), username, password
			  String url = "jdbc:mysql://localhost:3306/shop";
			  String username = "root";
			  String password = "1234";
			  Connection con = DriverManager.getConnection(url, username, password);
			  System.out.println("2. shoes db연결 성공!!!");
			  
			  //3. sql문을 만든다.
			  String sql = "select * from member where id = ?";
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, bag.getId());
			  System.out.println("3. sql문 생성 성공!!!");
			  
			  //4. sql문을 mysql로 전송한다.
			  rs = ps.executeQuery();
			  System.out.println("4. sql문 전송 전송");
//			  System.out.println("검색 결과는 "+rs.next());//두번쓰면 안되서 주석
			  if (rs.next()) {
				  System.out.println("검색 결과가 있음");
				  String id = rs.getString(1); //rs.getString("컬럼명"); //sql은 인덱스 1부터
				  String pw = rs.getString(2);
				  String name = rs.getString(3);
				  String tel = rs.getString(4);
				  System.out.println(id+ " " + pw + " "+ name+ " "+tel);
				  bag2.setId(id); //새로 생성한 bag에 값을 넣어준다.
				  bag2.setPw(pw);
				  bag2.setName(name);
				  bag2.setTel(tel);
			  }else {
				  System.out.println("검색 결과가 없음");
			  }
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>>드라이버 없음!!");
			e.printStackTrace();//에러 정보
		} catch (SQLException e) {//2-4단계
			System.out.println("2-4번 에러>> DB관련 처리하다 에러 발생함!!!");
			e.printStackTrace();
		}
		   return bag2; // bag2를 리턴해준다.
	}
```

### 2) table 통째로 가져오기(day28에서 이어짐)

- member.jsp

```html
<h3>회원 전체 검색</h3>
<a href="all.jsp">전체 검색 페이지로</a>
```

- all.jsp

```java
<%@page import="shop.dto.회원Bag"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.db.회원DAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% //스크립트릿(서버에서 돌아가는 작은 포르그램)
    
    	//jsp 파일 자동 import 단축키 : 클릭 후, 컨트롤+쉬프트+m
    	회원DAO2 dao = new 회원DAO2();
    	ArrayList<회원Bag> list = dao.read();      	
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= list %><!-- 표현식 -->
</body>
</html>
```

- 회원DAO2.java

```java
public ArrayList<회원Bag> read() {
		
			ResultSet rs = null;//참조형 초기화 null //메서드 안에서 선언된 변수는 모두 지역변수
			//지역변수는 초기화를 해줘야 한다.
			
			//가방을 넣어 줄 컨테이너를 하나 만들어주자.
			//java파일에서 자동 import : ctrl+shift+o(영문)
			ArrayList<회원Bag> list = new ArrayList<회원Bag>();
			
		   try {
			//자바와 db연결하는 프로그램(JDBC) 순서
			  //1. jdbc connector설정
			  Class.forName("com.mysql.jdbc.Driver");
			  System.out.println("1. connector연결 성공!!!");
			  
			  //2. java에서 db로 연결: 
			  //   연결할 주소url(ip, port, db명), username, password
			  String url = "jdbc:mysql://localhost:3306/shop";
			  String username = "root";
			  String password = "1234";
			  Connection con = DriverManager.getConnection(url, username, password);
			  System.out.println("2. shoes db연결 성공!!!");
			  
			  //3. sql문을 만든다.
			  String sql = "select * from member"; //* 모두
			  PreparedStatement ps = con.prepareStatement(sql);
			  System.out.println("3. sql문 생성 성공!!!");
			  
			  //4. sql문을 mysql로 전송한다.
//			  result = ps.executeUpdate();//cud일때만 씀
			  rs = ps.executeQuery();
			  System.out.println("4. sql문 전송 전송");
//			  System.out.println("검색 결과는 "+rs.next());//두번쓰면 안되서 주석
			  while (rs.next()) {//row 개수만큼 반복하게 됨.
				  System.out.println("검색 결과가 있음");
				  //가방을 만들어서 table에서 하나의 row를 꺼내준다음 가방에 넣어야 한다.
				  회원Bag bag2 = new 회원Bag();
				  String id = rs.getString(1); //rs.getString("컬럼명"); //sql은 인덱스 1부터
				  String pw = rs.getString(2);
				  String name = rs.getString(3);
				  String tel = rs.getString(4);
				  System.out.println(id+ " " + pw + " "+ name+ " "+tel);
				  bag2.setId(id);
				  bag2.setPw(pw);
				  bag2.setName(name);
				  bag2.setTel(tel);
				  //만들어진 가방을 컨테이너에 넣어주어야 한다.
				  list.add(bag2); //list에 가방을 쏙 넣어준다.
			  }
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>>드라이버 없음!!");
			e.printStackTrace();//에러 정보
		} catch (SQLException e) {//2-4단계
			System.out.println("2-4번 에러>> DB관련 처리하다 에러 발생함!!!");
			e.printStackTrace();
		}
		   return list; //list 반환
	}
```

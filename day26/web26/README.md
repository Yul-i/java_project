## 1. 복습

### 1) build 설정

- 부품이 없을때 설정하는 방법
- 프로젝트를 선택해서 Build Path-Configure Build Path로 들어간다.
- ADD Library를 클릭한다.
- JRE 부품이 없어서, JRE System Library를 선택한다.
- 다음으로 넘어가서, 설치된 JRE 버전과 사용하려는 버전을 함께 선택해준다.
- 같은 방법으로 Tomcat을 설치하려면 Server Runtime을 선택한다.
- 필요한 부품이 로드 되면 apply-apply and close 순으로 창을 닫아준다.


## 2) UI-DTO-DAO-DB(create, update, delete)

### 1) create

- member.jsp

```html
<h3>회원 가입</h3>
<form action="insert.jsp">
   ID: <input name = "id"><br>
   PW: <input name = "pw"><br>
   이름: <input name = "name"><br>
   tel: <input name = "tel"><br>
   <button>회원가입 처리</button>
</form>
```

- insert.jsp

```html
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
    	dao.create(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
	전송된 회원정보의 sql문을 전송함.
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
public void create(회원Bag bag) {

		System.out.println("전달된 id는 "+bag.getId());
		System.out.println("전달된 pw는 "+bag.getPw());
		System.out.println("전달된 name는 "+bag.getName());
		System.out.println("전달된 tel는 "+bag.getTel());
		
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
			  int result = ps.executeUpdate();
			  System.out.println("4. sql문 전송 전송");
			  System.out.println(result);
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>>드라이버 없음!!");
		} catch (SQLException e) {//2-4단계
			System.out.println("2-4번 에러>> DB관련 처리하다 에러 발생함!!!");
		}
	}
```

### 2) update

- member.jsp

```html
<h3>회원 수정</h3>
<form action="update.jsp">
   ID: <input name = "id"><br>
   이름: <input name = "name"><br>
   tel: <input name = "tel"><br>
   <button>회원수정 처리</button>
</form>
```

- update.jsp

```html
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
    	dao.update(bag);
 
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	회원 수정이 완료되었습니다.
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
public void update(회원Bag bag) {
		System.out.println("전달된 id는 "+bag.getId());
		System.out.println("전달된 name는 "+bag.getName());
		System.out.println("전달된 tel는 "+bag.getTel());
		
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
			  int result = ps.executeUpdate();
			  System.out.println("4. sql문 전송 전송");
			  System.out.println(result);
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>>드라이버 없음!!");
		} catch (SQLException e) {//2-4단계
			System.out.println("2-4번 에러>> DB관련 처리하다 에러 발생함!!!");
		}
	}
```

### 3) delete

- member.jsp

```html
<h3>회원 탈퇴</h3>
<form action="delete.jsp">
   ID: <input name = "id"><br>
   <button>회원탈퇴 처리</button>
</form>
```

- delete.jsp

```html
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
    	dao.delete(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	회원 탈퇴가 처리 되었음
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
public void delete(회원Bag bag) {
		System.out.println("전달된 id는 "+bag.getId());
		
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
			  int result = ps.executeUpdate();
			  System.out.println("4. sql문 전송 전송");
			  System.out.println(result);
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>>드라이버 없음!!");
		} catch (SQLException e) {//2-4단계
			System.out.println("2-4번 에러>> DB관련 처리하다 에러 발생함!!!");
		}
	}
```

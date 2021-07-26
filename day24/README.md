## 1. 복습

### 1) OOP(객체지향 프로그래밍)

- ↔ 절차지향 프로그래밍
- 반드시 필요한 부품
- DAO(Data access object) : CRUD 구현 - 일반적으로 테이블당 하나씩 둠
- DTO(Data transfer object) : 전달할 가방 역할 구현

    == VO(Value Object)

### 2) 값을 묶는 방법

- 배열
- 컬렉션
- DTO, bag

### 3)접근 제어자

1. private 
    - private 멤버에 직접 접근할 수 없으며, 해당 객체의 public 메소드를 통해서만 접근할 수 있습니다.

    ![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/33c1d466-0a45-4608-ad40-d6a027f9c499/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/33c1d466-0a45-4608-ad40-d6a027f9c499/Untitled.png)

2. public
    - 선언된 클래스 멤버는 외부로 공개되며, 해당 객체를 사용하는 프로그램 어디에서나 직접 접근할 수 있습니다.
    - public 메소드를 통해서만 해당 객체의 private 멤버에 접근할 수 있습니다.

    ![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cebb5583-2eab-41c6-a108-235f03ac6cda/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cebb5583-2eab-41c6-a108-235f03ac6cda/Untitled.png)

3. default
    - 클래스 및 클래스 멤버의 접근 제어의 기본값으로 default 접근 제어를 별도로 명시하고 있습니다.
    - default 접근 제어를 가지는 멤버는 같은 클래스의 멤버와 같은 패키지에 속하는 멤버에서만 접근할 수 있습니다.

    ![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cd309a86-76f7-4e00-b3f0-536cee6ebaca/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cd309a86-76f7-4e00-b3f0-536cee6ebaca/Untitled.png)

4. protected
    - protected 멤버는 부모 클래스에 대해서는 public 멤버처럼 취급되며, 외부에서는 private 멤버처럼 취급됩니다.

    ![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2d0e7112-0562-4011-9c74-bdc9c65de41d/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2d0e7112-0562-4011-9c74-bdc9c65de41d/Untitled.png)

- 비교

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0547c4d1-45d1-4a90-8d67-10dbaa897ac2/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0547c4d1-45d1-4a90-8d67-10dbaa897ac2/Untitled.png)

> [http://tcpschool.com/java/java_modifier_accessModifier](http://tcpschool.com/java/java_modifier_accessModifier)

## 2. DTO(Data transfer object)

### 1) private

- DTO에서 접근 제한자를 사용하는 이유
    - 데이터 손상 차단
    - 정보 은닉
    - 변수의 직접적 접근 방지
    - 오류 발생시 빠른 발견 이점

    > [https://ecsimsw.tistory.com/387](https://ecsimsw.tistory.com/387)

### 2) getters/setters

값을 넣을 때는 set변수명();     // setId();
값을 꺼낼 때는 get변수명();	// getId();

- setters를 통해서 변수에 저장되는 값의 범위를 미리 지정할 수 있다 -> 변수 대입 저장 시 실수 방지
- getters는 setters를 쓰면서 변수에 직접 접근할 수 없어서 추가로 생성하는 것

- 이클립스 이용한 getters/setters 생성 방법
    - 클래스 내에 private 타입 변수명;을 선언한다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5f5fa06d-66d8-454f-a61d-684d6f889d97/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5f5fa06d-66d8-454f-a61d-684d6f889d97/Untitled.png)

- Source-Generate Getters and Setters를 선택한다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/71f195f3-17c3-4770-9f0f-cef8cefa8493/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/71f195f3-17c3-4770-9f0f-cef8cefa8493/Untitled.png)

- getters/setters로 만들 변수를 선택한다. 보통 Select All을 해준다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/70cac5f2-4c62-4622-b54a-6c795c355568/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/70cac5f2-4c62-4622-b54a-6c795c355568/Untitled.png)

- 생성된 코드의 모습이다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/17f88a4f-70d9-47f6-be3f-ab0be88cb2fa/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/17f88a4f-70d9-47f6-be3f-ab0be88cb2fa/Untitled.png)

### 3) 코드 (UI-DTO-DAO 연결)

- 회원Bag.java

```java
	public class 회원Bag {
	
		private String id;
		private String pw;
		private String name;
		private String tel; //String tel=null;

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
package db;

import dto.회원Bag;

public class 회원DAO2 {
	
	//메서드(변수들) : 메서드를 호출할 때 값을 전달하게 되는데 이 전달된 값들을
//				   중간에 저장할 목적으로 매개체 역할을 해주는 변수(매개변수, parameter)
	public void create(회원Bag bag) {
		//매서드 안에서 만들어진 변수
		//변수는 "타입 변수명;" 만들어 짐(선언)
		//선언의 위치가 변수의 생존범위를 결정함.
		//파라메터는 지역변수이다. 이 지역을 벗어나서는 사용 불가능.
		//지역변수는 자동초기화x, 쓰레기값 들어있는 상태!
		System.out.println("전달된 id는 "+bag.getId());
		System.out.println("전달된 pw는 "+bag.getPw());
		System.out.println("전달된 name는 "+bag.getName());
		System.out.println("전달된 tel는 "+bag.getTel());
	}
}
```

- 회원정보UI.java

```java
package ui;

import javax.swing.JOptionPane;

import db.회원DAO;
import db.회원DAO2;
import dto.회원Bag;

public class 회원정보UI2 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("회원 가입 id 입력");
		String pw = JOptionPane.showInputDialog("회원 가입 pw 입력");
		String name = JOptionPane.showInputDialog("회원 가입 name 입력");
		String tel = JOptionPane.showInputDialog("회원 가입 tel 입력");
		
		회원DAO2 dao2 = new 회원DAO2();
		회원Bag bag = new 회원Bag();

		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		dao2.create(bag);
		
		System.out.println("DAO2의 create() 하고 연이어 실행 됨");
	}
```

- 연결 과정 그림 그려보자

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e8f9f032-c33f-45a5-91b5-4ceb4ec3650c/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e8f9f032-c33f-45a5-91b5-4ceb4ec3650c/Untitled.png)

## 3. JSP-DB 연결하기

### 1) UI

- bbs.jsp

- form을 통해 insert2.jsp로 값을 파라미터로 전달한다.

```html
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/out.css">
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
				<form action="insert2.jsp">
			   ID: <input name = "id"><br>
			   제목: <input name = "title"><br>
			   내용: <input name = "content"><br>
			   글쓴이: <input name = "writer"><br>
			   <button>회원가입 처리</button>
			</form>
		</div>
	</div>
</body>
</html>
```

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2aa8a919-7b25-43d9-9e1c-19091ca14bf3/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2aa8a919-7b25-43d9-9e1c-19091ca14bf3/Untitled.png)

- insert2.jsp
    - 파라미터의 값을 받아와서 DTO에 값을 넣어주고, DAO의 메서드를 실행한다.

```html
<%@page import="shop.dto.게시판Bag"%>
<%@page import="shop.db.게시판DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	// 1. 게시판에 입력한 값을 가지고 와야함.
    	// 2. 가방을 만들어서 1번의 값들을 넣어준다.
    	// 3. 게시판DAO를 만들어서 create 기능을 처리하라고 메서드 호출
    	//	  2번에서 만든 가방을 입력값으로 주어야 함.
    	// 4. html로 알려주세요.
    	String id = request.getParameter("id");	
    	String title = request.getParameter("title");	
    	String content = request.getParameter("content");	
    	String writer = request.getParameter("writer");
    	
    	
    	게시판Bag bag = new 게시판Bag();
    	bag.setId(id);
    	bag.setTitle(title);
    	bag.setContent(content);
    	bag.setWriter(writer);
    	
    	게시판DAO dao = new 게시판DAO();
    	dao.create(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="orange">
	게시판 글 db에 저장하도록 sql문 전송됨.
</body>
</html>
```

### 2) DTO

- 게시판Bag.java

```java
package shop.dto;

public class 게시판Bag {
	private String id;
	private String title;
	private String content;
	private String writer;
	//setters and getters를 생성해보세요
	//toString도 생성해보세요.
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	@Override
	public String toString() {
		return "게시판Bag [id=" + id + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}

}
```

### 3) DAO

- 게시판DAO.java
- DTO에서 bag을 가져와서 그 값들로 실행할 메서드를 정의하고, DB와 연결하여 값을 전달한다.

```java
package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import shop.dto.게시판Bag;

public class 게시판DAO {
	public void create(게시판Bag bag) {
		System.out.println("글 번호: "+bag.getId());
		System.out.println("글 제목: "+bag.getTitle());
		System.out.println("글 내용: "+bag.getContent());
		System.out.println("글 작가: "+bag.getWriter());
		
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
			  String sql = "insert into board values (?, ?, ?, ?)";
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, bag.getId());
			  ps.setString(2, bag.getTitle());
			  ps.setString(3, bag.getContent());
			  ps.setString(4, bag.getWriter());
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
}
```

- SQL 결과

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d9359e2f-70d9-4a43-a564-521b8354e560/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d9359e2f-70d9-4a43-a564-521b8354e560/Untitled.png)

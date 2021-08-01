## 1. read

### 1) table 통째로 가져오기

- bbs.jsp

```html
<h3>게시판 목록 다 가져오기</h3>
<a href="all2.jsp">게시판 목록 보기</a>
```

- all2.jsp

```java
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="shop.dto.게시판Bag"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.db.게시판DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    	게시판DAO dao = new 게시판DAO();
    	ArrayList<게시판Bag> list = dao.read();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	전체 게시판 목록의 개수 : <%= list.size() %> <br>
	<hr>
		<table border=1>
			<tr bgcolor="yellow">
				<th>아이디</th>
				<th>제목</th>
				<th>내용</th>
				<th>글쓴이</th>				
			</tr>
	<%
		for(게시판Bag dto :list){
	%>
			<tr bgcolor="pink">
				<td><%= dto.getId() %></td> 
				<td>
				<a href="/web28/read2.jsp?id=<%= dto.getId()%>"><%= dto.getTitle() %></a></td> 
				<td><%= dto.getContent() %></td> 
				<td><%= dto.getWriter() %></td> 
			</tr>
	<%}%>
		</table>
</body>
</html>
```

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

- 게시판DAO.java

```java
public ArrayList<게시판Bag> read() {
		
			//DTO를 넣을 컨테이너 역할을 하는 ArrayList를 만들어 주어야 한다.
			ArrayList<게시판Bag> list = new ArrayList<>();
			ResultSet rs = null;//참조형 초기화 null //메서드 안에서 선언된 변수는 모두 지역변수

		   try {			  
			  //3. sql문을 만든다.
			  String sql = "select * from board";
			  PreparedStatement ps = con.prepareStatement(sql);
			  System.out.println("3. sql문 생성 성공!!!");
			  
			  //4. sql문을 mysql로 전송한다.
			  rs = ps.executeQuery();
			  System.out.println("4. sql문 전송 전송");
			  while (rs.next()) {
				  게시판Bag bag2 = new 게시판Bag();
				  System.out.println("검색 결과가 있음");
				  bag2.setId(rs.getString(1));;
				  bag2.setTitle(rs.getString(2));
				  bag2.setContent(rs.getString(3));
				  bag2.setWriter(rs.getString(4));
				  
				  list.add(bag2);
			  }
		} catch (SQLException e) {//3-4단계
			System.out.println("3-4번 에러>> DB관련 처리하다 에러 발생함!!!");
			e.printStackTrace();
		}
		   return list;
	}
```

## 2. DBeaver

### 1) 데이터 가져오기-txt

- Dbeaver 테이블 오른쪽 클릭- 데이터 가져오기를 클릭한다.
- CSV에서 가져오기를 선택
- Source의 <none>을 클릭한다.
- 파일 확장자를 *.txt로 바꾸고 넣으려는 파일 txt을 연다.
- 다음으로 넘어간다.
- Start를 누르면...
- 이렇게 데이터가 등록 된 것을 확인 할 수 있다.

  
## 3. 크롤링

### 1) 부품 등록

- Maven에 부품을 다운 받으러 가자
- 버전은 1.9.2를 다운 받아보았다.
- jar 파일을 등록해보자. Build Path-Configure Build Path...를 클릭한다.
- Add External JARs...를 클릭해서 등록한다.
  
### 2) 사이트 크롤링

- 네이버 메인

```java
package 크롤링;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements; //tag가 담긴 arrayList

public class 네이버메인크롤링테스트 {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://www.naver.com").get();
			System.out.println("1. 사이트 연결 성공@@@");
			System.out.println("2. 소스 받아오기 성공@@@");
//			System.out.println(doc);
			//Element : tag
			//Elements : tags
			Elements list = doc.select("a.nav");
			System.out.println(list.size());
//			System.out.println(list);
			for (Element tag : list) {
				System.out.println(tag.text());
//				System.out.println(tag.attr("href"));
			}
			
			Element aTag0 = list.get(0);
			Elements list2 = aTag0.select("i");
			System.out.println(list2.get(0));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
```

- W3Schools 메뉴 크롤링

```java
package 크롤링;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements; //tag가 담긴 arrayList

public class W3Schools크롤링테스트 {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://www.w3schools.com/tags/default.asp").get();
			System.out.println("1. 사이트 연결 성공@@@");
			System.out.println("2. 소스 받아오기 성공@@@");
//			System.out.println(doc);
			//Element : tag
			//Elements : tags
			Elements list = doc.select("div.w3-bar a.w3-bar-item");
			System.out.println(list.size());
//			System.out.println(list);
//			for (Element tag : list) {
//				System.out.println(tag.text());
//			}			
			
			for (int i = 9; i < list.size(); i++) {
				Element aTag = list.get(i);
				System.out.println(aTag.text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
```

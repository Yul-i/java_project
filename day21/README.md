## 1. 설정

### 1) dynamic java project의 맨 처음 열리는 html 설정

- 보통 index로 설정되어있다.

### 2) 클래스 다이어그램 설치

- Help - Install  New Software 클릭
- work with에 URL을 넣고 enter 해주면 아래 목록에 뜬다.
- 설치해주자.
### 3) Tern Eclipse IDE 설치(JavaScript 자동완성)

- Market Place에 tern을 검색해서 설치를 하자.

## 2. HTML(Hypertext markup language)

### 1) a 태그

```html
<h3>주요 사이트 연결</h3> <!-- <>는 태그 안에 있는건 data -->
<a href="mail.html">메일 사이트로 연결</a>
<a href="dict.html">사전 사이트로 연결</a>
<a href="news.html">뉴스 사이트로 연결</a>
<a href="news2.html">뉴스2 사이트로 연결</a>
<hr>
<h3>내가 주로 가는 사이트 연결</h3>
<a href="https://www.molangshop.co.kr">몰량샵 사이트로 연결</a>
<a href="https://www.ikmyeongshop.com">익명상점 사이트로 연결</a>
<a href="https://www.webtoonshop.co.kr/product/list.html?cate_no=657">김춘배 사이트로 연결</a>
<a href="http://localhost:8889/web04/">web04 index page로 go!!!</a>
```

### 2) 게시판 글 쓰기(input 연습)

- 게시판.html

```html
<h2>게 시 판</h2>
	<form action="insert2.jsp">
		<table border="1">
			<tr>
				<th>제목</th>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<th>글쓴이</th>
				<td><input type="text" name="auther"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="20" cols="30" placeholder="내용을 입력해주세요." name="content"></textarea></td>
			</tr>
			<tr>
				<th>종류</th>
				<td>
					<input type="radio" name="type" value="문의사항">문의사항
					<input type="radio" name="type" value="답변">답변					
					<input type="radio" name="type" value="확인">확인
				</td>
			</tr>
			<tr>
				<th>부서</th>
				<td>
					<select name="dpart">
						<option value="기획부">기획부 
						<option value="총무부">총무부 
						<option value="인사부">인사부 
					</select>
				</td>
			</tr>
			<tr>
				<th>날짜</th>
				<td><input type="text" name="today" placeholder="00/00로 작성해주세요."></td>
			</tr>
		</table>
		<button type="submit">글 작성하기</button>
	</form>
```

- insert2.jsp

```html
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String title = request.getParameter("title");
    	String auther = request.getParameter("auther");
    	String content = request.getParameter("content");
    	String type = request.getParameter("type");
    	String dpart = request.getParameter("dpart");
    	String today = request.getParameter("today");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게 시 판</h2>
	<table border="1">
		<tr>
			<th>제목</th>
			<td><%= title %></td>
		</tr>
		<tr>
			<th>글쓴이</th>
			<td><%= auther %></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><%= content %></td>
		</tr>
		<tr>
			<th>종류</th>
			<td>
				<%= type %>
			</td>
		</tr>
		<tr>
			<th>부서</th>
			<td>
				<%= dpart %>
			</td>
		</tr>
		<tr>
			<th>날짜</th>
			<td><%= today %></td>
		</tr>
	</table>
</body>
</html>
```

### 3) Table

- 연습

```html
<table>
		 	<tr align="center">
		 		<th bgcolor="yellow" width="100" height="30">취미생활</th>
		 		<th bgcolor="pink" width="100" height="30">취미금액</th>
		 		<th bgcolor="lime" width="100" height="30">취미장소</th>		 		
		 	</tr>
		 	<tr bgcolor="lightblue">
		 		<td>달리기</td>
		 		<td>1000</td>
		 		<td>여의도 공원</td>		 		
		 	</tr>
		 	<tr bgcolor="lightblue">
		 		<td>등산</td>
		 		<td>2000</td>
		 		<td>관악산</td>		 		
		 	</tr>
		 	<tr bgcolor="lightblue">
		 		<td>독서</td>
		 		<td>10000</td>
		 		<td>강남역</td>		 		
		 	</tr>
		 	<tr align="center" bgcolor="blue">
		 		<td colspan="3"><a href="index.html">첫 페이지로</a></td> 		
		 	</tr>
		</table>
```

- 실습(유튜브 동영상 리스트)

```html
<table>
		<colgroup width="200">
		<colgroup width="200">
		<colgroup width="200">
		<colgroup width="200">
		<!-- 첫줄 -->
		<tr align="center">
			<td>
				<iframe width="150" height="100" src="https://www.youtube.com/embed/cwdp7sZvRUs" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
			</td>
			<td>
				<iframe width="150" height="100" src="https://www.youtube.com/embed/bmsP9KDc0os" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
			</td>
			<td>
				<iframe width="150" height="100" src="https://www.youtube.com/embed/AOgczaodke0" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
			</td>
			<td>
				<iframe width="150" height="100" src="https://www.youtube.com/embed/bJXkieCVew4" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
			</td>
		</tr>
		<tr>
			<td><font color="blue" font="3"><b>#DJRYAN</b></font></td>
			<td><font color="blue" font="3"><b>#DJRYAN</b></font></td>
			<td><font color="blue" font="3"><b>#DJRYAN</b></font></td>
			<td><font color="blue" font="3"><b>#DJRYAN</b></font></td>			
		</tr>
		<tr>
			<td><font size="1">[Playlist] DJ 라이언의 여유로운 휴일, 집에서 뒹굴뒹굴</font></td>
			<td><font size="1">[Playlist] 아무도 몰라요 오늘의 기분은</font></td>
			<td><font size="1">[Playlist] DJ 라이언과 비 내리는 오후, 카페 안에서</font></td>
			<td><font size="1">[Playlist] DJ 라이언과 함께 하는 여름의 시작, 시원한 드라이브</font></td>			
		</tr>
		<tr>
			<td><font size="1">조회수 13만회 · 1개월 전</font></td>
			<td><font size="1">조회수 1.8만회 · 1주 전</font></td>
			<td><font size="1">조회수 10만회 · 2주 전</font></td>
			<td><font size="1">조회수 16만회 · 1개월 전</font></td>
		</tr>
		<tr>
			<td colspan="4" height="30"> </td>
		</tr>
		<!-- 둘째줄 -->
		<tr align="center">
			<td>
				<iframe width="150" height="100" src="https://www.youtube.com/embed/7hS1khKHTQ4" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
			</td>
			<td>
				<iframe width="150" height="100" src="https://www.youtube.com/embed/7-m-oA5TZxk" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
			</td>
			<td>
				<iframe width="150" height="100" src="https://www.youtube.com/embed/cyF9W8ZjbR0" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
			</td>
			<td>
				<iframe width="150" height="100" src="https://www.youtube.com/embed/cVA35NIsXVc" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
			</td>
		</tr>
		<tr>
			<td><font color="blue" font="2"><b>#여름 #일상</b></font></td>
			<td><font color="blue" font="2"><b>#보사노바 #휴양지</b></font></td>
			<td><font color="blue" font="2"><b>#기분전환 #여름</b></font></td>
			<td><font color="blue" font="2"><b>#여유로운 #파리</b></font></td>			
		</tr>
		<tr>
			<td><font size="1">[Playlist] 여름볕을 피해 앉은 어느 그늘 밑에서</font></td>
			<td><font size="1">[Playlist] 호캉스에 딱ㅣ휴양지 카페에서 흘러나오는 썸머 보사노바</font></td>
			<td><font size="1">[Playlist] 시원한 물속으로 풍덩ㅣ무더운 여름 감각적인 댄서블 노동요</font></td>
			<td><font size="1">[Playlist] 일상의 소소한 행복을 찾아서ㅣ파리의 어느 빈티지 가게에서 우리는</font></td>			
		</tr>
		<tr>
			<td><font size="1">조회수 31만회 · 1주 전</font></td>
			<td><font size="1">조회수 9.2만회 · 2일 전</font></td>
			<td><font size="1">조회수 45만회 · 2주 전</font></td>
			<td><font size="1">조회수 25만회 · 2개월 전</font></td>
		</tr>
	</table>
```


### 4) audio, video

```html
<audio src="Kalimba.mp3" controls="controls"></audio>
<video src="sample_video.mp4" controls="controls"></video>
```

### 5) Image

```html
<img alt="익명이" src="dance.jpg" width="200" height="200">
```

## 3. 생성자(Constructor)

### 1) 생성자 설명

- 객체 생성시 클래스이름과 동일한 메서드가 있으면 자동호출됨
- 객체 생성시 넣어주어야 하는 처음값을 넣어주기 위해 사용
- 생성자 메서드 => 생성자
- new를 이용해서 객체 생성시 자동 호출
- public 클래스이름() : 생성자는 클래스 이름과 동일!!
- 반환 유무를 쓰지 않음 : 무조건 void라 안써줌.
- 생성자는 오버로딩 할 수 있다.
- 오버로딩은 메소드 이름을 동일하게 쓸 수있다.
- 생성자는 여러개 만들 수 있다.
- 단, 입력값을 다르게 해야한다.

    ex) new 계좌();

    new 계좌("홍길동");

    new 계좌("홍길동", 1000);

- 생성자 오버로딩을 통해 객체생성 조건을 한정시킬 수 있다.

---

### 2) 연습

- 마스크.java

```java
package 생성자;

public class 마스크{
	//속성 => 멤버변수
	//색, 가격
	//자동 초기화
	String color;//참조형 변수는 null
	int price;//기본형 변수는 0
	
	public 마스크(String c, int p) {
		color = c;
		price = p;
	}
	
	//동작 => 멤버 메서드
	public void cover() {
		System.out.println("마스크쓰다. ");
	}
	
	
	public String toString() {
		return color + " " + price;
	}
}
```

- 마스크공장.java

```java
package 생성자;

public class 마스크공장 {

	public static void main(String[] args) {
		마스크 m1 = new 마스크("white", 2500);
		마스크 m2 = new 마스크("black", 3000);
		System.out.println(m1);
		System.out.println(m2);
		
//		m1.color = "white";
//		m1.price = 2500;
//		
//		m2.color = "black";
//		m2.price = 3000;
		
		System.out.println(m1);
		System.out.println(m2);
	}

}
```

---

- TV.java

```java
package 생성자;

public class TV {
	String color;
	int price;

	//클래스 이름과 동일한 메서드를 생성자라고 부르고
	//파라메터 없는 생성자는 기본생성자
	//기본생성자는 자동으로 만들어진다.
	//묵시적으로 생성된다.
	
	public TV() {
		//객체 생성할 때마다 무엇을 하고 싶은 경우
		//클래스이름과 동일한 이름을 가진 메소드를 만들어주면
		//자동 호출되어 객체생성 할 때마다 특정한 기능을 처리하게 할 수 있다.
		System.out.println("객체 하나 만들어짐");
	}
	
	public TV(String c, int p) {
		color = c;
		price = p;
	}
	
	public String toString () {
		return color + ", " + price;
	}
}
```

- TV공장.java

```java
package 생성자;

public class TV공장 {

	public static void main(String[] args) {
		TV tv1 = new TV("black", 100);
		TV tv2 = new TV("white", 200);
		
		System.out.println("tv1: "+ tv1);
		System.out.println("tv2: "+ tv2);
	}

}
```

### 3) 자동 생성

- 클래스를 생성 한 후 변수를 선언한다.
- Source - Generate Constructor using Fields...를 클릭한다.
- 변수값을 받는 생성자 메서드가 생성된다.
- String 리턴으로 보낼 메서드를 생성하자.
- Source - Generate toString()... 을 클릭한다.
- 내가 쓴거보다 더 이쁘게 생성된다.

- 폰공장.java

```java
package 생성자;

public class 폰공장 {

	public static void main(String[] args) {
		폰 phone1 = new 폰("Samsung", "black", 70);
		폰 phone2 = new 폰("apple", "silver", 120);
		폰 phone3 = new 폰("shaomi", "red", 40);
		
		System.out.println("폰1: "+phone1);
		System.out.println("폰2: "+phone2);
		System.out.println("폰3: "+phone3);
	}

}
```

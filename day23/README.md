## 1. 복습

### 1) 주요 패키지

java.util - 주요한 유틸리티 모음, Random, Date
java.sql - JDBC 관련, PrepareStatement, Connetion
[java.io](http://java.io/) - 입출력 관련, File, FileWriter, OutputStream
[java.net](http://java.net/) - 네크워크 관련, InetAddress(ip), Socket

### 2) Static 변수

- 객체 생성과 상관없이 클래스에 1개만 가지고 있으면서 생성된 여러개의 객체들이 공유할 목적으로 만든 변수
- 객체 생성시에는 멤버변수가 객체마다 따로 생성 (다이나믹한 성격, 인스턴스 변수)
- static 변수 : RAM중에서 클래스의 원본 영역에 있음. static 영역, 메소드 영역
- 인스턴스 변수 : 힙 영역(랜덤 접근하여 크기가 맞으면 할당이 가능)

## 2. File

### 1) 파일 다루기

- file 모듈은 파일, 폴더 둘 다 다룸

```java
File file = new File("text.txt");
File file = new File("C:\\data");
```

- 파일 삭제

```java
file.delete();
```

- 파일 존재 유무

```java
		File file = new File("C:/data"); 
		boolean result = file.exists();
		if (result) {
			System.out.println("파일이나 폴더가 존재함");
			System.out.println(file.getAbsolutePath());
			if (file.isDirectory()) {
				System.out.println("폴더!!!");
			}else {
				System.out.println("파일!!!");
			}
		} else {
			System.out.println("파일이나 폴더가 존재하지 않음");
		}
```

- 파일 경로

```java
file.getAbsolutePath()); //절대경로
file.getPath(); //상대경로
```

- 폴더인가요?

```java
file.isDirectory() //true, false
```

- 파일 리스트

```java
		//파일 리스트 가져오기
		File[] list= file.listFiles();
		System.out.println(list.length);

		//foreach
		for (File file2 : list) {
			System.out.println(file2);
		}
		//for
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
```

- 파일 이름

```java
file.list();//목록 이름만 알고 싶으면
file.listFiles();//디렉토리니? 삭제 등 기능 사용하고 싶으면
```

- 응용

```java
File file = new File("C:\\Program Files\\Java\\jdk1.8.0_291"); 
		
		String[] list2 = file.list();
		for (String x : list2) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------");
		
		// jdk 폴더 아래 몇 개가 있는지 프린트
		File[] list = file.listFiles();//디렉토리니? 삭제 등 기능 사용하고 싶으면
		System.out.println("몇 개인가요? : "+ list.length);
		
		for (File string : list) {
			System.out.println(string);
			System.out.println(string.isDirectory());
		}
```


### 2) 파일에 쓰기

- 스트림을 생성할 때 try/catch 를 만든다.

- 코드(파일 쓰기)

```java
//1. test2.txt 스트링을 file객체로 만들어준다.
//2. test2.txt 파일과 java 프로그램간 stream까지 만들어준다.		
	try {
			FileWriter file = new FileWriter("test2.txt");
			//3. stream으로 데이터를 보내면 된다.
			file.write("hello"+"\n");
			file.write("Hi"+"\n");
			file.close(); //작성 완료되면 반드시 닫아준다.
		} catch (IOException e) {//파일, 네크워크 연결(채팅, db, 외부자원 연결 등)
			System.out.println("파일 저장하는 동안 에러가 발생함");
		}
```

- 응용

```java
JButton b1 = new JButton("파일에 일기 저장");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String day = t1.getText();
				String weather = t2.getText();
				String title = t3.getText();
				String content = t4.getText();
				try {
					FileWriter file = new FileWriter(day+".text");
					file.write("날짜 : "+day+"\n");
					file.write("날씨 : "+weather+"\n");
					file.write("제목 : "+title+"\n");
					file.write("내용 : "+content+"\n");
					file.close();
					JOptionPane.showMessageDialog(f, "일기가 저장되었습니다.");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("저장에 오류가 발생했습니다.");
				}
			}
		});
```


### 3) 이클립스 파일 refresh 설정

- preferences - general - workspace - refresh using native hooks or polling 체크


## 3. JSP

### 1) jsp:include

- member.jsp

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
			<p>회원가입 들어가는 부분.</p>
		</div>
	</div>
</body>
</html>
```

- top.jsp

```html
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <ul>
    	<li><a href="member.jsp">회원가입</a></li>
    	<li><a href="product.jsp">제품정보</a></li>
    	<li><a href="bbs.jsp">게시판</a></li>
    	<li><a href="basket.jsp">장바구니</a></li>
    </ul>
```

- top2.jsp

```html
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <p>장바구니 개수 : 0</p>
```

## 4. CSS

- create.html

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/member.css">
</head>
<body>
	<h3>회원가입 화면 입니다.</h3>
	<hr>
	<form action="db_create.jsp">
		<table>
			<tr>
				<td class="left" id="data">아이디:</td>
				<td class="right"><input type="text" name="id"></td>
			</tr>
			<tr>
				<td class="left">패스워드:</td>
				<td class="right"><input type="text" name="pw"></td>
			</tr> 
			<tr>
				<td class="left">이  름:</td>
				<td class="right"><input type="text" name="name"></td>
			</tr> 
			<tr>
				<td class="left">전화번호:</td>
				<td class="right"><input type="text" name="tel"></td>
			</tr> 
			<tr>
				<td colspan="2" class="bottom">
					<button>회원가입 처리 요청</button>
				</td>
			</tr> 
		</table>
	</form>
</body>
</html>
```

- member.css

```css
@charset "UTF-8";
/* 선택자 */
input{
	font-size : 40px;
	height : 100px;
}

body{/* 선택 : 태그 */
	color : blue;
	font-size : 40px;
}

button{
	background : red;
	color : white;
	font-weight: bold;
	font-size : 40px;
}
#data{/* 선택 : 아이디 */
	font-style : italic;
}

.left{/* 선택 : 클래스- 그룹을 지어서 여러개를 동일한 효과를 주고자 하는 경우 */
	background : yellow;
	height : 100px;
	width : 200px;
	text-align : center;
}

.right{
	width : 300px;/* css에서 스타일을 숫자로 지정하는 경우 px를 써준다. */
	background : fuchsia;
}
.bottom{
	text-align :center;
	background : maroon;
	height :100px;
}
```

- 위의 member.jsp / top.jsp / top2.jsp 이어서
- out.css

```css
@charset "UTF-8";
a{
	text-decoration : none;
	color : red;
	transition:1s;
}

a:hover{/* 마우스를 a태그에 올렸을 때 효과 */
	color : white;
	text-decoration : overline;
}

#total{
	width : 800px;
	height : 800px;
	background : lime;
}

#top{
	width : 800px;
	height : 100px;
	background : aqua;
}

#top2{
	width : 300px;
	height : 100px;
	background : black;
	color : white;
	position : fixed;
	top : 5px;
	right : 5px;
	border-radius : 100px 0 100px 0;
}

#center{
	width : 800px;
	height : 500px;	
	background : url('../img/ahah.jpg');
	background-size: cover;
}

li{
	list-style : none;
	float : left;
	font-size : 25px;
	background : orange;
	padding : 10px;
	margin : 5px;
	transition :1s;
}
li:nth-child(2n+1){
	background : yellow;
}

li:hover{
	background : pink;
	border-radius: 30px;
}
```

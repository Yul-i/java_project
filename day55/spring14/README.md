## 1. mybatis-read(All)

### 1) index.jsp

```html
<a href="list.mega">회원 정보 전체 목록 가지고 오기</a>
```

### 2) MemberController.java

```java
@RequestMapping("list.mega")
	public void list(Model model) {
		List<MemberDTO> list = dao.list();
		model.addAttribute("list", list);
		System.out.println("회원 전체 수>>>"+list.size());
	}
```

### 3) MemberDAO.java

```java
public List<MemberDTO> list() {
		List<MemberDTO> list = mybatis.selectList("member.all");
		return list;
	}
```

### 4) memberMapper.xml

```xml
<select id="all" resultType="memberDTO">
		select * from MEMBER
</select>
```

### 5) views/list.jsp

```html
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr bgcolor="yellow">
			<td width="100">아이디</td>
			<td width="200">이름</td>
			<td width="300">전화번호</td>
			<td width="100">상세페이지</td>
		</tr>
		<c:forEach items="${list}" var="dto">
			<tr bgcolor="lime" align="center">
				<td>${dto.id}</td>
				<td>${dto.name}</td>
				<td>${dto.tel}</td>
				<td>
					<a href="one.do?id=${dto.id}">
						<button style="background:pink;">상세 페이지로</button>
					</a>
				</td>
			</tr>
		</c:forEach>	
	</table>
</body>
</html>
```

### 6) views/one.jsp

```html
<h1>검색된 회원 정보 입니다.</h1>
	<hr>
	검색된 id : ${dto.id} <br>
	검색된 pw : ${dto.pw} <br>
	검색된 name : ${dto.name} <br>
	검색된 tel : ${dto.tel} <br>
```

## 2. mybatis-delete

### 1) views/list.jsp

```html
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr bgcolor="yellow">
			<td width="100">아이디</td>
			<td width="200">이름</td>
			<td width="300">전화번호</t
			<td width="100">삭제</td>
		</tr>
		<c:forEach items="${list}" var="dto">
			<tr bgcolor="lime" align="center">
				<td>${dto.id}</td>
				<td>${dto.name}</td>
				<td>${dto.tel}</td>
				<td>
					<a href="del.do?id=${dto.id}">
						<button style="background:blue; color:white;">삭제</button>
					</a>
				</td>
			</tr>
		</c:forEach>	
	</table>
</body>
</html>
```

### 2) MemberController.java

```java
@RequestMapping("del.do")
	public String delete(MemberDTO memberDTO) {
		int result = dao.delete(memberDTO);
		return "redirect:list.mega";
	}
```

### 3) MemberDAO.java

```java
public int delete(MemberDTO memberDTO) {
		int result = mybatis.delete("member.del", memberDTO);
		return result;
	}
```

### 4) memberMapper.xml

```xml
<delete id="del" parameterType="memberDTO">
		delete from MEMBER where id = #{id}
</delete>
```

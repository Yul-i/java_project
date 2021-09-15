## 1. 게시판 만들기

### 1) bbs_main.jsp

```html
<a href="bbs_list">게시판 전체 목록</a>
```

### 2) BbsController.java

```java
@RequestMapping("bbs_list")
	public void list(Model model) {
		List<BbsDTO> list = dao.all();
		System.out.println(list.size()+"=================");
		model.addAttribute("list", list);
	}
```

### 3) BbsDAO.java

```java
public List<BbsDTO> list() {
		List<BbsDTO> list = my.selectList("bbs.all");
		return list;
	}
```

### 4) BbsMapper.xml

```xml
<mapper namespace="bbs">
	<select id="all" resultType="bbsVO">
		select * from BBS
	</select>
</mapper>
```

### 5) bbsList.jsp

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
<hr color="red">
<table border=1>
	<tr bgcolor="yellow">
		<td width="100">아이디</td>
		<td width="100">제목</td>
		<td width="100">내용</td>
		<td width="100">작성자</td>
		<td width="150">상세페이지</td>
	</tr>
	<c:forEach items="${list}" var="dto">
	<tr bgcolor="lime" align="center">
		<td width="100">${dto.id}</td>
		<td width="100">${dto.title}</td>
		<td width="100">${dto.content}</td>
		<td width="100">${dto.writer}</td>
		<td width="150">
			<a href="one2?id=${dto.id}">
				<button>상세페이지로!</button>
			</a>
		</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>
```

### 6) BbsController.java

```java
@RequestMapping("one2") //게시판 상세페이지+댓글 리스트 
	public void one2(BbsDTO bbsDTO, Model model) {
		BbsDTO dto = dao.one(bbsDTO);
		ReplyDTO dto2 = new ReplyDTO();
		dto2.setBbsId(Integer.parseInt(bbsDTO.getId()));
		List<ReplyDTO> list2 = dao2.all(dto2);
		System.out.println(list2.size());
		System.out.println(dto);
		model.addAttribute("dto", dto);//게시판 상세페이지 
		model.addAttribute("list2", list2);//댓글 리스트 
	}
```

### 7) BbsDAO.java

```java
public BbsDTO one(BbsDTO bbsDTO) {
		return my.selectOne("bbs.one", bbsDTO);
	}
```

### 8) BbsMapper.xml

```xml
<mapper namespace="bbs">
	<select id="one"  parameterType="bbsVO" resultType="bbsVO">
		select * from BBS where id = #{id}
	</select>
</mapper>
```

### 9) ReplyDAO.java

```java
public List<ReplyDTO> all(ReplyDTO replyDTO) {
		return my.selectList("reply.all", replyDTO);
	}
```

### 10) ReplyMapper.xml

```xml
<select id="all" parameterType="replyVO" resultType="replyVO">
		select * from REPLY where bbsid = #{bbsId}
	</select>
```

### 11) one2.xml

```html
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>검색된 게시판 정보입니다.</h1>
	<hr>
	<a href="bbs_list">
		<button>게시판 전체 목록으로 가기!</button>
	</a>
	<br>
		검색된 id : ${dto.id} <br>
		검색된 제목 : ${dto.title} <br>
		검색된 내용 : ${dto.content} <br>
		검색된 작성자 : ${dto.writer} <br>
	<hr>
	${dto2.id}<br>
	${dto2.id}<br>
</body>
</html>
```

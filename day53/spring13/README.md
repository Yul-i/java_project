## 1. 프레임워크

### 1) 프레임워크란?(Framework)

- 개발에서 기본이 되는 틀을 제공해줌으로서, 애플리케이션의 기본 아키텍처는 프레임워크가 제공하고 뼈대에 살을 붙이는 작업은 개발자가 하는 것

### 2) 프레임워크의 장점

- 빠른 구현시간
- 쉬운 관리
- 개발자들의 역량 획일화
- 검증된 아키텍쳐의 재사용과 일관성 유지

### 3) 스프링 프레임워크

- IoC와 AOP를 지원하는 경량의 컨테이너 프레임워크
- **제어의 역행(Inversion Of Control)**
    - 비즈니스 컴포넌트를 개발할 때 신경 쓰는 것이 바로 낮은 결합도의 높은 응집도이다.
    - 스프링은 제어의 역행을 통해 애플리케이션으로 구성되는 객체 간의 느슨한 결합, 즉 낮은 결합도를 유지한다.
- **AOP(관점지향 프로그래밍, Aspect Oriented Programming)**
    - 관점지향 프로그래밍은 비즈니스 메소드를 개발할 때, 핵심 비즈니스 로직과 각 비즈니스 메소드 마다 반복해서 등장하는 공통 로직을 분리함으로써 응집도가 높게 개발할 수 있도록 지원한다.

    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/789f87cc-0372-401e-aa6a-ba4947772dde/Untitled.png)

    - 공통으로 사용하는 기능들을 외부의 독립된 클래스로 분리하고 해당기능을 프로그램 코드에 직접 명시하지 않고 선언적으로 처리하여 적용하는 것이 관점지향 프로그밍의 기본이다.
    - 이렇게 되면 공통 기능을 분리하여 관리할 수 있기 때문에 응집도가 높은 비즈니스 컴포넌트를 만들 수 있다.

### 4) WebServer와 WAS

- 단순한 WebServer : http로 html, img, js, css같은 정적인 페이지를 요청하는 경우 웹 서버를 이 파일들을 찾아서 http로 응답하는 기능만 있는 서버
    - apache web server, nginx
- WAS(Web Application Server) : http로 jsp와 같은 서버의 처리를 필요로 하는 동적인 페이지를 요청하는 경우, 페이지를 처리해서 html을 만들어주는 기능을 가지고 있는 서버
- TomCat은 웹서버+WAS 를 같이 가지고 있음

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b59f5458-fda1-4751-9380-b531db162580/Untitled.png)

## 2. Spring MVC2 구성도

1. 클라이언트의 요청
2. WAS로 전송
3. 어노테이션 기능을 어느곳으로 분배를 할지 알기 위해서 handleMapper에게 물어봄(Hashmap)
4. 어느 주소로 분배를 할지 Handlermapper가 알려줌
5. HandlerMapper에서 찾은 주소로 요청
6. 암호화 같은 개인/기업의 자체적 처리를 해 줄 경우, service로 요청을 하고 그게 없을 경우에는 바로 DAO로 요청을 함
7. 자체적 처리를 한 후 DAO로 요청을 함
8. DB와 연결을 해서 데이터를 확인 요청
9. 확인 결과를 DAO가 받아줌
10. DAO를 통해서 받은 DB데이터를 Service로 전달
11. DB로 부터 받은 데이터를 Controller에 전해붐
12. 처리된 데이터를 Front Controller로 전해줌
13. 앞서 처리한 결과들을 렌더링(담아서 처리)하는 것을 요청
14. 렌더링 한 결과를 알려줌
15. 렌더링 한 것을 보여주도록 요청
16. HTML로 변환해서 전달을 해줌
17. WAS의 처리 결과를 웹 서버로 전달해줌
18. 처리된 최종 결과를 클라이언트에게 보여줌

## 3. mybatis DB insert

### 1) bbs.jsp

```html
<form action="bbs.mega">
		번호 : <input type="text" name="id"><br>
		제목 : <input type="text" name="title"><br>
		내용 : <input type="text" name="content"><br>
		작성자 : <input type="text" name="writer"><br>
		<button type="submit">게시판 신청 완료</button>
	</form>
```

### 2) BbsController.java

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO dao;
	
	@RequestMapping("bbs.mega")
	public void insert(BbsDTO bbsDTO) {
		System.out.println(bbsDTO);
		dao.create(bbsDTO);
	}

}
```

### 3) BbsDAO.java

```java
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	//기능별로 메서드로 정의한다.
	public void create(BbsDTO bbsDTO) {
		int result = my.insert("bbs.add", bbsDTO);
		System.out.println(result);
	}
	
}
```

### 4) mybatis-config.xml

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
  PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
   <typeAliases>
      <typeAlias type="com.mega.mvc13.BbsDTO" alias="bbsVO"></typeAlias>
   </typeAliases>
   <mappers>
      <mapper resource="mapper/bbsMapper.xml" />
   </mappers>
</configuration>
```

### 5) bbsMapper.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="bbs">
	<insert id="add" parameterType="bbsVO">
		insert into BBS values (#{id}, #{title}, #{content}, #{writer})
	</insert>
</mapper>
```

### 6) root-context.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

	<bean id="dbcp" class="org.apache.commons.dbcp.BasicDataSource">
		<property name="driverClassName" value="oracle.jdbc.OracleDriver"></property>
		<property name="url" value="jdbc:oracle:thin:@localhost:1521:xe"></property>
		<property name="username" value="root"></property>
		<property name="password" value="1234"></property>
	</bean>
	
	<bean id="config" class="org.mybatis.spring.SqlSessionFactoryBean">
		<property name="configLocation" value="classpath:mybatis-config.xml"></property>
		<property name="dataSource" ref="dbcp"></property>
	</bean>
	
	<bean id="mybatis" class="org.mybatis.spring.SqlSessionTemplate">
		<constructor-arg ref="config"></constructor-arg>
	</bean>
</beans>
```

### 7) views/bbs.jsp

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
	게시물 db저장 후 내가 불러져요!!
	<hr>
	<img alt="" src="resources/img/unnamed.png">
</body>
</html>
```

## 4. mybatis DB select(1개)

### 1) one.jsp

```html
<form action="one.do">
		id : <input name="id"><br>
		<button>회원 정보 검색 요청</button>
	</form>
```

### 2) MemberController.java

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired 
	MemberDAO dao; 
	
	@RequestMapping("one.do")
	public void one(MemberDTO memberDTO, Model model ) {
		System.out.println(memberDTO.getId());
		MemberDTO dto = dao.read(memberDTO);
		//dto의 데이터는 views/one.jsp로 출력되어야 클라이언트에게 보인다.
		//model 속성을 이용하면 Controller->views 아래까지 데이터를 보내고, 사라진다.
		model.addAttribute("dto", dto);
	}
}
```

### 3) MemberDAO.java

```java
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository 
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	public MemberDTO read(MemberDTO memberDTO) {
		MemberDTO dto = mybatis.selectOne("member.one", memberDTO);
		return dto;
	}
```

### 4) memberMapper.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="member">
	<select id="one" parameterType="memberVO" resultType="memberVO">
		select * from MEMBER where id = #{id}
	</select>
</mapper>
```

### 5) mybatis-config.xml

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
  PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
   <typeAliases>
      <typeAlias type="com.mega.mvc13.MemberDTO" alias="memberVO"></typeAlias>
   </typeAliases>
   <mappers>
      <mapper resource="mapper/memberMapper.xml" />
   </mappers>
</configuration>
```

### 6) views/one.jsp

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
	<h1>검색된 회원 정보 입니다.</h1>
	<hr>
	검색된 id : ${dto.id} <br>
	검색된 pw : ${dto.pw} <br>
	검색된 name : ${dto.name} <br>
	검색된 tel : ${dto.tel} <br>
</body>
</html>
```

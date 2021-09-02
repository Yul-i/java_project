## 1. Spring에 DBCP ↔ mybatis 연결

- [Day51](https://www.notion.so/Day51-AWS-RDB-MySQL-DBCP-Maven-23e591505f294611a6a185b908090508)에서 이어진다.

### 1) root-context.xml 설정

- src/main/resources 폴더에 Spring Bean Configuration File을 생성한다.
- 스프링 시작할 때 싱글톤 객체를 만들어 달라고 정의하는 파일이다.
- 이름을 root-context로 지어준다.
- context = 문맥, 전체 프로젝트
- 싱글톤 bean 설정하는 파일 = context 파일

- 다음 코드를 작성해준다.

```xml
	<bean id="dbcp" class="org.apache.commons.dbcp.BasicDataSource">
		<!-- db connection pool을 만들기 위해, driver, url, user, pw -->
		<!-- property태그는 각 변수의 set메서드를 호출해서 값을 넣어준다. -->
		<!-- dbcp.setUrl("~~"); -->
		<property name="driverClassName" value="oracle.jdbc.OracleDriver"></property>
		<property name="url" value="jdbc:oracle:thin:@localhost:1521:xe"></property>
		<property name="username" value="root"></property>
		<property name="password" value="1234"></property>
	</bean>
	
	<!-- mybatis와 관련된 설정이 많아서 설정만 따로 해주는 클래스의 객체  -->	
	<bean id="config" class="org.mybatis.spring.SqlSessionFactoryBean">
		<property name="configLocation" value="classpath:mybatis-config.xml"></property>
		<property name="dataSource" ref="dbcp"></property>
	</bean>
	
	<!-- myBatis -->
	<!-- SqlSessionTemplate mybatis = new SqlSessionTemplate() -->
	<bean id="mybatis" class="org.mybatis.spring.SqlSessionTemplate">
		<!-- 객체 생성시 파라미터 있는 생성자를 호출하는 경우에는 constructor-arg 태그를 넣어주어야 한다. -->
		<!--constructor-arg 태그내에 파라미터 값을 넣어줌. -->
		<constructor-arg ref="config"></constructor-arg>
	</bean>
```

- dbcp←config←mybatis 참조하는 순이다.

### 2) MyBatis Generator, MyBatipse 설치

- Eclipse Marketplace에서 MyBatis를 검색해서 나오는 두 프로그램을 설치해준다.

### 3) mybatis-configure.xml 생성

- new - mybatis를 검색하면 나오는 MyBatis Generator Configuration File을 선택한다
- 위치는 src/main/resources이고, 이름은 mybatis-config.xml로 설정한다.

- 다음 코드를 넣어주었다.

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
  PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
   <typeAliases>
      <typeAlias type="com.mega.mvc12.MemberDTO" alias="memberDTO"></typeAlias>
   </typeAliases>
   <mappers>
      <mapper resource="mapper/memberMapper.xml" />
   </mappers>
</configuration>
```

### 4) Mapper 파일 생성

- New - MyBatis XML Mapper 파일을 생성해준다.
- src/main/resources에 mapper 폴더를 생성해주고, 여기에 저장해준다.
- 테이블 명을 가진 mapper을 생성해주는데, 테이블 1개당 mapper 파일 1개이다.

- 코드를 작성해주었다.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="memberMapper">
	<insert id="create">
		insert into MEMBER values ('my3','my3','my3','my3')
	</insert>
</mapper>
```

### 5) web.xml 설정

- web.xml의 위치는 src/main/webapp/WEB-INF 폴더 내에 있다.
- TomCat이 실행되면 가장 먼저 읽는 xml 파일이다.
- root-context.xml의 경로를 바꿔준다.

```xml
<param-value>classpath:root-context.xml</param-value>
```


- 저장하면서 에러가 발생했는데, 아래의 방법으로 해결하였다.

```xml
<web-app version="2.5" xmlns="http://java.sun.com/xml/ns/javaee"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://JAVA.sun.com/xml/ns/javaee https://java.sun.com/xml/ns/javaee/web-app_2_5.xsd">
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/636c5482-e3bf-4d4e-83af-5591effba13a/Untitled.png)

## 2. 실습으로 Spring 설정 다시 구성해보기

### 1)  project 생성 : spring13
### 2) project facets설정
### 3) pom.xml- jdk버전, springframework 5.0.1- 라이브러리 5개 추가
```xml
<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
		<dependency>
		    <groupId>mysql</groupId>
		    <artifactId>mysql-connector-java</artifactId>
		    <version>5.1.46</version>
		</dependency>  
		
		<!-- https://mvnrepository.com/artifact/commons-dbcp/commons-dbcp -->
		<dependency>
		    <groupId>commons-dbcp</groupId>
		    <artifactId>commons-dbcp</artifactId>
		    <version>1.4</version>
		</dependency>
		
		<!-- https://mvnrepository.com/artifact/org.mybatis/mybatis -->
		<dependency>
		    <groupId>org.mybatis</groupId>
		    <artifactId>mybatis</artifactId>
		    <version>3.4.0</version>
		</dependency>
		
		<!-- https://mvnrepository.com/artifact/org.springframework/spring-jdbc -->
		<dependency>
		    <groupId>org.springframework</groupId>
		    <artifactId>spring-jdbc</artifactId>
		    <version>5.0.1.RELEASE</version>
		</dependency>
		
		<!-- https://mvnrepository.com/artifact/org.mybatis/mybatis-spring -->
		<dependency>
		    <groupId>org.mybatis</groupId>
		    <artifactId>mybatis-spring</artifactId>
		    <version>1.3.2</version>
		</dependency>
```

### 4) webapp아래 index.jsp를 복사

### 5) webapp/resources아래 js, css, img 폴더 생성
### 6) com.mega.mvc13아래 MemberDAO, MemberDTO, MemberController 복사
### 7) src/main/resources아래root-context파일 복사 : dbcp, config, mybatis 객체 싱글톤객체 생성 정의

```xml
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
```

### 8) mybatis-config.xml파일 복사 : mapper/memberMapper.xml 설정

mapper폴더 생성 : memberMapper.xml 복사

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
  PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
   <typeAliases>
      <typeAlias type="com.mega.mvc13.MemberDTO" alias="memberDTO"></typeAlias>
   </typeAliases>
   <mappers>
      <mapper resource="mapper/memberMapper.xml" />
   </mappers>
</configuration>
```

### 9) web.xml에 root-context.xml 파일 경로 변경

```xml
<param-value>classpath:root-context.xml</param-value>
```


## 3. DB 연결(Oracle)

- 2번에서 생성한 Spring 설정에서 이어짐
- 
### 1) index2.jsp 생성

```html
<form action="create.do">
		id : <input name="id"><br>
		pw : <input name="pw"><br>
		naem : <input name="name"><br>
		tel : <input name="tel"><br>
		<button>회원 가입 요청</button>
</form>
```

### 2) views/create.jsp 생성

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
	<h3>회원가입 완료</h3>
</body>
</html>
```

### 3) root-context.xml 설정

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

### 4) mybatis-config.xml 설정

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
  PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
   <typeAliases>
      <typeAlias type="com.mega.mvc13.MemberDTO" alias="memberDTO"></typeAlias>
   </typeAliases>
   <mappers>
      <mapper resource="mapper/memberMapper.xml" />
   </mappers>
</configuration>
```

### 5) [MemberController.jav](http://membercontroller.java)a 메서드 생성

```java
package com.mega.mvc13;

import org.springframework.beans.factory.annotation.Autowired;
import org.sprinframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//싱글톤 객체, 스프링에 컨트롤러로 등록
@Controller
public class MemberController {
	
	@Autowired //자동연결
	MemberDAO dao; //스프링이 만들어놓은 싱글톤 객체의 주소를 넣어준다.
	
	@RequestMapping("create.do")
	public void create(MemberDTO memberDTO) {
		System.out.println(memberDTO);
		dao.create(memberDTO);
	}
}
```

 

### 6) memberMapper.xml SQL문 작성

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="member">
	<insert id="create" parameterType="memberDTO">
		insert into MEMBER values (#{id},#{pw},#{name},#{tel})
	</insert>
</mapper>
```

### 7) [MemberDAO.java](http://memberdao.java) 메서드 생성

```java
package com.mega.mvc13;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository 
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	public void create(MemberDTO memberDTO) {
		mybatis.insert("member.create", memberDTO);
		
	}

}
```

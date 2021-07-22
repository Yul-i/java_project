## 1. 복습

### 1) 생성자(constructor)

- 객체생성시 클래스이름과 동일한 메서드가 있으면 자동호출되는 메서드
- 생성자는 여러개 만들 수 있다.
- 입력값을 다르게 해야한다.
- 생성자 오버로딩을 통해서 객체 생성 조건을 한정시킬 수 있다.
- 조건을 충족하지 않으면 생성이 되지 않게 할 수 있다.

- 생성자 묵시적 생성

```java
public 통장() {
//		//생성자중에서 입력값이 없는 생성자 -> 기본 생성자
//		//default constructor
//		//다른 생성자가 하나도 없으면 자동 생성
//		//묵시적으로 만들어졌음.
}
```

- 연습
- MemberBag.java

```java
package 생성자;

public class MemberBag {
	
	String id;
	String pw;
	String name;
	String tel;
	
	public MemberBag(String id, String pw, String name, String tel) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "MemberBag [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
}
```

- 회원가입.java

```java
package 생성자;

public class 회원가입 {

	public static void main(String[] args) {
		MemberBag bag1 = new MemberBag("root", "1234", "hong", "011");
		MemberBag bag2 = new MemberBag("apple", "3333", "kim", "010");
		
		System.out.println(bag1);
		System.out.println(bag2);
	}

}
```

### 2) 다형성

- 오버로드, 폴리모피즘
- 다형성 구분(입력 파라메터가 다르다면 메서드 이름 동일하게 쓸 수 있음)
- 모든 메서드에 해당됨
- 이중 사용할 수 없는 메서드는?

```java
1. public void call()  // 1,2중 하나만 써야한다. call() 종류 다름 구분 못함

2. public int call()

3. public void call(int x)

4. public void call(int x, String y) // call("a", 100); 인식 못함

5. public void call(int x, int y)    // 입력 파라메터 순서, 타입이 맞아야 함 
```

## 2. 컬렉션

### 1) 컬렉션(collection)

- 많은 양의 데이터를 다룰 때 사용하는 클래스들
- 타입이 다른 데이터들을 묶어둘 수 있다.
- 크기 조절이 가능하다.

### 2) List

- 순서가 의미가 있는 자료
- ArrayList, LinkedList

```java
		ArrayList list = new ArrayList();
		//data 넣기
		list.add("홍길동");
		list.add(100); //기본형 -> 클래스 변환 -> Object
		list.add(22.22);
		list.add(true);
		list.add('남');
		list.add(new JFrame());
		
		//크기 구하기
		System.out.println(list.size());//6
		
		//전체 리스트
		System.out.println(list);//원래 주소가 찍혀야 하지만 안의 구성이 보이도록 오버라이딩 되었다.
		
		//data 가져오기
		System.out.println(list.get(0));
		System.out.println(list.get(5));
		list.add("목요일");
		System.out.println(list.size());//7

		//data 지우기
		list.remove(5);
		list.remove("홍길동");//안의 값으로도 지울 수 있음 댑악
//		list.remove(new Integer(100));//100 지울 때
		System.out.println(list.size());//5
		System.out.println(list.get(0));

		//인덱스 n번 앞에 값을 넣어라
		list.add(0, "김길동");//0번 앞에 넣어라
		System.out.println(list);
		list.set(0, "홍길동");
		System.out.println(list);
```

- 연습 : 스키대회

```java
ArrayList ski = new ArrayList();
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		System.out.println(ski);
		ski.remove(1);
		System.out.println(ski);
		
		for (int i = 0; i < ski.size(); i++) {
			System.out.println(i+1+"등 : "+ski.get(i));
		}
```


### 3) Set

- 순서는 없지만, 자료의 중복을 허용하지 않는 자료
- HashSet

```java
		HashSet bag = new HashSet();
		bag.add("볼펜");
		bag.add("휴지");
		bag.add("휴대폰");
		bag.add("볼펜");
		System.out.println(bag.size());
		//toString에 오버라이드 되어있어서 참조형인데도 주소가 안뜨고 들어가있는 데이터가 뜬다.
		System.out.println(bag);

		for (Object object : bag) {
			System.out.println(object); // ["볼펜","휴지","휴대폰"]
		}
```

- 연습 : 팀원 구하기

```java
		HashSet team = new HashSet();
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		
		System.out.println("팀원목록 : "+ team);
```


### 4) Queue

- 먼저 들어온 것이 먼저 나가는 자료
- LinkedList, PriorityQueue(우선순위 큐)

```java
LinkedList queue = new LinkedList();
		queue.add("홍길동");
		queue.add("김길동");
		queue.add("송길동");
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);
```

- 연습 : 냉장고

```java
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		System.out.println("현재 냉장고 : "+ milk);
		milk.remove();
		System.out.println("현재 냉장고 : "+ milk);
```


- 연습 : 시험일정

```java
LinkedList test = new LinkedList();
		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");
		System.out.println("전체 시험 볼 과목 : "+test);
		test.remove();
		System.out.println("1일차 시험본 후 남은 과목 : "+test);
		test.remove();
		System.out.println("2일차 시험본 후 남은 과목 : "+test);
		test.remove();
		System.out.println("3일차 시험본 후 남은 과목 : "+test);
```


### 5) Map

- 키와 값의 쌍으로 저장하고자 하는 자료
- 다른 언어에서는 dicionary
- HashMap

```java
		HashMap dic = new HashMap();

		//키는 중복되면 안되고 value 는 중복되어도 됨
		//키, 값 넣기
		dic.put("사과", "apple");
		dic.put("바나나", "banana");
		dic.put("멜론", "melon");
		
		System.out.println(dic);
		//		dic.clear();//다 지워용
		System.out.println(dic.size());
		
		//값을 구할땐 인덱스 대신 키를 넣어준다.
		System.out.println(dic.get("사과"));
		
		dic.put("사과", "blueApple");
		System.out.println(dic.get("사과"));
		
		//지울때도 키를 넣어준다.
		dic.remove("멜론");
		System.out.println(dic);
```

- 연습 : 폰 연락처

```java
		HashMap phoneNum = new HashMap();
		phoneNum.put("1번", "엄마");
		phoneNum.put("2번", "아빠");
		phoneNum.put("3번", "친구");
		phoneNum.put("4번", "동생");
		System.out.println("2번에 저장된 가족: "+phoneNum.get("2번"));
```


## 3. TCP 이용한 socket 통신

### 1) TCP/IP

> TCP/IP란 컴퓨터와 컴퓨터간 네트워크에서 원할한 통신을 가능하도록 하기 위한 프로토콜(통신규약)이다.

### **TCP(Transmission Control Protocol)**

**개념**

- 네트워크에서 데이터 전달을 관리하는 규칙이다.
- 데이터를 전송할 때 `패킷` 단위로 나누어 보내고, 수신지에서 이를 다시 조립하여 원래 데이터로 만드는 규칙이다.
- `TCP`는 패킷을 조립하고, 손실된 패킷을 확인하고, 재전송하도록 요청하는 기능을 한다.

**데이터를 패킷 단위로 나누어 보내는 이유?**

- 하나의 데이터를 통채로 전송하면 라우터 이동간에 데이터가 손실될 경우가 있다.
- 이 경우에는 데이터 손실이 일어나도, 수신지에서는 확인할 방법이 없다.
- `패킷` 단위로 데이터를 나누어 보내면 패킷마다 전체 패킷수를 입력하여 전송하기 때문에 수신지에서 패킷 유실을 확인 할 수 있다.

### **IP(Internet Protocol)**

**개념**

- 네트워크 상에서 데이터 전송을 위해 컴퓨터의 위치를 나타내는 규약이다.
- 기존에 사용하던 방식인 `IPv4 - 32bit`에서 주소공간에 대한 우려로 `IPv6 - 128bit`가 등장했다.


### 2) TCPServer

- ServerSocket 부품을 불러오고, 포트값을 넣어준다.
- throws declaration을 추가한다.
- Exception를 선택한다.
- 이미 톰캣이 깔려있다면 실행 시 Java Application을 선택해주고 서버를 실행한다.

- 코드

```java
package mega;

import java.io.IOException;
import java.net.ServerSocket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// 서버 객체를 생성하자.
		ServerSocket server = new ServerSocket(9100);
		System.out.println("server start!!");
		int count = 0;
		while (true) {
			System.out.println("wait request...!!");
			server.accept();
			System.out.println("클라이언트가 연결됨...!" + ++count);
			if (count==1000) {
				server.close();
				System.out.println("서버 멈춰!");
			}
		}
	}

}
```

### 3) TCPClient

```java
package mega;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 2000; i++) {
			// 서버 객체를 생성하자.
			Socket server = new Socket("localhost", 9100);
			System.out.println("client request -----"+i);
		}
	}

}
```

### 4) Mysql 연동을 위한 준비

- Dynamic 폴더의 WEB-INF - lib안에 jar파일을 넣어준다.


## 4. CSS

- 사용 방법

### 1)css파일을 별도로 만들어서 여러 파일에서 연결해서 쓴다.

```css
@charset "UTF-8";

body{
	background : pink; /* 배경색 지정 */
	color : purple; /* 글자색 지정 */
}	

hr{
	width : 500px;
	height : 5px;
	background: white;
}

h1, h3{
	text-align: center;
}
```

### 2)해당 html만 사용하고 싶은 스타일이 있으면 <style>

```css
<style>
		h3{
			width : 300px;
			height : 50px;
			background : lime;
		}
		p{
			width : 800px;
			height : 150px;
			background : blue;
			color : white;
		}
	</style>
```

### 3)특정 태그내에서 스타일을 적용하고 싶으면<태그명 style="">

```css
<h3 style="border: 1px solid white">CSS는 HTML를 이쁘게 꾸며줘요.</h3>
```

## 5. 오늘의 용어

### 1) 오버라이드

- @Override
- 원래 메서드가 있던 것을 똑같은 형태로 다시 한번 정의 해주면 원래 있었던 메서드가 다시 정의한 메서드로 덮어써짐
- 위로 올라타다

### 2) Annotation, @

- 다양한 목적이 있지만 **메타 데이터**의 비중이 가장 크다 할 수 있습니다.

> 메타-테이터(Meta-Data) : 데이터를 위한 데이터를 의미하며, 풀어 이야기하면 한 데이터에 대한 설명을 의미하는 데이터. (자신의 정보를 담고 있는 데이터)

> [https://elfinlas.github.io/2017/12/14/java-annotation/](https://elfinlas.github.io/2017/12/14/java-annotation/)

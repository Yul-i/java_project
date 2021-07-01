## 1. 복습

### 1) 순차문

- 순차문은 입력->처리->출력의 순서
- import 깜박했당!  : 클릭+f2, 마지막 글자를 지우고 다시 자동완성
- 모든 입력데이터는 컴퓨터는 String으로 읽어온다.
숫자로 쓸지, 스트링 그대로 쓸지는 프로그래머가(사람) 결정한다.
- String으로 숫자를 받을 수 있지만 연산 하려면 변환 처리를 해주어야 한다.
변환하는 처리 기능을 가진 부품을 찾아서 쓰면 된다.

```java
//1. 입력 - 지금까지 한거 JOptionPane랑 swing이 있지
String today = JOptionPane.showInputDialog("오늘은 무슨 요일일까요?");
String temp = JOptionPane.showInputDialog("오늘은 몇도 인가요?");
// 2. 처리
String result = today + "은 " + temp + "도";
// 3. 출력, sysout + 컨트롤 + 스페이스바
System.out.println(result);
```

## 2. 순차문

### 1) String → int / double

- 캐스팅은 기본 데이터만 가능하다.

int temp2 = Integer.parseInt(temp);//정수

double temp3 = Double.parseDouble(temp);//실수

- 예시

```java
String today = JOptionPane.showInputDialog("오늘은 무슨 요일일까요?");
String temp = JOptionPane.showInputDialog("오늘은 몇도 인가요?");

// 2. 처리, 27을 입력
int yes = 28; // 어제 온도
//int temp2 = Integer.parseInt(temp);//정수
// 27도라고 쓰면 인식 못함ㅠㅁ ㅠ(글자 못읽음)
double temp3 = Double.parseDouble(temp);//실수
//int result = yes - temp2;
double result2 = yes - temp3;

//캐스팅은 기본 데이터만 가능하당.

// 3. 출력, sysout + 컨트롤 + 스페이스바
//System.out.println(result + "도 차이가 나요.");
System.out.println(result2 + "도 차이가 나요.");
```

### 2) String 끼리 비교

- String 비교시엔 **equals**를 사용한다.

id.equals(id2)

- 예시

```java
String id = JOptionPane.showInputDialog("아이디 입력");
String pw = JOptionPane.showInputDialog("패스워드 입력");

String id2 = "root";// 회원가입시 가입한 id
String pw2 = "pass";// 회원가입시 가입한 pw
// 기본형 데이터가 아니면 연산자를 가지고 비교할 수 없다.

//String 비교시엔 equals를 사용한다.
System.out.println(id.equals(id2));
System.out.println(pw.equals(pw2));
System.out.println(id.equals(id2) && pw.equals(pw2));
	

//id는 중복되지 않는 고유값이기 때문에 먼저 계산하게 배치하였다.
//pw는 같은 값이 중복 될 수 있다.
//&&연산자 배치시 참고 할 것.

//and연산자인 경우, 중요한 체크를 할 비교를 첫번째에 넣는다.
//첫번째 비교에서 false가 나오면, 이후의 비교 연산자는 실행되지 않는다.
//or연산자는 반대로 true가 많이 나올 요소를 첫번째에 넣는다.

if (id.equals(id2) && pw.equals(pw2)) {//조건이 true
	//String의 초기값은 null로 준다.
	JOptionPane.showMessageDialog(null, "로그인 성공");
} else {//조건이 false
	JOptionPane.showMessageDialog(null, "로그인 실패");
}
```

## 3. 조건문

### 1) else if

```java
// 1. 입력
int score = 77;

// 2. 처리 : 학점 부여
String result = null;//변수를 선언 할 때는 초기값 넣어주기 (=초기화)

if (score >= 90) {
	result = "A학점";
}else if (score >=80) {
	result = "B학점";
}else if (score >=70) {
	result = "C학점";
}else{
	result = "D학점";
}

// 3. 출력
System.out.println(result);
```

## 4. 반복문(while)

- 반복 - 무한으로 할것인가, 유한적으로 횟수를 정해서 할 것인가
- 유한루프 - 시작값, 종료, 증가 쓰면 while문으로 만들 수 있음

```java
		while (true) {//true면 무한루프 
			System.out.println("나는 계속 돌아요..!!");
			String q = JOptionPane.showInputDialog("중단하실래요x");
			if (q.equals("x")) {
				//break;//반복문을 여기서 끝내랑
				System.exit(0);//그만행, 둘중 하나만 쓰기
			}
		}
```

## 5. WindowBuilder

- 버튼 연습

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4d5ee71e-3573-449c-81b4-18884a67dca1/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4d5ee71e-3573-449c-81b4-18884a67dca1/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3c39ea21-6e40-46b4-9f83-27a99c42ecab/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3c39ea21-6e40-46b4-9f83-27a99c42ecab/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4252f85d-190a-44f5-9e50-1d798ed9af3d/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4252f85d-190a-44f5-9e50-1d798ed9af3d/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9bb40282-ea60-4d99-9421-3c4e5a9b3609/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9bb40282-ea60-4d99-9421-3c4e5a9b3609/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/48c0311f-59e0-453c-b64c-537bb74df2c5/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/48c0311f-59e0-453c-b64c-537bb74df2c5/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ec6b823f-17a9-4521-a85b-31fc886c3ecf/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ec6b823f-17a9-4521-a85b-31fc886c3ecf/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f63072cd-aff8-4982-b367-a85461061919/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f63072cd-aff8-4982-b367-a85461061919/Untitled.png)

- 미니 계산기

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/021cb98f-3a3a-4cd8-a4c8-24fb3a8ba31a/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/021cb98f-3a3a-4cd8-a4c8-24fb3a8ba31a/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cd679ef6-2a7f-4737-b7e1-7ef578031bd4/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cd679ef6-2a7f-4737-b7e1-7ef578031bd4/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2830de28-8576-4bb4-9569-73b99683d686/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2830de28-8576-4bb4-9569-73b99683d686/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/449c84c4-0bdc-4804-ae45-2f0a923e05ea/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/449c84c4-0bdc-4804-ae45-2f0a923e05ea/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/87935015-0192-49d8-8a30-2df4fae94f23/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/87935015-0192-49d8-8a30-2df4fae94f23/Untitled.png)

## 6. 오늘의 용어

### 1) 튜링 테스트

1950년 앨런 튜링에 의해 개발된 튜링 테스트는 인간의 것과 동등하거나 구별할 수 없는 지능적인 행동을 보여주는 기계의 능력에 대한 테스트다. 튜링은 인간 평가자가 인간과 같은 반응을 일으키도록 설계된 기계 사이의 자연 언어 대화를 판단할 것을 제안했다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/dcf5c264-d4e7-431d-8a14-e6e10d964765/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/dcf5c264-d4e7-431d-8a14-e6e10d964765/Untitled.png)

> [https://ko.wikipedia.org/wiki/튜링_테스트](https://ko.wikipedia.org/wiki/%ED%8A%9C%EB%A7%81_%ED%85%8C%EC%8A%A4%ED%8A%B8)

### 2) 디버깅

디버깅(영어: debugging) 또는 디버그(영어: debug)는 컴퓨터 프로그램 개발 단계 중에 발생하는 시스템의 논리적인 오류나 비정상적 연산(버그)을 찾아내고 그 원인을 밝히고 수정하는 작업 과정을 뜻한다.

> [https://ko.wikipedia.org/wiki/디버그](https://ko.wikipedia.org/wiki/%EB%94%94%EB%B2%84%EA%B7%B8)

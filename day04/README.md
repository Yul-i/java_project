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

### 5. WindowBuilder

- 버튼 연습
- 미니 계산기

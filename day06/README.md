## 1. 복습

### 1) 부품사용방법

- 망치 : 너무 자주 사용하여 RAM에 이미 들어가있음.
    - 클래스 이름으로 바로 사용가능.
    - Integer, Double, System, JOptionPane 등등
    - 기능을 가진 부품을 선택 - 선택의 기준 : 기능을 가지고 있는지 여부
    - 함수를 가지고 있는 부품을 선택

- 벽돌 : Date라는 부품을 복사해서 램에 변수를 만들어 저장해둔다.
    - cpu는 모든 부품을 램에 가져다 놓고 조립한다.
    - Date date; => 저장된타입 변수명;(선언:램에 저장공간을 만드는 것.)

```java
Date name;
name = new Date();

=>
Date date = new Date();// 보통 클래스명은 대문자니 소문자 명으로 바꿔서 쓰는걸 권장함
Random r = new Random();
Scanner sc = new Scanner(System.in);
```

```java
		Date date = new Date();// 보통 클래스명은 대문자니 소문자 명으로 바꿔서 쓰는걸 권장함
//		Random r = new Random();
//		Scanner sc = new Scanner(System.in);

		int hour = date.getHours(); // 10
		System.out.println("현재 시각은 " + hour + "시");
```

- 함수 : 반환값이 있는 함수가 있고 없는게 있다.
    - 반환을 return 이라고 부른다.
    - 반환이 있는 함수만 프린트가 가능하다.
    - 반환이 없는 경우에는 void라고 써있다. void = 없다.

```java
System.out.println(date.getMinutes());
// 계속 반복해서 쓸거면 변수에 담는거지. 문제가 되는건 없음

System.out.println(System.out.println()); (이렇게 쓰면 안된다!)
```

### 2) 조건문

```java
int month = date.getMonth() + 1;
		String result = "해당 계절이 없습니다.";

		if (month == 3 || month == 4 || month == 5) {
			result = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			result = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			result = "가을";
		} else {
			result = "겨울";
		}

		System.out.println(result);
```

## 2. 조건문

### 1) break;

- if문에는 자체 break가 있다. while은 없음.
- while은 break를 안걸어주면 무한루프이다.

```java
int day = date.getDay();// 요일
		if (day == 0 || day == 6) {// if문에는 자체 break가 있다. while은 없음.
			System.out.println("주말에는 놀아요.");
		} else {
			System.out.println("주중에는 달려요.");
		}

		while (true) {// break가 없어서 자동으로 1-2-3-1-2-3 무한루프
			System.out.println("달려요!! 달려!!"); // 1
			System.out.println("또 달려요!"); // 2
			System.out.println("마지막 달려요!!"); // 3
			break;
		}
```

### 2) Switch

- 정수 지원함(int), 문자1, String 지원함 - 실수는x
- while처럼 break 써줘야 멈춤, 반드시 넣어줘야 함.
- 예시

```java
//
		switch (month) {// 얘도 while처럼 break 써줘야 멈춤, 반드시 넣어줘야 함.
		case 3:
		case 4:
		case 5:
			System.out.println("봄 입니다.");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println("여름 입니다.");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println("가을 입니다.");
			break;

		default://else가 없으면 안써도 됨
			System.out.println("겨울 입니다.");
			break;
		}
```

- 사원번호 구하기

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/86bc7c18-3690-47e2-8000-7b97df3ba969/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/86bc7c18-3690-47e2-8000-7b97df3ba969/Untitled.png)

- 태어난 연도/시각

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/24cc7e64-a5a7-4b66-8892-72a55cdecabb/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/24cc7e64-a5a7-4b66-8892-72a55cdecabb/Untitled.png)

## 3. 그래픽 프로그램

- 버튼 for문 돌리기

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/33d2c38c-6ea5-43aa-b2d4-66705129112e/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/33d2c38c-6ea5-43aa-b2d4-66705129112e/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6e0a9534-297f-48ae-982b-cfe6e23e72d4/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6e0a9534-297f-48ae-982b-cfe6e23e72d4/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/457eb9bd-cb01-4f6a-9113-d51372c6c5de/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/457eb9bd-cb01-4f6a-9113-d51372c6c5de/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2159d31b-bf5e-4729-9f55-0817dbaa5e7a/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2159d31b-bf5e-4729-9f55-0817dbaa5e7a/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/65693fcd-34dd-424b-888c-0512c0a253a6/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/65693fcd-34dd-424b-888c-0512c0a253a6/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ae3caf46-c3ed-491a-8455-06970cc894b7/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ae3caf46-c3ed-491a-8455-06970cc894b7/Untitled.png)

### 4. 오늘의 용어

### 1) 스케일 아웃 (Scale out)

‘스케일 아웃’이란 서버를 여러 대 추가하여 시스템을 확장하는 방법입니다. 예를 들어, ‘1’의 처리 능력을 가진 서버에 동일한 서버 4대를 더 추가하여, 총 ‘5’의 처리 능력을 만드는 것입니다. 서버가 여러 대가 되기 때문에 각 서버에 걸리는 부하를 균등하게 해주는 ‘로드밸런싱’이 필수적으로 동반되어야 합니다. 스케일 아웃의 경우, 서버 한 대가 장애로 다운되더라도 다른 서버로 서비스 제공이 가능하다는 장점이 있습니다. 반면 모든 서버가 동일한 데이터를 가지고 있어야 하므로, 데이터 변화가 적은 ‘웹 서버’에 적합한 방식입니다.

### 2) 스케일 업(Scale up)

‘스케일 업’은 서버에 CPU나 RAM 등을 추가하거나 고성능의 부품, 서버로 교환하는 방법을 의미합니다. 예를 들어, ‘1’의 처리 능력을 가진 서버 한 대를 ‘5’의 처리 능력을 가진 서버로 업그레이드시키는 것입니다. CPU나 RAM을 추가하기로 했다면 현재 서버에 추가 부품을 장착할 수 있는 여유 슬롯이 있어야 하며, 그렇지 않은 경우 서버 자체를 고성능으로 교체하는 것이 필요합니다. 스케일 업의 경우, 서버 한 대에 모든 부하가 집중되므로 장애 시 영향을 크게 받을 수 있는 위험성이 있습니다. 한 대의 서버에서 모든 데이터를 처리하므로 데이터 갱신이 빈번하게 일어나는 ‘데이터베이스 서버’에 적합한 방식입니다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/03eb5a37-de20-448e-9df6-91e3e9f9a642/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/03eb5a37-de20-448e-9df6-91e3e9f9a642/Untitled.png)

> [https://library.gabia.com/contents/infrahosting/1222/](https://library.gabia.com/contents/infrahosting/1222/)

### 3) 블록체인(BlockChain)

관리 대상 데이터를 '블록'이라고 하는 소규모 데이터들이 P2P 방식을 기반으로 생성된 체인 형태의 연결고리 기반 분산 데이터 저장 환경에 저장하여 누구라도 임의로 수정할 수 없고 누구나 변경의 결과를 열람할 수 있는 분산 컴퓨팅 기술 기반의 원장 관리 기술

> [https://ko.wikipedia.org/wiki/블록체인](https://ko.wikipedia.org/wiki/%EB%B8%94%EB%A1%9D%EC%B2%B4%EC%9D%B8)

### 4) 하둡 분산형 파일시스템(Hadoop Distributed FileSystem, HDFS)

분산 환경에서 빅 데이터를 저장하고 처리할 수 있는 자바 기반의 오픈 소스 프레임 워크.

> [https://opentutorials.org/module/2926/17055](https://opentutorials.org/module/2926/17055)

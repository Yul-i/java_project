## 1. 복습

### 1) 배열에 값 넣기

```java
// 정수 5개 크기의 배열을 만들어서
		// 10, 20, 30, 40, 50 을 순서대로 넣는다.
		// 첫번째값과 세번째값을 더해서 프린트.
		
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("배열에 넣을 숫자 넣기 >> ");
			num[i] = sc.nextInt();
		}
		
		System.out.println(num[0]+num[2]);
		sc.close();//scanner 스트림(연결 통로)를 닫아라.
		
```

```java
		// 스트링 3개 크기의 배열을 만들어서
		// 자바, 스프링, JSP를 순서대로 넣는다.
		// -> "자바 보다는 스프링"으로 출력
		
		String[] s = new String[3];
		//배열 자동 초기화{null, null, null}
		String[] s2 = {"java", "jsp", "spring"};
		// s2[0] : 주소!
		// String 변수는 원래 주소가 들어가있지만,
		// 내부적으로 그 주소가 가르키는 char들을 프린트 되도록 조정이 되어있는 상태
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {
			System.out.println("과목 입력>> ");
			s[i] = sc.next();
		}
		
		System.out.println(s[0]+"보다는 "+s[1]);
```

### 2) 베열의 크기를 구하기(String, int)

- 참조형 변수
- 기본형 변수

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0f7220ac-4737-4ea3-9b57-40765070e299/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0f7220ac-4737-4ea3-9b57-40765070e299/Untitled.png)

### 3) 랜덤 1000개 배열에 값 넣기

```java
int[] jumsu = new int[1000];
		//{0,0,0,0,0,0,0,0,0,0,0...}		
		// 변수 개수 : 1002개
		// 램의 크기 : 4012byte(4004+8)
		System.out.println(jumsu.length + "개");
		System.out.println(jumsu);
		//기본형 변수(값) : 1001개(배열 갯수, 배열 길이)
		//참조형 변수(주소)의 개수 : 1개(jumsu)
		
		Random r = new Random(42);
//		System.out.println(r.nextInt(100));
//		jumsu[0] = r.nextInt()100;
//		jumsu[1] = r.nextInt()100;
//		jumsu[2] = r.nextInt()100;
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(100);
		}
		
//		for (int i = 0; i < jumsu.length; i++) {
//			System.out.println(jumsu[i]);
//		}
		
		for (int i : jumsu) {
			System.out.println(i);
		}
```

## 2. 영화 예매

### 1) 분석 해보기

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/948d1108-9446-4f36-9a78-2ab1731f862d/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/948d1108-9446-4f36-9a78-2ab1731f862d/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/79b8d4dc-8e5a-42ac-a689-b672f6c1385a/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/79b8d4dc-8e5a-42ac-a689-b672f6c1385a/Untitled.png)

### 2) 작업 과정 그려보기

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c9a3c6a8-3e39-45df-a218-a3cbccc6e7d7/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c9a3c6a8-3e39-45df-a218-a3cbccc6e7d7/Untitled.png)

### 3) 복기 해보기

```java
public static void main(String[] args) {

		int[] seat = new int[10];
		int count = 0;
		int count2 = 0;
		final int COST = 12000;
		String sum = "";
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("--------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("--------------------");
			for (int i : seat) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.print("예매할 좌석 번호>> ");
			int num = sc.nextInt();

			// 예약 종료
			if (num == -1) {
				System.out.println("예약 종료합니다.");
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count2++;
						sum = sum + i + "번 좌석 ";
					}
				}
				System.out.println(sum);
				System.out.println("총 " + count2 * COST + "원 입니다.");
				break;
			}

			// 예약하기
			if (seat[num] != 1) {
				seat[num] = 1;
				count++;
				System.out.println(num + "번 좌석 예약 완료");
				System.out.println(count + "개 좌석 예약");
			} else {
				System.out.println("이미 예약된 좌석");
			}
			System.out.println();
		}
		sc.close();
	}
```

## 3. 응용

### 1)  좋아하는 과일

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/dbdd946c-c3fc-4a96-bbf3-d31cf54019dc/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/dbdd946c-c3fc-4a96-bbf3-d31cf54019dc/Untitled.png)

## 4. 오늘의 용어

### 1) 구글 차트

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1dd47b38-8085-4f9a-8b1c-4943f94133c1/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1dd47b38-8085-4f9a-8b1c-4943f94133c1/Untitled.png)

> [https://developers.google.com/chart](https://developers.google.com/chart)

### 2) API(Application Programming Interface)

- API(Application Programming Interface 애플리케이션 프로그래밍 인터페이스, 응용 프로그램 프로그래밍 인터페이스)는 응용 프로그램에서 사용할 수 있도록, 운영 체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스를 뜻한다.

### 3) 웹 API

- 웹 API는 웹 애플리케이션 개발에서 다른 서비스에 요청을 보내고 응답을 받기 위해 정의된 명세를 일컫는다.
- 예를 들어 블로그 API를 이용하면 블로그에 접속하지 않고도 다른 방법으로 글을 올릴 수 있다. 그 외에 우체국의 우편번호 API, 구글과 네이버의 지도 API등 유용한 API들이 많으므로, 요즘은 홈페이지 구축이나 추가개편 시 따로 추가로 개발하지 않고 이런 오픈 API를 가져와 사용하는 추세다.

> [https://ko.wikipedia.org/wiki/API](https://ko.wikipedia.org/wiki/API)

### 4) 모듈

- 소프트웨어 설계에서 **기능단위로 분해하고 추상화 되어 재사용 및 공유 가능한 수준으로 만들어진 단위**

### 5)모듈화

- 소프트웨어의 **성능을 향상시키거나 시스템의 디버깅, 시험, 통합 및 수정을 용이하도록 하는 소프트웨어 설계 기법**

> [https://vincentgeranium.github.io/study/2019/08/26/module.html](https://vincentgeranium.github.io/study/2019/08/26/module.html)

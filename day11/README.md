## 1. 복습

### 1) 배열을 쓰기 좋은 조건

1. 크기가 고정되어있을때
2. 타입이 같을 때

### 2) 수능 만점자 구하기

```java
int[] jumsu = new int[10000];
		Random r = new Random(5);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(331);
		}
		//1. 수능 만점자는 몇명일까요?
		int count = 0;
		for (int j = 0; j < jumsu.length; j++) {
			if (jumsu[j]==330) {
				count++;//count = count + 1
				//2. 만점자 번호는 몇번?
				System.out.println("번호> "+ j);
			}
		}System.out.println("수능 만점자 : "+count+"명");

		// 내가 짠거
		String person = "";
		for (int j = 0; j < jumsu.length; j++) {
			if (jumsu[j]==330) {
				person = person + j+"번 ";
			}
		}System.out.println("수능 만점자 : "+person);
```

### 3) 성적 구하기

```java
String[] subject = { "컴퓨터", "국어", "수학", "영어", "체육" };
		int[] term1 = { 77, 88, 99, 80, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		// 1. 성적이 2학기에 향상된 과목의 수를 카운트 해보세요.
		int count1 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count1++;
			}
		}
		System.out.println("성적 향상 과목 수 : " + count1);
		// 2. 성적이 1,2학기 동일한 과목의 수를 카운트 해보세요.
		int count2 = 0;
		int location = -1;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count2++;
				location = i;
			}
		}
		System.out.println("성적 동일 과목 수 : " + count2);

		// 3. 성적이 1,2학기 동일하나 과목의 과목명을 프린터 해보세요.
		if (location != -1) {			
			System.out.println("성적 동일 과목 명 : " + subject[location]);
		}else {
			System.out.println("동일한 과목이 없습니다.");
		}
```

## 2. 배열 복사

### 1) 기본형 복사

- ram의 변수에 들어있는 값을 복사

```java
int x = 100;
		int y = x;//기본형 복사
		System.out.println("x: "+x);//100
		System.out.println("y: "+y);//100
		
		System.out.println("==원본 x값 수정 후==");
		
		x = 200;
		System.out.println("x: "+x);//200
		System.out.println("y: "+y);//100
```

### 2) 참조형 복사(얕은 복사)

- 변수에 들어있는 주소를 복사

```java
		int[] x = {1,2,3};
		int[] y = x; 

		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i+" ");//1,2,3
		}
		System.out.println();
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i+" "); //1,2,3
		}
		
		System.out.println("\n==원본 x 값 수정 후==");
		
		x[0] = 9;
		
		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i+" "); //9,2,3
		}
		System.out.println();
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i+" "); //9,2,3
		}
```

### 3) 참조형 복사(깊은 복사, shallow copy)

- 주소가 가르키는 값들의 목록을 복사

```java
		int[] x = {1,2,3};
		int[] y = x.clone();

		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i+" "); //1,2,3
		}
		System.out.println();
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i+" ");//1,2,3
		}
		
		System.out.println("\n==원본 x 값 수정 후==");
		x[0] = 9;
		
		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i+" ");//9,2,3
		}
		System.out.println();
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i+" ");//1,2,3
		}
```

### 4) 참조형 복사 - 그림

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/336f8d07-02ea-4551-a632-0b9688d06af3/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/336f8d07-02ea-4551-a632-0b9688d06af3/Untitled.png)

## 3. 깊은 복사 응용

### 1) 성적 구하기

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ec7082d0-5ccf-4b9f-8a02-8e53eac01be2/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ec7082d0-5ccf-4b9f-8a02-8e53eac01be2/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/82fd8841-425e-4ce6-a8a7-2c13253fe5d1/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/82fd8841-425e-4ce6-a8a7-2c13253fe5d1/Untitled.png)

## 3. 널포인터 익셉션(NullpointerException)

### 1) null값

- null은 숫자 0이나 문자의 공백과는 다른 것입니다. null이란 "존재하지 않는다, 없다, 아무것도 아니다.." 뭐 이런정도의 뜻이 될겁니다.
- NullpointerException은 null값으로 뭔가를 하려고할 때, 또는 객체가 초기화되지 않은 상태에서 객체의 변수나 메소드를 접근하려고 할 때 발생합니다.

```java
String s = null;//공간만 만들지 차지하진 않는다.
		System.out.println(s.charAt(0));//실행x
		
		String[] s = new String[10];
		System.out.println(s[0].charAt(0));//실행x
		System.out.println("내가 실행되나...");
```

> [https://okky.kr/article/13824](https://okky.kr/article/13824)

### 2) 자료형 초기값

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/723b9dc8-7197-49fd-af1e-ae8ca28c5848/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/723b9dc8-7197-49fd-af1e-ae8ca28c5848/Untitled.png)

## 4. 에러의 종류

### 1) 번역단계

- 컴파일, 컴파일러(javac.exe) => 컴파일 에러
- javac 영화예매.java

### 2)실행단계

- 인터프리트, 인터프리터(java.exe) => 실행(런타임) 에러
- java 영화예매

## 5. 배열 메소드

### 1) arrays.split()

- split() 메서드는 String 객체를 지정한 구분자를 이용하여 여러 개의 문자열로 나눕니다.

```java
String s = "감자,고구마,양파";
		String[]s2 = s.split(",");//{"감자","고구마","양파"}
		for (String i : s2) {
			System.out.println(i);
		}
		System.out.println(s2.length);
		System.out.println(s2[0].equals(s2[1]));
		
		//일,월,화 날씨를 순서대로 입력해보세요.(흐림,맑음,흐림)
		//흐림이 몇개인지, 맑음이 몇개인지
		// 1.sc.next()로 받아서
		// 2.스트링을 배열로 변환해서 넣으세요.
		// 3.count 해보세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일,월,화 날씨를 순서대로 입력해보세요.>> ");
		String weather = sc.next();
		String[] weather2 = weather.split(",");
		int count = 0, count2 = 0;
		for (int i = 0; i < weather2.length; i++) {
			if (weather2[i].equals("흐림")) {
				count++;
			}else if(weather2[i].equals("맑음")) {
				count2++;
			}
		}
		System.out.println("흐림: "+count+", 맑음: "+count2);
	}
```

> [https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/String/split](https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/String/split)

### 2) arrays.trim()

- trim() 메서드는 문자열 양 끝의 공백을 제거합니다. 공백이란 모든 공백문자(space, tab, NBSP 등)와 모든 개행문자(LF, CR 등)를 의미합니다.

> [https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/String/Trim](https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/String/Trim)

### 3) arrays.replace("기존 문자열", "새로운 문자열")

- replace() 메서드는 어떤 패턴에 일치하는 일부 또는 모든 부분이 교체된 새로운 문자열을 반환합니다. 그 패턴은 문자열이나 정규식(RegExp)이 될 수 있으며, 교체 문자열은 문자열이나 모든 매치에 대해서 호출된 함수일 수 있습니다.

```java
		String s1 = "    감자        ";
		System.out.println(s1.length());
		
		String s2 = s1.trim();
		System.out.println(s2.length());
		
		String s3 = s1.replace("    ", "");
		System.out.println(s3.length());
```

> [https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/String/replace](https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/String/replace)

### 4) 메서드들..

```java
		String s = "나는 너구리구리야";
		String s2 = "아니야!!";
		String s3 = "You are racoon.";
		
		//스트링 결합
		System.out.println(s+s2);//나는 너구리구리야아니야!!
		System.out.println(s.concat(s2));//나는 너구리구리야아니야!!

		//문자 1글자 추출
		System.out.println(s.charAt(4));//구
		System.out.println(s.charAt(2));//" "

		//특정한 문자로 끝나는지 확인
		System.out.println(s.endsWith("야"));//true
		System.out.println(s.endsWith("리"));//false

		//인덱스 3이후 글자들 모두 추출
		System.out.println(s.substring(3));//너구리구리야

		//인덱스 3~8까지 글자들 모두 추출
		System.out.println(s.substring(3, 8));//너구리구리

		//s에 s2가 포함되어있는가?
		System.out.println(s.contains(s2));//false

		//s중 " "글자의 위치
		System.out.println(s.lastIndexOf("너"));//3
		System.out.println(s.lastIndexOf("구"));//6 (마지막 글자만 찾아주나보다)

		//대문자로
		System.out.println(s3.toUpperCase());//YOU ARE RACOON.

		//소문자로
		System.out.println(s3.toLowerCase());//you are racoon.

		//글자 수 
		System.out.println(s.length());//9

		//글자 바꿔주기
		System.out.println(s.replace("너", "개"));//나는 개구리구리야
```

### 5) 비파괴함수

- 원본을 건드리지 않는다.
- 예시

```java
		String data = "감자, 고구마, 양파, 고구마, 양파, 양파 ";
		System.out.println(data.length());//25
		String data2 = data.trim();
		System.out.println(data2);//감자, 고구마, 양파, 고구마, 양파, 양파
		System.out.println(data2.length());//24
		String data3 = data.replace(" ", "");
		System.out.println(data3);//감자,고구마,양파,고구마,양파,양파
		System.out.println(data3.length());//19
```

### 6) 파괴함수

- 원본을 건드린다.

```java
//파괴함수
		int[] num = {1, 2, 5, 10, 4, 20};
		Arrays.sort(num);//원본 위치를 바꿔버림, 파괴함수
		for (int i : num) {
			System.out.print(i+ " ");//1 2 4 5 10 20 
		}
```

### 7) 응용문제 - 휴대폰 번호

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3adf70c3-1db9-44d5-b481-9b461349287c/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3adf70c3-1db9-44d5-b481-9b461349287c/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a1268d36-5911-44e7-9cb0-ea2aa391863c/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a1268d36-5911-44e7-9cb0-ea2aa391863c/Untitled.png)

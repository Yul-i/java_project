## 1. 배열

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/514ddcdd-e229-4822-bc98-54c1aba84210/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/514ddcdd-e229-4822-bc98-54c1aba84210/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e978ee06-6881-48b9-9987-ec5a245b2d82/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e978ee06-6881-48b9-9987-ec5a245b2d82/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/57d9b851-9537-4dd7-92c9-5eb1095f6082/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/57d9b851-9537-4dd7-92c9-5eb1095f6082/Untitled.png)

### 1) 기본형 배열

- int[] 변수명 : int로 만들어진 배열을 가리키는 주소가 변수명에 들어간다라는 의미
- main안에서 선언되어야 한다.

```java
public static void main(String[] args) {
		int[] s = new int[10];
		double[] s2 = new double[5];
		String[] s3 = new String[100];
		
		//배열은 자동초기화 시켜줌.
		System.out.println(s); //0
		System.out.println(s2); //0
		System.out.println(s3); //null

	}
```

- 배열 선언 풀어보기

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3be3268c-12fe-44c5-92a6-8eea5a169bb1/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3be3268c-12fe-44c5-92a6-8eea5a169bb1/Untitled.png)

```java
int[] s = new int[10];
System.out.println(s.length);//배열의 갯수
```

- int[] : int 타입의 배열을 가르키는 주소가 들어간다는 의미
- s : 힙영역에 할당된 저장공간의 주소가 들어간다.
- = : 힙영역에 할당된 저장공간의 주소를 변수에 넣는다.
- new : 힙영역에 지정된 타입의 크기만큼 배열을 만들어라.
- int[10] : 배열로 만들어진 데이터의 타입과 크기가 설정/0~9까지의 index를 가진 배열 생성

```java
for (int i = 0; i < s.length; i++) {//i=index
			System.out.print(s[i]+" ");
			//배열은 자동 초기화 되어있음
		}System.out.println();
		
		for (int i = 0; i < s.length; i++) {
			s[i] = i;
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+ 1 + " ");
		}
```

### 2) 배열 값을 알고 있는 경우

```java
public static void main(String[] args) {
		// 배열을 만들때는 처음부터 값들을 알고 있는 경우/모르는 경우
		String[] names = { "홍길동", "송길동", "정길동", "박길동", "장길동" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		for (String n : names) {
			System.out.println(n);
		}
		
		int[] ages = { 100, 88, 55, 10, 4 };
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		for (int x : ages) {
			System.out.println(x);
		}
		
		double[] eyes = { 2.0, 1.5, 1.2, 0.8, 1.0 };
		for (int i = 0; i < eyes.length; i++) {
			System.out.println(eyes[i]);
		}
		for (double d : eyes) {
			System.out.println(d);
		}

		char[] gender = { '남', '여', '남', '여', '남' };
		for (int i = 0; i < gender.length; i++) {
			System.out.println(gender[i]);
		}
		for (char c : gender) {
			System.out.println(c);
		}
		
		boolean[] food = { true, false, true, true, false };
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		for (boolean b : food) {
			System.out.println(b);
		}
	}
```

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b957cda3-3aa7-4e8f-88e8-a46ed04cf296/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b957cda3-3aa7-4e8f-88e8-a46ed04cf296/Untitled.png)

- 문제 풀이

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6aec1437-8573-4ebf-b035-572719a61831/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6aec1437-8573-4ebf-b035-572719a61831/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2c67fedd-8b16-49a7-bb1a-b5646c63cbe7/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2c67fedd-8b16-49a7-bb1a-b5646c63cbe7/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/aea18f2d-f308-4f6e-ac93-f2e77564589a/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/aea18f2d-f308-4f6e-ac93-f2e77564589a/Untitled.png)

## 2. Heap 영역

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/34eac049-fcea-4bf9-8edd-57761cefcde0/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/34eac049-fcea-4bf9-8edd-57761cefcde0/Untitled.png)

- 관리가 가능한 데이터 외에 다른 형태의 데이터를 관리하기 위한 빈공간(Space)
- **즉 동적할당(Dynamic Allocation)에 의해 생성된 동적 변수(Dynamic Variables)를 관리하기 위한 영역**
- new연산자로 생성된 객체와 배열을 저장하는 공간
- 클래스 영역에 로드된 클래스만 생성가능
- GarbageCollector(GC)를 통해 메모리 반환
- java나 c++등에서 'new', c에서 'malloc', 'calloc' 을 통해 동적으로 생성되는 변수를 저장하기 위해 할당 되는 영역

> [https://power-overwhelming.tistory.com/33](https://power-overwhelming.tistory.com/33)

## 3. for과 foreach 차이

### 1) for each

for each 문의 구조는 다음과 같다.

```java
for (type var: iterate) {
    body-of-loop
}
```

위 iterate는 루프를 돌릴 객체이고 iterate 객체에서 한개씩 순차적으로 var에 대입되어 for문을 수행하게 된다. iterate부분에 들어가는 타입은 루프를 돌릴수 있는 형태인 배열 및 ArrayList등이 가능하다.

다음은 위 예제를 ArrayList 로 재 구현한 예제이다. for문의 사용법은 String[] 배열을 사용했을 때와 완전히 동일하다.

```java
ArrayList<String> numbers =new ArrayList<String>();
numbers.add("one");
numbers.add("two");
numbers.add("three");

for(String number: numbers) {
    System.out.println(number);
}
```

단, foreach문은 따로 반복회수를 명시적으로 주는 것이 불가능하고, 1스탭씩 순차적으로 반복될때만 사용가능하다는 제약이 있다.

### 2) 브레인 스토밍의 결과...

```java
String[] names = { "홍길동", "송길동", "정길동", "박길동", "장길동" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		for (String n : names) {
			System.out.println(n);
		}
```

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6ea918d4-0351-49b9-86b1-e260fd0f2b49/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6ea918d4-0351-49b9-86b1-e260fd0f2b49/Untitled.png)

## 4. 오늘의 용어

### 1) 메모리 동적할당

동적 메모리 할당 또는 메모리 동적 할당은 컴퓨터 프로그래밍에서 실행 시간 동안 사용할 메모리 공간을 할당하는 것을 말한다. 사용이 끝나면 운영체제가 쓸 수 있도록 반납하고 다음에 요구가 오면 재 할당을 받을 수 있다.

> [https://ko.wikipedia.org/wiki/유틸리티_소프트웨어](https://ko.wikipedia.org/wiki/%EB%8F%99%EC%A0%81_%EB%A9%94%EB%AA%A8%EB%A6%AC_%ED%95%A0%EB%8B%B9)

### 2) 메모리 정적 할당

정적 메모리 할당은 메모리 할당 방법 중에 하나로, 메모리의 크기가 하드 코딩되어 있기 때문에 프로그램이 실행 될 때 이미 해당 메모리의 크기가 결정되는 것이 특징이다.

> [https://ko.wikipedia.org/wiki/정적_메모리_할당](https://ko.wikipedia.org/wiki/%EC%A0%95%EC%A0%81_%EB%A9%94%EB%AA%A8%EB%A6%AC_%ED%95%A0%EB%8B%B9)

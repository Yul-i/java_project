## 1. 복습

### 1) 2차원 배열 - 열이 동일

```java
int[][] n2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		for (int i = 0; i < n2.length; i++) {
			for (int j = 0; j < n2[i].length; j++) {
				System.out.print(n2[i][j]+" ");
			}System.out.println();
		}

		int[][] n1 = new int[3][4];
		System.out.println("2차원 배열의 행의 개수 : " + n1.length);
		System.out.println("0행의 배열의 행의 개수 : " + n1[0].length);
		System.out.println("1행의 배열의 행의 개수 : " + n1[1].length);
		System.out.println("2행의 배열의 행의 개수 : " + n1[2].length);
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				System.out.print(n1[i][j] + " ");
			}
			System.out.println();
		}
```

### 2) 2차원 배열 - 열이 다름

```java
//  1. 배열 처음에 만들 때 값을 이미 알고 있는 경우
		int[][] n1 = { { 1, 2, 3 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4, 5 } };
		
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				System.out.print(n1[i][j]+" ");
			}System.out.println();
		}
		
//		2. 배열 처음에 만들 때 값을 모르고 있는 경우
//		2-1) 1차원 배열을 만들어라.
		int[][] n2 = new int[3][];
//		2-2) 1차원 배열을 2차원 배열의 각 행에 끼워넣어라.
		int[] arr1 = new int[10];
		int[] arr2 = new int[15];
		int[] arr3 = new int[12];
		
		n2[0] = arr1;
		n2[1] = arr2;
		n2[2] = arr3;
		
		for (int i = 0; i < n2.length; i++) {
			for (int j = 0; j < n2[i].length; j++) {
				System.out.print(n2[i][j]+" ");
			}System.out.println();
		}
```

### 3) 응용 문제 - 랜덤

```java
랜덤한 값을 1~100
//		4*5 2차원 배열에 넣으세요.
//		전체를 프린트
		int arr[][] = new int[4][5];
		Random r = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(100)+1;
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
```

### 4) 그래픽 - JTable

```java
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 제이테이블2차원배열 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 300);
		
		//제목
		String[] title = {"컴퓨터", "영어", "수학", "체육"};
		
		//내용
		String[][] contents = {
				{"100", "88", "99", "77"},
				{"70", "87", "79", "78"},
				{"60", "83", "89", "79"},
				{"80", "86", "59", "80"},
				{"100", "88", "99", "77"},
				{"70", "87", "79", "78"},
				{"60", "83", "89", "79"},
				{"80", "86", "59", "80"},
				{"100", "88", "99", "77"},
				{"70", "87", "79", "78"},
				{"60", "83", "89", "79"},
				{"80", "86", "59", "80"},
				{"100", "88", "99", "77"},
				{"70", "87", "79", "78"},
				{"60", "83", "89", "79"},
				{"80", "86", "59", "80"}
		};
		JTable table = new JTable(contents, title);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		f.setVisible(true);
	}

}
```

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6b1f7909-79b5-49a8-902e-ce3180871b93/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6b1f7909-79b5-49a8-902e-ce3180871b93/Untitled.png)

## 2. 알고리즘

### 1) 최솟값 구하기(min)

- min에 계속 들어가는 작은 수

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0c84cf4c-aa1a-4821-84f9-11ec3bba7e50/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0c84cf4c-aa1a-4821-84f9-11ec3bba7e50/Untitled.png)

```java
// 많은 양의 데이터를 정렬/검색 하는 경우 배열에 집어넣어라.
		int[] s = { 90, 80, 20, 60, 70 };

		// 전체를 n번 순차적으로 순회하면서 해당 인덱스까지의 최솟값을 변수 하나를
		// 정해서 넣어두는 알고리즘
		int min = s[0]; // 90, 첫 번째 값을 넣어둔다.
		// 해당 인덱스에 들어있는 값이 min에 넣어둔 값보다 작으면
		// 해당 인덱스에 들어있는 값을 min에 넣어둔다.
		for (int i = 1; i < s.length; i++) {
			if (s[i] < min) {
				min = s[i];
			}
		}
		
		System.out.println("최솟값은"+min);
	}
```

### 2) 최솟값 구하기(min) - 응용

```java
		// 1~1000까지의 값을 랜덤하게 10000개 만들어서
		// 1. 최솟값을 찾아보세요
		// 2. 개수를 세어보세요
		// 3. 위치값을 찾아보세요

		Random r = new Random();
		int[] arr = new int[10000];
		String location = "";
		int save = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(1000) + 1;
		}

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println("최솟값 : " + min);

		for (int i = 0; i < arr.length; i++) {
			if (min == arr[i]) {
				save++;
				location += i + "번 ";
			}
		}
		System.out.println("min의 갯수: " + save);
		System.out.println("위치값: " + location);

	}
```

## 3. 가변적인 크기를 가진 배열

### 1) ArrayList

- 많은 양의 데이터를 다룰 때, 가변, 다양한 데이타인 경우 사용

```java
		ArrayList list = new ArrayList();
		//많은 양의 데이터를 다룰 때, 가변, 다양한 데이타인 경우 사용
		//Object
		list.add(100);
		list.add(100.33);
		list.add(true);
		list.add('a');
		list.add("감자");
		
		Random r = new Random();
		list.add(r);
		
		//값 가져올때는 .get()
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
//		System.out.println(list.get(5));
		
		//크기는 .size()
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+": "+list.get(i));
		}
		
		//삭제는 .remove()
		list.remove(5);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+": "+list.get(i));
		}
```

- .get() : 값을 가져온다.
- .add() : 값을 저장한다.
- .size() : 배열의 크기를 담는다.
- .remove() : 선택한 값을 삭제한다.

### 2) HashSet

- 많은 양의 데이터를 다룰 때, 가변, 다양한 데이타인 경우 사용
- 중복된 값을 허용하지 않는다.

```java
	//set : 집합, 중복된 값 허용하지 x
		HashSet set = new HashSet();
		set.add("");
		set.add(100);
		set.add(200);
		set.add(100);
		System.out.println(set.size());
		System.out.println(set);//주소대신에 내부 값이 보이게 만들어놔서 굳이 for문 안돌려도 보임
```

- 문법은 ArrayList와 동일하다.

### 3) 2차원 배열에 값 넣기(길이가 다른 배열)

```java
	//set : 집합, 중복된 값 허용하지 x
		HashSet set = new HashSet();
		set.add("");
		set.add(100);
		set.add(200);
		set.add(100);
		System.out.println(set.size());
		System.out.println(set);//주소대신에 내부 값이 보이게 만들어놔서 굳이 for문 안돌려도 보임
```

## 3. 클래스(class)

### 1) 클래스 생성

- 전역변수(Global, 글로별 변수)<->지역변수(local, 자동 초기화 안됨, 메모리 위치 다름)
- 성질 => 변수로 만든다. 멤버변수
	ex) 색(color), 바퀴수(count)
- 동작 => 멤버메서드(함수의 기능을 정의)
- 예시

```java
package 클래스생성;

public class Car {
	//전역변수(Global, 글로별 변수)<->지역변수(local, 자동 초기화 안됨, 메모리 위치 다름)
	//(모델링)
	// 성질 => 변수로 만든다. 멤버변수
	// 색(color), 바퀴수(count)
	public String color; //클래스 밑에 만들어지면 자동 초기화 됨 null
	public int count;//자동초기화 0
	
	// 동작 => 멤버메서드
	public void run() {//메서드
		//함수의 기능을 정의
		System.out.println("네 바퀴로 달리자.");
	}
	
	public void up() {
		System.out.println("속도를 20씩 높이자.");
	}
}
```

### 2) 클래스 사용

```java
package 클래스사용;

import java.util.Scanner;

import 클래스생성.Car;

public class 자동차공장 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.run();
		car1.up();
		car1.color = "빨강";
		car1.count = 4;
		
		System.out.println(car1.color);
		System.out.println(car1.count);

		
	}
```

### 3) 응용

- 거실 class에 Phone, Dog 클래스를 가져와라.

- Phone 클래스

```java
package 클래스생성;

public class Phone {
	public String os;
	public int series;
	
	public void ring(){
		System.out.println("전화가 왔어요.");
	}
	
	public void message() {
		System.out.println("문자가 왔어요.");
	}
}
```

- Dog 클래스

```java
package 클래스생성;

public class Dog {
	public String kinds;
	public int many;
	
	public void bark(String say){
		System.out.println("개가 "+say+" 짓는다.");
	}
	
	public void eat(String i) {
		System.out.println("사료는 "+i+"를 좋아한다.");
	}
}
```

- 거실 클래스

```java
package 클래스사용;

import 클래스생성.Dog;
import 클래스생성.Phone;

public class 거실 {

	public static void main(String[] args) {
		Phone phone = new Phone();
		Dog dog = new Dog();
		
		phone.os = "android";
		phone.series = 9;
		
		System.out.println("쓰고있는 폰 os는 "+phone.os+"입니다.");
		System.out.println("폰 기종은 갤럭시 "+phone.series+" 입니다.");
		phone.ring();
		phone.message();
		
		dog.kinds = "골든리트리버";
		dog.many = 3;
		
		System.out.println("강아지 종은 "+dog.kinds+" 입니다.");
		System.out.println("개가 "+dog.many+"마리 있습니다.");
		dog.bark("왈왈");
		dog.eat("시저");

	}

}
```

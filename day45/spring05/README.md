## 2. static

### 1) static 변수

- 객체 생성과 상관없이 클래스 1개만 가지고 있으면서 생성된 여러개 객채들이 공유할 목적으로 만든 변수
- 객체생성시는 멤버변수가 객체마다 따로 생성
(다이나믹한 성격, 인스턴스 변수)
- instance변수와는 달리 메모리 할당을 딱 한번만 하게 되어 메모리 사용에 이점을 볼 수 있게된다
- static을 사용하는 또 한가지 이유로 공유의 개념을 들 수 있다. static 으로 설정하면 같은 곳의 메모리 주소만을 바라보기 때문에 static 변수의 값을 공유하게 되는 것이다.

- static 변수 : RAM중에서 클래스의 원본영역에 있음. static 영역, 메소드 영역
- 인스턴스변수 : 힙영역(랜덤접근하여 크기가 맞으면 할당이 가능)


### 2) static메서드

- static 메서드는 객체 생성하지 않아도 아무때나 클래스이름으로 접근해서 그 기능을 처리하게 할 수 있다
- 자주쓰는 기능은 static 메서드로 만들어놓으면 아무때나 쓸 수 있어서 편하다.
- static메서드 안에는 static 변수만 사용 가능. instance 변수는 사용 불가능(instance 변수는 객체 생성 후 접근 가능하기 때문)
- static 메서드는 객체 생성하지 않아도 접근해서 처리 해야함.
- 스태틱 메소드는 유틸리티 성 메소드를 작성할 때 많이 사용된다. 예를 들어 "오늘의 날짜 구하기", "숫자에 콤마 추가하기"등의 메소드를 작성할 때에는 클래스 메소드를 사용하는 것이 유리하다.

> [https://wikidocs.net/228](https://wikidocs.net/228)

### 3) 예시 코드

- Day.java

```java
package com.mega.mvc05.static1;

public class Day {
	
	//멤버변수, 전역변수, 자동초기화
	String doing;//null
	int time;//0
	String location;//null
	static int count;//0
	static int sum;
	
	public Day(String doing, int time, String location) {
		super();
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		sum = sum+time;
	}
	
	public static int gatAvg() {
		return sum/count;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}
```

- DayUse.java

```java
package com.mega.mvc05.static1;

public class DayUse {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남");
		System.out.println(Day.count); //static 변수는 클래스 이름으로 써준다.
		Day day2 = new Day("여행", 15, "강원도");
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println("전체 하는 일의 시간은 : "+Day.sum+"시간");
		System.out.println("평균 하는 일의 시간은 : "+Day.sum/Day.count+"시간");
		System.out.println("몇일 동안 했나요 : "+Day.count+"일");
		System.out.println(Day.gatAvg());
	}

}
```

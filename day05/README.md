## 1. 복습

### 1) 입력 - 처리(if/else) - 출력

- 비교 연산자의 결과는 항상 boolean(논리데이터 - true/false) 이다.

```java
    // 1. 입력
		String hobby = JOptionPane.showInputDialog("당신의 취미는?");
		String when = JOptionPane.showInputDialog("언제하시나요?");
		String time = JOptionPane.showInputDialog("몇시간이나 하셨나요?");

		// 2. 처리
		String result = when + "에 " + hobby + "을 하시는군요.";
		// String->int로 변환해주는 처리
		int time2 = Integer.parseInt(time);
		if (time2 >= 3) { //비교 연산자의 결과는 항상 boolean(논리데이터 - true/false) 이다.
			//조건이 true일 때 실행 되는 부분
			JOptionPane.showMessageDialog(null, "아주 많이 하셨군요.");
		} else {
			//조건이 false일 때 실행되는 부분
			JOptionPane.showMessageDialog(null, "보통으로 하셨군요.");
		}

		// 3. 출력
		JOptionPane.showMessageDialog(null, result);// void = 없다?
```

## 2. 조건문

### 1) if/else if

- 변수의 초기화(initialized)
    - 처음에 공간을 할당할 때 쓰레기 값이 들어있는 공간이 할당이 됨.
    - 쓰레기값은 프린트도 안되고, 연산도 불가능
    - 변수를 깨끗하게 비우는 작업을 처음에 초기에 해두는 것이 좋다.

```java
    // 1. 입력

		int jumsu = 66;

		// 2. 처리
		String result = null;// 선언 : 램에 공간이 할당
		//처음에 공간을 할당할 때 쓰레기 값이 들어있는 공간이 할당이 됨.
		//쓰레기값은 프린트도 안되고, 연산도 불가능
		//변수를 깨끗하게 비우는 작업을 처음에 초기에 해두는 것이 좋다.
		//변수의 초기화(initialized)
//		System.out.println(result);

		if (jumsu > 90) {
			result = "A학점";
		}else if (jumsu > 80) {
			result = "B학점";
		}else if (jumsu > 70) {
			result = "C학점";
		}else {
			result = "F학점";			
		}
		
		// 3. 출력
		System.out.println("당신의 학점은 "+result);
```

## 3. 반복문

### 1) for

- ++, -- : 증감 연산자, RAM의 변수값을 1씩 감소or증가 시켜주는 처리
- for(시작값; 조건식; 증감식){ };
- 위의 2번 예시를 품은 예시

```java
	for (int i = 0; i < 3; i++) {//0번부터 시작~ 3번까지~ 1씩 늘어남
			//for (int i = 0; i < 3; i=i+1) {
			// 1. 입력
			// 입력을 데이터로 받아서 처리해보세요!
			String data = JOptionPane.showInputDialog("당신의 점수는?");
			// String->int 변환해서, jumsu에 넣어주면 된다.
			int jumsu = Integer.parseInt(data);

			// 2. 처리
			String result = null;// 선언 : 램에 공간이 할당
			// 처음에 공간을 할당할 때 쓰레기 값이 들어있는 공간이 할당이 됨.
			// 쓰레기값은 프린트도 안되고, 연산도 불가능
			// 변수를 깨끗하게 비우는 작업을 처음에 초기에 해두는 것이 좋다.
			// 변수의 초기화(initialized)
//		System.out.println(result);

			if (jumsu > 90) {
				result = "A학점";
			} else if (jumsu > 80) {
				result = "B학점";
			} else if (jumsu > 70) {
				result = "C학점";
			} else {
				result = "F학점";
			}

			// 3. 출력
			System.out.println("당신의 학점은 " + result);

		} // for
```

- 반복문안에 들어가는 변수는 횟수를 카운트할 때도 사용하고

    변수에 들어있는 값을 가지고 처리할 때도 사용한다. 

- i = index
- for 문 예시

```java
// 반복문안에 들어가는 변수는 횟수를 카운트할 때도 사용하고
		// 변수에 들어있는 값을 가지고 처리할 때도 사용한다.
		// 1부터 5까지 반복해서 찍어보자.
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		// 1부터 10까지 중 2씩 점프해서 찍어보자.

		for (int j = 1; j <= 10; j = j + 2) {
			System.out.println(j);
		}
		// 1부터 100까지 중 5씩 점프해서 찍어보자.
		for (int k = 1; k <= 100; k = k + 5) {
			System.out.println(k);
		}

		// 100부터 1까지 1씩 점프해서 찍어보자.
		for (int l = 100; l >= 1; l--) {
			System.out.println(l);
		}

		// 1000부터 0까지 8씩 점프해서 찍어보자.
		for (int m = 1000; m >= 0; m = m - 8) {
			System.out.println(m);
		}
```

- for문 메모 기록

1)

```java
for(int i = 0; i>3; i++){};
```

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/751855c3-bc3e-48e2-a49e-725d3f53011c/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/751855c3-bc3e-48e2-a49e-725d3f53011c/Untitled.png)

2)

```java
for(int  i = 0; i < 3; i++){
	System.out.println("밥을 먹자");
};
```

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6261676f-02d0-4990-a36e-dedbe000b101/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6261676f-02d0-4990-a36e-dedbe000b101/Untitled.png)

3)

```java
for(int i=1; i <= 5; i++) {
	System.out.println(i);
}
```

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1da9497d-9812-4deb-a57b-07e6686f9414/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1da9497d-9812-4deb-a57b-07e6686f9414/Untitled.png)

### 2) While

- 예시1

```java
int i = 0; //시작값 
		
while (i < 10) { //조건식
	System.out.println("밥 먹을 시간이예요.");
	i++; //증감식
}
System.out.println(i);
```

- 예시2

```java
    // 시작값 : 3
		// 종료값: 10
		// 3, 4, ~ , 10 까지 프린트
		String data1 = JOptionPane.showInputDialog("시작값");
		String data2 = JOptionPane.showInputDialog("종료값");
		
		int start = Integer.parseInt(data1);
		int end = Integer.parseInt(data2);
		
		int i = start; //시작값 
		
		while (i <= end) { //조건식
			System.out.println(i);
			i++; //증감식
		}
```

- 메모 기록

1)

```java
int i = 0;
while(i<10){
		System.out.println("냠")
		i++'
}
System.out.println(i);
```

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e241a6fc-943b-4fd9-88bf-9f25bf05adcc/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e241a6fc-943b-4fd9-88bf-9f25bf05adcc/Untitled.png)

## 4. Random

```java
Random r = new Random(); //Random 블록을 ram의 r에 저장한다.
		
int first = r.nextInt(100); 
//random의 부품 중 랜덤한 int값을 불러주는 nextInt()를 사용해서 int 타입 변수에 담는다.
int second = r.nextInt(100); 
//(n)안의 숫자는 0~n값안에서 숫자가 뜨도록 제한을 둔다.
```

### 5. Date

```java
Date date = new Date();
int hour = date.getHours();
int min = date.getMinutes();
int sec = date.getSeconds();
System.out.println(hour+"시"+min+"분"+sec+"초");

int year = date.getYear()+1900;
int month = date.getMonth()+1;
int today = date.getDate();
System.out.println(year+"년"+month+"월"+today+"일");

int day = date.getDay();
System.out.println(day);
if (day==0) {
	System.out.println("일요일");
}else if (day==1) {
	System.out.println("월요일");
}
```

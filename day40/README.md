## 1. 복습

### 1) 기본 입출력

- console : 콘솔과 자바프로그램간 입력 스트림(입력용 연결 통로)이 만들어진다.

```java
Scanner	sc = new Scanner(System.in);
sc.close(); //입력스트림 닫는다.
```

### 2) 생성자

- 기본 생성자 : 클래스 이름과 동일한 이름을 가진 파라메터없는 생성자메서드
- 객체 생성시 꼭 처리해야할 것이 있으면 생성자 메서드에 정의해서 꼭 실행하도록 함
- 변수 초기화 많이 함.
- 생성자는 **대문자로 시작**하는 유일한 메서드(o)
- 에러의 원인 ) 기본생성자를 만들어두지 않았기 때문에 호출할 수 없음
- 기본 생성자는 **자동**으로 생성됨
- 단) 다른 파라메터 있는 생성자가 없는 경우에만!!!

어떤 생성자들이 있는지 알고 싶은 경우
1) 컨트롤+클릭을 해본다.
2) 자동완성 기능을 사용해본다.

### 3) CPU의 구성

- 연산 + 제어 + 저장
- 컴퓨터 안의 중앙 처리 장치(CPU)는 외부에서 정보를 입력 받고, 기억하고, 컴퓨터 프로그램의 명령어를 해석하여 연산하고, 외부로 출력하는 역할을 한다.

### 4) Scanner 클래스

```java
Scanner	sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			
			//오늘 온도는 몇도인가요?
			System.out.print("오늘 온도는 몇도인가요?>>");
			//변수에 넣어서, 30도 이상이면 너무 더워요.
			//			그 미만이면 괜찮아요!
			int todayTemp = sc.nextInt();//모든 외부 입력은 모두다 String -> int로 변환!  //"33"->33
			//====1=======2=====3=======
			//1) 변수 선언 : 변수 만들어 짐
			//3) 입력 값을 String으로 받아서 정수로 변환
			//2) 변환한 정수값을 변수에 저장
			if (todayTemp >= 30) {
				System.out.println("너무 더워요.");
			} else {
				System.out.println("괜찮아요!");
			} 
		}
	sc.close(); //입력스트림 닫는다.
```

### 4) 변수 초기화

```java
		int sum; //쓰레기값 상태 : 연산도 할 수 없고, 출력도 안되는 상태
		int sum = 0; //쓰레기값 대신 처음 값을 넣어주는 것, 초기화 , 변수 초기화
```

- 변수 초기화는 반드시 해주어야 한다.
- 자동으로 되는 경우가 있음(전역변수, 멤버변수는 자동 초기화 됨)
- **전역변수**는 클래스 전체영역에서 사용 가능한 변수
- 변수 선언의 위치에 따라 사용 할 수있는 범위가 달라짐
- 변수 선언이 클래스 바로 아래에 되어야 전체 영역에서 사용 가능
- 자동으로 안되는 경우는 수동으로 초기화를 해주어야 한다.(지역변수, 로컬변수)
- **로컬변수**는 반드시 수동으로 초기화를 해주어야 한다.

### 5) 정수 → 실수

- 자바에서는 정수끼리의 연산은 무조건 정수
- 자바에서는 하나라도 실수이면, 연산의 결과는 무조건 실수
- 예시 문제

```java
Scanner	sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.print("오늘 온도는 몇도인가요? ");
			int temp = sc.nextInt(); //모든 외부 입력은 모두다 String
			if (temp >= 30) {
				System.out.println("너무 더워요.");
			} else {
				System.out.println("괜찮아요.");
			}
			sum = sum + temp;
		}
		double avg = sum / 5.0;
		System.out.println("평균은"+avg);
		//double avg = (double)sum/5;
		//(바꾸고 싶은 타입)cpu가 ram에 있는 것을 가져다가 type 변경!
		sc.close(); 
	}
```

### 6) 배열 선언

```java
int[] jumsu = { 0, 0, 0, 0, 0};
int[] jumsu = new int[5]; //배열은 선언시 자동 초기화
```

### 7) 반복문(for문)

- 예시 문제

```java
public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int sum = 0;
		int[] jumsu = new int[5];
		for (int i = 0; i < jumsu.length(); i++) {
			System.out.print("오늘 온도는 몇도인가요? ");
			int temp = sc.nextInt(); 
			if (temp >= 30) {
				System.out.println("너무 더워요.");
			} else {
				System.out.println("괜찮아요.");
			}
			jumsu[i] = temp;
			sum = sum + temp;
		}
		double avg = sum / 5.0;
		System.out.println("평균은"+avg);
		System.out.println("-----------------");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print(jumsu[i]+" ");
		}
		sc.close();
	}
```

### 8) 반복문(while문)

- 예시 문제 ( while에 true )

```java
public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int sum = 0;
		int[] jumsu = new int[5];
		//횟수를 정하고 반복하고자 하는 경우에는 카운트초기값, 반복할 조건, 증가값
		int i2 = 0; //카운트 초기값
		while (true) {//반복할 조건
			System.out.print("오늘 온도는 몇도인가요? ");
			int temp = sc.nextInt();
			if (temp >= 30) {
				System.out.println("너무 더워요.");
			} else {
				System.out.println("괜찮아요.");
			}
			jumsu[i2] = temp;
			sum += temp;//sum = sum + temp;
			i2++;//증가값

			if(i2==5) {//중지 조건
				break;
			}
		}
		double avg = sum / 5.0;
		System.out.println("평균은"+avg);
		System.out.println("-----------------");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print(jumsu[i]+" ");
		}
		sc.close();
	}
```

- 예시 문제 (while에 비교연산자)

```java
		Scanner	sc = new Scanner(System.in);
		//시작은 100부터 값 500이 되기 전까지 전체를 더해보세요!
		int sum = 0;
		int i2 = 100;//초기값
		while (i2<500) {//반복할 조건
			sum += i2;
			i2++;
			System.out.println(sum);
		}
		sc.close();
```

### 9) 반복문, 제어문 혼합 연습

- 예시 문제

```java
Scanner	sc = new Scanner(System.in);
		//1. 시작할 값 입력, 종료할 값 입력
		//2. 5의 배수만 더해서 출력
		//3. 5의 배수의 개수
		//4. 5의 배수의 목록
		//5. 5의 배수의 평균 값
		System.out.print("시작할 값>>");
		int int1 = sc.nextInt();
		System.out.print("종료할 값>>");
		int int2 = sc.nextInt();
		
		int sum = 0;
		int count=0;
		ArrayList list = new ArrayList();
		
		while(int1<=int2) {
			if(int1%5==0) {				
				sum += int1;
				count++;
				list.add(int1);
			}
			int1++;
		}
		System.out.println("합계:"+sum);
		System.out.println("5의 배수 갯수:"+count);
		System.out.println("5의 배수 목록:"+list);
		
		int listSum = 0;
		for (int i = 0; i < list.size(); i++) {
			listSum += (int)list.get(i);
		}
		int listAvg = listSum/list.size();
		
		System.out.println("5의 배수의 평균값:"+listAvg);
	}
```

### 10) Random 클래스

```java
		Random r = new Random(100); //seed값, 씨앗값 
		int start = r.nextInt(10); //0~99 시작값
		int end = r.nextInt(10)+1000;//1000~1009 종료값
		int sum = 0;
		while(start<=end) {
			if (start%3==0) {
				sum += start;
				System.out.println(start+" : "+sum);
			}
			start++;
		}
		System.out.println("3의 배수 더한 값 : "+ sum);
```

### 11) 데이터 타입

- 기본데이터 타입 : 정수, 실수, 문자, 논리 =>값
- 참조데이터 타입 : 나머지 다, 배열, 클래스 => 주소
- 정수 데이터

```java
byte b = 100; //~128~127, 1바이트, 8비트의 모음
//bit(비트) : 신호 하나, 1/0
//@ : 0,1(2개)
//@@ : 00, 01, 10, 11(4개)
//@@@ : 000, 001. ...(8개)
//@@@@@@@@ : (256개) -128~127
short s = 30000; //2바이트 +-3만
int i = 10000000; //4바이트 +-21억
long l = 2200000000L;//8바이트 //22000000000l;
```

- 실수 데이터

```java
double d = 4.56678912345;//8바이트
float f = 1.234456F; //4바이트 1.234456f
```

- 문자 데이터

```java
		char c = 'A';//2바이트 //a:97 A:65
```

- 논리 데이터

```java
	boolean bo = true; //false //1바이트
```

### 11) 데이터 형 변환(casting)

- 작은 데이터 → 큰 데이터(자동형 변환)

```java
		byte b = 100;
		int i = b;
```

- 큰 데이터 → 작은 데이터(형 변환, casting)

```java
		int i2 = 100;
		byte bs = (byte)i2;
```

- **형변환** : cpu가 타입을 변환, 캐스팅(casting)
- ram에 선언된 타입 변경 불가, 선언할 때 타입이 결정되기 때문에 재선언 불가
- 캐스팅의 종류 :  1)자동, 2)강제
- 강제 캐스팅 : 값의 범위가 해당되는 경우만 가능

```java
	int i3 = 1000;
	//byte b3 = (byte)i3;//byte의 범위에 1000이 포함되지 않아서 캐스팅하면x
```

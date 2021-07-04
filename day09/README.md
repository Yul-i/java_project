## 1. 복습

```java
public static void main(String[] args) {
		// 배열을 만들 때 값을 처음부터 알고 있는 경우
		int[] num = { 100, 200, 300 };
		// 변수가 5개 생김, num, 100, 200, 300, length
		// 64비트 = 8byte, 16+8 = 24 byte 잡혀있음
		num[1] = 500;
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		for (int x : num) {//x변수는 1개, 3번 사용, foreach는 출력용으로 쓰자
			System.out.println(x);
		}

		// 값을 처음에 모르고 있다가 나중에 넣는 경우
		// 일단 공간 만들어넣고 값을 넣으면 되어서 이 방법을 많이 씀
		int[] num2 = new int[3];
		// 공간 5개 만들어짐 num2, { 0, 0, 0 }로 자동초기화, length=3
		num2[0] = 1000;
		num2[num2.length-1] = 1000;
		for (int x : num2) {
			System.out.println(x);
		}
	}
```

## 2. 배열 사용(인기투표)

### 1) 분석 해보기

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cf720516-9104-4693-80f5-d5baf5aa9eed/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cf720516-9104-4693-80f5-d5baf5aa9eed/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/03f4a5b7-7ead-4cb9-aba8-35d563f79228/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/03f4a5b7-7ead-4cb9-aba8-35d563f79228/Untitled.png)

### 2) 복기 해보기

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f9db10c1-eb34-4333-a14a-f30578451b88/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f9db10c1-eb34-4333-a14a-f30578451b88/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d9da6d03-879a-492f-a58e-36791fd303e6/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d9da6d03-879a-492f-a58e-36791fd303e6/Untitled.png)

## 3. 랜덤한 100개 값 배열에 넣기

```java
Random r = new Random(42);//sudo(가짜랜덤)
		int[] jumsu = new int[100];
		//100개의 변수를 넣을 공간을 만든다.
		
		for (int i = 0; i < jumsu.length; i++) {//100번 넣어야 해서 반복문을 돌린다(유한) 
			jumsu[i] = r.nextInt(101);//특정한 변수 인덱스에 하나씩 랜덤한 값을 대입한다. (0~100 안으로)
		}
		
		for (int x : jumsu) {
			System.out.println(x);
		}
```

## 4. 성적 입력하기

```java
public static void main(String[] args) {
		int[] student = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i < student.length; i++) {
			System.out.println((i+1)+"번째 학생 성적 입력>>");
			student[i] = sc.nextInt();//ㅇ0ㅇ
			sum = sum+student[i];
		}
		System.out.println(sum);
		
		int avg = sum/student.length;
		System.out.println("합계 :"+sum+"점, 평균 : "+avg+"점");

	}
```

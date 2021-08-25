## 1. 복습

### 1) instance

- instance : 실제 data
- static 변수 <-> instance 변수
- class의 instance(object)
- db schema의 instance(스키마에 대한 실제 데이터, 테이블의 각 행을 의미)
- 프로토타입은 instance가 아님

## 2. 예외처리

### 1) 예외처리란?

- 프로그램을 만들다 보면 수없이 많은 에러가 난다. 물론 에러가 나는 이유는 프로그램이 오동작을 하지 않기 하기 위한 자바의 배려이다. 하지만 때로는 이러한 에러를 무시하고 싶을 때도 있고, 에러가 날 때 그에 맞는 적절한 처리를 하고 싶을 때도 있다. 이에 자바는 try ... catch, throw등을 이용하여 에러를 처리 할 수 있도록 도와준다.

### 2) 반드시 예외처리 해주어야 하는 경우

- 네크워크
- 파일
- DB
- CPU

### 3) ArithmeticException : 수학적 예외처리

- 수학 계산 오류 발생시 나타나는 예외처리이다.

```java
public static void main(String[] args) {
		System.out.println("1. 나는 프린트 될까요");
		System.out.println("2. 문제 발생 줄~~~"+10/0);
		System.out.println("3. 나도 프린트 될까요");
	}
```

- 콘솔 결과

```java
1. 나는 프린트 될까요
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.mega.mvc06.Problem01.main(Problem01.java:8)
```

### 4) try/catch

- try문안의 수행할 문장들에서 예외가 발생하지 않는다면 catch문 다음의 문장들은 수행이 되지 않는다.
- 하지만 try문안의 문장들을 수행 중 해당예외가 발생하면 예외에 해당되는 catch문이 수행된다.
- 실행에러만 try/catch 로 잡을수있다.
- 런타임시 에러 발견됨

- 위의 코드를 수정해보았다.

```java
public static void main(String[] args) {
		System.out.println("1. 나는 프린트 될까요");
		try {
			System.out.println("2. 문제 발생 줄~~~"+10/0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("3. 나도 프린트 될까요");
	}
```

- 콘솔

```java
1. 나는 프린트 될까요
java.lang.ArithmeticException: / by zero
	at com.mega.mvc06.Problem02.main(Problem02.java:9)
3. 나도 프린트 될까요
```

### 5) FileNotFoundException : 파일 못찾음 예외처리

- 파일을 찾지 못할때, 경로를 알 수 없을때 나타나는 예외처리
- try/catch 문을 작성하였다.

```java
public static void main(String[] args) {
		System.out.println("1. 나는 프린트 될까요");
		try {
			FileWriter file = new FileWriter("d:\text.txt");
			file.write("내가 첫줄\n");
			file.write("내가 둘째 줄\n");
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("3. 나도 프린트 될까요");
	}
```

- 콘솔

```java
1. 나는 프린트 될까요
java.io.FileNotFoundException: d:	ext.txt (지정된 경로를 찾을 수 없습니다)
	at java.io.FileOutputStream.open0(Native Method)
	at java.io.FileOutputStream.open(Unknown Source)
	at java.io.FileOutputStream.<init>(Unknown Source)
	at java.io.FileOutputStream.<init>(Unknown Source)
	at java.io.FileWriter.<init>(Unknown Source)
	at com.mega.mvc06.Problem03.main(Problem03.java:12)
3. 나도 프린트 될까요
```

### 6) 예외처리 순서, finally

- 예외처리는 **작은거 → 큰거** 잡는 순으로 배치한다.
- 위에서 걸러내지 못한것만 잡아내도록 하는 배치이다.
- 여기서는 ArithmeticException(수학적)→IOException(쓰고출력)→Exception(예외처리전체) 순으로 catch문을 배치하였다.

- **finally** 구문은 try문장 수행 중 예외발생 여부에 상관없이 무조건 실행된다.

```java
public static void main(String[] args) {
		System.out.println("1. 나는 프린트 될까요");
		try {
			FileWriter file = new FileWriter("d:\text.txt");
			file.write("내가 첫줄\n");
			file.write("내가 둘째 줄\n");
			file.close();
		} catch (ArithmeticException e1) {//수학적
			e1.printStackTrace();
		} catch (IOException e2) {//쓰고 출력
			System.out.println("파일에 쓰는 중 에러 발생...@@@@@");
		} catch (Exception e) {
			System.out.println("모든 에러를 처리합니댜.");
		} finally {
			System.out.println("휴~~~예외처리 다 했음");
		}
		System.out.println("3. 나도 프린트 될까요");
	}
```

- 콘솔

```java
1. 나는 프린트 될까요
파일에 쓰는 중 에러 발생...@@@@@
휴~~~예외처리 다 했음
3. 나도 프린트 될까요
```

### 7) try/catch 클래스에서 먼저 처리 후 메인에서 실행

- Problum05 클래스 내의 call() 메서드에 try/catch를 작성하여 예외처리를 먼저 하도록 하였다.
- Main에서 이 클래스의 메스드를 불러볼 것이다.

```java
public class Problem05 {

	  public  void call() {
	      try {
	         System.out.println(3/0);
	      } catch (Exception e) {
	         System.out.println("내가 예외처리 다 함..!");
	      }
	   }
	   

}
```

- Problum05Main.java
- 메인에서 실행하면 클래스 내에서 예외 처리를 한채 콘솔에 출력된다.

```java
public static void main(String[] args) {
		Problem05 error = new Problem05();
		error.call();
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
	}
```

- 콘솔

    ```java
    내가 예외처리 다 함..!
    에러 발생후 실행될까요....!!!!s
    에러 발생후 실행될까요....!!!!s
    에러 발생후 실행될까요....!!!!s
    에러 발생후 실행될까요....!!!!s
    에러 발생후 실행될까요....!!!!s
    에러 발생후 실행될까요....!!!!s
    에러 발생후 실행될까요....!!!!s
    에러 발생후 실행될까요....!!!!s
    에러 발생후 실행될까요....!!!!s
    에러 발생후 실행될까요....!!!!s
    ```

### 8) 예외 던지기(throws)

- 메서드를 호출한 곳에서 Exception을 처리하도록 예외를 위로 던질 수 있는 방법이 있다.
- [Problum06.java](http://problum06.java) 의 call() 메서드에 **throws Exception** 을 작성해주었다.
- Exception외에도 더 작은 예외처리를 하는 예외처리문을 넣을 수 있다.

```java
public class Problem06 {
	  public  void call() throws Exception{
		  System.out.println(3/0);
	  }
}
```

- 메인 내에서 try/catch를 사용해서 예외 처리를 해주었다.
- 호출 한 곳에서 예외처리를 하는 모습이다.

```java
public static void main(String[] args) {
		Problem06 error = new Problem06();
		try {
			error.call();
		} catch (Exception e) {
			System.out.println("호출한 곳에서 알아서 처리함...!");
		}
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
	}
```

- 콘솔

```java
호출한 곳에서 알아서 처리함...!
에러 발생후 실행될까요....!!!!s
에러 발생후 실행될까요....!!!!s
에러 발생후 실행될까요....!!!!s
에러 발생후 실행될까요....!!!!s
에러 발생후 실행될까요....!!!!s
에러 발생후 실행될까요....!!!!s
에러 발생후 실행될까요....!!!!s
에러 발생후 실행될까요....!!!!s
에러 발생후 실행될까요....!!!!s
에러 발생후 실행될까요....!!!!s
```

### 9) throws를 사용하여 호출한 곳 마다 다르게 예외처리 하기

- throws를 사용한 메서드 파일이다.
- 호출 한 곳마다 다르게 예외처리를 할 수 있다.

```java
public class ArrayError2 {
	public void array() throws Exception{
		int[] num = {1,2,3};
		num[3] = 4;
		System.out.println("아 배열 끝~~~~~");	
	}
}
```

- main1

```java
public class ArrayError2Main {

	public static void main(String[] args) {
		ArrayError2 array2 = new ArrayError2();
		try {
			array2.array();
		} catch (Exception e) {
			System.out.println("호출된 곳에서 예외 처리");
		}
	}
}
```

- 콘솔

```java
호출된 곳에서 예외 처리
```

---

- main2

```java
public class ArrayError2Main2 {

	public static void main(String[] args) {
		ArrayError2 array2 = new ArrayError2();
		try {
			array2.array();
		} catch (Exception e) {
			System.out.println("예외처리를 했지롱롱");
		}
	}
}
```

- 콘솔

```java
예외처리를 했지롱롱
```

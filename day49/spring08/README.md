## 1. 포장 클래스

### 1) 포장클래스(Wrapper Class)

- 프로그램에 따라 기본 타입의 데이터를 객체로 취급해야 하는 경우가 있습니다.
- 예를 들어, 메소드의 인수로 객체 타입만이 요구되면, 기본 타입의 데이터를 그대로 사용할 수는 없습니다.
- 이때에는 기본 타입의 데이터를 먼저 객체로 변환한 후 작업을 수행해야 합니다.
- 기본 타입에 해당하는 데이터를 객체로 포장해 주는 클래스를 래퍼 클래스(Wrapper class)라고 합니다.
- 래퍼 클래스는 각각의 타입에 해당하는 데이터를 인수로 전달받아, 해당 값을 가지는 객체로 만들어 줍니다.
- 이러한 래퍼 클래스는 모두 java.lang 패키지에 포함되어 제공됩니다.

> [http://tcpschool.com/java/java_api_wrapper](http://tcpschool.com/java/java_api_wrapper)

- 예시코드

```jsx
public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("나이를 입력");
		//int기본형을 가지고 정수와 관련된 여러가지 기능 처리가 불가능.
		//기본형과 관련된 여러가지 기능 처리를 하고자 하는 경우 사용하려고
		//기본형의 특징을 가지고 클래스를 만들어 놓음.
		//int->Integer, double->Double
		int age2 = Integer.parseInt(age);
		System.out.println(age2+1);
	}
```

### 2) 포장 클래스 종류

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1d4e2d43-b797-4d9b-b141-13c97989e04c/Untitled.png)

### 3) 박싱(Boxing)과 언박싱(UnBoxing)

- 래퍼 클래스(Wrapper class)는 산술 연산을 위해 정의된 클래스가 아니므로, 인스턴스에 저장된 값을 변경할 수 없다.
- 단지, 값을 참조하기 위해 새로운 인스턴스를 생성하고, 생성된 인스턴스의 값만을 참조할 수 있다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ab71f9e0-f648-4f04-98de-5d4d5bc8876a/Untitled.png)

- 위의 그림과 같이 기본 타입의 데이터를 래퍼 클래스의 인스턴스로 변환하는 과정을 박싱(Boxing)이라고 한다.
- 반면 래퍼 클래스의 인스턴스에 저장된 값을 다시 기본 타입의 데이터로 꺼내는 과정을 언박싱(UnBoxing)이라고 한다.

### 4) 오토 박싱(AutoBoxing)과 오토 언박싱(AutoUnBoxing)

- 예제 코드1

```java
public static void main(String[] args) {
		//원래는 참조형 변수에 들어있는 주소를 기본형 변수에 넣을 수 없다. 
		//=> 자바는 변수가 선언될 때 변수에 들어가는 타입이 결정되기 때문.
		//기본형과 기본형에 대한 포장클래스간만 가능
		Integer i1 = new Integer(0);//참조형
		int i2 = 0;//기본형 정수
		int i3 = 0;
		
		//참조형 변수에 기본형을 넣음.
		//기본형 변수에 참조형 값을 넣음.
		i1 = i2; //참조형(객체, 클래스)<---오토박싱--기본형 
		i3 = i1;//기본형<--오토언박싱--참조형(깩체)
	}
```

- 예제 코드2

```jsx
public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		//add(Object o):Object 자리에는 모든 클래스가 다 들어갈 수 있다.
		//add(참조형 변수의 주소) <--auto-Boxing--add(기본형)
		list.add("hong");
		list.add(new Date());
		list.add(new Random());
		list.add(new MemberDTO());
		list.add(100); //Integer <---오토박싱---int
		list.add(11.1);//Double <---오토박싱---double
		list.add(true);//Boolean <---오토박싱---boolean
		list.add('a');//Character <---오토박싱---char
	}
```

## 2. 형변환(Casting)

### 1) 캐스팅이란?

- 캐스팅이란 모든 연산을 진행할때에는 같은 타입의 피연산자끼리만 수행이 가능하다.
- 이때 같은 타입이면 상관이 없지만 다른타입의 피연산자끼리 연산을 수행할 필요가 있을경우, 같은 타입으로 변경해주는 것을 캐스팅(형변환)이라고 한다.

> [https://sundrystore.tistory.com/17](https://sundrystore.tistory.com/17)

```java
public static void main(String[] args) {
		//파생된 데이터, 참조형 변수
		//형변환(Casting, 캐스팅)
		//참조형 형변환은 "상속관계에 있는 클래스간" 가능
		학용품 p = new 학용품(); //부모, 수퍼클래스, 큰
		볼펜 b = new 볼펜(); //자식, 서브클래스, 작음
		//클래스간의 크기는 "개념"을 가지고 큰지 작은지 판단한다.
		
		p = b; //큰<--자동형변환--작
		b = (볼펜)p; //작<--강제형변환--큰
		
	}
```

### 2) 업캐스팅(UpCasting)

- 업캐스팅은 상속관계은 부모클래스와 자식클래스간의 형변환중의 하나이며,
- **자식클래스에서 부모클래스로 형변환하는 것을 업캐스팅이라고한다.**
- 업캐스팅의 경우 기본적으로 하위 클래스의 형에서 상위 클래스의 형으로 캐스팅 시키는것이라 형만 정확하다면 묵시적으로 캐스팅이 가능하다.
- 자동 형 변환
- 업캐스팅되어 Object로 들어간 객체는 원래 클래스가 가지고 있던 자식에서 추가된 메서드를 쓸 수 없게 된다.
- 부모클래스로 업캐스팅 하는 경우는 자식에서 추가된 메서드를 인식 못한다.

### 3) 다운캐스팅(DownCasting)

- 업캐스팅 한 것을 다시 원래의 형으로 복원 시켜주는 것
- 타입 형을 꼭 명시해야함
- 강제 형 변환
- 자식에게 추가된 메서드를 사용하고 싶으면 다시 자식타입으로 변환해야 한다.
- 자식 타입은 부모타입 보다 작으므로 강제 형변환이 필요하다.

- 업,다운캐스팅 예시 코드

```java
public static void main(String[] args) {
		//클래스간 캐스팅은 상속관계에 있는 클래스만 가능!
		ArrayList list = new ArrayList();
		
		MemberDTO dto = new MemberDTO();
		dto.setId("hong");
		
		list.add(dto);  //Object(큰) <--자동형변환-- MemberDTO(작)
		list.add("hong"); //Object(큰) <--자동형변환-- String(작)
		list.add(new Date()); //Object(큰) <--자동형변환-- Date(작)
		list.add(new Random()); //Object(큰) <--자동형변환-- Random(작)
		list.add(100); //Object(큰) <--자동형변환(업캐스팅)-- Integer(작)<--오토박싱--int(기본형)
		list.add(11.11);//Object(큰) <--자동형변환-- Double(작)<--auto-boxing--double(기본형)
		//업, 다운은 클래스에서만 사용
		System.out.println(list);
		
		
		Object dto2= list.get(0); //Object

		MemberDTO dto3 = (MemberDTO) list.get(0); 
		//memberDTO(작)<--강제형변환(다운캐스팅)--Object
		System.out.println(dto3.getId());
		
		//100을 꺼내서 1을 더해보자.
		System.out.println(list.get(4));
		int age = (Integer) list.get(4);
		System.out.println(age+1);
		//int <--오토언박싱 --Integer <-다운캐스팅 -- Object
		//11.11을 꺼내서 100을 더해보세요.
		double temp = (double) list.get(5);
		System.out.println(temp+100);
		//double <-오토언박싱--Double<-다운캐스팅--Object
	}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9ed4732d-273f-4e69-9129-4184ed98162d/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/df2e079e-239a-46d8-9648-9620b47bea95/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9701e3ce-01d9-4a1a-9fa3-1694e65701bd/Untitled.png)

### 4) Primitive Type Casting

> [https://sundrystore.tistory.com/17](https://sundrystore.tistory.com/17)

Java는 다음 두개의 타입을 지원합니다.

- Primitive type
- Reference type

Primitive type은 int와 같은 자바에서 기본적으로 제공해주는 타입을 말합니다. 이런 타입들은 클래스가 아니며, 상속으로 재가공이 불가능한 타입입니다. Reference type은 클래스로 만들어지는 객체를 의미합니다.

**Primitive type**

자바는 다음과 같은 Primitive type을 지원합니다.

- byte: 8bit, signed
- short: 16bit, signed
- int: 32bit, signed
- long: 64bit, signed
- float: 32bit, signed
- double: 64bit, signed
- boolean: true or false
- char: 16bit, unsigned

**Type casting (형변환)**

위의 Primitive type에서 소개한 것처럼, 각각의 Type은 표현할 수 있는 데이터 크기가 다릅니다.

따라서, 서로 다른 Type의 변수를 할당하려면 Type casting을 해야 합니다. 그리고 Type casting을 할 때 경우에 따라서 데이터가 손실될 수도 있고, 손실되지 않을 수도 있습니다.

```java
public static void main(String[] args) {
		//기본형 형변환(정수, 실수, 문자, 논리)
		//형변환(데이터 type 변환)
		byte b1 = 100;//-128~127
		int i1 = 200;
		
		i1 = b1; //가능 int(큰)<-----byte(작은)
		//자동으로 byte에 들어있던 100데이터가 int로 변환되어 저장됨
		//자동 데이터 변환(자동형변환)
		
		b1 = (byte)i1; //불가능 int(큰)----->byte(작은)
		//강제로 int에 들어있던 100데이터가 byte로 변환되어 저장됨
		//강제 데이터 변환(강제형변환)
		
		int i2 = 3000;
		byte b2 = (byte)i2;
		System.out.println(b2);//-72
		//강제형변환이 가능한 이유는 범위의 값만 가능
	}
```

### 5) casting 문제 풀이

```java
public static void main(String[] args) {
		System.out.println("나에 대한 데이터를 모아보세요.");
		ArrayList list = new ArrayList();
		
		list.add(1000);
		list.add(189.1);
		list.add(false);
		list.add('남');
		
		System.out.println("---------------------------------");
		//1. 전체목록을 프린트
		System.out.println(list);
		
		//2. 돈 1000을 꺼내서 2000을 더해 프린트
		int money = (int) list.get(0);
		System.out.println(money+2000);
		
		//3. 키 189.1를 꺼내서 10을 더해 프린트
		double height = (double) list.get(1);
		System.out.println(height+10);
		
		//4. 아침여부 false를 꺼내서 아침을 먹었으면 배불러요. 아니면 배고파요
		boolean food = (boolean) list.get(2);
		if (food) {
			System.out.println("배물러요");
		}else {
			System.out.println("배고파요.");
		}
		
		//5. 성별 남 꺼내서 남이면 주민번호는 1,3이예요 출력.
		char gender = (char) list.get(3);
		if (gender=='남') {
			System.out.println("주민번호는 1,3이예요.");
		}else if(gender=='여') {
			System.out.println("주민번호는 2,4예요");
		}
		
		//6. 2~3에서 형변환(업캐스팅, 다운캐스팅), 오토박싱, 오토언박싱 과정을 순서대로 작성해주세요.
		//	2. Object--다운캐스팅-->Integer--오토언박싱-->int
		//	3. Object--다운캐스팅-->Double--오토언박싱-->double 
	}
```

## 3. 제네릭(generic)

### 1) 제네릭이란?

- 자바에서 제네릭(generic)이란 데이터의 타입(data type)을 일반화한다(generalize)는 것을 의미한다.
- 제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정하는 방법.
- 이렇게 컴파일 시에 미리 타입 검사(type check)를 수행하면 다음과 같은 장점을 가진다.

    1. 클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높일 수 있습니다

    2. 반환값에 대한 타입 변환 및 타입 검사에 들어가는 노력을 줄일 수 있습니다.

> [http://tcpschool.com/java/java_generic_concept](http://tcpschool.com/java/java_generic_concept)

### 2) 선언 방법

```java
public class Car<T> {
	T size;

	@Override
	public String toString() {
		return "Car [size=" + size + "]";
	}
	
}
```

- 위의 예제에서 사용된 'T'를 타입 변수(type variable)라고 하며, 임의의 참조형 타입을 의미한다.
- 꼭 'T'뿐만 아니라 어떠한 문자를 사용해도 상관없으며, 여러 개의 타입 변수는 쉼표(,)로 구분하여 명시 가능
- 타입 변수는 클래스에서뿐만 아니라 메소드의 매개변수나 반환값으로도 사용할 수 있다.

- 위와 같이 선언된 제네릭 클래스(generic class)를 생성할 때에는 타입 변수 자리에 사용할 실제 타입을 명시해야 한다.

```java
public class CarUse {

	public static void main(String[] args) {
		Car<String> car1 = new Car<String>();
		Car<Integer> car2 = new Car<>();
		
		car1.size = "big";
		car2.size = 100;
		
		System.out.println(car1);
		System.out.println(car2);
	}

}
```

- 여러개 타입 변수

```java
public class Truck <T1, T2>{
	T1 weight;
	T2 distance;
	
	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", distance=" + distance + "]";
	}
}
```

```java
public class TruckUse {

	public static void main(String[] args) {
		Truck<String, Integer> t1 = new Truck<>();
		Truck<Integer, String> t2 = new Truck<>();
		
		t1.weight = "중량무게";
		t1.distance = 100;
		
		t2.weight = 1000;
		t2.distance = "장거리";
		
		System.out.println(t1);
		System.out.println(t2);
		
	}

}
```

### 3) 예제 코드

- 제네릭 <> 1개

```java
public static void main(String[] args) {
		// 가변적인 데이터 모음, 변화가 많음.
		// 하나의 데이터 타입만 넣으려고 하는 경우 
//		ArrayList list = new ArrayList();
		//박싱과 업캐스팅이 일어남.
		//list.add(100);
		//list.add(200);
		//list.add(300);
		//꺼낼때는 언박싱과 다운캐스팅을 해야함.
		
		ArrayList<Integer> list = new ArrayList<>();
		//제너릭 프로그램을 사용하면 캐스팅 안해도 됨
		list.add(100);
		list.add(200);
		list.add(300);
		int i1 = list.get(0);
		System.out.println(i1+100);
		
		ArrayList<Double> list2 = new ArrayList<>();
		list2.add(11.1);
		list2.add(11.2);
		list2.add(11.3);
		//객체 생성시 사용할 데이터의 타입을 정할 수 있는 문법
		
	}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e9db4dd3-1646-441f-8587-4c70812d987e/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/02b42f99-e9c5-43b8-a5a5-e88214144e25/Untitled.png)

- 제네릭<> 2개

```java
public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("hong", 1000);
		map.put("kim", 2000);
		System.out.println(map);
		
		HashMap<Integer, MemberDTO> map2 = new HashMap<>();
		
		map2.put(1, new MemberDTO());
		map2.put(2, new MemberDTO());
		System.out.println(map2);
		
	}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/99bc2a76-6b83-41e1-b000-92e5c295b4ad/Untitled.png)

## 4. Math 클래스

Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스입니다.

Math 클래스의 모든 메소드는 클래스 메소드(static method)이므로, 객체를 생성하지 않고도 바로 사용할 수 있습니다.

> [http://tcpschool.com/java/java_api_math](http://tcpschool.com/java/java_api_math)

```java
double data = -3.12345;
		System.out.println(Math.abs(data));//절대값
		System.out.println(Math.ceil(data));//올림
		System.out.println(Math.floor(data));//버림
		System.out.println(Math.round(data));//반올림, 소수점 없앰
		
		System.out.println(Math.random());//0~1미만
		System.out.println(Math.random()+10);//10
```

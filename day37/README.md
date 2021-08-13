## 1. Thread(스레드)

### 1) 스레드란?

- 프로세스를 잘게 나눠서 동시에 처리되도록 하게 보이는 것
- 스레드는 어떠한 프로그램 내에서, 특히 프로세스 내에서 실행되는 흐름의 단위를 말한다.
- 일반적으로 한 프로그램은 하나의 스레드를 가지고 있지만, 프로그램 환경에 따라 둘 이상의 스레드를 동시에 실행할 수 있다. 이러한 실행 방식을 멀티스레드라고 한다.

### 2) Process(프로세스)

- 프로세스(process)는 컴퓨터에서 연속적으로 실행되고 있는 컴퓨터 프로그램을 말한다. 종종 스케줄링의 대상이 되는 작업(task)이라는 용어와 거의 같은 의미로 쓰인다.
- 일을 처리하는 하나의 단위

### 3) 스레드 사용하는 방법(순서)

1. 스레드 상속을 받은 클래스를 만든다.
2. 상속을 받은 클래스에서 run()메서드를 오버라이드 한다.
(동시에 처리하고 싶은 내용을 구현)
3. 상속받아 만들어놓은 스레드 클래스의 객체 생성한다.
4. cpu에 등록을 한다. start()

- 코드
- New - SuperClass에서 상속 클래스를 변경한다.
- Thread 를 검색해서 선택한다.
- SuperClass가 변경된 모습이다.


- Count1.java

```java
package 스레드;

public class Count1 extends Thread {
	@Override
	public void run() {
		// i-- (증감연산자) --> i = i - 1;
		for (int i = 1000; i >= 0; i = i - 2) {
			System.out.println("count>>" + i);
			
			try {
				Thread.sleep(500);//밀리세컨즈(1/1000초)
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}
```

- image1.java

```java
package 스레드;

public class Image1 extends Thread {
	@Override
	public void run() {
		String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png", "6.png", "7.png", "8.png", "9.png", "10.png"};
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
			
			try {
				Thread.sleep(5000);//밀리세컨즈(1/1000초)
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}
```

- time1.java

```java
package 스레드;

import java.util.Date;

public class Timer1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Date date = new Date();
			System.out.println(date);
			try {
				Thread.sleep(1000);//밀리세컨즈(1/1000초)
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}
```

- ThreadGraphic1.java

```java
package 스레드;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic1 extends JFrame{
	
	//static이라 붙으면 객체 생성하지 않아도 cpu가 바로 호출해서 사용할 수 있음
	//멤버변수가 있으면 static메서드에서 바로 사용 불가능..
	//전역변수에도 static을 붙여주면 객체생성하지 않아도 static 메서드 안에서 접근 가능
	//RAM에 상주하고 있음. 언제든지 cpu가 접근해서 사용 가능.
	//static을 많이 사용하면 안된다.
	
	JLabel count, image, timer;//전역 변수로 빼주었다.
	
	public ThreadGraphic1() {//main은 static이라 메모리 마니 잡아먹어용
		setSize(800, 350);
		setTitle("나의 스레드 프로그램");
		
		count = new JLabel("카운트 들어가는 부분");
		image = new JLabel("이미지 변환되는 부분");
		timer = new JLabel("타이머 들어가는 부분");
		
		add(count, BorderLayout.WEST);
		add(image);
		add(timer, BorderLayout.SOUTH);
		Font font = new Font("궁서", Font.BOLD, 40);
		Font font2 = new Font("궁서", Font.BOLD, 30);
		count.setFont(font);
		timer.setFont(font2);
		
		//thread 객체 생성
		Count2 thread1 = new Count2();
		Image2 thread2 = new Image2();
		Timer2 thread3 = new Timer2();
		
		//cpu에 객체를 등록해주어야 함,
		thread1.start();
		thread2.start();
		thread3.start();
		
		setVisible(true);
	}
	
	//내부 클래스(inner Class, 이너 클래스) 
	// - 클래스간 변수를 공유할 목적으롤 클래스 내에 클래스를 끼워넣을 수 있음.
	//내부로 끼워진 클래스는 독립적으로 다른 곳에서 사용될 수 없다.
	
	public class Count2 extends Thread {
		@Override
		public void run() {
			// i-- (증감연산자) --> i = i - 1;
			for (int i = 1000; i >= 0; i = i - 2) {
				count.setText("count>>"+i);
				
				try {
					Thread.sleep(500);//밀리세컨즈(1/1000초)
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		}
	}
	
	public class Image2 extends Thread {
		@Override
		public void run() {
			String[] list = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg", "7.jpg", "8.jpg", "9.jpg", "10.jpg"};
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				//image.setText(list[i]);
				
				try {
					Thread.sleep(5000);//밀리세컨즈(1/1000초)
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		}
	}
	
	public class Timer2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date = new Date();
				timer.setText(date+"");
				try {
					Thread.sleep(1000);//밀리세컨즈(1/1000초)
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		}
	}

	
	public static void main(String[] args) {
		ThreadGraphic1 s = new ThreadGraphic1();
	}

}
```

## 2. Static

- static 제어자를 가지는 멤버는 다음과 같은 특징을 가지게 됩니다.

1. 프로그램 시작시 최초에 단 한 번만 생성되고 초기화됩니다.
2. 인스턴스를 생성하지 않고도 바로 사용할 수 있게 됩니다.
3. 해당 클래스의 모든 인스턴스가 공유합니다.

- 자바에서 static 제어자를 사용할 수 있는 대상은 다음과 같습니다.

메소드, 필드, 초기화 블록

- static이라 붙으면 객체 생성하지 않아도 cpu가 바로 호출해서 사용할 수 있음
- 멤버변수가 있으면 static메서드에서 바로 사용 불가능..
- 전역변수에도 static을 붙여주면 객체생성하지 않아도 static 메서드 안에서 접근 가능
- RAM에 상주하고 있음. 언제든지 cpu가 접근해서 사용 가능.
- static을 많이 사용하면 안된다.

> [http://tcpschool.com/java/java_modifier_ectModifier](http://tcpschool.com/java/java_modifier_ectModifier)

## 3. InnerClass(내부 클래스)

- 내부 클래스(inner class)란 하나의 클래스 내부에 선언된 또 다른 클래스를 의미합니다.
- 이러한 내부 클래스는 외부 클래스(outer class)에 대해 두 개의 클래스가 서로 긴밀한 관계를 맺고 있을 때 선언할 수 있습니다.
- 클래스간 변수를 공유할 목적으롤 클래스 내에 클래스를 끼워넣을 수 있음.
- 내부로 끼워진 클래스는 독립적으로 다른 곳에서 사용될 수 없다.

- 내부 클래스의 장점

1. 내부 클래스에서 외부 클래스의 멤버에 손쉽게 접근할 수 있게 됩니다.
2. 서로 관련 있는 클래스를 논리적으로 묶어서 표현함으로써, 코드의 캡슐화를 증가시킵니다.
3. 외부에서는 내부 클래스에 접근할 수 없으므로, 코드의 복잡성을 줄일 수 있습니다.

> [http://tcpschool.com/java/java_usingClass_innerClass](http://tcpschool.com/java/java_usingClass_innerClass)

## 4. 예외처리

### 1) 예외처리란?

- 예외 처리(例外 處理) 또는 오류 처리는 일반적인 실행의 흐름을 바꾸는 몇 가지 조건을 처리하도록 설계한 프로그래밍 언어의 개념이나 컴퓨터 하드웨어 구조를 말한다.
- 일반적으로 프로그램이 처리되는 동안 특정한 문제가 일어났을 때 처리를 중단하고 다른 처리를 하는 것을 예외 처리라고 한다.

### 2) 반드시 예외처리(try/catch, throws) 해주어야 하는 상황

- 자바에서 외부 자원을 연결해야 할 때
- File 연결
- DB 연결
- 네크워크 연결
- 컴퓨터 주요 device 연결(cpu)

### 3) 예외처리를 왜 하는가?

- 프로그램이 중단되는 상황이 생기면 더이상 실행하지 않고, 프로그램이 멈추어 버린다.
중단(방해, interrupt, 인터럽트)

### 4) Error

- error는 근본적으로 JVM에서 생성되거나, 나타나는 예외입니다. 이 말은 사용자 애플리케이션이 제어할 수 있는 예외가 아니라는 것이죠. 말 그대로 <에러>입니다.
- 애플리케이션의 범위를 벗어나기 때문에 대게 애플리케이션 단에서는 이 error를 처리하지 않습니다. 이 에러가 발생할 때 구동중인 애플리케이션은 죽는 게 맞는 거죠.

### 5) Exception

- Exception 예외들은 '예상할 수 있는 예외'들입니다.
- 또는 '프로그래머가 만드는 예외'이기도 합니다.
- 이 Exception도 논리적으로 다음과 같이 두 개의 Exception으로 나뉩니다.

1. **Checked exceptions**
    - Checked exceptions은 프로그래머가 사용하는 라이브러리, 코드 등에서 new 생성자를 이용해 만들어졌고, 해당 모듈을 사용하는 오브젝트에게 여기서 예외가 발생할 수 있으니 throws 키워드를 이용해서 상위 caller에게 예외를 전달하든, 네가 확인해서 처리하든지 하라는 확인이 필요한 예외입니다.
    - 다시 말하면, 컴파일 타임에 해당 예외가 체크되어야 하고, 프로그래머에게 예외를 다루거나 throws exception 같은 메소드를 선언할 것을 요구합니다.
    - 예를 들어 FileNotFoundException과 같은 예외 객체가 있습니다.
2. **Unchecked exceptions** 
    - Unchecked exceptions또한 프로그래머 사용하는 라이브러리, 코드 등에서 만들어졌지만, 해당 모듈을 사용하는 오브젝트에게 여기서 발생한 예외를 확인해서 처리하라는 강제를 두지 않습니다.
    - 예외는 발생할 수 있지만 필요 없거나 어차피 네가 처리하지 못할 예외니 그냥 상위 caller로 던지라 이 뜻입니다. 계속 던지다 보면 JVM이 받아서 프로그램을 종료하던가, 처리합니다. -
    - 대게 NullPointerException 같은 프로그래밍 에러로 나타납니다.

> [https://brunch.co.kr/@kd4/5](https://brunch.co.kr/@kd4/5)

## 1. 복습

### 1) 영화 예매 사이트(좌석)

- 코드

```java
JFrame f = new JFrame("영화예매그래픽 버전");
		f.setSize(560, 730);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		int[] seat = new int[200];
		
		for (int i = 0; i < 200; i++) {
			JButton b = new JButton(i+"");//String.valueOf(0);
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand();//스트링으로 들어온다.
					int index = Integer.parseInt(s);//스트링을 인트로 바꿔주자.
					seat[index] = 1;
					JOptionPane.showMessageDialog(f, index+"번 예약됨.");
					//버튼을 비활성화!
					b.setEnabled(false);
					b.setBackground(Color.red);
				}
			});
			f.add(b);
		}//for
		
//		결제하기 버튼을 누르면
//		1) 배열안에 1이 몇개인지 세서
//		2) 금액이 10000원씩 계산 후에
//		3) 결제금액 알려주세요.
//		4) 몇번 좌석을 예약했는지 출력.

		JButton b2 = new JButton("<<<<<<<< 결제하기 >>>>>>>>");
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;//지역변수로 주어야 함. 속해있는 클래스가 서로 달라서이다.
				final int COST = 10000;
				String sum ="";
				for (int i = 0; i < seat.length; i++) {
					if (seat[i]==1) {
						count++;
						sum += i+"번 ";
					}
				}//for
				int payment = count*COST;
				
				JOptionPane.showMessageDialog(f, "선택한 좌석은 "+sum+"입니다.");
				JOptionPane.showMessageDialog(f, "당신이 결제할 금액은 "+payment+"원 입니다.");
			}//class
		});
		b2.setBackground(Color.yellow);
		f.add(b2);
		f.setVisible(true);
	}
```

### 2) 참고해야할 코드 - **getActionCommand(), getSource(), getModifiers()**

- **getActionCommand()**

    이벤트를 발생시킨 객체의 문자열을 가져온다.

- 찾아보니 이런 코드들도 있었다!
- **getSource()**

    이벤트를 발생시킨 객체의 위치값을 가져온다.

- **getModifiers()**

    이벤트가 발생되었을 때 같이 사용된 modifier키들을 가져온다.

> [https://raccoonjy.tistory.com/18](https://raccoonjy.tistory.com/18)

### 3) 좌석 - 복기 코드

- 기존 코드에서

    1.클릭 시 마다 제목 바뀌는 기능, 

    2.좌석 전체 취소 기능 추가

```java

	public static void main(String[] args) {
		int[] seat = new int[200];//좌석 선택 여부가 1또는0으로 들어갈 배열

		JFrame f = new JFrame("영화 예매하기");
		f.setSize(600, 750);

		ArrayList list = new ArrayList();//1. 아직 낯선 코드다!
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);//스윙 레이아웃을 absolute로 변경

		for (int i = 0; i < 200; i++) {//버튼을 200개 생성할 반복문
			JButton b = new JButton(i + "");//버튼에 차례대로 공백없이 숫자가 들어갈 것
			b.addActionListener(new ActionListener() {//버튼 누르면 발생하는 이벤트

				@Override
				public void actionPerformed(ActionEvent e) {//이벤트 클래스
					list.add(e.getSource());//e.주소를 object로 던져준다!
				
					String s = e.getActionCommand();//클릭한 버튼의 이름이 String으로 담김
					int num = Integer.parseInt(s);//String을 int로 변환
					seat[num] = 1;//누른 번호에 맞는 배열에 1 넣어주기.
					b.setEnabled(false);//버튼 비활성화
					b.setBackground(Color.red);//버튼 배경 빨강이
					JOptionPane.showMessageDialog(f, "선택하신 좌석은 " + num + "번 입니다.");
					int count2 = 0;//예약된 좌석 수 넣을 변수
					for (int j = 0; j < seat.length; j++) {//반복문으로 예약된 좌석 검사
						if (seat[j]==1) {//예약:1 이 보이면 실행해라
							count2++;//좌석수 카운트 누적(int)
							String title = String.valueOf(count2);//int를 String으로 변환
							f.setTitle("현재 선택된 좌석: "+title+"개");//swing에서 프레임 이름 바꾸는 메서드
						}
					}
				}
					
				
			});
			f.getContentPane().add(b);
		}
		
//1. 아직 낯선 코드다!
		JButton redo = new JButton("선택 전체취소");
		redo.setBackground(Color.yellow);
		redo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for(Object o :list){//{버튼0주소,버튼1주소,버튼2주소.....}
				JButton b = (JButton)o; //object를 jbutton으로 형변환 
				b.setEnabled(true);
				b.setBackground(null);
				}
			}	
		});
		f.add(redo);

		JButton b1 = new JButton("==========선택 완료===========");
		b1.addActionListener(new ActionListener() {//b1 클릭시 발생하는 이벤트

			@Override
			public void actionPerformed(ActionEvent e) {
				String reserve = "";//총 선택한 좌석 번호 담을 String
				final int COST = 12000;//좌석 당 가격 고정
				int count = 0;//좌석 수 카운트 담을 변수

				for (int i = 0; i < seat.length; i++) {//반복문으로 예약 유무 검사
					if (seat[i] == 1) {//예약:1이면 실행해라
						count++;//좌석 수 1씩 누적
						reserve += i + "번 ";//String을 연속해서 더해준다.
					}
				}
				int sum = COST*count;//좌석수와 가격의 합계
				JOptionPane.showMessageDialog(f, "선택한 좌석번호 : "+reserve);
				JOptionPane.showMessageDialog(f, "결졔 예정 금액 : "+sum+"원");

			}
		});
		b1.setBackground(Color.CYAN);
		f.getContentPane().add(b1);

		f.setVisible(true);
	}
```

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a9271409-7f27-4edf-9e1a-6b48b1997880/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a9271409-7f27-4edf-9e1a-6b48b1997880/Untitled.png)

### 4) 참고해야할 코드 - String.valueOf()

- int를 String으로 변환해주는 메서드.

```java
String title = String.valueOf(count2);
```

## 2. 2차원 배열

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a870db21-0bf1-42b2-b0e3-60f2503be906/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a870db21-0bf1-42b2-b0e3-60f2503be906/Untitled.png)

### 1) 2차원 배열 선언

```java
int[][] s = new int[3][5];
```

### 2) 2차원 배열에 값 넣기(길이가 같은 배열)

```java
int[][] s = new int[3][5];
		// 	  0	1	2 3	4
		// ------------------------------
		//	0	0	0	0	0	0
		//	1	0	1	1	1	0
		//	2	0	0	0	0	1
		
		s[1][1]=1;
		s[1][2]=1;
		s[1][3]=1;
		s[2][4]=1;
		System.out.println(s[1][1]);
		System.out.println(s[1][2]);
		System.out.println(s[1][3]);
		System.out.println(s[2][4]);
		
		for (int i = 0; i < 3; i++) {//2차원 배열의 행
			for (int j = 0; j < 5; j++) {//1차원 배열의 열
				System.out.print(s[i][j] + " ");
			}System.out.println();
		}
		//i=0 s[0][0]		s[0][1]		s[0][2]		s[0][3]		s[0][4]
		//i=1 s[1][0]		s[1][1]		s[1][2]		s[1][3]		s[1][4]
		//i=2 s[2][0]		s[2][1]		s[2][2]		s[2][3]		s[2][4]
```

### 3) 2차원 배열에 값 넣기(길이가 다른 배열)

```java
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];
		int[] arr3 = new int[4];
		
		int[][] arrList = new int[3][];
		arrList[0] = arr1;
		arrList[1] = arr2;
		arrList[2] = arr3;
		
		// 		0	1	2 	3	4
		// ------------------------------
		//	0	0	0	0	
		//	1	0	0	0	0	0
		//	2	0	0	0	0	
		
		System.out.println(arrList.length);//3
		System.out.println(arrList[0].length);//3
		System.out.println(arrList[1].length);//5
		System.out.println(arrList[2].length);//4
```

### 4) 길이가 다른 2차원 배열 크기 구하기

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/be2ce7ba-5433-4cba-904c-35f444c1597f/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/be2ce7ba-5433-4cba-904c-35f444c1597f/Untitled.png)

## 3. 이중 for문

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/032e2028-8495-4b91-80e7-74ca286ee12b/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/032e2028-8495-4b91-80e7-74ca286ee12b/Untitled.png)

```java
for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
```

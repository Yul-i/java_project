## 자바 복습 연습문제2


```java
public static void main(String[] args) {
		//스캐너 모듈로 값을 받을 것이다.
		Scanner sc = new Scanner(System.in);
		int[] subject = new int[5];//과목별 예약 유무를 0(예약가능)/1(예약불가)로 받을 배열
		while(true) {//종료 전까지 계속 돌기 위해 while문을 사용하였다.
			System.out.println("수강 신청을 진행합니다.");
			System.out.println("원하는 과목을 신청해주세요.");
			System.out.println("---------------------------------------");
			System.out.println("1)자바 2)스프링 3)안드로이드 4)파이썬 5)제이쿼리");
			System.out.println("---------------------------------------");
			for (int i = 0; i < subject.length; i++) {//for문으로 배열에 담긴 값을 순서대로 출력한다.
				System.out.print(subject[i]+"       ");
			}
			System.out.println("");
			System.out.print("원하는 과목코드를 입력해주세요.(종료 0)==>");
			int select = sc.nextInt();//과목코드를 int로 받는다.
			if (select==0) {//0을 받으면 while문을 종료한다.
				System.out.println("신청을 종료합니다.");
				break;
			} else if(select==1||select==2||select==3||select==4||select==5) {//1~5를 받으면 실행한다.
				if(subject[select-1]==1) {//index값이 1이면 이미 등록된 과목이여서 신청 불가
					System.out.println("신청 불가능 합니다.");
				} else if(subject[select-1]==0) {//index값이 0이면 과목 신청을 한다.
					System.out.print("수강신청을 햐시겠습니까?==> 1) 신청 2) 취소");
					int confirm = sc.nextInt(); 
					if (confirm==1) {//수강 신청 1번을 선택하면 실행해라.
						if (select==1) {//select가 1이면 0번 인덱스의 값이 1로 변한다.
							subject[0]=1;
						} else if(select==2){//select가 2이면 1번 인덱스의 값이 1로 변한다.
							subject[1]=1;
						} else if(select==3){//select가 3이면 2번 인덱스의 값이 1로 변한다.
							subject[2]=1;
						} else if(select==4){//select가 4이면 3번 인덱스의 값이 1로 변한다.
							subject[3]=1;
						} else if(select==5){//select가 5이면 4번 인덱스의 값이 1로 변한다.
							subject[4]=1;
						}
						System.out.println("신청 완료 되었습니다.");
					}else {//2번을 선택하면
						System.out.println("수강 신청을 취소합니다.");
					}
				} 
			}else{//0~5외의 숫자를 입력하면 뜨는 출력문
				System.out.println("번호를 다시 입력해주세요.");
			}
		}
	}
```

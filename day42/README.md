## 자바 복습 연습문제


```java
public class 문제풀이1 {
	
	public static String make() {
		Random r = new Random();
		int year = r.nextInt(100); //년
		int month = r.nextInt(12)+1; //달
		int num = 0;
		switch (month) {//달 숫자 받으면 해당 일자 세기
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			num = 31;
		case 4: case 6: case 9: case 11:
			num = 30;
		case 2:
			num = 28;
		}
		int day = r.nextInt(num)+1;//28~31일
		
		String year1 = null;
		String month1 = null;
		String day1 = null;
		String back = null;

		//뒷자리
		if (year<22) {
			back = Integer.toString(r.nextInt(2000000)+3000000);
			if (year<10) {
				year1 = '0'+Integer.toString(year);
			}else {
				year1 = Integer.toString(year);
			}
		}else {
			back = Integer.toString(r.nextInt(2000000)+1000000);
			year1 = Integer.toString(year);
		}
		
		//10미만인 달 0 붙여주기
		if (month<10) {
			month1 = '0'+ Integer.toString(month);
		}else {
			month1 = Integer.toString(month);
		}
		
		//10미만인 일 0 붙여주기
		if (day<10) {
			day1 = '0'+ Integer.toString(day);
		}else {
			day1 = Integer.toString(day);
		}
		
		
		String rrn = year1+month1+day1+"-"+back;
		
		return rrn;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 주민등록 번호를 생성하시겠습니까?>>");
		int amount = sc.nextInt();
		String[] bag = new String[amount];
		
		for (int i = 0; i < amount; i++) {
			String rrn1 = make();			
			System.out.println(rrn1);
			bag[i]=rrn1;
		}
		
		System.out.println(bag[0]);
		
		int MCount = 0;
		int WCount = 0;
		String genderCount = null;
		
		// 성별 계산
		for (int i = 0; i < bag.length; i++) {
			genderCount = Character.toString(bag[i].charAt(7)) ;
			if (genderCount.equals("1")||genderCount.equals("3")) {
				MCount++;
			}else if(genderCount.equals("2")||genderCount.equals("4")){
				WCount++;
			}
		}
		
		String townCount = null;
		int seoul = 0;
		int busan = 0;
		int jeju = 0;
		int other = 0;
		
		//지역 계산
		for (int i = 0; i < bag.length; i++) {
			townCount = Character.toString(bag[i].charAt(8)) ;
			if (townCount.equals("1")) {
				seoul++;
			}else if (townCount.equals("2")) {
				busan++;
			}else if (townCount.equals("3")) {
				jeju++;
			}else {
				other++;
			}
		}
		
		System.out.println("총 "+bag.length+"명 중,");
		System.out.println("남자는 "+MCount+"명 이고, 여자는 "+WCount+"명 입니다.");
		System.out.println("서울 "+seoul+"명 이고, 부산 "+busan+"명 이고, 제주 "+jeju+"명 이고, 기타 지역 "+other+"명 입니다.");
		
		
	}

}
```

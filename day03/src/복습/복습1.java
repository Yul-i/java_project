package 복습;

public class 복습1 {

	public static void main(String[] args) {
		// 오늘을 나타내는 정보를 기본데이터를 이용해서 저장하고 출력해보세요.
		// - 어제 온도 하나 넣어주세요...! 26.2도
		// - 어제 온도 27.5도
		// - 어제 온도와 오늘 온도가 동일한지 프린트 
		// - 어제 온도보다 오늘 온도가 높은지 프린트
		
		double todayTemp = 26.2;//8
		int classNo = 8;//4
		char day = '목';//2
		//String에서 한글자 추출 할 때 char 사용
		boolean food = true;//1
		String lunch = "1층가서 생각해보자.";//22 1자당 2
		
		double yesterdayTemp = 27.5;
		
		System.out.println("오늘 온도 : "+todayTemp+"도");
		System.out.println("오늘 수업 수 : "+classNo);
		System.out.println("오늘 "+day+"요일");
		System.out.println("오늘 아침 먹었나요? : "+food);
		System.out.println("오늘 점심 뭐먹어요? : "+lunch);
		
		System.out.println(todayTemp==27.5);
		System.out.println(todayTemp > 27.5);
		
		System.out.println(yesterdayTemp==todayTemp);
		System.out.println(yesterdayTemp<todayTemp);
		
		//오늘 온도 29.2로 변경하여, 어제 온도보다 낮은지?
		
		todayTemp = 29.2;
		System.out.println(todayTemp<27.5);
		
	}

}

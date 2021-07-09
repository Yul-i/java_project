package 클래스생성;

public class 브런치카페 {
	
	public static void main(String[] args) {
		int coffeePrice = 3500;
		int coffeeCount = 5;
		
		int bagelPrice = 3000;
		int bagelCount = 3;
		
		계산기 cal = new 계산기();
		cal.곱하기(coffeePrice, coffeeCount);
		cal.곱하기(bagelPrice, bagelCount);
		
		// 커피주문 해보세요.
		cal.order("커피");
		cal.order("베이글");
		
		cal.더하기(1000, 2000);
		cal.나누기(55.5, 11.2);
	}

}

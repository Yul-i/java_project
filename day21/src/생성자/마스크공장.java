package 생성자;

public class 마스크공장 {

	public static void main(String[] args) {
		마스크 m1 = new 마스크("white", 2500);
		마스크 m2 = new 마스크("black", 3000);
		System.out.println(m1);
		System.out.println(m2);
		
//		m1.color = "white";
//		m1.price = 2500;
//		
//		m2.color = "black";
//		m2.price = 3000;
		
		System.out.println(m1);
		System.out.println(m2);
	}

}

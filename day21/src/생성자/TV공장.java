package 생성자;

public class TV공장 {

	public static void main(String[] args) {
		TV tv1 = new TV("black", 100);
		TV tv2 = new TV("white", 200);
		
		System.out.println("tv1: "+ tv1);
		System.out.println("tv2: "+ tv2);
	}

}

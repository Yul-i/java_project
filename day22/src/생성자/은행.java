package 생성자;

public class 은행 {

	public static void main(String[] args) {
		통장 account1 = new 통장("홍길동", "990101", 10000);
		통장 account2 = new 통장("김길동", "980101", 20000);
		System.out.println(account1);
		System.out.println(account2);
		
	}

}

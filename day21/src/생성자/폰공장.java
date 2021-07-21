package 생성자;

public class 폰공장 {

	public static void main(String[] args) {
		폰 phone1 = new 폰("Samsung", "black", 70);
		폰 phone2 = new 폰("apple", "silver", 120);
		폰 phone3 = new 폰("shaomi", "red", 40);
		
		System.out.println("폰1: "+phone1);
		System.out.println("폰2: "+phone2);
		System.out.println("폰3: "+phone3);
	}

}

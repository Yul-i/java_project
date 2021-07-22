package 생성자;

public class 회원가입 {

	public static void main(String[] args) {
		MemberBag bag1 = new MemberBag("root", "1234", "hong", "011");
		MemberBag bag2 = new MemberBag("apple", "3333", "kim", "010");
		
		System.out.println(bag1);
		System.out.println(bag2);
	}

}

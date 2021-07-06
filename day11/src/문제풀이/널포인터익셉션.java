package 문제풀이;

public class 널포인터익셉션 {

	public static void main(String[] args) {
		String s = null;//공간만 만들지 차지하진 않는다.
		System.out.println(s.charAt(0));
		
		String[] s = new String[10];
		System.out.println(s[0].charAt(0));
		System.out.println("내가 실행되나...");
	}

}

package 자바기본;

import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("끝말잇기를 시작해볼까요!>>");
		String start = sc.next();
		char startWord = start.charAt(start.length()-1);
		
		while (true) {
			System.out.print(startWord + "(으)로 시작하는 말은~>> ");
			String next = sc.next();
			char nextWord = next.charAt(0);
			if (next.length()==3) {
				if (startWord == nextWord) {
					start = next;
					startWord = next.charAt(start.length()-1);
				}else {
					System.out.println("다시 입력해보세요.");
				}
			}else {
				System.out.println("글자수가 다릅니다. 3글자!!");
			}
	
		}
		
	}

}

package 배열응용;

import java.util.Arrays;
import java.util.Scanner;

public class 스트링을배열로3 {

	public static void main(String[] args) {
		String s = "나는 너구리구리야";
		String s2 = "아니야!!";
		String s3 = "You are racoon.";
		
		//스트링 결합
		System.out.println(s+s2);//나는 너구리구리야아니야!!
		System.out.println(s.concat(s2));//나는 너구리구리야아니야!!
		//문자 1글자 추출
		System.out.println(s.charAt(4));//구
		System.out.println(s.charAt(2));//" "
		//특정한 문자로 끝나는지 확인
		System.out.println(s.endsWith("야"));//true
		System.out.println(s.endsWith("리"));//false
		//인덱스 3이후 글자들 모두 추출
		System.out.println(s.substring(3));//너구리구리야
		//인덱스 3~8까지 글자들 모두 추출
		System.out.println(s.substring(3, 8));//너구리구리
		//s에 s2가 포함되어있는가?
		System.out.println(s.contains(s2));//false
		//s중 " "글자의 위치
		System.out.println(s.lastIndexOf("너"));//3
		System.out.println(s.lastIndexOf("구"));//6 (마지막 글자만 찾아주나보다)
		//대문자로
		System.out.println(s3.toUpperCase());//YOU ARE RACOON.
		//소문자로
		System.out.println(s3.toLowerCase());//you are racoon.
		//글자 수 
		System.out.println(s.length());//9
		//글자 바꿔주기
		System.out.println(s.replace("너", "개"));//나는 개구리구리야
		
	}

}

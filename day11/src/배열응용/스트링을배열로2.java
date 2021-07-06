package 배열응용;

import java.util.Arrays;
import java.util.Scanner;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		String s1 = "    감자        ";
		System.out.println(s1.length());
		
		String s2 = s1.trim();
		System.out.println(s2.length());
		
		String s3 = s1.replace("    ", "");
		System.out.println(s3.length());
		
		//비파괴함수(원본을 건드리지 않음.)
		String data = "감자, 고구마, 양파, 고구마, 양파, 양파 ";
		System.out.println(data.length());//25
		String data2 = data.trim();
		System.out.println(data2);//감자, 고구마, 양파, 고구마, 양파, 양파
		System.out.println(data2.length());//24
		String data3 = data.replace(" ", "");
		System.out.println(data3);//감자,고구마,양파,고구마,양파,양파
		System.out.println(data3.length());//19
		
		//파괴함수
		int[] num = {1, 2, 5, 10, 4, 20};
		Arrays.sort(num);//원본 위치를 바꿔버림, 파괴함수
		for (int i : num) {
			System.out.print(i+ " ");//1 2 4 5 10 20 
		}
	}

}

package 자바기본;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> roto = new ArrayList<Integer>();
		ArrayList<Integer> input = new ArrayList<Integer>();
		
		for (int i = 0; i < 6; i++) {
			roto.add(r.nextInt(45)+1);
		}
		System.out.println(roto);
		
		
		for (int i = 0; i < roto.size(); i++) {
			System.out.println("번호를 입력 해주세요");
			int number = sc.nextInt();
				if(number <= 45 && number >= 1) {
					input.add(number);
				} else {
					i--;
					System.out.println("1~45까지의 번호를 입력 해주세요");
				}
		}
		System.out.println(input);
		
		sc.close();
		
		int count = 0;
		for (int i = 0; i < input.size(); i++) {
			if(roto.get(i) == input.get(i)) {
				count++;
			}
		} 
		
		switch (count) {
		case 6:
			System.out.println("1등 입니다.");
			break;
			
		case 5:
			System.out.println("2등 입니다.");
			break;
			
		case 4:
			System.out.println("3등 입니다.");
			break;

		default:
			System.out.println("꽝");
			break;
		}

	}


	}



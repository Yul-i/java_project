package com.mega.mvc06;

import java.io.FileWriter;
import java.io.IOException;

public class Problem04 {

	public static void main(String[] args) {
		System.out.println("1. 나는 프린트 될까요");
		try {
			//System.out.println("2. 문제 발생 줄~~~"+10/0);
			FileWriter file = new FileWriter("d:\text.txt");
			file.write("내가 첫줄\n");
			file.write("내가 둘째 줄\n");
			file.close();
			//조그만거부터 먼저 큰건 마지막에 위에서 못잡은건만 밑에서 잡도록 한다.
		} catch (ArithmeticException e1) {//수학적
			e1.printStackTrace();
		} catch (IOException e2) {//쓰고 출력
			System.out.println("파일에 쓰는 중 에러 발생...@@@@@");
		} catch (Exception e) {
			System.out.println("모든 에러를 처리합니댜.");
		} finally {
			//에러의 발생 유무와는 상관없이 반드시 꼭 실행해주너야 하는 부분은 여기에 넣음.
			System.out.println("휴~~~예외처리 다 했음");
		}
		System.out.println("3. 나도 프린트 될까요");
	}

}

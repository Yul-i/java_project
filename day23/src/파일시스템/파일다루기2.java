package 파일시스템;

import java.io.File;

public class 파일다루기2 {

	public static void main(String[] args) {
		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_291"); 
		
		String[] list2 = file.list();//목록 이름만 알고 싶으면
		for (String x : list2) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------");
		
		// jdk 폴더 아래 몇 개가 있는지 프린트
		File[] list = file.listFiles();//디렉토리니? 삭제 등 기능 사용하고 싶으면
		System.out.println("몇 개인가요? : "+ list.length);
		
		// 무엇이 있는지 프린트 해보고, 폴더인지/파일인지 프린트
//		for (int i = 0; i < list.length; i++) {
//			if (list[i].isDirectory()) {
//				System.out.println("폴더 : "+list[i]);
//			} else {
//				System.out.println("파일 : "+list[i]);
//			}
//		}
		
		for (File string : list) {
			System.out.println(string);
			System.out.println(string.isDirectory());
		}

	}//main

}//class

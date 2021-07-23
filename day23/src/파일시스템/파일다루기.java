package 파일시스템;

import java.io.File;

public class 파일다루기 {

	public static void main(String[] args) {
//		File file = new File("text.txt");
//		File file = new File("C:\\data");//파일, 폴더 둘다 다룸
		File file = new File("C:/data"); 
//		file.delete();//파일 삭제
		boolean result = file.exists();
		if (result) {
			System.out.println("파일이나 폴더가 존재함");
			System.out.println(file.getAbsolutePath()); //절대경로, getPath():
			if (file.isDirectory()) {
				System.out.println("폴더!!!");
			}else {
				System.out.println("파일!!!");
			}
		} else {
			System.out.println("파일이나 폴더가 존재하지 않음");
		}
		
		//파일 리스트 가져오기
		File[] list= file.listFiles();
		System.out.println(list.length);
		//foreach
		for (File file2 : list) {
			System.out.println(file2);
		}
		//for
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
	}//main

}//class

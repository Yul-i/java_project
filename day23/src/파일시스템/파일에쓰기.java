package 파일시스템;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에쓰기 {

	public static void main(String[] args) {
		//1. test2.txt 스트링을 file객체로 만들어준다.
		//2. test2.txt 파일과 java 프로그램간 stream까지 만들어준다.
		
		//스트림 연결시 무조건 try/catch
		try {
			FileWriter file = new FileWriter("test2.txt");
			//3. stream으로 데이터를 보내면 된다.
			file.write("hello"+"\n");
			file.write("Hi"+"\n");
			file.close(); //작성 완료되면 반드시 닫아준다.
		} catch (IOException e) {//파일, 네크워크 연결(채팅, db, 외부자원 연결 등)
			System.out.println("파일 저장하는 동안 에러가 발생함");
		}
				
	}

}

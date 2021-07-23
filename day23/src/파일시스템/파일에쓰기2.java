package 파일시스템;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에쓰기2 {

	public static void main(String[] args) {
		// 1. test2.txt 스트링을 file객체로 만들어준다.
		// 2. test2.txt 파일과 java 프로그램간 stream까지 만들어준다.

		String day = JOptionPane.showInputDialog("날짜 입력");
		String title = JOptionPane.showInputDialog("제목 입력");
		String content = JOptionPane.showInputDialog("내용 입력");
		String weather = JOptionPane.showInputDialog("날씨 입력");

		// 스트림 연결시 무조건 try/catch
		try {
			FileWriter file = new FileWriter(day + ".txt");
			// 3. stream으로 데이터를 보내면 된다.
			file.write(day + "\n");
			file.write(title + "\n");
			file.write(content + "\n");
			file.write(weather + "\n");
			file.close(); // 작성 완료되면 반드시 닫아준다.
			JOptionPane.showMessageDialog(null, "일기가 기록됨");
		} catch (IOException e) {// 파일, 네크워크 연결(채팅, db, 외부자원 연결 등)
			System.out.println("파일 저장하는 동안 에러가 발생함");
		}

	}

}

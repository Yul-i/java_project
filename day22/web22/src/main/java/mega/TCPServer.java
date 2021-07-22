package mega;

import java.io.IOException;
import java.net.ServerSocket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// 서버 객체를 생성하자.
		ServerSocket server = new ServerSocket(9100);
		System.out.println("server start!!");
		int count = 0;
		while (true) {
			System.out.println("wait request...!!");
			server.accept();
			System.out.println("클라이언트가 연결됨...!" + ++count);
			if (count==1000) {
				server.close();
				System.out.println("서버 멈춰!");
			}
		}
	}

}

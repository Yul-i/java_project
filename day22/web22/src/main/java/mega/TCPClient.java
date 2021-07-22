package mega;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 2000; i++) {
			// 서버 객체를 생성하자.
			Socket server = new Socket("localhost", 9100);
			System.out.println("client request -----"+i);
		}
	}

}

package com.mega.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TomcatServer {

	public static void main(String[] args) throws Exception {
		//네트워크 통신을 하기 위해서는 Socket(소켓)이 필요
		//네트워크 프로그래밍을 소켓 프로그래밍이라고도 한다.
		//클라이언트의 요청이 들어왔을 때 클라이언트를
		//선별하여 승인만을 담당하는 서버소켓이 필요.
		ServerSocket server = new ServerSocket(9100);
		System.out.println("승인용 서버 소켓 시작됨.");
		System.out.println("클라이언트의 요청을 기다리는 중.");
		//서버소켓의 승인이 되면
		//클라이언트와 서버사이에 통신이 가능
		//양쪽에 네트워크 통신을 하려면 양쪽다 Socket
		int count = 0;
		while(true) {
			Socket socket = server.accept();
			count++;
			System.out.println("요청이 승인되어 클라이언트 스트림이 연결됨.");
			System.out.println("현재 접속된 클라이언트수는 " + count + "개");
			//서버측은 소켓이 2개가 필요
		//승인용소켓, 통신용 소켓이 필요
		//클라이언트의 요청을 계속 받기위해서는
		//서버가 죽으면 안된다. 무한루프 
			String data = "i am a java programmer";
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.print(data);
			out.close();
			socket.close();
		}

	}


}

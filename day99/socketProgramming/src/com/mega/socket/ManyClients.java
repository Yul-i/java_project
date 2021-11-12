package com.mega.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ManyClients {
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 100; i++) {
			Socket socket = new Socket("localhost", 9100);
			System.out.println("클라이언트 소켓 시작됨.");
			System.out.println("서버로 요청 보냄.!!");
			
			BufferedReader buffer = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()) );
			String data = buffer.readLine();
			System.out.println("서버로 부터 받은 데이터는>> " + data);
//			InputStream input = socket.getInputStream();
//			
//			InputStreamReader reader = new InputStreamReader(input);
//			
//			BufferedReader buffer = new BufferedReader(reader);
		}	
		
		}

}

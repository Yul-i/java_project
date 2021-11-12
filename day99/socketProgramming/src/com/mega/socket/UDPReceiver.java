package com.mega.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {
	public static void main(String[] args) throws Exception {
		//1. 받는 소켓 객체 생성
		DatagramSocket socket = new DatagramSocket(5000);
		//2. 받는 패킷을 만들어 놓아야 한다.
		byte[] buf = new byte[256];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		//   byte[] 만들어놓아야 한다.
		//   데이터(바이트버퍼, 데이터크기)
		socket.receive(packet);
		
		//3. byte[] ==> String으로 변환처리, 프린트
		String data = new String(buf);
		System.out.println("받은 데이터는 " + data );
	}
}

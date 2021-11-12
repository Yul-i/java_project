package com.mega.socket;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MessagerA extends JFrame {
	
	DatagramSocket socket;
	JTextArea list;
	JTextField input;
	
	public MessagerA() throws Exception {
		socket = new DatagramSocket(5555);//받는 소켓
		setTitle("메신저A");
		setSize(500, 500);
		
		//채팅리스트
		list = new JTextArea();
		
		//채팅입력창
		input = new JTextField(); 
		
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		
		Font font = new Font("굴림", Font.BOLD, 30);
		list.setFont(font);
		input.setFont(font);
		
		list.setBackground(Color.green);
		input.setBackground(Color.yellow);
		list.setEditable(false);
		
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. 입력값한 가지고 와서
				String data = input.getText();
				// 2. 리스트에 올려라,
				list.append("너구리>> " + data + "\n");
				input.setText("");
				// 3. 상대편에 패킷을 만들어 보내라.
				//1. UDP용 소켓이 필요
				
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					
					//2. 전송될 데이터 정해야 함
					
					
					//3. 전송될 데이터를 바이트배열로 변환시켜야 함.
					byte[] buf = data.getBytes();
					
					//4. 전송할 단위인 데이터그램 패킷으로 만들어야 한다.
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					int port = 7777;
					DatagramPacket packet = new DatagramPacket(buf, buf.length, ip, port);
					//	 데이터(데이터+크기) + 주소(ip+port)

					//5. 소켓으로 패킷을 전송
					socket.send(packet);
					
					//6. 통신 끝!
					socket.close();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		
		setVisible(true);
	}
	
	
	public void process() throws Exception {
		while(true) {
			//1. 받는 소켓 객체 생성
				
			//2. 받는 패킷을 만들어 놓아야 한다.
			byte[] buf = new byte[256]; //받은 데이터 저장 장소
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			//   byte[] 만들어놓아야 한다.
			//   데이터(바이트버퍼, 데이터크기)
			
			socket.receive(packet);
			list.append("고양이>> " + new String(buf) + "\n");
		}
	}
	
	public static void main(String[] args) throws Exception {
		MessagerA m = new MessagerA();
		m.process();
	}
}

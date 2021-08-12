package 스레드;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic1 extends JFrame{
	
	//static이라 붙으면 객체 생성하지 않아도 cpu가 바로 호출해서 사용할 수 있음
	//멤버변수가 있으면 static메서드에서 바로 사용 불가능..
	//전역변수에도 static을 붙여주면 객체생성하지 않아도 static 메서드 안에서 접근 가능
	//RAM에 상주하고 있음. 언제든지 cpu가 접근해서 사용 가능.
	//static을 많이 사용하면 안된다.
	
	JLabel count, image, timer;//전역 변수로 빼주었다.
	
	public ThreadGraphic1() {//main은 static이라 메모리 마니 잡아먹어용
		setSize(800, 350);
		setTitle("나의 스레드 프로그램");
		
		count = new JLabel("카운트 들어가는 부분");
		image = new JLabel("이미지 변환되는 부분");
		timer = new JLabel("타이머 들어가는 부분");
		
		add(count, BorderLayout.WEST);
		add(image);
		add(timer, BorderLayout.SOUTH);
		Font font = new Font("궁서", Font.BOLD, 40);
		Font font2 = new Font("궁서", Font.BOLD, 30);
		count.setFont(font);
		timer.setFont(font2);
		
		//thread 객체 생성
		Count2 thread1 = new Count2();
		Image2 thread2 = new Image2();
		Timer2 thread3 = new Timer2();
		
		//cpu에 객체를 등록해주어야 함,
		thread1.start();
		thread2.start();
		thread3.start();
		
		setVisible(true);
	}
	
	//내부 클래스(inner Class, 이너 클래스) 
	// - 클래스간 변수를 공유할 목적으롤 클래스 내에 클래스를 끼워넣을 수 있음.
	//내부로 끼워진 클래스는 독립적으로 다른 곳에서 사용될 수 없다.
	
	public class Count2 extends Thread {
		@Override
		public void run() {
			// i-- (증감연산자) --> i = i - 1;
			for (int i = 1000; i >= 0; i = i - 2) {
				count.setText("count>>"+i);
				
				try {
					Thread.sleep(500);//밀리세컨즈(1/1000초)
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		}
	}
	
	public class Image2 extends Thread {
		@Override
		public void run() {
			String[] list = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg", "7.jpg", "8.jpg", "9.jpg", "10.jpg"};
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				//image.setText(list[i]);
				
				try {
					Thread.sleep(5000);//밀리세컨즈(1/1000초)
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		}
	}
	
	public class Timer2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date = new Date();
				timer.setText(date+"");
				try {
					Thread.sleep(1000);//밀리세컨즈(1/1000초)
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		}
	}


	
	public static void main(String[] args) {
		ThreadGraphic1 s = new ThreadGraphic1();
	}

}

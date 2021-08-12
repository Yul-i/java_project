package 스레드;

public class 동시처리Main1 {

	public static void main(String[] args) {
		동시1 thread1 = new 동시1();
		동시2 thread2 = new 동시2();
		//cpu에 스레드를 등록해주어야 함.
		thread1.start();
		thread2.start();
		
		System.out.println("스레드 종료");
	}

}

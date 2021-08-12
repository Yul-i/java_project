package 스레드;

public class 동시처리Main2 {

	public static void main(String[] args) {
		AtThread thread1 = new AtThread();
		DollarThread thread2 = new DollarThread();
		PercentThread thread3 = new PercentThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println("스레드 종료");
	}

}

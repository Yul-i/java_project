package 스레드;

public class Count1 extends Thread {
	@Override
	public void run() {
		// i-- (증감연산자) --> i = i - 1;
		for (int i = 1000; i >= 0; i = i - 2) {
			System.out.println("count>>" + i);
			
			try {
				Thread.sleep(500);//밀리세컨즈(1/1000초)
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}

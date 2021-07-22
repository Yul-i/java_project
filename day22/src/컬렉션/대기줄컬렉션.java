package 컬렉션;

import java.util.LinkedList;

public class 대기줄컬렉션 {

	public static void main(String[] args) {
		LinkedList queue = new LinkedList();
		queue.add("홍길동");
		queue.add("김길동");
		queue.add("송길동");
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);
	}

}

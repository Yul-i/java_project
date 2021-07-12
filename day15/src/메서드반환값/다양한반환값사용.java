package 메서드반환값;
import java.util.Date;

public class 다양한반환값사용 {

	public static void main(String[] args) {
		다양한리턴 r = new 다양한리턴();
		int result1  = r.add1();
		double result2  = r.add2();
		char result3  = r.add3();
		boolean result4  = r.add4();
		String result5  = r.add5();
		Date date = new Date();
		Date result6  = r.add6();
		System.out.println(result6);
		int[] result7  = r.add7();
		for (int i : result7) {
			System.out.println(i+" ");
		}
		계산기 result8  = r.add8();
		result8.add(200, 100);
	}

}

package 알고리즘;

public class 최소값구하기 {

	public static void main(String[] args) {
		// 많은 양의 데이터를 정렬/검색 하는 경우 배열에 집어넣어라.
		int[] s = { 90, 80, 20, 60, 70 };

		// 전체를 n번 순차적으로 순회하면서 해당 인덱스까지의 최솟값을 변수 하나를
		// 정해서 넣어두는 알고리즘
		int min = s[0]; // 90, 첫 번째 값을 넣어둔다.
		// 해당 인덱스에 들어있는 값이 min에 넣어둔 값보다 작으면
		// 해당 인덱스에 들어있는 값을 min에 넣어둔다.
		for (int i = 1; i < s.length; i++) {
			if (s[i] < min) {
				min = s[i];
			}
		}
		
		System.out.println("최솟값은"+min);
	}

}

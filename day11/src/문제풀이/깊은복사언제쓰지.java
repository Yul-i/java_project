package 문제풀이;

public class 깊은복사언제쓰지 {

	public static void main(String[] args) {
		int[] team1 = {100, 88, 99, 77, 22};
		int[] team2 = team1.clone();
		team2[4] = 66;

	}

}

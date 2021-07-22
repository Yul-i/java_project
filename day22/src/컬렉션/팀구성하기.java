package 컬렉션;

import java.util.HashSet;

public class 팀구성하기 {
	public static void main(String[] args) {
		HashSet team = new HashSet();
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		
		System.out.println("팀원목록 : "+ team);
	}

	
}

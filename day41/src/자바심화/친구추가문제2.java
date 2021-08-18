package 자바심화;

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 친구추가문제2 {

	public static void main(String[] args) {
		//친구 목록 들어갈 리스트
		HashMap<String, String> list = new HashMap<>();
		list.put("홍길동", "011-1111-2222");
		list.put("김길동", "010-2222-3333");
		Scanner	sc = new Scanner(System.in); 
		String name = "";
		String tel = "";
		
		while (true) {
			System.out.println("--------------------");
			System.out.println("1. 친구 리스트 출력");
			System.out.println("2. 친구 추가");
			System.out.println("3. 친구 삭제");
			System.out.println("4. 번호 변경");
			System.out.println("9. 종료");
			System.out.println("메뉴를 선택하시오>>");
			int choice = sc.nextInt();
			if (choice==9) {
				System.out.println("스텝 종료합니다.");
				break;
			}else if (choice==1) {//1. 친구 리스트 출력
				System.out.println("친구 목록은 "+list);
			}else if (choice==2) {//2. 친구 추가
				System.out.print("추가할 친구 이름 입력>>");
				name = sc.next();
				System.out.print("추가할 친구 전화번호 입력>>");
				tel = sc.next();
				int size1 = list.size(); //넣기 전에 크기
				list.put(name, tel);
				int size2 = list.size();//넣은 후 크기
				if (size2>size1) {
					System.out.println("친구가 추가되었습니다.");
				}
			}else if (choice==3) {//3. 친구 삭제
				for(String key : list.keySet()) {
		            System.out.println(key);
		        }
				System.out.println("삭제할 친구를 고르시오.>>");
				name = sc.next();
				list.remove(name);
				
				if (!list.containsKey(name)) {
					System.out.println("삭제가 완료되었습니다.");
				}
				
			}else if (choice==4) {//4. 이름 변경
				for(String key : list.keySet()) {
		            System.out.println(key);
		        }
				System.out.println("번호 수정 할 친구를 고르시오.>>");
				name = sc.next();
				System.out.println("새 번호 입력>>");
				tel = sc.next();
				list.replace(name, tel);
				System.out.println("수정이 완료되었습니다.");
			}else {//1~4, 9도 아닌 경우
				JOptionPane.showMessageDialog(null, "해당 숫자가 없습니다.");
			}
		}
	}

}

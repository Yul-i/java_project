package 자바심화;

import java.util.HashMap;
import java.util.Scanner;


public class 친구추가문제3 {

	public static void main(String[] args) {
		//친구 목록 들어갈 리스트
		HashMap<String, HashMap<String, String>> friends = new HashMap<>();
		
		Scanner	sc = new Scanner(System.in); 
		
		HashMap<String, String> friend = new HashMap<String, String>();
		
		String name = "";
		String tel = "";
		String gender = "";
		String address = "";
		String email = "";

		while(true) {
			System.out.println("--------------------");
			System.out.println("1. 친구 리스트 출력");			
			System.out.println("2. 친구 추가");
			System.out.println("3. 친구 삭제");
			System.out.println("4. 정보 변경");			
			System.out.println("9. 종료");
			System.out.println("메뉴를 선택하시오>>");
			int choice = sc.nextInt();
			
			if (choice==9) {
				System.out.println("스텝 종료합니다.");
				break;
			}else if (choice==1) {//1. 친구 리스트 출력
				System.out.println("친구 목록은 "+friends);
			}else if (choice==2) {//2. 친구 추가
				friend = new HashMap<String, String>();
				System.out.print("추가할 친구 이름 입력>>");
				name = sc.next();
				System.out.print("추가할 친구 전화번호 입력>>");
				tel = sc.next();
				System.out.print("추가할 친구 성별 입력>>");
				gender = sc.next();
				System.out.print("추가할 친구 주소 입력>>");
				address = sc.next();
				System.out.print("추가할 친구 이메일 입력>>");
				email = sc.next();
				System.out.println("");
				friend.put("이름", name);
				friend.put("전화번호", tel);
				friend.put("성별", gender);
				friend.put("주소", address);
				friend.put("이메일", email);
				int size1 = friends.size(); //넣기 전에 크기
				friends.put(name, friend);
				int size2 = friends.size();//넣은 후 크기
				if (size2>size1) {
					System.out.println("친구가 추가되었습니다.");
				}
			}else if (choice==3) {//3. 친구 삭제
				System.out.println("삭제할 친구를 고르시오.");
				for(String key : friends.keySet()) {
		            System.out.println(key);
		        }
				System.out.print("삭제할 친구 이름>>");
				name = sc.next();
				friends.remove(name);
				
				if (!friends.containsKey(name)) {
					System.out.println("삭제가 완료되었습니다.");
				}
				
			}else if (choice==4) {//4. 정보 변경
				System.out.println("수정 할 친구를 고르시오.");
				for(String key : friends.keySet()) {
		            System.out.println(key);
		        }
				System.out.println("수정 할 친구 이름 >>");
				name = sc.next();
				System.out.println(name+"친구의 정보");
				System.out.println(friends.get(name));
				System.out.println("수정할 정보를 고르시오>>");
				String updateKey = sc.next();
				System.out.println(updateKey+"정보 수정>>");
				String updateValue = sc.next();
				friends.get(name).replace(updateKey, updateValue);
				if (friends.get(name).get(updateKey)==updateValue) {
					System.out.println("수정이 완료되었습니다.");
				}
			}else {//1~4, 9도 아닌 경우
				System.out.println("번호를 다시 입력해주세요.");
			}
		
		}
		

		}

}

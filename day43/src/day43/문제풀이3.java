package day43;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 문제풀이3 {

	public static void main(String[] args) {

		// 친구목록 들어갈 리스트
		Scanner sc = new Scanner(System.in);
		ArrayList<콘도bag> list = new ArrayList<콘도bag>();
		
		while (true) {

			System.out.println("----------------------------------------");
			System.out.println("1. 계좌생성 2. 계좌목록 3. 예금 4. 출금 5. 종료 ");
			System.out.println("----------------------------------------");
			System.out.print("번호 선택 >>>> ");

			int choice = sc.nextInt();

			if (choice == 5) {
				System.out.println("은행 어플리케이션이 종료 되었습니다");
				break;
			} else if (choice == 2) {
				System.out.println(list);

			} else if (choice == 1) {
				콘도bag dto = new 콘도bag();
				System.out.println("선택: " + choice);
				System.out.println("--------------");
				System.out.println("계좌생성 ");
				System.out.println("--------------");

				System.out.print("번호: ");
				dto.setNum(sc.next());
				System.out.print("이름: ");
				dto.setName(sc.next());
				System.out.print("입금액: ");
				dto.setMoney(sc.nextInt());
				
				int size1 = list.size();
				list.add(dto);
				int size2 = list.size();
				
				if (size2 > size1) {
					System.out.println("계좌생성에 성공하셨습니다");

				}
			} else if (choice == 3) {
				
				System.out.println("------------------------------");
				System.out.println("입금할 계좌번호와 입금액을 입력하세요");
				System.out.println("------------------------------");
				
				System.out.print("번호: ");
				String num2 = sc.next();
				
				for (int i = 0; i < list.size(); i++) {
					if (num2.equals(list.get(i).getNum())) {
						System.out.print("입금액: ");
						int money = sc.nextInt();
						int savedMoney = list.get(i).getMoney();
						list.get(i).setMoney(savedMoney+money);
						System.out.println("잔액은 총 : "+list.get(i).getMoney()+"원 입니다.");
					}
					
				}
				

			} else { // 1~4, 9도 아닌 경우
				JOptionPane.showInputDialog(null, "해당 숫자가 없습니다 다시 입력");

			}
		}

		sc.close();
	}

}
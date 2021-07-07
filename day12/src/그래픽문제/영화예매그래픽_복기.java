package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class 영화예매그래픽_복기 {

	public static void main(String[] args) {
		int[] seat = new int[200];//좌석 선택 여부가 1또는0으로 들어갈 배열

		JFrame f = new JFrame("영화 예매하기");
		f.setSize(600, 750);

		ArrayList list = new ArrayList();//1. 아직 낯선 코드다!
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);//스윙 레이아웃을 absolute로 변경

		for (int i = 0; i < 200; i++) {//버튼을 200개 생성할 반복문
			JButton b = new JButton(i + "");//버튼에 차례대로 공백없이 숫자가 들어갈 것
			b.addActionListener(new ActionListener() {//버튼 누르면 발생하는 이벤트

				@Override
				public void actionPerformed(ActionEvent e) {//이벤트 클래스
					list.add(e.getSource());//e.주소를 object로 던져준다!
				
					String s = e.getActionCommand();//클릭한 버튼의 이름이 String으로 담김
					int num = Integer.parseInt(s);//String을 int로 변환
					seat[num] = 1;//누른 번호에 맞는 배열에 1 넣어주기.
					b.setEnabled(false);//버튼 비활성화
					b.setBackground(Color.red);//버튼 배경 빨강이
					JOptionPane.showMessageDialog(f, "선택하신 좌석은 " + num + "번 입니다.");
					int count2 = 0;//예약된 좌석 수 넣을 변수
					for (int j = 0; j < seat.length; j++) {//반복문으로 예약된 좌석 검사
						if (seat[j]==1) {//예약:1 이 보이면 실행해라
							count2++;//좌석수 카운트 누적(int)
							String title = String.valueOf(count2);//int를 String으로 변환
							f.setTitle("현재 선택된 좌석: "+title+"개");//swing에서 프레임 이름 바꾸는 메서드
						}
					}
				}
					
				
			});
			f.getContentPane().add(b);
		}
		
//1. 아직 낯선 코드다!
		JButton redo = new JButton("선택 전체취소");
		redo.setBackground(Color.yellow);
		redo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for(Object o :list){//{버튼0주소,버튼1주소,버튼2주소.....}
				JButton b = (JButton)o; //object를 jbutton으로 형변환 
				b.setEnabled(true);
				b.setBackground(null);
				}
			}	
		});
		f.add(redo);

		JButton b1 = new JButton("==========선택 완료===========");
		b1.addActionListener(new ActionListener() {//b1 클릭시 발생하는 이벤트

			@Override
			public void actionPerformed(ActionEvent e) {
				String reserve = "";//총 선택한 좌석 번호 담을 String
				final int COST = 12000;//좌석 당 가격 고정
				int count = 0;//좌석 수 카운트 담을 변수

				for (int i = 0; i < seat.length; i++) {//반복문으로 예약 유무 검사
					if (seat[i] == 1) {//예약:1이면 실행해라
						count++;//좌석 수 1씩 누적
						reserve += i + "번 ";//String을 연속해서 더해준다.
					}
				}
				int sum = COST*count;//좌석수와 가격의 합계
				JOptionPane.showMessageDialog(f, "선택한 좌석번호 : "+reserve);
				JOptionPane.showMessageDialog(f, "결졔 예정 금액 : "+sum+"원");

			}
		});
		b1.setBackground(Color.CYAN);
		f.getContentPane().add(b1);

		f.setVisible(true);
	}

}

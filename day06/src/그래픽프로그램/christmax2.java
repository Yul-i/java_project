
 

package 그래픽프로그램;
/* 
임의의 나무사진을 찾고 나무사진에 적절한 윈도우 크기를 설정하고, 백그라운드에 이미지를 삽입한다.
1. 버튼을 눌러 나무 꼭대기를 장식해주세요.
2. 가족수를 입력하면 가족수만큼 선물(■)이 출력 되게 하세요. 
 */

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class christmax2 {

public static void main(String[] args) {


JFrame f = new JFrame();
f.setSize(400, 600); //이미지사이즈 적용
f.getContentPane().setLayout(null); //레이아웃에 절대위치가 적용되도록

JLabel m2 = new JLabel("");//라벨을 보이지 않게 설정값 미리 정해놓고 생성
m2.setHorizontalAlignment(SwingConstants.CENTER);
m2.setFont(new Font("굴림", Font.PLAIN, 71));
m2.setForeground(new Color(255, 204, 0));
m2.setBounds(166, 0, 81, 67);
f.getContentPane().add(m2);

JLabel bl = new JLabel("");
bl.setBounds(0, 0, 384, 518);
f.getContentPane().add(bl);
ImageIcon tree = new ImageIcon("나무.png");
bl.setIcon(tree);

String fm = JOptionPane.showInputDialog("가족은 몇 명이에요?");
// 가족수를 문자열로 입력받는다.
int fmI = Integer.parseInt(fm); 
// 문자열을 정수로 반환

JButton b1 = new JButton("★");
b1.setFont(new Font("굴림", Font.PLAIN, 13));
b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String top = JOptionPane.showInputDialog(f, "트리에 달고 싶은 모양을 입력해주세요.");
m2.setText(top);//버튼 클릭시 Label에 String 내용 변경
}
});

b1.setBackground(new Color(255, 204, 51));
b1.setBounds(91, 528, 57, 23);
f.getContentPane().add(b1);

JButton b2 = new JButton("FROM 산타");
b2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

for(int i = 0; i < fmI; i++) {
System.out.println("■");
} //입력된 가족수대로 ■가 출력되는 반복문

JOptionPane.showMessageDialog(f, "선물이 " + fmI + "개 배달되었습니다.");

}
});
b2.setFont(new Font("굴림", Font.PLAIN, 13));
b2.setBackground(new Color(255, 204, 51));
b2.setBounds(160, 528, 137, 23);
f.getContentPane().add(b2);

f.setVisible(true);

}

}
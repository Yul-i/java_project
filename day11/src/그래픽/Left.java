package 그래픽;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Left {

	public void left() {
		JFrame f = new JFrame("업프레임");
		f.setSize(300, 300);
		JButton b = new JButton("나는 Left");
		f.add(b);
		
		f.setVisible(true);
	}

}

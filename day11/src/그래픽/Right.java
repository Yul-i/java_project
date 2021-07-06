package 그래픽;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Right {

	public void Right() {
		JFrame f = new JFrame("업프레임");
		f.setSize(300, 300);
		JButton b = new JButton("나는 right");
		f.add(b);
		
		f.setVisible(true);
	}

}

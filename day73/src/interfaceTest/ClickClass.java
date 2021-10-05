package interfaceTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickClass implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("버튼이 클릭 됨");
	}

}

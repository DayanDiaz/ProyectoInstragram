package business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentation.GUIInfoUser;

public class ControllerInfoUser implements ActionListener{

	GUIInfoUser guiIU;
	
	public ControllerInfoUser() {
		
		guiIU = new GUIInfoUser();
		
		initAction();
	}
	
	private void initAction() {
		guiIU.getBNext().addActionListener(this);
	}
	
	//ACTION LISTENER
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == guiIU.getBNext()) {
			//new ControllerEditProifle();
			guiIU.dispose();
		}
	}

}

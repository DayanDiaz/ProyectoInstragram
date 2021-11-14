package business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import presentation.GUILogin;

public class ControllerLogin implements ActionListener, MouseListener{

	public GUILogin guiL;
	
	public ControllerLogin() {
		
		guiL = new GUILogin();
		
		initAction();
	}
	
	private void initAction() {
		guiL.getBLogin().addActionListener(this);
		guiL.getLRegister().addMouseListener(this);
	}
	
	//ACTION LISTENER
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == guiL.getBLogin()) {
			new ControllerHome();
			guiL.dispose();
		}
	}

	//MOUSE LISTENER
	public void mouseClicked(MouseEvent e) {
		
		if(e.getSource() == guiL.getLRegister()) {
			new ControllerRegister();
			guiL.dispose();
		}
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
	
	}

	public void mouseExited(MouseEvent e) {
		
	}
}

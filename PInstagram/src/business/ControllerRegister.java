package business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import presentation.GUIRegister;

public class ControllerRegister implements ActionListener, MouseListener{

	public GUIRegister guiR;
	
	public ControllerRegister() {
		
		guiR = new GUIRegister();
		
		initAction();
	}
	
	private void initAction() {
		guiR.getBRegister().addActionListener(this);
		guiR.getLLoginAccess().addMouseListener(this);
	}
	
	//ACTION LISTENER
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == guiR.getBRegister()) {
			new ControllerInfoUser();
			guiR.dispose();
		}	
	}

	//MOUSE LISTENER
	public void mouseClicked(MouseEvent e) {
		
		if(e.getSource() == guiR.getLLoginAccess()) {
			new ControllerLogin();
			guiR.dispose();
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

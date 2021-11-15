package business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import data.DatabaseConnect;
import presentation.GUIRegister;

public class ControllerRegister implements ActionListener, MouseListener{

	private String username,password,name,lastName1,lastName2,phone;
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
			
			username = guiR.getTfUser().getText();
			password = guiR.getTfPassWord().getText();
			System.out.println(username);
			name = guiR.getTfName().getText();//Separar nombre de apellidos
			phone = guiR.getTfCel().getText();
			
			new ControllerInfoUser(username,password,name,lastName1,lastName2,phone);
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

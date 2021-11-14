package business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import presentation.GUIProfile;

public class ControllerProfile implements ActionListener, MouseListener{
	
	GUIProfile guiP;
	
	public ControllerProfile() {
		
		guiP = new GUIProfile();
		
		initAction();
	}
	
	public void initAction() {
		guiP.getBEditProfile().addActionListener(this);
//		guiP.getLPhotos().addMouseListener(this);
//		guiP.getLVideos().addMouseListener(this);
		guiP.getLHome().addMouseListener(this);
		guiP.getLSearch().addMouseListener(this);
//		guiP.getLAdd().addMouseListener(this);
//		guiP.getLUser().addMouseListener(this);
	}

	//ACTION LISTENER
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == guiP.getBEditProfile()) {
			new ControllerEditProfile();
			guiP.dispose();
		}
	}

	//MOUSE LISTENER
	public void mouseClicked(MouseEvent e) {
		
		if(e.getSource() == guiP.getLHome()) {
			new ControllerHome();
			guiP.dispose();
		}
		
		if(e.getSource() == guiP.getLSearch()) {
			new ControllerSearch();	
			guiP.dispose();
		}

		if(e.getSource() == guiP.getLAdd()) {
			guiP.dispose();
		}

		if(e.getSource() == guiP.getLPhotos()) {
			guiP.dispose();
		}

		if(e.getSource() == guiP.getLVideos()) {
			guiP.dispose();
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

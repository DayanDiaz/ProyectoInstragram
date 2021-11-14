package business;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import presentation.GUIHome;

public class ControllerHome implements MouseListener{
	
	GUIHome guiH;
	
	public ControllerHome() {
		
		guiH = new GUIHome();
		
		initAction();
	}
	
	public void initAction() {
//		guiH.getLMessage().addMouseListener(this);
//		guiH.getLNewStory().addMouseListener(this);
//		guiH.getLHome().addMouseListener(this);
		guiH.getLSearch().addMouseListener(this);
//		guiH.getLAdd().addMouseListener(this);
		guiH.getLUser().addMouseListener(this);
	}

	//MOUSE LISTENER
	public void mouseClicked(MouseEvent e) {
		
		if(e.getSource() == guiH.getLMessage()) {
			
			guiH.dispose();
		}
		
		if(e.getSource() == guiH.getLNewStory()) {
			
			guiH.dispose();
		}
		
		if(e.getSource() == guiH.getLHome()) {
			
			guiH.dispose();
		}
		
		if(e.getSource() == guiH.getLSearch()) {
			new ControllerSearch();
			guiH.dispose();
		}
		
		if(e.getSource() == guiH.getLAdd()) {
		
			guiH.dispose();
		}	
		
		if(e.getSource() == guiH.getLUser()) {
			new ControllerProfile();
			guiH.dispose();
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

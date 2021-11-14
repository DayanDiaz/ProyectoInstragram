package business;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import presentation.GUIEditProfile;

public class ControllerEditProfile implements MouseListener{

	GUIEditProfile guiEP;

	public ControllerEditProfile () {

		guiEP = new GUIEditProfile();

		initAction();
	}

	private void initAction() {
		guiEP.getLCancel().addMouseListener(this);
		guiEP.getLDone().addMouseListener(this);
		guiEP.getLChangesPhotoProfile().addMouseListener(this);
//		guiEP.getLPersonalInfo().addMouseListener(this);
	}

	//MOUSE LISTENER
	public void mouseClicked(MouseEvent e) {

		if(e.getSource() == guiEP.getLCancel()) {
			new ControllerProfile();
			guiEP.dispose();
		}

		if(e.getSource() == guiEP.getLDone()) {
			new ControllerProfile();
			guiEP.dispose();
		}

		if(e.getSource() == guiEP.getLChangesPhotoProfile()) {
			//BUSCA LA FOTO
		}

		if(e.getSource() == guiEP.getLPersonalInfo()) {
			guiEP.dispose();
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

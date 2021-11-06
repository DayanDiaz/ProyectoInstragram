package business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentation.GUIProfile;

public class ControllerProfile implements ActionListener{
	
	GUIProfile guiP;
	public ControllerProfile() {
		guiP = new GUIProfile();
		
		
		initialization();
	}
	
	public void initialization() {
		guiP.getBStarted().addActionListener(this);
		guiP.getBEditProfile().addActionListener(this);
		guiP.getBSearch().addActionListener(this);
		guiP.getBAdd().addActionListener(this);
		guiP.getBPhotos().addActionListener(this);
		guiP.getBVideos().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == guiP.getBStarted()) {
			new ControllerHome();
			guiP.dispose();
		}
		
		
		if(e.getSource() == guiP.getBEditProfile()) {
			
			//guiP.dispose();
		}
		
		if(e.getSource() == guiP.getBSearch()) {
					
					//guiP.dispose();
				}
		if(e.getSource() == guiP.getBAdd()) {
			
			//guiP.dispose();
		}
		if(e.getSource() == guiP.getBPhotos()) {
			
			//guiP.dispose();
		}
		if(e.getSource() == guiP.getBVideos()) {
			
			//guiP.dispose();
		}
	}

	
}

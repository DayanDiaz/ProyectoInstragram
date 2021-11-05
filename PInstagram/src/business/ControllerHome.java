package business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentation.GUIHome;

public class ControllerHome implements ActionListener{
	
	GUIHome guiH;
	
	public ControllerHome() {
		guiH = new GUIHome();
		
		
		initialization();
	}
	
	public void initialization() {
		guiH.getBProfile().addActionListener(this);
		guiH.getBSearch().addActionListener(this);
		guiH.getBAdd().addActionListener(this);
		guiH.getBNewStory().addActionListener(this);
		guiH.getBMessage().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == guiH.getBProfile()) {
			new ControllerProfile();
			guiH.dispose();
		}
		
		if(e.getSource() == guiH.getBSearch()) {
			
			//guiH.dispose();
		}
		
		if(e.getSource() == guiH.getBAdd()) {
			
			//guiH.dispose();
		}
		
		if(e.getSource() == guiH.getBNewStory()) {
			
			//guiH.dispose();
		}
		
		if(e.getSource() == guiH.getBMessage()) {
		
			//guiH.dispose();
		}
		
		
		
	}

	
}

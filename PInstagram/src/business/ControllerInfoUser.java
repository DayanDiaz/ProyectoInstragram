package business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import data.DatabaseConnect;
import presentation.GUIInfoUser;

public class ControllerInfoUser implements ActionListener{

	GUIInfoUser guiIU;
	private String username,password,name,lastName1,lastName2,phone,dateOfBirth,gender;
	private DatabaseConnect dbc;
	
	public ControllerInfoUser(String username,String password,String name,String lastName1,String lastName2,String phone) {
		
		guiIU = new GUIInfoUser();
		
		dbc = DatabaseConnect.getInstance();
		
		this.username = username;
		this.password = password;
		this.name = name;//Separar nombre de apellidos
		this.phone = phone;
		
		initAction();
	}
	
	private void initAction() {
		guiIU.getBNext().addActionListener(this);
	}
	
	
	//ACTION LISTENER
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == guiIU.getBNext()) {
			dateOfBirth =	guiIU.getTfBirthDate().getText();
			gender =  guiIU.getTfGender().getText();
			
			System.out.println(dateOfBirth);
			
			dbc.insertUser(username,password,name,lastName1,lastName2,phone,dateOfBirth,gender);
			
			//new ControllerEditProifle();
			new ControllerLogin();
			guiIU.dispose();
		}
	}
	
	//Pasar a logica
	/*
	 * private boolean verifyAge(String date) {
	 * 
	 * if() {
	 * 
	 * } }
	 */

}

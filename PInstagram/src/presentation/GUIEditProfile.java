package presentation;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.SystemColor;

import utils.RouteImages;

@SuppressWarnings("serial")
public class GUIEditProfile extends JFrame {
	
	//COMPONENTS
	private JLabel lCancel;
	private JLabel lEditprofile;
	private JLabel lDone;
	
	private JLabel lPhotoProfile;
	private JLabel lChangesPhotoProfile;
	
	private JLabel lName;
	private JLabel lPronouns;
	private JLabel lUserName;
	private JLabel lDescription;
	
	private JLabel lPersonalInfo;
	
	private JTextField tfName;
	private JTextField tfPronouns;
	private JTextField tfUser;
	private JTextField tfDescription;
	
	public GUIEditProfile() {
		
		//BACKGROUND
		getContentPane().setBackground(Color.WHITE);
		
		//ADD
		getContentPane().add(getLCancel());
		getContentPane().add(getLEditprofile());
		getContentPane().add(getLDone());
		
		getContentPane().add(getLPhotoProfile());
		getContentPane().add(getLChangesPhotoProfile());
		
		getContentPane().add(getLName());
		getContentPane().add(getLPronouns());
		getContentPane().add(getLUserName());
		getContentPane().add(getLDescription());
		
		getContentPane().add(getLPersonalInfo());
		
		getContentPane().add(getTfName());
		getContentPane().add(getTfPronouns());
		getContentPane().add(getTfUser());
		getContentPane().add(getTfDescription());
		
		init();
	}
	
	public void init() {
		setTitle("Editar Perfil");
		setSize(355,555);
		getContentPane().setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(RouteImages.ICON));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//METHODS
	public JLabel getLCancel() {
		if (lCancel == null) {
			lCancel = new JLabel("Cancelar");
			lCancel.setFont(new Font("Dialog", Font.PLAIN, 13));
			lCancel.setHorizontalAlignment(SwingConstants.LEFT);
			lCancel.setBounds(15, 11, 97, 32);
		}
		return lCancel;
	}
	
	public JLabel getLEditprofile() {
		if (lEditprofile == null) {
			lEditprofile = new JLabel("Editar Perfil");
			lEditprofile.setHorizontalAlignment(SwingConstants.CENTER);
			lEditprofile.setFont(new Font("Dialog", Font.BOLD, 13));
			lEditprofile.setBounds(124, 11, 97, 32);
		}
		return lEditprofile;
	}
	
	public JLabel getLDone() {
		if (lDone == null) {
			lDone = new JLabel("Guardar");
			lDone.setForeground(SystemColor.textHighlight);
			lDone.setHorizontalAlignment(SwingConstants.RIGHT);
			lDone.setFont(new Font("Dialog", Font.PLAIN, 13));
			lDone.setBounds(235, 11, 87, 32);
		}
		return lDone;
	}
	
	public JLabel getLPhotoProfile() {
		if (lPhotoProfile == null) {
			lPhotoProfile = new JLabel("");
			lPhotoProfile.setBounds(115, 54, 116, 104);
			lPhotoProfile.setIcon(new ImageIcon(RouteImages.PHOTOPROFILE));
		}
		return lPhotoProfile;
	}
	
	public JLabel getLChangesPhotoProfile() {
		if (lChangesPhotoProfile == null) {
			lChangesPhotoProfile = new JLabel("Cambiar foto de perfil");
			lChangesPhotoProfile.setForeground(SystemColor.textHighlight);
			lChangesPhotoProfile.setHorizontalAlignment(SwingConstants.CENTER);
			lChangesPhotoProfile.setFont(new Font("Dialog", Font.BOLD, 12));
			lChangesPhotoProfile.setBounds(102, 163, 132, 32);
		}
		return lChangesPhotoProfile;
	}
	
	public JLabel getLName() {
		if (lName == null) {
			lName = new JLabel("Nombre");
			lName.setHorizontalAlignment(SwingConstants.LEFT);
			lName.setFont(new Font("Dialog", Font.PLAIN, 12));
			lName.setBounds(10, 235, 87, 23);
		}
		return lName;
	}
	
	public JLabel getLPronouns() {
		if (lPronouns == null) {
			lPronouns = new JLabel("Pronombre");
			lPronouns.setHorizontalAlignment(SwingConstants.LEFT);
			lPronouns.setFont(new Font("Dialog", Font.PLAIN, 12));
			lPronouns.setBounds(10, 275, 73, 23);
		}
		return lPronouns;
	}
	
	public JLabel getLUserName() {
		if (lUserName == null) {
			lUserName = new JLabel("Usuario");
			lUserName.setHorizontalAlignment(SwingConstants.LEFT);
			lUserName.setFont(new Font("Dialog", Font.PLAIN, 12));
			lUserName.setBounds(10, 313, 56, 25);
		}
		return lUserName;
	}
	
	public JLabel getLDescription() {
		if (lDescription == null) {
			lDescription = new JLabel("Bio");
			lDescription.setFont(new Font("Dialog", Font.PLAIN, 12));
			lDescription.setBounds(10, 359, 56, 23);
		}
		return lDescription;
	}
	
	public JLabel getLPersonalInfo() {
		if (lPersonalInfo == null) {
			lPersonalInfo = new JLabel("Configuraci\u00F3n de informaci\u00F3n personal");
			lPersonalInfo.setForeground(SystemColor.textHighlight);
			lPersonalInfo.setFont(new Font("Dialog", Font.BOLD, 12));
			lPersonalInfo.setBounds(10, 409, 221, 23);
		}
		return lPersonalInfo;
	}
	
	public JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setForeground(Color.LIGHT_GRAY);
			tfName.setBorder(null);
			tfName.setText(" Nombre");
			tfName.setFont(new Font("Dialog", Font.PLAIN, 12));
			tfName.setBounds(82, 230, 240, 32);
			tfName.setColumns(10);
		}
		return tfName;
	}
	
	public JTextField getTfPronouns() {
		if (tfPronouns == null) {
			tfPronouns = new JTextField();
			tfPronouns.setForeground(Color.LIGHT_GRAY);
			tfPronouns.setBorder(null);
			tfPronouns.setText(" Pronombre");
			tfPronouns.setFont(new Font("Dialog", Font.PLAIN, 12));
			tfPronouns.setColumns(10);
			tfPronouns.setBounds(82, 270, 240, 32);
		}
		return tfPronouns;
	}
	
	public JTextField getTfUser() {
		if (tfUser == null) {
			tfUser = new JTextField();
			tfUser.setForeground(Color.LIGHT_GRAY);
			tfUser.setBorder(null);
			tfUser.setText(" Usuario");
			tfUser.setFont(new Font("Dialog", Font.PLAIN, 12));
			tfUser.setColumns(10);
			tfUser.setBounds(82, 311, 240, 32);
		}
		return tfUser;
	}
	
	public JTextField getTfDescription() {
		if (tfDescription == null) {
			tfDescription = new JTextField();
			tfDescription.setText(" Description");
			tfDescription.setForeground(Color.LIGHT_GRAY);
			tfDescription.setBorder(null);
			tfDescription.setFont(new Font("Dialog", Font.PLAIN, 12));
			tfDescription.setColumns(10);
			tfDescription.setBounds(82, 354, 240, 32);
		}
		return tfDescription;
	}
}
